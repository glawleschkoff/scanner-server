package de.glawleschkoff.moritz.cloudyleopard.repository;

import de.glawleschkoff.moritz.cloudyleopard.model.USERKommWagenModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface USERKommWagenRepository extends JpaRepository<USERKommWagenModel, Integer> {

    @Query(value = "select RowId, Auftrag, WagenKennung" +
            " from USERKommWagen a where a.Auftrag= :auftrag ", nativeQuery = true)
    USERKommWagenModel findByAuftrag(String auftrag);



}
