package de.glawleschkoff.moritz.cloudyleopard.repository;

import de.glawleschkoff.moritz.cloudyleopard.model.USERKntFeedbackModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface USERKntFeedbackRepository extends JpaRepository<USERKntFeedbackModel, Integer> {

    List<USERKntFeedbackModel> getAllByExemplarNr(String id);
}
