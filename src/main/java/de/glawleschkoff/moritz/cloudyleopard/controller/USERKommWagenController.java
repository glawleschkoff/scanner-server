package de.glawleschkoff.moritz.cloudyleopard.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import de.glawleschkoff.moritz.cloudyleopard.model.USERKommWagenModel;
import de.glawleschkoff.moritz.cloudyleopard.service.USERKommWagenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class USERKommWagenController {

    private final USERKommWagenService userKommWagenService;

    public USERKommWagenController(USERKommWagenService userKommWagenService){
        this.userKommWagenService = userKommWagenService;
    }

    @GetMapping("/api/v1/kommwagen")
    public USERKommWagenModel getUSERKommWagen(@RequestParam String auftrag) throws JsonProcessingException {
        return userKommWagenService.getUSERKommWagenByAuftrag(auftrag);
    }

}
