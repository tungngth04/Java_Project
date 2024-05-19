/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Until;

import Model.PhieuMuon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class PhieuMuonL {
     public void luuFile(List<PhieuMuon> list,boolean  t) {
        try {
            FileWriter fw =new FileWriter("src/Data/PhieuMuon.txt",t);
            BufferedWriter bw=new BufferedWriter(fw);
            for (PhieuMuon pm : list) {
                bw.write(pm.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<PhieuMuon> docFile(){
        try {
            List<PhieuMuon> list=new ArrayList<>();
            FileReader fr=new FileReader("src/Data/PhieuMuon.txt");
            BufferedReader br=new BufferedReader(fr);
            String line="";
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                String txt[]=line.split(",");
                list.add(new PhieuMuon(txt[0],txt[1] , txt[2], txt[3], txt[4]));
            }
            return list;
            
        } catch (Exception e) {
        }
        return null;
    }
    
}
