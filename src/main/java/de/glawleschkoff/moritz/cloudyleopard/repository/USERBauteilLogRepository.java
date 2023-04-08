package de.glawleschkoff.moritz.cloudyleopard.repository;

import de.glawleschkoff.moritz.cloudyleopard.model.USERBauteilLogModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface USERBauteilLogRepository extends JpaRepository<USERBauteilLogModel, Integer> {

    List<USERBauteilLogModel> getAllByExemplarNr(String id);
}
