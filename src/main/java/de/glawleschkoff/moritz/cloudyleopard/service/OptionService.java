package de.glawleschkoff.moritz.cloudyleopard.service;

import de.glawleschkoff.moritz.cloudyleopard.model.OptionModel;
import de.glawleschkoff.moritz.cloudyleopard.repository.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionService {

    private final OptionRepository optionRepository;

    @Autowired
    public OptionService(OptionRepository optionRepository){
        this.optionRepository = optionRepository;
    }

    public List<OptionModel> getAllOptions(){
        return optionRepository.findByF20("OPTION");
    }
}
