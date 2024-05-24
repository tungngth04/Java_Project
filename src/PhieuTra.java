
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

    public PhieuTra() {
    }

    public PhieuTra(String maphieutra, String masach, String manguoidoc, String thoigiantra, String tensach) {
        this.maphieutra = maphieutra;
        this.masach = masach;
        this.manguoidoc = manguoidoc;
        this.tensach=tensach;
        this.thoigiantra = thoigiantra;
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

    @Override
    public String toString() {
        return "Phieu Tra : {" + "maphieutra=" + maphieutra + ", masach=" + masach + ", manguoidoc=" + manguoidoc + ", tensach=" + tensach + ", thoigiantra=" + thoigiantra + '}';
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
        if (this.thoigiantra != other.thoigiantra) {
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
        return Objects.equals(this.tensach, other.tensach);
    }
    

    
    
    
    
}
