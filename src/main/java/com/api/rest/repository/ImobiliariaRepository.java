/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.rest.repository;

import com.api.rest.models.Imobiliaria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author caiocesardemorais
 */
public interface ImobiliariaRepository extends JpaRepository<Imobiliaria, Long>{
 
    Imobiliaria findById(long id);
    
}
