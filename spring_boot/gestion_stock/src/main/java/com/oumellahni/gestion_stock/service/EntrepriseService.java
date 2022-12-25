package com.oumellahni.gestion_stock.service;

import com.oumellahni.gestion_stock.model.Entreprise;

import java.util.List;

/**
 * Created by nabil on 24 Dec 2022 at 15:26
 **/
public interface EntrepriseService {

    Entreprise create (Entreprise entreprise);

    List<Entreprise> getAll();
}
