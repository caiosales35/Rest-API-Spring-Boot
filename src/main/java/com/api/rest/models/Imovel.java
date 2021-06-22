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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author caiocesardemorais
 */
@Entity
@Table(name = "Imovel")
public class Imovel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotBlank
    @Size(max = 100)
    @Column(nullable = false, length = 100)
    private String nome;
    
    @NotBlank
    @Size(max = 256)
    @Column(nullable = false, length = 256)
    private String descricao;
    
    @NotNull
    @Column(nullable = false, length = 12)
    private float valor;
    
    @NotBlank
    @Size(max = 11)
    @Column(nullable = false, length = 11)
    private String cep;

    @NotBlank
    @Size(max = 100)
    @Column(nullable = false, length = 100)
    private String logradouro;

    @NotNull
    @Column(nullable = false)
    private Integer numero;

    @NotBlank
    @Size(max = 100)
    @Column(nullable = false, length = 100)
    private String bairro;

    @NotBlank
    @Size(max = 100)
    @Column(nullable = false, length = 100)
    private String cidade;
    
    @NotBlank
    @Size(max = 100)
    @Column(nullable = false, length = 100)
    private String url_foto;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name = "imobiliaria_id")
    private Imobiliaria imobiliaria;

    public Imovel() {
    }

    public Imovel(String nome, String descricao, float valor, String cep, String logradouro, Integer numero, String bairro, String cidade, Imobiliaria imobiliaria, String url_foto) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.imobiliaria = imobiliaria;
        this.url_foto = url_foto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }
    
    public Imobiliaria getImobiliaria() {
        return imobiliaria;
    }

    public void setImobiliaria(Imobiliaria imobiliaria) {
        this.imobiliaria = imobiliaria;
    }
    
}
