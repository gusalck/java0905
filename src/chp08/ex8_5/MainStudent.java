package chp08.ex8_5;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student(2019122104,"Park");
        Student s2 = new Student(2019206028,"Kim");
        Student s3 = new Student(2019153237,"Lee");
        System.out.printf("생성된 Student 객체의 개수 : %d개",Student.count);
    }
}
