package de.glawleschkoff.moritz.cloudyleopard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "USERPlattenLager")
public class USERPlattenLagerModel {

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
    @Column(columnDefinition = "DOUBLE(15) default NULL")
    private Double plattenID;
    @Column(columnDefinition = "VARCHAR(10) default NULL")
    private String LagerPlatz;
    @Column(columnDefinition = "DOUBLE(15) default NULL")
    private Double Lng;
    @Column(columnDefinition = "DOUBLE(15) default NULL")
    private Double Brt;
    @Column(columnDefinition = "VARCHAR(30) default NULL")
    private String MatKurzzeichen;
    @Column(columnDefinition = "VARCHAR(60) default NULL")
    private String MZ3;
    @Column(columnDefinition = "DOUBLE(15) default NULL")
    private Double optimiert;
    @Column(columnDefinition = "DOUBLE(15) default NULL")
    private Double Produktion;
    @Column(columnDefinition = "VARCHAR(15) default NULL")
    private String MZ6;
    @Column(columnDefinition = "VARCHAR(60) default NULL")
    private String MZ1;
    @Column(columnDefinition = "DOUBLE(15) default NULL")
    private Double Menge;

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

    public Double getPlattenID() {
        return plattenID;
    }

    public String getLagerPlatz() {
        return LagerPlatz;
    }

    public Double getLng() {
        return Lng;
    }

    public Double getBrt() {
        return Brt;
    }

    public String getMatKurzzeichen() {
        return MatKurzzeichen;
    }

    public String getMZ3() {
        return MZ3;
    }

    public Double getOptimiert() {
        return optimiert;
    }

    public Double getProduktion() {
        return Produktion;
    }

    public String getMZ6() {
        return MZ6;
    }

    public String getMZ1() {
        return MZ1;
    }


    public Double getMenge() {
        return Menge;
    }
}
