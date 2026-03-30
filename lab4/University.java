package model;

public class University {

    private String universityName;

    public University(String universityName) {
        this.universityName = universityName;
    }

    // Student объектісін параметр ретінде қабылдау
    public void enrollStudent(Student student) {
        System.out.println(universityName + " университетіне студент қабылданды:");
        student.displayInfo();
    }
}