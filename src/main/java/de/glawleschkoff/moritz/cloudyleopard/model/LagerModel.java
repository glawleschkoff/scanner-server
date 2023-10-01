package de.glawleschkoff.moritz.cloudyleopard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "Lager")
public class LagerModel {

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
    private String kurzzeichen;

    private String MPTextur;

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

    public String getKurzzeichen() {
        return kurzzeichen;
    }

    public String getMPTextur() {
        return MPTextur;
    }
}
