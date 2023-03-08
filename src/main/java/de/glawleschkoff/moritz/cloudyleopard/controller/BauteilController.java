package de.glawleschkoff.moritz.cloudyleopard.controller;

import de.glawleschkoff.moritz.cloudyleopard.model.BauteilModel;
import de.glawleschkoff.moritz.cloudyleopard.service.BauteilService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BauteilController {

    private final BauteilService bauteilService;

    public BauteilController(BauteilService bauteilService){
        this.bauteilService = bauteilService;
    }

    //@GetMapping("/api/v1/bauteil")
    public BauteilModel getBauteil(@RequestParam String id){
        return bauteilService.getBauteilById(id);
    }
}
