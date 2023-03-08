package de.glawleschkoff.moritz.cloudyleopard.controller;

import de.glawleschkoff.moritz.cloudyleopard.model.USERScannerTestModel;
import de.glawleschkoff.moritz.cloudyleopard.service.USERScannerTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class USERScannerTestController {
    private final USERScannerTestService userScannerTestService;

    public USERScannerTestController(USERScannerTestService userScannerTestService) {
        this.userScannerTestService = userScannerTestService;
    }

    //@GetMapping
    public List<USERScannerTestModel> hello(){
        return userScannerTestService.getItems();
    }
/*
    @GetMapping (path = "{var}")
    public void post(@PathVariable("var") String f1){
        userScannerTestService.modifyUSERScannerTest(f1, 1);
    }

 */
    //@GetMapping(path ="{var}")
    public void insert(@PathVariable("var") String f1){
        userScannerTestService.insertUSERScannerTest(f1);
    }
}
