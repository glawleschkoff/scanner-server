package de.glawleschkoff.moritz.cloudyleopard.service;

import de.glawleschkoff.moritz.cloudyleopard.model.BauteilModel;
import de.glawleschkoff.moritz.cloudyleopard.repository.BauteilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BauteilService {

    private final BauteilRepository bauteilRepository;

    @Autowired
    public BauteilService(BauteilRepository bauteilRepository){
        this.bauteilRepository = bauteilRepository;
    }

    public BauteilModel getBauteilById(String id){
        return bauteilRepository.findByF20AndF1("BAUTEIL", id);
    }
}
