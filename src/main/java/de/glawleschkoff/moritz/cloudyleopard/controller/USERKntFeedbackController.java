package de.glawleschkoff.moritz.cloudyleopard.controller;

import de.glawleschkoff.moritz.cloudyleopard.model.USERKntFeedbackModel;
import de.glawleschkoff.moritz.cloudyleopard.service.USERKntFeedbackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class USERKntFeedbackController {

    private final USERKntFeedbackService userKntFeedbackService;

    public USERKntFeedbackController(USERKntFeedbackService userKntFeedbackService){
        this.userKntFeedbackService = userKntFeedbackService;
    }

    @GetMapping("/api/v1/kntfeedback")
    public List<USERKntFeedbackModel> getUSERKntFeedbacks(@RequestParam String id){
        return userKntFeedbackService.getUSERKntFeedbackListById(id);
    }
}
