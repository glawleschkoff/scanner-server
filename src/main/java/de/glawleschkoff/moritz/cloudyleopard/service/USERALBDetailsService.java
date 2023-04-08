package de.glawleschkoff.moritz.cloudyleopard.service;

import de.glawleschkoff.moritz.cloudyleopard.model.USERALBDetailsModel;
import de.glawleschkoff.moritz.cloudyleopard.repository.USERALBDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class USERALBDetailsService {

    private final USERALBDetailsRepository useralbDetailsRepository;

    @Autowired
    public USERALBDetailsService(USERALBDetailsRepository useralbDetailsRepository){
        this.useralbDetailsRepository = useralbDetailsRepository;
    }

    public USERALBDetailsModel getUSERALBDetailsById(String id){
        return useralbDetailsRepository.findByExemplarNr(id);
    }

}
