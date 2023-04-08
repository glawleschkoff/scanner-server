package de.glawleschkoff.moritz.cloudyleopard.service;

import de.glawleschkoff.moritz.cloudyleopard.model.USERBauteilLogModel;
import de.glawleschkoff.moritz.cloudyleopard.repository.USERBauteilLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class USERBauteilLogService {

    private final USERBauteilLogRepository userBauteilLogRepository;

    @Autowired
    public USERBauteilLogService(USERBauteilLogRepository userBauteilLogRepository){
        this.userBauteilLogRepository = userBauteilLogRepository;
    }

    public List<USERBauteilLogModel> getUSERBauteilLogListById(String id){
        return userBauteilLogRepository.getAllByExemplarNr(id);
    }
}
