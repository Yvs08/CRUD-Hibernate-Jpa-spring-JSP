/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yves.lambert.controller;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class CreationForm {
    
     @NotEmpty
    private String libelle;
    @NotEmpty
    @Pattern(regexp="\\d*")
    private String quantite;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(final String pLibelle) {
        libelle = pLibelle;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(final String pQuantite) {
        quantite = pQuantite;
    }
    
}
