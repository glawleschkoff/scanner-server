package de.glawleschkoff.moritz.cloudyleopard.repository;

import de.glawleschkoff.moritz.cloudyleopard.model.OptionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OptionRepository extends JpaRepository<OptionModel, String> {

    List<OptionModel> findByF20(String f20);
}
