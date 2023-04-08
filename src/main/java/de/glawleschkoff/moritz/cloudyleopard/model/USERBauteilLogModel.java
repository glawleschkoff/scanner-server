package de.glawleschkoff.moritz.cloudyleopard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "USERBauteilLog")
public class USERBauteilLogModel {

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
    @Column(columnDefinition = "DATE(10) default NULL")
    private Date Datum;
    @Column(columnDefinition = "DOUBLE(15) default NULL")
    private Double Uhrzeit;
    @Column(columnDefinition = "VARCHAR(30) default NULL")
    private String exemplarNr;
    @Column(columnDefinition = "VARCHAR(30) default NULL")
    private String Job;
    @Column(columnDefinition = "VARCHAR(30) default NULL")
    private String Vorgang;
    @Column(columnDefinition = "LONGVARCHAR(65500) default NULL")
    private String Protokoll;

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

    public Date getDatum() {
        return Datum;
    }

    public Double getUhrzeit() {
        return Uhrzeit;
    }

    public String getExemplarNr() {
        return exemplarNr;
    }

    public String getJob() {
        return Job;
    }

    public String getVorgang() {
        return Vorgang;
    }

    public String getProtokoll() {
        return Protokoll;
    }
}
