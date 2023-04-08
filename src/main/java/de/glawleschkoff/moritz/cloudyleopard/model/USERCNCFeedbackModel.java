package de.glawleschkoff.moritz.cloudyleopard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "USERCNCFeedback")
public class USERCNCFeedbackModel {

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
    @Column(columnDefinition = "VARCHAR(40) default 'NULL'")
    private String exemplarNr;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String Fortschritt;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String Maschine;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String Datum;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String Uhrzeit;
    @Column(columnDefinition = "VARCHAR(250) default 'NULL'")
    private String BestandsBuchung;

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

    public String getFortschritt() {
        return Fortschritt;
    }

    public String getMaschine() {
        return Maschine;
    }

    public String getDatum() {
        return Datum;
    }

    public String getUhrzeit() {
        return Uhrzeit;
    }
}
