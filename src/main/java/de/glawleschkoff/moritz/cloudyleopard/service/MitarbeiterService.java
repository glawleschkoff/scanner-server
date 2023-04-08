package de.glawleschkoff.moritz.cloudyleopard.service;

import de.glawleschkoff.moritz.cloudyleopard.model.MitarbeiterModel;
import de.glawleschkoff.moritz.cloudyleopard.repository.MitarbeiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MitarbeiterService {

    private final MitarbeiterRepository mitarbeiterRepository;

    @Autowired
    public MitarbeiterService(MitarbeiterRepository mitarbeiterRepository){
        this.mitarbeiterRepository = mitarbeiterRepository;
    }

    public List<MitarbeiterModel> getMitarbeiter(){
        return mitarbeiterRepository.findAll();
    }
}
