package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Placement_details")
public class DBTable{
    @Id
    private Integer Sno;
    private String Gender;
    private Float Percent10th;
    private String SSCBoard;
    private Float Percent12th;
    private String HSCBoard;
    private String Stream12th;
    private Float DegreePercent;
    private String DegreeStream;
    private String WorkExp;
    private String Specialisation;
    private Float MBAPercent;
    private String status;
    private Integer Salary;

    public DBTable(Integer sno, String gender, Float percent10th, String SSCBoard, Float percent12th, String HSCBoard, String stream12th, Float degreePercent, String degreeStream, String workExp, String specialisation, Float MBAPercent, String status, Integer salary) {
        Sno = sno;
        Gender = gender;
        Percent10th = percent10th;
        this.SSCBoard = SSCBoard;
        Percent12th = percent12th;
        this.HSCBoard = HSCBoard;
        Stream12th = stream12th;
        DegreePercent = degreePercent;
        DegreeStream = degreeStream;
        WorkExp = workExp;
        Specialisation = specialisation;
        this.MBAPercent = MBAPercent;
        this.status = status;
        Salary = salary;
    }

    public DBTable() {
        super();
    }

    public Integer getSno() {
        return Sno;
    }

    public void setSno(Integer sno) {
        Sno = sno;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Float getPercent10th() {
        return Percent10th;
    }

    public void setPercent10th(Float percent10th) {
        Percent10th = percent10th;
    }

    public String getSSCBoard() {
        return SSCBoard;
    }

    public void setSSCBoard(String SSCBoard) {
        this.SSCBoard = SSCBoard;
    }

    public Float getPercent12th() {
        return Percent12th;
    }

    public void setPercent12th(Float percent12th) {
        Percent12th = percent12th;
    }

    public String getHSCBoard() {
        return HSCBoard;
    }

    public void setHSCBoard(String HSCBoard) {
        this.HSCBoard = HSCBoard;
    }

    public String getStream12th() {
        return Stream12th;
    }

    public void setStream12th(String stream12th) {
        Stream12th = stream12th;
    }

    public Float getDegreePercent() {
        return DegreePercent;
    }

    public void setDegreePercent(Float degreePercent) {
        DegreePercent = degreePercent;
    }

    public String getDegreeStream() {
        return DegreeStream;
    }

    public void setDegreeStream(String degreeStream) {
        DegreeStream = degreeStream;
    }

    public String getWorkExp() {
        return WorkExp;
    }

    public void setWorkExp(String workExp) {
        WorkExp = workExp;
    }

    public String getSpecialisation() {
        return Specialisation;
    }

    public void setSpecialisation(String specialisation) {
        Specialisation = specialisation;
    }

    public Float getMBAPercent() {
        return MBAPercent;
    }

    public void setMBAPercent(Float MBAPercent) {
        this.MBAPercent = MBAPercent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "DBTable{" +
                "Sno=" + Sno +
                ", Gender='" + Gender + '\'' +
                ", Percent10th=" + Percent10th +
                ", SSCBoard='" + SSCBoard + '\'' +
                ", Percent12th=" + Percent12th +
                ", HSCBoard='" + HSCBoard + '\'' +
                ", Stream12th='" + Stream12th + '\'' +
                ", DegreePercent=" + DegreePercent +
                ", DegreeStream='" + DegreeStream + '\'' +
                ", WorkExp='" + WorkExp + '\'' +
                ", Specialisation='" + Specialisation + '\'' +
                ", MBAPercent=" + MBAPercent +
                ", status='" + status + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
