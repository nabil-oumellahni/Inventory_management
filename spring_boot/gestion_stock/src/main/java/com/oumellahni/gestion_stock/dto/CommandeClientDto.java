package com.oumellahni.gestion_stock.dto;

import com.oumellahni.gestion_stock.Enum.EtatCommande;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

/**
 * Created by nabil on 23 Dec 2022 at 22:26
 **/

@Setter
@Getter
public class CommandeClientDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private EtatCommande etatCommande;

    private ClientDto client;

    private Integer idEntreprise;

    private List<LigneCommandeClientDto> ligneCommandeClients;
}
