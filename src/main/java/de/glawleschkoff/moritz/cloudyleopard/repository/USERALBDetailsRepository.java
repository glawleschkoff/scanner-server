package de.glawleschkoff.moritz.cloudyleopard.repository;

import de.glawleschkoff.moritz.cloudyleopard.model.USERALBDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface USERALBDetailsRepository extends JpaRepository<USERALBDetailsModel, Integer> {

    @Query(value = "select RowID, RowTimestamp, RowUserID, RowGUID, RowCreationTimestamp" +
            ", RowEarliestDelDate, RowLatestDelDate, ExemplarNr, ALBAuftrag, ALBPosition, KundenAuftrag" +
            ", KundenPosition, ScannerAnweisung, ScannerAntwort, OriginalIDNUM, Platte, KA, KB, KC, KD" +
            ", KE, KF, KG, KH, Status, Kommentar, ProdFreigabe, F20" +
            ", GetDDMDate('ProdDatum',RowDDMFields) as ProdDatum" +
            ", GetDDMDate('FertigDatum',RowDDMFields) as FertigDatum" +
            ", GetDDMStr('LetztesReset',RowDDMFields) as LetztesReset" +
            ", GetDDMDate('BeginnPlatte',RowDDMFields) as BeginnPlatte" +
            ", GetDDMDate('BeginnKante',RowDDMFields) as BeginnKante" +
            ", GetDDMDate('BeginnBankQM',RowDDMFields) as BeginnBankQM" +
            ", GetDDMDate('BeginnVerpk',RowDDMFields) as BeginnVerpk" +
            ", GetDDMVal('SollZtPlatte',RowDDMFields) as SollZtPlatte" +
            ", GetDDMVal('SollZtKante',RowDDMFields) as SollZtKante" +
            ", GetDDMVal('SollZtBankQM',RowDDMFields) as SollZtBankQM" +
            ", GetDDMVal('BauteilAnzGes',RowDDMFields) as BauteilAnzGes" +
            ", GetDDMStr('ProdStopp',RowDDMFields) as ProdStopp" +
            ", GetDDMVal('PL FLng',RowDDMFields) as PL_FLng" +
            ", GetDDMVal('PL FBrt',RowDDMFields) as PL_FBrt" +
            ", GetDDMVal('ZLng',RowDDMFields) as ZLng" +
            ", GetDDMVal('ZBrt',RowDDMFields) as ZBrt" +
            ", GetDDMDate('Prio1Datum',RowDDMFields) as Prio1Datum" +
            ", GetDDMDate('Prio2Datum',RowDDMFields) as Prio2Datum" +
            ", GetDDMVal('Prio',RowDDMFields) as Prio" +
            ", GetDDMStr('ArdisJob',RowDDMFields) as ArdisJob" +
            ", GetDDMVal('ArdisSPln',RowDDMFields) as ArdisSPln" +
            ", GetDDMStr('PlattenID',RowDDMFields) as PlattenID" +
            ", GetDDMStr('Maschine',RowDDMFields) as Maschine" +
            ", GetDDMStr('Säge',RowDDMFields) as Säge" +
            ", GetDDMVal('OptiQuote',RowDDMFields) as OptiQuote" +
            ", GetDDMVal('OptiQtEff',RowDDMFields) as OptiQtEff" +
            ", GetDDMVal('StripNo',RowDDMFields) as StripNo" +
            ", GetDDMVal('PlatteKlein',RowDDMFields) as PlatteKlein" +
            ", GetDDMB('Ausw',RowDDMFields) as Ausw" +
            ", GetDDMStr('AuslagerID',RowDDMFields) as AuslagerID" +
            ", GetDDMDate('ausgelagert',RowDDMFields) as ausgelagert" +
            ", GetDDMB('SPlan gedruckt',RowDDMFields) as SPlan_gedruckt" +
            ", GetDDMB('BTEti gedruckt',RowDDMFields) as BTEti_gedruckt" +
            ", GetDDMB('STEti gedruckt',RowDDMFields) as STEti_gedruckt" +
            ", GetDDMStr('BAZ Vorgabe',RowDDMFields) as BAZ_Vorgabe" +
            ", GetDDMStr('BAZ Fortschritt',RowDDMFields) as BAZ_Fortschritt" +
            ", GetDDMStr('Kante Fortschritt',RowDDMFields) as Kante_Fortschritt" +
            ", GetDDMB('FertigZuschnitt',RowDDMFields) as FertigZuschnitt" +
            ", GetDDMDate('ZuschnittDatum',RowDDMFields) as ZuschnittDatum" +
            ", GetDDMVal('KA Ist L',RowDDMFields) as KA_Ist_L" +
            ", GetDDMVal('KB Ist L',RowDDMFields) as KB_Ist_L" +
            ", GetDDMVal('KC Ist L',RowDDMFields) as KC_Ist_L" +
            ", GetDDMVal('KD Ist L',RowDDMFields) as KD_Ist_L" +
            ", GetDDMVal('KE Ist L',RowDDMFields) as KE_Ist_L" +
            ", GetDDMVal('KF Ist L',RowDDMFields) as KF_Ist_L" +
            ", GetDDMVal('KG Ist L',RowDDMFields) as KG_Ist_L" +
            ", GetDDMVal('KH Ist L',RowDDMFields) as KH_Ist_L" +
            ", GetDDMVal('KA Läufe',RowDDMFields) as KA_Läufe" +
            ", GetDDMVal('KB Läufe',RowDDMFields) as KB_Läufe" +
            ", GetDDMVal('KC Läufe',RowDDMFields) as KC_Läufe" +
            ", GetDDMVal('KD Läufe',RowDDMFields) as KD_Läufe" +
            ", GetDDMVal('KE Läufe',RowDDMFields) as KE_Läufe" +
            ", GetDDMVal('KF Läufe',RowDDMFields) as KF_Läufe" +
            ", GetDDMVal('KG Läufe',RowDDMFields) as KG_Läufe" +
            ", GetDDMVal('KH Läufe',RowDDMFields) as KH_Läufe" +
            ", GetDDMVal('KA Verbrauch',RowDDMFields) as KA_Verbrauch" +
            ", GetDDMVal('KB Verbrauch',RowDDMFields) as KB_Verbrauch" +
            ", GetDDMVal('KC Verbrauch',RowDDMFields) as KC_Verbrauch" +
            ", GetDDMVal('KD Verbrauch',RowDDMFields) as KD_Verbrauch" +
            ", GetDDMVal('KE Verbrauch',RowDDMFields) as KE_Verbrauch" +
            ", GetDDMVal('KF Verbrauch',RowDDMFields) as KF_Verbrauch" +
            ", GetDDMVal('KG Verbrauch',RowDDMFields) as KG_Verbrauch" +
            ", GetDDMVal('KH Verbrauch',RowDDMFields) as KH_Verbrauch" +
            ", GetDDMB('FertigKante',RowDDMFields) as FertigKante" +
            ", GetDDMB('CP ausblenden',RowDDMFields) as CP_ausblenden" +
            " from USERALBDetails a where a.ExemplarNr= :id ", nativeQuery = true)
    USERALBDetailsModel findByExemplarNr(String id);

    @Transactional
    @Modifying
    @Query(value = "update USERALBDetails u set u.ScannerAntwort = :scannerAnweisung where u.ExemplarNr = :exemplarNr", nativeQuery = true)
    void updateUSERALBDetails(String exemplarNr, String scannerAnweisung);

}











