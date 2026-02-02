class Config {
    // Hang so – dung chung, khong thay doi
    public static final double MAX_SCORE = 10.0;
    public static final double MIN_SCORE = 0.0;
}

public class B5 {
    public static void main(String[] args) {

        double score = 7.5;

        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Diem hop le");
        } else {
            System.out.println("Diem khong hop le");
        }

        // Config.MAX_SCORE = 20.0;
        // Loi xay ra ngay khi bien dich (compile-time error)
    }
}

/*
 * Tu khoa final:
 * - Gia tri khong the thay doi
 * - Bao ve du lieu quan trong
 * - Tranh bi sua nham
 * - Compiler phat hien loi som
 */
