package com.oumellahni.gestion_stock.dto;

import com.oumellahni.gestion_stock.model.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by nabil on 23 Dec 2022 at 22:16
 **/

@Setter
@Getter
public class ArticleDto {

    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    private Integer idEntreprise;

    private Category category;

    private List<LigneVente> ligneVentes;

    private List<LigneCommandeClient> ligneCommandeClients;

    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

    private List<MvtStk> mvtStks;

}
