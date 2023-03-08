package de.glawleschkoff.moritz.cloudyleopard.repository;

import de.glawleschkoff.moritz.cloudyleopard.model.BauteilModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BauteilRepository extends JpaRepository<BauteilModel, String> {

    BauteilModel findByF20AndF1(String f20, String f1);
}
