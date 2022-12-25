package com.oumellahni.gestion_stock.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by nabil on 24 Dec 2022 at 10:17
 **/
@Setter
@Getter
public class LigneVenteDto {

    private Integer id;

    private VenteDto vente;

    private ArticleDto article;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private Integer idEntreprise;
}
