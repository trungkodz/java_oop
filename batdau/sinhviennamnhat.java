
public class sinhviennamnhat extends sinhvien {
    // tính kế thừa
    private int khoa;

    public sinhviennamnhat(String ten, String Msv, long drl, int khoa) {
        super(ten, Msv, drl);
        this.khoa = khoa;
    }

    // tính đa hình:
    public void thongtinsinhvien() {
        System.out.println("sv namnhat: " + ten);
        System.out.println("sv namnhat: " + Msv);
        System.out.println("sv khoa: " + this.khoa);
    }
}
