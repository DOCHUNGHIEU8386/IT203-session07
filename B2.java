public class Main {

    // ===== Class Student (biến tham chiếu) =====
    static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        // ===== BIẾN NGUYÊN THỦY =====
        int a = 10;
        int b = a;   // sao chép GIÁ TRỊ
        b = 20;

        System.out.println("=== BIEN NGUYEN THUY ===");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20

        // ===== BIẾN THAM CHIẾU =====
        Student s1 = new Student("An");
        Student s2 = s1; // sao chép ĐỊA CHỈ

        s2.name = "Binh";

        System.out.println("\n=== BIEN THAM CHIEU ===");
        System.out.println("s1.name = " + s1.name); // Binh
        System.out.println("s2.name = " + s2.name); // Binh
    }
}
