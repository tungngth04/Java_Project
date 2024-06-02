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

    @Override
    public String toString() {
        return "objects=" + objects  ;
    }
}
