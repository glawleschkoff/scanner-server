package de.glawleschkoff.moritz.cloudyleopard.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "USERALBDetails")
public class USERALBDetailsModel {

    @Id
    @Column(columnDefinition = "IDENTITY(10) default '0'")
    private Integer rowID;
    @Column(columnDefinition = "TIMESTAMP(23) default NULL")
    private Timestamp RowTimestamp;
    @Column(columnDefinition = "INTEGER default NULL")
    private Integer RowUserID;
    @Column(columnDefinition = "LONGVARCHAR(65500) default NULL")
    private String RowDDMFields;
    @Column(columnDefinition = "UNIQUEIDENTIFIER(36) default NULL")
    private UUID RowGUID;
    @Column(columnDefinition = "TIMESTAMP(23) default NULL")
    private Timestamp RowCreationTimestamp;
    @Column(columnDefinition = "DATE(10) default NULL")
    private Date RowEarliestDelDate;
    @Column(columnDefinition = "DATE(10) default NULL")
    private Date RowLatestDelDate;
    @Column(columnDefinition = "VARCHAR(40) default 'NULL'")
    private String ExemplarNr;
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

    public Integer getRowID() {
        return rowID;
    }

    public Timestamp getRowTimestamp() {
        return RowTimestamp;
    }

    public Integer getRowUserID() {
        return RowUserID;
    }

    public String getRowDDMFields() {
        return RowDDMFields;
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
        return ExemplarNr;
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
}
