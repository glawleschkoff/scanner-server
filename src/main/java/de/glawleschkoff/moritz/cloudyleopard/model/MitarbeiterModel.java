package de.glawleschkoff.moritz.cloudyleopard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mitarbeiter")
public class MitarbeiterModel {
    @Id
    @Column(columnDefinition = "IDENTITY(10) default '0'")
    private Integer rowID;
    @Column(columnDefinition = "VARCHAR(5) default 'NULL'")
    private String Kurzzeichen;

    public Integer getRowID() {
        return rowID;
    }

    public String getKurzzeichen() {
        return Kurzzeichen;
    }
}
