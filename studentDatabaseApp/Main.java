package studentDatabaseApp;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.enroll();
        std1.viewBalance();
        std1.payFees();
        std1.showInfo();
    }
}
