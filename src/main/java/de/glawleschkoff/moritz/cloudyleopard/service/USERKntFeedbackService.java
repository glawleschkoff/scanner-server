package de.glawleschkoff.moritz.cloudyleopard.service;

import de.glawleschkoff.moritz.cloudyleopard.model.USERKntFeedbackModel;
import de.glawleschkoff.moritz.cloudyleopard.repository.USERKntFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class USERKntFeedbackService {

    private final USERKntFeedbackRepository userKntFeedbackRepository;

    @Autowired
    public USERKntFeedbackService(USERKntFeedbackRepository userKntFeedbackRepository){
        this.userKntFeedbackRepository = userKntFeedbackRepository;
    }

    public List<USERKntFeedbackModel> getUSERKntFeedbackListById(String id){
        return userKntFeedbackRepository.getAllByExemplarNr(id);
    }
}
