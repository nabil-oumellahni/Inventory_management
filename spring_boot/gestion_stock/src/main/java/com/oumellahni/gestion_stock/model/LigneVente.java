package com.oumellahni.gestion_stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by nabil on 23 Dec 2022 at 20:10
 **/

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class LigneVente extends AbstractClass {


    @ManyToOne
    @JoinColumn(name = "idvente")
    private Vente vente;
    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private Integer idEntreprise;

}
