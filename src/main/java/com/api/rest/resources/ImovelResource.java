/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.rest.resources;

import com.api.rest.models.Imovel;
import com.api.rest.repository.ImovelRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author caiocesardemorais
 */
@RestController
@RequestMapping(value="/api/v1")
public class ImovelResource {
    
    @Autowired
    ImovelRepository imovelRepository;
    
    @GetMapping("/imovel")
    public List<Imovel> listaImoveis(){
        return imovelRepository.findAll();
    }
    
    @GetMapping("/imovel/{id}")
    public Imovel listaImovelPorId(@PathVariable(value="id") long id){
        return imovelRepository.findById(id);
    }
    
    @GetMapping(path = "/imovel/imobiliaria/{id}")
    public List<Imovel> listaPorImobiliaria(@PathVariable("id") long id) {
	return imovelRepository.findByImobiliariaId(id);
    }
    
    @GetMapping(path = "/imovel/filtros")
    public List<Imovel> listaPorCidade(@RequestParam(name = "cidade") String cidade) {
        return imovelRepository.findByCidadeLikeIgnoreCase("%" + cidade + "%");
    }
}