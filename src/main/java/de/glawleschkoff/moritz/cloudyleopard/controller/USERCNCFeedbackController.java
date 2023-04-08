package de.glawleschkoff.moritz.cloudyleopard.controller;

import de.glawleschkoff.moritz.cloudyleopard.model.USERCNCFeedbackModel;
import de.glawleschkoff.moritz.cloudyleopard.service.USERCNCFeedbackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class USERCNCFeedbackController {

    private final USERCNCFeedbackService usercncFeedbackService;

    public USERCNCFeedbackController(USERCNCFeedbackService usercncFeedbackService){
        this.usercncFeedbackService = usercncFeedbackService;
    }

    @GetMapping("/api/v1/cncfeedback")
    public List<USERCNCFeedbackModel> getUSERCNCFeedbacks(@RequestParam String id){
        return usercncFeedbackService.getUSERCNCFeedbackListById(id);
    }
}
