package Model;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class PhieuTra {
    private String maphieutra;
    private String masach;
    private String manguoidoc;
    private String tensach;
    private String thoigiantra;
    private String soluong;

    public PhieuTra() {
    }

    public PhieuTra(String maphieutra, String masach) {
        this.maphieutra = maphieutra;
        this.masach = masach;
    }

    public PhieuTra(String manguoidoc, String tensach, String thoigiantra, String soluong) {
        this.manguoidoc = manguoidoc;
        this.tensach = tensach;
        this.thoigiantra = thoigiantra;
        this.soluong = soluong;
    }  
    public PhieuTra(String maphieutra, String masach, String manguoidoc, String thoigiantra, String tensach, String soluong) {
        this.maphieutra = maphieutra;
        this.masach = masach;
        this.manguoidoc = manguoidoc;
        this.tensach=tensach;
        this.thoigiantra = thoigiantra;
        this.soluong= soluong;
    }
    public String getMaphieutra() {
        return maphieutra;
    }

    public void setMaphieutra(String maphieutra) {
        this.maphieutra = maphieutra;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getManguoidoc() {
        return manguoidoc;
    }

    public void setManguoidoc(String manguoidoc) {
        this.manguoidoc = manguoidoc;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }
    

    public String getThoigiantra() {
        return thoigiantra;
    }

    public void setThoigiantra(String thoigiantra) {
        this.thoigiantra = thoigiantra;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "PhieuTra{" + "maphieutra=" + maphieutra + ", masach=" + masach + ", manguoidoc=" + manguoidoc + ", tensach=" + tensach + ", thoigiantra=" + thoigiantra + ", soluong=" + soluong + '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PhieuTra other = (PhieuTra) obj;
        if (this.soluong != other.soluong) {
            return false;
        }
        if (!Objects.equals(this.maphieutra, other.maphieutra)) {
            return false;
        }
        if (!Objects.equals(this.masach, other.masach)) {
            return false;
        }
        if (!Objects.equals(this.manguoidoc, other.manguoidoc)) {
            return false;
        }
        if (!Objects.equals(this.tensach, other.tensach)) {
            return false;
        }
        return Objects.equals(this.thoigiantra, other.thoigiantra);
    }
    

   
    
    

    
    
    
    
}
