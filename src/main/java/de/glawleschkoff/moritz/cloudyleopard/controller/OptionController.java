package de.glawleschkoff.moritz.cloudyleopard.controller;

import de.glawleschkoff.moritz.cloudyleopard.model.OptionModel;
import de.glawleschkoff.moritz.cloudyleopard.service.OptionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OptionController {

    private final OptionService optionService;

    public OptionController(OptionService optionService){
        this.optionService = optionService;
    }

    @GetMapping("/api/v1/options")
    public List<OptionModel> getOptions(){
        return optionService.getAllOptions();
    }
}
