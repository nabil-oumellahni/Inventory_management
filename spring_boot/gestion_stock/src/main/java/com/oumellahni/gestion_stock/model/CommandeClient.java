package com.oumellahni.gestion_stock.model;

import com.oumellahni.gestion_stock.Enum.EtatCommande;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

/**
 * Created by nabil on 23 Dec 2022 at 19:00
 **/

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class CommandeClient extends AbstractClass {

    private String code;

    private Instant dateCommande;

    @Enumerated(EnumType.STRING)
    private EtatCommande etatCommande;

    private Integer idEntreprise;

    @ManyToOne
    @JoinColumn(name = "idclient")
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;

}
