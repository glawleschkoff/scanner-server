package de.glawleschkoff.moritz.cloudyleopard.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import de.glawleschkoff.moritz.cloudyleopard.model.USERPlattenLagerModel;
import de.glawleschkoff.moritz.cloudyleopard.service.USERPlattenLagerService;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.util.UUID;

@RestController
public class USERPlattenLagerController {
    private final USERPlattenLagerService userPlattenLagerService;

    public USERPlattenLagerController(USERPlattenLagerService userPlattenLagerService){
        this.userPlattenLagerService = userPlattenLagerService;
    }

    @GetMapping("/api/v1/plattenlager")
    public USERPlattenLagerModel getUSERPlattenLager(@RequestParam String id) throws JsonProcessingException {
        return userPlattenLagerService.getUSERPlattenLagerById(Double.parseDouble(id));
    }

    @GetMapping("/api/v1/plattenlagerupdate")
    public void updatePlattenLager(@RequestParam String lagerPlatz, Double lng, Double brt, String mz3, Double plattenId, String auslagerId, String auslagerInfo, Date auslagerDatum, Double menge) throws JsonProcessingException {
        userPlattenLagerService.updateUSERPlattenLager(lagerPlatz,lng,brt,mz3,plattenId,auslagerId,auslagerInfo,auslagerDatum,menge);
    }

    @GetMapping("/api/v1/plattenlagerinsert")
    public void newPlattenLager(@RequestParam Integer rowUserId, String matKurzzeichen, Double plattenId, String lagerplatz, String mz3, Double lng, Double brt) throws JsonProcessingException{
        userPlattenLagerService.insertUSERPlattenLager(rowUserId, matKurzzeichen, plattenId, lagerplatz, mz3, lng, brt);
    }

    @GetMapping("/api/v1/plattenlagermax")
    public Double getMaxPlattenID() {
        return userPlattenLagerService.getMaxPlattenID();
    }
}
