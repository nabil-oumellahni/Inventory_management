package com.oumellahni.gestion_stock.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

/**
 * Created by nabil on 24 Dec 2022 at 10:17
 **/

@Setter
@Getter
public class VenteDto {

    private Integer id;

    private String code;

    private Instant dateVente;

    private String commentaire;

    private List<LigneVenteDto> ligneVentes;

    private Integer idEntreprise;
}
