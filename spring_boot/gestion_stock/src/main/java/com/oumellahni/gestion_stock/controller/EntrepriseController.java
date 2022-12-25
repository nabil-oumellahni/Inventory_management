package com.oumellahni.gestion_stock.controller;

import com.oumellahni.gestion_stock.controller.api.EntrepriseApi;
import com.oumellahni.gestion_stock.dto.EntrepriseDto;
import com.oumellahni.gestion_stock.model.Entreprise;
import com.oumellahni.gestion_stock.service.EntrepriseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nabil on 24 Dec 2022 at 15:31
 **/

@RestController
public class EntrepriseController implements EntrepriseApi {

    @Autowired
    EntrepriseService entrepriseService;

    @Autowired
    ModelMapper modelMapper;
    @Override
    public EntrepriseDto create(EntrepriseDto entrepriseDto) {
        return fromEntity(entrepriseService.create(toEntity(entrepriseDto)));
    }

    @Override
    public List<EntrepriseDto> getAll() {
        return entrepriseService
                .getAll()
                .stream()
                .map(this::fromEntity)
                .collect(Collectors.toList());
    }



    public Entreprise toEntity(EntrepriseDto dto) {
        return modelMapper.map(dto, Entreprise.class);
    }

    public EntrepriseDto fromEntity(Entreprise compte) {
        return modelMapper.map(compte, EntrepriseDto.class);
    }
}
