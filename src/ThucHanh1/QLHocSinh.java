package ThucHanh1;

import jdk.nashorn.internal.ir.Symbol;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class QLHocSinh {
     Scanner scanner = new Scanner(System.in);
     ArrayList<HoSoHocSinh> dsHocSinhs = new ArrayList<>();

    public void menu(){
        System.out.println("---Menu---");
        System.out.println("1. Nhập danh sách học sinh.");
        System.out.println("2. Hiển thị ra màn hình tất cả những học sinh sinh năm 1985 và quê ở Thái Nguyên.");
        System.out.println("3. Hiển thị ra màn hình tất cả những học sinh của lớp 10A1.");
        System.out.println("4. Exit");
        System.out.println("Nhập vào lựa chọn của bạn: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                creatHoSoHocSinh();
                break;
            case 2:
                showByRequired();
                break;
            case 3:
                showHocSinh10A1();
                break;
            case 4:
                System.exit(0);
        }
    }

    public void creatHoSoHocSinh(){
        try {
            System.out.println("Nhập họ tên học sinh");
            String hoTen = scanner.nextLine();
            System.out.println("Nhập ngày sinh");
            Date ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
            System.out.println("Nhập quê quán: ");
            String queQuan = scanner.nextLine();
            System.out.println("Nhập lớp: ");
            String lop = scanner.nextLine();
            System.out.println("Nhập khóa học: ");
            String khoaHoc = scanner.nextLine();
            System.out.println("Nhập kỳ học: ");
            String kyHoc = scanner.nextLine();
            HoSoHocSinh hocSinh = new HoSoHocSinh(hoTen, ngaySinh, queQuan, lop, khoaHoc, kyHoc);
            dsHocSinhs.add(hocSinh);
        }catch (Exception e){
            System.out.println("Nhập thông tin sai, vui lòng nhập lại! ");
            creatHoSoHocSinh();
        }

    }
    public void showByRequired(){
        System.out.println("Nhập năm sinh của học sinh muốn hiển thị: ");
        String age = scanner.nextLine();
        System.out.println("Nhập quê quán của học sinh muốn hiển thị: ");
        String queQuan = scanner.nextLine();
        for (int i = 0; i < dsHocSinhs.size(); i++) {
            if ((age.equals(dsHocSinhs.get(i).getNgaySinh().getYear() + 1900) && queQuan.equals(dsHocSinhs.get(i).getQueQuan()))) {
                System.out.println(dsHocSinhs.get(i).toString());
            }
        }
    }

    public void showHocSinh10A1(){
        System.out.println("Nhập lớp của học sinh muốn hiển thị: ");
        String lop = scanner.nextLine();
        for (int i = 0; i < dsHocSinhs.size(); i++) {
            if (lop.equals(dsHocSinhs.get(i).getLop())){
                System.out.println(dsHocSinhs.get(i).toString());
            }
        }
    }
}
