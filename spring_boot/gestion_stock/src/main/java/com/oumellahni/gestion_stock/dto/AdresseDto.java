package com.oumellahni.gestion_stock.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by nabil on 23 Dec 2022 at 22:25
 **/

@Setter
@Getter
public class AdresseDto {

    private String adresse1;

    private String adresse2;

    private String ville;

    private String codePostale;

    private String pays;
}
