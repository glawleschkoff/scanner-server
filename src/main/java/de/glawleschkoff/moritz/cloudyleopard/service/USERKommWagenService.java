package de.glawleschkoff.moritz.cloudyleopard.service;

import de.glawleschkoff.moritz.cloudyleopard.model.USERKommWagenModel;
import de.glawleschkoff.moritz.cloudyleopard.repository.USERKommWagenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class USERKommWagenService {

    private final USERKommWagenRepository userKommWagenRepository;

    @Autowired
    public USERKommWagenService(USERKommWagenRepository userKommWagenRepository){
        this.userKommWagenRepository = userKommWagenRepository;
    }

    public USERKommWagenModel getUSERKommWagenByAuftrag(Integer auftrag){
        return userKommWagenRepository.findByAuftrag(auftrag);
    }

}
