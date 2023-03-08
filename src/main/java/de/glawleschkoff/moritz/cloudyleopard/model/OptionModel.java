package de.glawleschkoff.moritz.cloudyleopard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERScannerTest")
public class OptionModel {

    @Id
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f11;
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f12 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f13 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f14 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f15 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f16 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f20 = "";

    public String getF11() {
        return f11;
    }

    public String getF12() {
        return f12;
    }

    public String getF13() {
        return f13;
    }

    public String getF14() {
        return f14;
    }

    public String getF15() {
        return f15;
    }

    public String getF16() {
        return f16;
    }

    public String getF20() {
        return f20;
    }
}
