/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.rest.repository;

import com.api.rest.models.Imobiliaria;
import java.util.List;

import com.api.rest.models.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author caiocesardemorais
 */
public interface ImovelRepository extends JpaRepository<Imovel, Long>{
    
    Imovel findById(long id);  
    
    List<Imovel> findByCidadeLikeIgnoreCase(String nome);
    
    @Query("select i from Imovel i where imobiliaria_id = :id")
    List<Imovel> findByImobiliariaId(@Param ("id") Long id);
    
}
