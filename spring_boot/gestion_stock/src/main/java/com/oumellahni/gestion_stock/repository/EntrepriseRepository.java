package com.oumellahni.gestion_stock.repository;

import com.oumellahni.gestion_stock.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
* Created by nabil on 24 Dec 2022 at 15:02
**/

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {
}
