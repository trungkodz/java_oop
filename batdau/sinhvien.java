public class sinhvien {
    // thuộc tính (Attributes/Fields) :dữ liệu của đối tượng
    public String ten;
    private String Msv;
    private long drl;
    private double m1, m2, m3;

    // hàm khởi tạo (constructor) : chạy khi tạo mới đối tượng
    public sinhvien(String ten, String Msv, long drl) {
        this.ten = ten;
        this.Msv = Msv;
        this.drl = drl;

    }

    // phương thức (method) : hành động
    public void thongtinsinhvien() {
        System.out.println("cac thong tin cau sinh vien: ");
        System.out.println("name: " + this.ten);
        System.out.println("Msv: " + this.Msv);
        System.out.println("drl: " + this.drl);
        System.out.println("xep loai: " + seploai());
    }

    public void tinhdiemtbmsv(double m1, double m2, double m3) {
        System.out.println("diem tbm = " + ((m1 + m2 + m3) / 3));
    }

    // logic nội bộ: kiểm tra xếp loại:
    public String seploai() {
        if (this.drl >= 80)
            return "suat sac";
        if (this.drl >= 60)
            return "gioi";
        return "trung binh";
    }
}
