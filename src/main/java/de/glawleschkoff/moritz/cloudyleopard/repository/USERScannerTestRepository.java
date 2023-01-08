package de.glawleschkoff.moritz.cloudyleopard.repository;

import de.glawleschkoff.moritz.cloudyleopard.model.USERScannerTestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface USERScannerTestRepository extends JpaRepository<USERScannerTestModel, Integer> {
    /*@Transactional
    @Modifying
    @Query("update USERScannerTestModel u set u.F1 = ?1 where u.RowID = ?2")
    void update(String F1, Integer RowID);

     */

    @Modifying
    @Query(value = "insert into USERScannerTest (ExemplarNr) values ('54')", nativeQuery = true)
    void customSave(@Param("ExemplarNr") String ExemplarNr);
}
