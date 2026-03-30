package model;

public class Student {

    // Өрістер
    private String name;
    private int age;
    private String major;

    // 2. Әдепкі конструктор
    public Student() {
        this.name = "Белгісіз";
        this.age = 0;
        this.major = "Анықталмаған";
        System.out.println("Әдепкі конструктор шақырылды");
    }

    // 2 & 3. Параметрлі конструктор + this қолдану
    public Student(String name, int age, String major) {
        this.name = name;     // this кілт сөзі
        this.age = age;
        this.major = major;
        System.out.println("Параметрлі конструктор шақырылды");
    }

    // 5. Объект күйін өзгертетін әдіс
    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }

    // 5. Ақпарат шығару әдісі
    public void displayInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
        System.out.println("----------------------");
    }
}