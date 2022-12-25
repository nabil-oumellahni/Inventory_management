package com.oumellahni.gestion_stock.model;


import com.oumellahni.gestion_stock.Enum.SourceMvtStk;
import com.oumellahni.gestion_stock.Enum.TypeMvtStk;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * Created by nabil on 23 Dec 2022 at 20:12
 **/

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class MvtStk extends AbstractClass {

    private Instant dateMvt;

    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    @Enumerated(EnumType.STRING)
    private TypeMvtStk typeMvt;

    @Enumerated(EnumType.STRING)
    private SourceMvtStk sourceMvt;

    private Integer idEntreprise;

}
