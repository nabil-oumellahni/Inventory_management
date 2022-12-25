package com.oumellahni.gestion_stock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by nabil on 24 Dec 2022 at 10:12
 **/

@Setter
@Getter
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    private AdresseDto adresse;

    private String codeFiscal;

    private String photo;

    private String email;

    private String numTel;

    private String steWeb;

    @JsonIgnore
    private List<UtilisateurDto> utilisateurs;
}
