package de.glawleschkoff.moritz.cloudyleopard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "USERKntFeedback")
public class USERKntFeedbackModel {

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
    @Column(columnDefinition = "VARCHAR(40) default NULL")
    private String DateiName;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String exemplarNr;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String LaufNr;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String Kante;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String PlatteLng;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String PlatteBrt;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String PlatteDck;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String KantenMat;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String KantenLng;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String Datum;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String Uhrzeit;

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

    public String getDateiName() {
        return DateiName;
    }

    public String getExemplarNr() {
        return exemplarNr;
    }

    public String getLaufNr() {
        return LaufNr;
    }

    public String getKante() {
        return Kante;
    }

    public String getPlatteLng() {
        return PlatteLng;
    }

    public String getPlatteBrt() {
        return PlatteBrt;
    }

    public String getPlatteDck() {
        return PlatteDck;
    }

    public String getKantenMat() {
        return KantenMat;
    }

    public String getKantenLng() {
        return KantenLng;
    }

    public String getDatum() {
        return Datum;
    }

    public String getUhrzeit() {
        return Uhrzeit;
    }
}
