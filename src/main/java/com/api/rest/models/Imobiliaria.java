/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.rest.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 *
 * @author caiocesardemorais
 */
@Entity
@Table(name = "Imobiliaria")
public class Imobiliaria implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    @NotBlank
    @Column(nullable = false, length = 18, unique = true)
    private String cnpj;
    
    @NotBlank
    @Size(max = 100)
    @Column(nullable = false, length = 100)
    private String nome;
    
    @NotBlank
    @Size(max = 256)
    @Column(nullable = false, length = 256)
    private String descricao;
    
    @NotBlank
    @Size(min = 5, max = 45)
    @Column(unique = true, nullable = false, length = 45)
    private String email;

    @NotBlank
    @Size(min = 6, max = 16)
    @Column(nullable = false, length = 16)
    private String senha;

    public Imobiliaria() {
    }

    public Imobiliaria(String cnpj, String nome, String descricao, String email, String senha) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.descricao = descricao;
        this.email = email;
        this.senha = senha;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}