class Classroom {
    // Bien instance - ten hoc sinh (rieng tung nguoi)
    private String name;

    // Bien static - quy lop (dung chung)
    private static double classFund = 0;

    public Classroom(String name) {
        this.name = name;
    }

    public void contribute(double amount) {
        classFund += amount;
        System.out.println("Hoc sinh " + name + " dong gop: " + amount);
    }

    public static void showClassFund() {
        System.out.println("Tong quy lop: " + classFund);
    }
}

public class B4 {
    public static void main(String[] args) {

        Classroom c1 = new Classroom("Do Chung Hieu");
        Classroom c2 = new Classroom("Nguyen Van A");

        c1.contribute(20000);
        c2.contribute(30000);

        Classroom.showClassFund();
    }
}
