package de.glawleschkoff.moritz.cloudyleopard.repository;

import de.glawleschkoff.moritz.cloudyleopard.model.USERALBDetailsModel;
import de.glawleschkoff.moritz.cloudyleopard.model.USERBauteilLogModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface USERBauteilLogRepository extends JpaRepository<USERBauteilLogModel, Integer> {



    @Query(value = "select RowID, RowTimestamp, RowUserID, RowGUID, RowCreationTimestamp" +
            ", RowEarliestDelDate, RowLatestDelDate, Datum, Uhrzeit, ExemplarNr, Job, Vorgang, Protokoll" +
            ", GetDDMStr('Mitarbeiter',RowDDMFields) as Mitarbeiter" +
            ", GetDDMStr('Ergebnis',RowDDMFields) as Ergebnis" +
            " from USERBauteilLog a where a.ExemplarNr= :id ", nativeQuery = true)
    List<USERBauteilLogModel> getAllByExemplarNr(String id);



}
