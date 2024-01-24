package de.glawleschkoff.moritz.cloudyleopard.repository;

import de.glawleschkoff.moritz.cloudyleopard.model.USERPlattenLagerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Repository
public interface USERPlattenLagerRepository extends JpaRepository<USERPlattenLagerModel, Integer> {
    USERPlattenLagerModel findByPlattenID(Double id);

    @Transactional
    @Modifying
    @Query(value = "update USERPlattenLager u set u.LagerPlatz = :lagerPlatz, u.Lng = :lng, u.Brt = :brt, u.MZ3 = :mz3, u.MZ6 = :auslagerId, u.MZ1 = :auslagerInfo+' '+CONVERT(DAYOFMONTH(CURRENT_TIMESTAMP()),SQL_VARCHAR)+'.'+CONVERT(MONTH(CURRENT_TIMESTAMP()),SQL_VARCHAR)+'.'+CONVERT(YEAR(CURRENT_TIMESTAMP()),SQL_VARCHAR)+' '+CONVERT(CURTIME(),SQL_VARCHAR), u.MZD1 = :auslagerDatum, u.Menge = :menge where u.PlattenId = :plattenId", nativeQuery = true)
    void updateUSERPlattenLager(String lagerPlatz, Double lng, Double brt, String mz3, Double plattenId, String auslagerId, String auslagerInfo, Date auslagerDatum, Double menge);

    @Transactional
    @Modifying
    @Query(value = "insert into USERPlattenLager (RowTimestamp, RowUserID, RowGUID, RowCreationTimestamp, MatKurzzeichen, PlattenID, LagerPlatz, MZ3, Lng, Brt, Menge, MZD2) " +
            "values (CURRENT_TIMESTAMP() , :rowUserId, NEWID() , CURRENT_TIMESTAMP() , :matKurzzeichen, :plattenId, :lagerPlatz, :mz3, :lng, :brt, 1, CURRENT_DATE())", nativeQuery = true)
    void insertUSERPlattenLager(Integer rowUserId, String matKurzzeichen, Double plattenId, String lagerPlatz, String mz3, Double lng, Double brt);

    @Query(value = "SELECT MAX(PlattenID) FROM USERPlattenLager WHERE PlattenID >= 6000000000 AND PlattenID < 7000000000", nativeQuery = true)
    Double findMaxPlattenID();
}
