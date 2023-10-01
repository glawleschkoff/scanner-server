package de.glawleschkoff.moritz.cloudyleopard.service;

import de.glawleschkoff.moritz.cloudyleopard.model.LagerModel;
import de.glawleschkoff.moritz.cloudyleopard.repository.LagerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LagerService {
    private final LagerRespository lagerRespository;

    @Autowired
    public LagerService(LagerRespository lagerRespository){
        this.lagerRespository = lagerRespository;
    }

    public LagerModel getLagerModel(String id){
        return lagerRespository.findByKurzzeichen(id);
    }

    public List<String> getMaterialien(){
        return lagerRespository.findMaterialien();
    }
}
