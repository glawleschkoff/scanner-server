package de.glawleschkoff.moritz.cloudyleopard.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import de.glawleschkoff.moritz.cloudyleopard.model.LagerModel;
import de.glawleschkoff.moritz.cloudyleopard.service.LagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LagerController {
    private final LagerService lagerService;

    public LagerController(LagerService lagerService){
        this.lagerService = lagerService;
    }

    @GetMapping("/api/v1/lager")
    public LagerModel getLager(@RequestParam String id) throws JsonProcessingException {
        return lagerService.getLagerModel(id);
    }

    @GetMapping("/api/v1/materialien")
    public List<String> getMaterialien() throws JsonProcessingException {
        return lagerService.getMaterialien();
    }
}
