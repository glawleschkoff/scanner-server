package de.glawleschkoff.moritz.cloudyleopard.controller;

import de.glawleschkoff.moritz.cloudyleopard.model.USERBauteilLogModel;
import de.glawleschkoff.moritz.cloudyleopard.service.USERBauteilLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class USERBauteilLogController {

    private final USERBauteilLogService userBauteilLogService;

    public USERBauteilLogController(USERBauteilLogService userBauteilLogService){
        this.userBauteilLogService = userBauteilLogService;
    }

    @GetMapping("/api/v1/bauteillog")
    public List<USERBauteilLogModel> getUSERBauteilLogs(@RequestParam String id){
        return userBauteilLogService.getUSERBauteilLogListById(id);
    }
}
