package com.oumellahni.gestion_stock.service;

import com.oumellahni.gestion_stock.model.Entreprise;
import com.oumellahni.gestion_stock.repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nabil on 24 Dec 2022 at 15:28
 **/

@Service
public class EntrepriseServiceImpl implements EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;
    @Override
    public Entreprise create(Entreprise entreprise) {
        if (entreprise == null) {
            return null;
        }
        else {
            return entrepriseRepository.save(entreprise);
        }
    }

    @Override
    public List<Entreprise> getAll() {
            return entrepriseRepository.findAll();
    }
}
