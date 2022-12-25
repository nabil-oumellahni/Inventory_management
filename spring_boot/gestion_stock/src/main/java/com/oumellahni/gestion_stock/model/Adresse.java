package com.oumellahni.gestion_stock.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by nabil on 23 Dec 2022 at 18:33
 **/

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Adresse {

    private String adresse1;

    private String adresse2;

    private String ville;

    private String codePostale;

    private String pays;

}
