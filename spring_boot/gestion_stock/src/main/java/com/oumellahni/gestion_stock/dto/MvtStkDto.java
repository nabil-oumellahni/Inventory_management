package com.oumellahni.gestion_stock.dto;

import com.oumellahni.gestion_stock.Enum.SourceMvtStk;
import com.oumellahni.gestion_stock.Enum.TypeMvtStk;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * Created by nabil on 24 Dec 2022 at 10:17
 **/

@Setter
@Getter
public class MvtStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    private TypeMvtStk typeMvt;

    private SourceMvtStk sourceMvt;

    private Integer idEntreprise;
}
