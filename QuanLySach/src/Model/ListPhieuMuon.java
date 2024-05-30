/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ListPhieuMuon {

    private List<PhieuMuon> listPM;

    public ListPhieuMuon() {
        this.listPM = new ArrayList<>();
    }

    public void addPhieuMuon(PhieuMuon pm) {
        listPM.add(pm);
    }

    public List<PhieuMuon> getlistPM() {
        return listPM;
    }

    @Override
    public String toString() {
        return "listPM{" + "listPM=" + listPM + '}';
    }
}
