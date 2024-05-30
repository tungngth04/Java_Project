package Model;

import java.util.Objects;


public class Sach1 {
    private String maSach;
    private String tenSach;
    private String theLoai;
    private String nhaXb;
    private int soLuong;
    // Constructors
    public Sach1() {
    }

    public Sach1(String maSach) {
        this.maSach = maSach;
    }

    public Sach1(String maSach, String tenSach, String theLoai, String nhaXb, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.theLoai = theLoai;
        this.nhaXb = nhaXb;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getNhaXb() {
        return nhaXb;
    }

    public void setNhaXb(String nhaXb) {
        this.nhaXb = nhaXb;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return maSach+","+tenSach+","+theLoai+","+nhaXb+","+soLuong;
    }
    

    // Phương thức equals() để so sánh hai đối tượng sách dựa trên mã sách
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Sach1 other = (Sach1) obj;
        return Objects.equals(maSach, other.maSach);
    }

    // Phương thức hashCode() để tạo mã băm cho đối tượng sách
    @Override
    public int hashCode() {
        return Objects.hash(maSach);
    }
}
