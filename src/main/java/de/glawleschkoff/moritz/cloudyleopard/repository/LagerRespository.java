package de.glawleschkoff.moritz.cloudyleopard.repository;

import de.glawleschkoff.moritz.cloudyleopard.model.LagerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LagerRespository extends JpaRepository<LagerModel, Integer> {

    @Query(value = "select RowID, RowTimestamp, RowUserID, RowGUID, RowCreationTimestamp" +
            ", RowEarliestDelDate, RowLatestDelDate, Kurzzeichen" +
            ", GetDDMStr('MPTextur',RowDDMFields) as MPTextur" +
            " from Lager a where a.Kurzzeichen= :id ", nativeQuery = true)
    LagerModel findByKurzzeichen(String id);

    @Query(value = "select Kurzzeichen from Lager a where a.Material_Art = 'P'", nativeQuery = true)
    List<String> findMaterialien();

}
