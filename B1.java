class SinhVien {
    // Thuộc tính riêng của mỗi sinh viên
    private String mssv;
    private String hoTen;

    // Thuộc tính static – dùng chung cho tất cả sinh viên
    private static int soLuongSV = 0;

    // Constructor
    public SinhVien(String mssv, String hoTen) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        soLuongSV++;
    }

    // Phương thức hiển thị thông tin sinh viên
    public void hienThiThongTin() {
        System.out.println("MSSV : " + mssv);
        System.out.println("Ho ten : " + hoTen);
        System.out.println("---------------------");
    }

    // Phương thức static hiển thị tổng số sinh viên
    public static void hienThiSoLuongSV() {
        System.out.println("Tong so sinh vien : " + soLuongSV);
    }
}

public class Bai1_Static {
    public static void main(String[] args) {

        SinhVien sv1 = new SinhVien("B24DTCN336", "Do Chung Hieu");
        SinhVien sv2 = new SinhVien("B24DTCN337", "Nguyen Van A");
        SinhVien sv3 = new SinhVien("B24DTCN338", "Tran Van B");

        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        sv3.hienThiThongTin();

        // Gọi phương thức static thông qua tên lớp
        SinhVien.hienThiSoLuongSV();
    }
}
