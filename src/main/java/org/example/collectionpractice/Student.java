package main.java.com.basic.collectionpractice;

public class Student extends MyProject {
    private Integer iD;
    private String name;

    Student(Integer iD, String name) {
        this.iD = iD;
        this.name = name;
    }

    public String getname() {

        return name;
    }

    public Integer getiD() {
        return iD;
    }
}


