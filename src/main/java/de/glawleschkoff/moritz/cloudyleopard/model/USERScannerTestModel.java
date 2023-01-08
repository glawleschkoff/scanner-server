package de.glawleschkoff.moritz.cloudyleopard.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "USERScannerTest")
public class USERScannerTestModel {
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RowID", length = 10)
    private Integer RowID;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RowGUID", unique = true)
    @Type(type = "uuid-char")
    private UUID RowGUID;

    @Column(columnDefinition = "VARCHAR(40)", nullable = false)
    private String ExemplarNr = "";


    /*
    private String F1;

     */

    public Integer getRowID() {
        return RowID;
    }

    public void setRowID(Integer rowID) {
        RowID = rowID;


    }



    /*public String getF1() {
        return F1;
    }

    public void setF1(String f1) {
        F1 = f1;
    }
    */

    public UUID getRowGUID() {
        return RowGUID;
    }

    public void setRowGUID(UUID rowGUID) {
        RowGUID = rowGUID;
    }


    public String getExemplarNr() {
        return this.ExemplarNr;
    }

    public void setExemplarNr(String exemplarNr) {
        this.ExemplarNr = exemplarNr;
    }


}
