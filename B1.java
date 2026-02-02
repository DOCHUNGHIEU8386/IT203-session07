public class Student {

    // ===== Biến instance (mỗi sinh viên có riêng) =====
    private String studentId;
    private String studentName;

    // ===== Biến static (dùng chung cho tất cả) =====
    private static int totalStudent = 0;

    // ===== Constructor =====
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++; // Mỗi lần tạo sinh viên -> tăng 1
    }

    // ===== Hiển thị thông tin sinh viên =====
    public void displayInfo() {
        System.out.println("MSSV: " + studentId);
        System.out.println("Họ tên: " + studentName);
    }

    // ===== Hiển thị tổng số sinh viên =====
    public static int getTotalStudent() {
        return totalStudent;
    }
}
