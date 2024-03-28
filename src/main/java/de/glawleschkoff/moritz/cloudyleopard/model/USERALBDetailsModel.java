package de.glawleschkoff.moritz.cloudyleopard.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "USERALBDetails")
public class USERALBDetailsModel {

    @Id
    @Column(columnDefinition = "IDENTITY(10) default '0'", name = "RowID")
    private Integer rowID;
    @Column(columnDefinition = "TIMESTAMP(23) default NULL")
    private Timestamp RowTimestamp;
    @Column(columnDefinition = "INTEGER default NULL")
    private Integer RowUserID;
    @Column(columnDefinition = "UNIQUEIDENTIFIER(36) default NULL")
    private UUID RowGUID;
    @Column(columnDefinition = "TIMESTAMP(23) default NULL")
    private Timestamp RowCreationTimestamp;
    @Column(columnDefinition = "DATE(10) default NULL")
    private Date RowEarliestDelDate;
    @Column(columnDefinition = "DATE(10) default NULL")
    private Date RowLatestDelDate;
    @Column(columnDefinition = "VARCHAR(40) default 'NULL'")
    private String exemplarNr;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String ALBAuftrag;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String ALBPosition;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String KundenAuftrag;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String KundenPosition;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String ScannerAnweisung;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String ScannerAntwort;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String OriginalIDNUM;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String Platte;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String KA;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String KB;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String KC;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String KD;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String KE;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String KF;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String KG;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String KH;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String Status;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String Kommentar;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String ProdFreigabe;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String F20;
    private String ProdDatum;
    private String FertigDatum;
    private String LetztesReset;
    private String BeginnPlatte;
    private String BeginnKante;
    private String BeginnBankQM;
    private String BeginnVerpk;
    private String SollZtPlatte;
    private String SollZtKante;
    private String SollZtBankQM;
    private String BauteilAnzGes;
    private String ProdStopp;
    private String PL_FLng;
    private String PL_FBrt;
    private String ZLng;
    private String ZBrt;
    private String Prio1Datum;
    private String Prio2Datum;
    private String Prio;
    private String ArdisJob;
    private String ArdisSPln;
    private String PlattenID;
    private String Maschine;
    private String Säge;
    private String OptiQuote;
    private String OptiQtEff;
    private String StripNo;
    private String PlatteKlein;
    private String Ausw;
    private String AuslagerID;
    private String ausgelagert;
    private String SPlan_gedruckt;
    private String BTEti_gedruckt;
    private String STEti_gedruckt;
    private String BAZ_Vorgabe;
    private String BAZ_Fortschritt;
    private String Kante_Fortschritt;
    private String FertigZuschnitt;
    private String ZuschnittDatum;
    private String KA_Ist_L;
    private String KB_Ist_L;
    private String KC_Ist_L;
    private String KD_Ist_L;
    private String KE_Ist_L;
    private String KF_Ist_L;
    private String KG_Ist_L;
    private String KH_Ist_L;
    private String KA_Läufe;
    private String KB_Läufe;
    private String KC_Läufe;
    private String KD_Läufe;
    private String KE_Läufe;
    private String KF_Läufe;
    private String KG_Läufe;
    private String KH_Läufe;
    private String KA_Verbrauch;
    private String KB_Verbrauch;
    private String KC_Verbrauch;
    private String KD_Verbrauch;
    private String KE_Verbrauch;
    private String KF_Verbrauch;
    private String KG_Verbrauch;
    private String KH_Verbrauch;
    private String FertigKante;
    private String CP_ausblenden;
    private String NB_Fortschritt;


    public String getFertigDatum() {
        return FertigDatum;
    }

    public String getLetztesReset() {
        return LetztesReset;
    }

    public String getBeginnPlatte() {
        return BeginnPlatte;
    }

    public String getBeginnKante() {
        return BeginnKante;
    }

    public String getBeginnBankQM() {
        return BeginnBankQM;
    }

    public String getBeginnVerpk() {
        return BeginnVerpk;
    }

    public String getSollZtPlatte() {
        return SollZtPlatte;
    }

    public String getSollZtKante() {
        return SollZtKante;
    }

    public String getSollZtBankQM() {
        return SollZtBankQM;
    }

    public String getBauteilAnzGes() {
        return BauteilAnzGes;
    }

    public String getProdStopp() {
        return ProdStopp;
    }

    public String getPL_FLng() {
        return PL_FLng;
    }

    public String getPL_FBrt() {
        return PL_FBrt;
    }

    public String getZLng() {
        return ZLng;
    }

    public String getZBrt() {
        return ZBrt;
    }

    public String getPrio1Datum() {
        return Prio1Datum;
    }

    public String getPrio2Datum() {
        return Prio2Datum;
    }

    public String getPrio() {
        return Prio;
    }

    public String getArdisJob() {
        return ArdisJob;
    }

    public String getArdisSPln() {
        return ArdisSPln;
    }

    public String getKante_Fortschritt() {
        return Kante_Fortschritt;
    }

    public String getPlattenID() {
        return PlattenID;
    }

    public String getMaschine() {
        return Maschine;
    }

    public String getSäge() {
        return Säge;
    }

    public String getOptiQuote() {
        return OptiQuote;
    }

    public String getOptiQtEff() {
        return OptiQtEff;
    }

    public String getStripNo() {
        return StripNo;
    }

    public String getPlatteKlein() {
        return PlatteKlein;
    }

    public String getAusw() {
        return Ausw;
    }

    public String getAuslagerID() {
        return AuslagerID;
    }

    public String getAusgelagert() {
        return ausgelagert;
    }

    public String getSPlan_gedruckt() {
        return SPlan_gedruckt;
    }

    public String getBTEti_gedruckt() {
        return BTEti_gedruckt;
    }

    public String getSTEti_gedruckt() {
        return STEti_gedruckt;
    }

    public String getBAZ_Vorgabe() {
        return BAZ_Vorgabe;
    }

    public String getBAZ_Fortschritt() {
        return BAZ_Fortschritt;
    }

    public String getFertigZuschnitt() {
        return FertigZuschnitt;
    }

    public String getZuschnittDatum() {
        return ZuschnittDatum;
    }

    public String getKA_Ist_L() {
        return KA_Ist_L;
    }

    public String getKB_Ist_L() {
        return KB_Ist_L;
    }

    public String getKC_Ist_L() {
        return KC_Ist_L;
    }

    public String getKD_Ist_L() {
        return KD_Ist_L;
    }

    public String getKE_Ist_L() {
        return KE_Ist_L;
    }

    public String getKF_Ist_L() {
        return KF_Ist_L;
    }

    public String getKG_Ist_L() {
        return KG_Ist_L;
    }

    public String getKH_Ist_L() {
        return KH_Ist_L;
    }

    public String getKA_Läufe() {
        return KA_Läufe;
    }

    public String getKB_Läufe() {
        return KB_Läufe;
    }

    public String getKC_Läufe() {
        return KC_Läufe;
    }

    public String getKD_Läufe() {
        return KD_Läufe;
    }

    public String getKE_Läufe() {
        return KE_Läufe;
    }

    public String getKF_Läufe() {
        return KF_Läufe;
    }

    public String getKG_Läufe() {
        return KG_Läufe;
    }

    public String getKH_Läufe() {
        return KH_Läufe;
    }

    public String getKA_Verbrauch() {
        return KA_Verbrauch;
    }

    public String getKB_Verbrauch() {
        return KB_Verbrauch;
    }

    public String getKC_Verbrauch() {
        return KC_Verbrauch;
    }

    public String getKD_Verbrauch() {
        return KD_Verbrauch;
    }

    public String getKE_Verbrauch() {
        return KE_Verbrauch;
    }

    public String getKF_Verbrauch() {
        return KF_Verbrauch;
    }

    public String getKG_Verbrauch() {
        return KG_Verbrauch;
    }

    public String getKH_Verbrauch() {
        return KH_Verbrauch;
    }

    public String getFertigKante() {
        return FertigKante;
    }

    public String getCP_ausblenden() {
        return CP_ausblenden;
    }

    public String getProdDatum(){
        return ProdDatum;
    }

    public Integer getRowID() {
        return rowID;
    }

    public Timestamp getRowTimestamp() {
        return RowTimestamp;
    }

    public Integer getRowUserID() {
        return RowUserID;
    }

    public UUID getRowGUID() {
        return RowGUID;
    }

    public Timestamp getRowCreationTimestamp() {
        return RowCreationTimestamp;
    }

    public Date getRowEarliestDelDate() {
        return RowEarliestDelDate;
    }

    public Date getRowLatestDelDate() {
        return RowLatestDelDate;
    }

    public String getExemplarNr() {
        return exemplarNr;
    }

    public String getALBAuftrag() {
        return ALBAuftrag;
    }

    public String getALBPosition() {
        return ALBPosition;
    }

    public String getKundenAuftrag() {
        return KundenAuftrag;
    }

    public String getKundenPosition() {
        return KundenPosition;
    }

    public String getScannerAnweisung() {
        return ScannerAnweisung;
    }

    public String getScannerAntwort() {
        return ScannerAntwort;
    }

    public String getOriginalIDNUM() {
        return OriginalIDNUM;
    }

    public String getPlatte() {
        return Platte;
    }

    public String getKA() {
        return KA;
    }

    public String getKB() {
        return KB;
    }

    public String getKC() {
        return KC;
    }

    public String getKD() {
        return KD;
    }

    public String getKE() {
        return KE;
    }

    public String getKF() {
        return KF;
    }

    public String getKG() {
        return KG;
    }

    public String getKH() {
        return KH;
    }

    public String getStatus() {
        return Status;
    }

    public String getKommentar() {
        return Kommentar;
    }

    public String getProdFreigabe() {
        return ProdFreigabe;
    }

    public String getF20() {
        return F20;
    }

    public String getNB_Fortschritt() {
        return NB_Fortschritt;
    }


}
