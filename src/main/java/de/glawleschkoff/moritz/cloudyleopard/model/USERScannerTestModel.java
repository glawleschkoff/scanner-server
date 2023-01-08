package de.glawleschkoff.moritz.cloudyleopard.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERScannerTest")
public class USERScannerTestModel {
    @Id
    private Integer RowID;
    private String F1;

    public Integer getRowID() {
        return RowID;
    }

    public void setRowID(Integer rowID) {
        RowID = rowID;
    }

    public String getF1() {
        return F1;
    }

    public void setF1(String f1) {
        F1 = f1;
    }
}
