public class Main {

    // ===== Lớp Config chứa hằng số =====
    static class Config {

        // Hằng số dùng chung
        public static final double MAX_SCORE = 10.0;
        public static final double MIN_SCORE = 0.0;
    }

    public static void main(String[] args) {

        double score = 8.5;

        // Sử dụng hằng số
        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Diem hop le: " + score);
        } else {
            System.out.println("Diem khong hop le!");
        }

        // ===== MINH HOA LOI BIEN DICH =====
        // Uncomment dong ben duoi se BI LOI
        // Config.MAX_SCORE = 20.0; // ❌ Cannot assign a value to final variable
    }
}
