import java.util.Scanner;
import java.lang.Math;
import java.lang.reflect.Array;
/*
 * lập trình hướng đối tượng xoay qoanh 2 thành phần chính là:
 * + Class(lớp)
 * + object(đối tượng)
 */
/*
 * lớp giống như bản thiết kế để sinh ra đối tượng: là một nhóm các biến và hàm
 * liên quan tới nhau
 * + biến(property): thuộc tính
 * + hàm(method): phương thức
 */

// nếu tạo class trong cùng file thì ko cần chữ public

// đọc trong note oop.
public class start {
    public static void main(String[] args) {
        sinhvien sv1 = new sinhvien("trung", "28a4402270", 86);
        svCNTTA sv3 = new svCNTTA(9.5, 10, 8);
        System.out.println("thong tin sv: ");
        sv1.thongtinsinhvien();
        sv1.tinhdiemtbmsv(9.5, 8.0, 9.75);
        sinhviennamnhat sv2 = new sinhviennamnhat("Huy", "28aa4042299", 0, 28);
        sv2.thongtinsinhvien();
        System.out.println(sv3.dtbk1());

    }
}
