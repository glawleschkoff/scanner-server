package de.glawleschkoff.moritz.cloudyleopard.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERScannerTest")
public class BauteilModel {

    @Id
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f1;
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f2 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f3 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f4 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f5 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f6 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f7 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f8 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f9 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f10 = "";
    @Column(columnDefinition = "VARCHAR(250)", nullable = false)
    private String f20 = "";

    public String getF1() {
        return f1;
    }

    public String getF2() {
        return f2;
    }

    public String getF3() {
        return f3;
    }

    public String getF4() {
        return f4;
    }

    public String getF5() {
        return f5;
    }

    public String getF6() {
        return f6;
    }

    public String getF7() {
        return f7;
    }

    public String getF8() {
        return f8;
    }

    public String getF9() {
        return f9;
    }

    public String getF10() {
        return f10;
    }

    public String getF20() {
        return f20;
    }
}
