package de.glawleschkoff.moritz.cloudyleopard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERKommWagen")
public class USERKommWagenModel {


    @Id
    @Column(columnDefinition = "IDENTITY(10) default '0'", name = "RowID")
    private Integer rowID;

    //@Column(columnDefinition = "VARCHAR(20) default 'NULL'")
    private String auftrag;

    @Column(columnDefinition = "VARCHAR(20) default 'NULL'")
    private String wagenKennung;

    public Integer getRowID(){
        return rowID;
    }

    public String getAuftrag() {
        return auftrag;
    }

    public String getWagenKennung() {
        return wagenKennung;
    }

}
