/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

public class PhieuMuon {
    private String maPM;
    private String maND;
    public PhieuMuon(){
        
    }

    public PhieuMuon(String maPM) {
        this.maPM = maPM;
    }

    public PhieuMuon(String maPM, String maND) {
        this.maPM = maPM;
        this.maND = maND;
    }

    public String getMaPM() {
        return maPM;
    }

    public void setMaPM(String maPM) {
        this.maPM = maPM;
    }

    public String getMaND() {
        return maND;
    }

    public void setMaND(String maND) {
        this.maND = maND;
    }
    @Override
    public String toString() {
        return  maPM+","+ maND;
        //+ "," + maSach +","+ tenSach +","+ tgMuon + "," + soLuong
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PhieuMuon other = (PhieuMuon) obj;
        return Objects.equals(maPM, other.maPM);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maPM);
    }
}

