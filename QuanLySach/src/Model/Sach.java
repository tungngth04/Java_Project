/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Administrator
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String tgMuon;
    private String soLuong;

    public Sach(){
        
    }

    public Sach(String maSach, String tenSach, String tgMuon, String soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tgMuon = tgMuon;
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

    public String getTgMuon() {
        return tgMuon;
    }

    public void setTgMuon(String tgMuon) {
        this.tgMuon = tgMuon;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
    

    @Override
    public String toString() {
        return maSach + "," + tenSach + "," + tgMuon + "," + soLuong;
    }
}
