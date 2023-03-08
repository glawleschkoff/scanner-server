package de.glawleschkoff.moritz.cloudyleopard.repository;

import de.glawleschkoff.moritz.cloudyleopard.model.USERALBDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface USERALBDetailsRepository extends JpaRepository<USERALBDetailsModel, Integer> {

    //@Query(value = "select GetDDMStr('RowCreationUserID', RowDDMFields) AS PL_FLng from USERALBDetails where RowID = ?1", nativeQuery = true)
    USERALBDetailsModel findByRowID(Integer id);

}
