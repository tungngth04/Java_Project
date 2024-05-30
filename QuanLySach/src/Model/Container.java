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
public class Container {
    private List<Sach> objects = new ArrayList<>();

    public void addObject(Sach obj) {
        objects.add(obj);
    }

    public List<Sach> getObjects() {
        return objects;
    }

    public Sach findPersonByName(String name) {
        for (Sach s : objects) {
            if (s.getMaSach().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public boolean updatePerson(String name, String newMS, String newTS, String newNM, String newSL) {
        Sach s = findPersonByName(name);
        if (s != null) {
            s.setMaSach(newMS);
            s.setTenSach(newTS);
            s.setTgMuon(newTS);
            s.setSoLuong(newSL);
            return true;
        }
        return false;
    }

    public boolean removePerson(String name) {
        Sach s = findPersonByName(name);
        if (s != null) {
            objects.remove(s);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "objects=" + objects  ;
    }
}
