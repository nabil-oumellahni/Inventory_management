package com.oumellahni.gestion_stock.controller.api;

import com.oumellahni.gestion_stock.dto.EntrepriseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static com.oumellahni.gestion_stock.util.Constant.*;

/**
 * Created by nabil on 24 Dec 2022 at 15:32
 **/

@Tag(name = "entreprise", description = "Entreprise API")
public interface EntrepriseApi {

    @PostMapping(
            value = APP_ROOT + ENTREPRISE + ADD,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Enregistrer une entreprise",
            description = "Cette methode permet d'enregistrer ou modifier une entreprise",
            tags = {"entreprise"}
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "L'entreprise cree .",
                    content = @Content(array = @ArraySchema(
                            schema = @Schema(implementation = EntrepriseDto.class)))
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "L'entreprise n'est pas valide."
            )
    })
    EntrepriseDto create(@RequestBody EntrepriseDto compte);


    @GetMapping(
            value = APP_ROOT + ENTREPRISE + ALL,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Renvoi la liste des entreprises",
            description = "Cette methode permet de chercher et renvoyer la liste des entreprises qui existent",
            tags = {"entreprise"}
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "La liste des entreprises / Une liste vide",
                    content = @Content(array = @ArraySchema(
                            schema = @Schema(implementation = EntrepriseDto.class)))
            )
    })
    List<EntrepriseDto> getAll();
}
