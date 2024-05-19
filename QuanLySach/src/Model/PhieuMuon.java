/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class PhieuMuon {
    private String maPM;
    private String maND;
    private String maSach;
    private String tenSach;
    private String tgMuon;
    public PhieuMuon(){
        
    }

    public PhieuMuon(String maPM) {
        this.maPM = maPM;
    }

    public PhieuMuon(String maPM, String maND, String maSach, String tenSach, String tgMuon) {
        this.maPM = maPM;
        this.maND = maND;
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tgMuon = tgMuon;
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

    public String getTgMuon() {
        return tgMuon;
    }

    public void setTgMuon(String tgMuon) {
        this.tgMuon = tgMuon;
    }
    @Override
    public String toString() {
        return  maPM+","+ maND+ "," + maSach +","+ tenSach +","+ tgMuon;
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

