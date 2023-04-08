package de.glawleschkoff.moritz.cloudyleopard.controller;

import de.glawleschkoff.moritz.cloudyleopard.model.MitarbeiterModel;
import de.glawleschkoff.moritz.cloudyleopard.service.MitarbeiterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MitarbeiterController {

    private final MitarbeiterService mitarbeiterService;

    public MitarbeiterController(MitarbeiterService mitarbeiterService){
        this.mitarbeiterService = mitarbeiterService;
    }

    @GetMapping("/api/v1/mitarbeiter")
    public List<MitarbeiterModel> getMitarbeiter(){
        return mitarbeiterService.getMitarbeiter();
    }
}
