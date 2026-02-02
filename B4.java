public class Main {

    // ===== Lớp ClassRoom =====
    static class ClassRoom {

        // Biến static - quỹ chung của lớp
        private static double classFund = 0;

        // Biến instance - riêng từng sinh viên
        private String studentName;

        public ClassRoom(String studentName) {
            this.studentName = studentName;
        }

        // Sinh viên đóng tiền vào quỹ lớp
        public void contribute(double amount) {
            if (amount > 0) {
                classFund += amount;
                System.out.println(studentName + " da dong " + amount + " vao quy lop.");
            }
        }

        // Xem tổng quỹ lớp (static)
        public static double getClassFund() {
            return classFund;
        }
    }

    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("An");
        ClassRoom s2 = new ClassRoom("Binh");
        ClassRoom s3 = new ClassRoom("Cuong");

        s1.contribute(100_000);
        s2.contribute(150_000);
        s3.contribute(200_000);

        System.out.println("\nTong quy lop: " + ClassRoom.getClassFund());
    }
}
