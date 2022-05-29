package ThucHanh1;

import java.util.Date;

public class HoSoHocSinh extends HocSinh {
    private String lop;
    private String khoaHoc;
    private String kyHoc;


    public HoSoHocSinh(String hoTen, Date ngaySinh, String queQuan, String lop, String khoaHoc, String kyHoc) {
        super(hoTen, ngaySinh, queQuan);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(String kyHoc) {
        this.kyHoc = kyHoc;
    }

    @Override
    public String toString() {
        return "ThucHanh1.HoSoHocSinh{" +
                "lop='" + lop + '\'' +
                ", khoaHoc='" + khoaHoc + '\'' +
                ", kyHoc='" + kyHoc + '\'' +
                ", hocSinh='" + super.toString() +
                '}';
    }
}
