package de.glawleschkoff.moritz.cloudyleopard.repository;

import de.glawleschkoff.moritz.cloudyleopard.model.USERALBDetailsModel;
import de.glawleschkoff.moritz.cloudyleopard.model.USERCNCFeedbackModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface USERCNCFeedbackRepository extends JpaRepository<USERCNCFeedbackModel, Integer> {

    List<USERCNCFeedbackModel> getAllByExemplarNr(String id);
}
