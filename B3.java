class ScoreUtils {

    // Kiem tra qua mon
    public static boolean isPass(double score) {
        return score >= 5.0;
    }

    // Tinh diem trung binh
    public static double calculateAverage(double s1, double s2, double s3) {
        return (s1 + s2 + s3) / 3;
    }
}

public class B3 {
    public static void main(String[] args) {

        double avg = ScoreUtils.calculateAverage(6.5, 7.0, 8.0);
        System.out.println("Diem trung binh = " + avg);

        boolean pass = ScoreUtils.isPass(avg);
        System.out.println("Qua mon = " + pass);
    }
}
