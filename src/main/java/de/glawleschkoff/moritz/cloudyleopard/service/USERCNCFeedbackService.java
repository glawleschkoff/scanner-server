package de.glawleschkoff.moritz.cloudyleopard.service;

import de.glawleschkoff.moritz.cloudyleopard.model.USERCNCFeedbackModel;
import de.glawleschkoff.moritz.cloudyleopard.repository.USERCNCFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class USERCNCFeedbackService {

    private final USERCNCFeedbackRepository usercncFeedbackRepository;

    @Autowired
    public USERCNCFeedbackService(USERCNCFeedbackRepository usercncFeedbackRepository){
        this.usercncFeedbackRepository = usercncFeedbackRepository;
    }

    public List<USERCNCFeedbackModel> getUSERCNCFeedbackListById(String id){
        return usercncFeedbackRepository.getAllByExemplarNr(id);
    }
}
