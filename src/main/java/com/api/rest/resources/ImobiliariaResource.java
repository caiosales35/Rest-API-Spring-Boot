/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.rest.resources;

import com.api.rest.models.Imobiliaria;
import com.api.rest.repository.ImobiliariaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author caiocesardemorais
 */
@RestController
@RequestMapping(value="/api/v1")
public class ImobiliariaResource {
    
    @Autowired
    ImobiliariaRepository imobiliariaRepository;
    
    @GetMapping("/imobiliaria")
    public List<Imobiliaria> listaImobiliarias(){
        return imobiliariaRepository.findAll();
    }
    
    @GetMapping("/imobiliaria/{id}")
    public Imobiliaria listaImobiliariaPorId(@PathVariable(value="id") long id){
        return imobiliariaRepository.findById(id);
    }
    
    @PostMapping("/imobiliaria")
    public Imobiliaria salvaImobiliaria(@RequestBody Imobiliaria imobiliaria){
        return imobiliariaRepository.save(imobiliaria);
    }
    
    @DeleteMapping("/imobiliaria/{id}")
    public void removeImobiliaria(@PathVariable(value="id") long id){
        imobiliariaRepository.deleteById(id);
    }
    
    @PatchMapping("/imobiliaria/{id}")
    public Imobiliaria atualizaImobiliaria(@RequestBody Imobiliaria imobiliaria, @PathVariable(value="id") long id){  
        imobiliaria.setId(id);    
        Imobiliaria imobiliariaAntiga = null;
        imobiliariaAntiga = imobiliariaRepository.findById(id);
        if (imobiliariaAntiga != null) {
            if (imobiliaria.getEmail() != null) imobiliariaAntiga.setEmail(imobiliaria.getEmail());
            if (imobiliaria.getSenha() != null) imobiliariaAntiga.setSenha(imobiliaria.getSenha());
            if (imobiliaria.getCnpj()!= null) imobiliariaAntiga.setCnpj(imobiliaria.getCnpj());
            if (imobiliaria.getNome()!= null) imobiliariaAntiga.setNome(imobiliaria.getNome());
            if (imobiliaria.getDescricao()!= null) imobiliariaAntiga.setDescricao(imobiliaria.getDescricao());
            return imobiliariaRepository.save(imobiliariaAntiga);
        }       
        return imobiliariaAntiga;
    }
    
}
