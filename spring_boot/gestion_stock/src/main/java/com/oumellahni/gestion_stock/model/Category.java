package com.oumellahni.gestion_stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by nabil on 23 Dec 2022 at 18:37
 **/

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Category extends AbstractClass {

    private String code;

    private String designation;

    private Integer idEntreprise;

    @OneToMany(mappedBy = "category")
    private List<Article> articles;
}
