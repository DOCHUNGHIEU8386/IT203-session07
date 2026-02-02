class Nguoi {
    String hoTen;

    public Nguoi(String hoTen) {
        this.hoTen = hoTen;
    }
}

public class Bai2_Primitive_Reference {
    public static void main(String[] args) {

        // ===== KIỂU PRIMITIVE =====
        int x = 15;
        int y = x; // sao chép GIÁ TRỊ

        y = 30;

        System.out.println("=== PRIMITIVE ===");
        System.out.println("x = " + x); // 15
        System.out.println("y = " + y); // 30
        // Primitive: biến độc lập, không ảnh hưởng lẫn nhau


        // ===== KIỂU REFERENCE =====
        Nguoi n1 = new Nguoi("Do Chung Hieu");
        Nguoi n2 = n1; // sao chép ĐỊA CHỈ

        n2.hoTen = "B24DTCN336";

        System.out.println("\n=== REFERENCE ===");
        System.out.println("Nguoi 1 : " + n1.hoTen); // B24DTCN336
        System.out.println("Nguoi 2 : " + n2.hoTen); // B24DTCN336
        // Reference: nhiều biến cùng trỏ đến 1 object
    }
}
