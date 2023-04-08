package de.glawleschkoff.moritz.cloudyleopard.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.glawleschkoff.moritz.cloudyleopard.model.USERALBDetailsModel;
import de.glawleschkoff.moritz.cloudyleopard.service.USERALBDetailsService;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class USERALBDetailsController {

    private final USERALBDetailsService useralbDetailsService;

    public USERALBDetailsController(USERALBDetailsService useralbDetailsService){
        this.useralbDetailsService = useralbDetailsService;
    }

    @GetMapping("/api/v1/bauteil")
    public USERALBDetailsModel getUSERALBDetails(@RequestParam String id) throws JsonProcessingException {
        return useralbDetailsService.getUSERALBDetailsById(id);
    }

}
