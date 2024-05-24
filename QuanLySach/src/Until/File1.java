/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Until;

import Model.Sach1;
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
public class File1 {
     public void luuFile(List<Sach1> list,boolean  t) {
        try {
            FileWriter fw =new FileWriter("src/Data/Sach.txt",t);
            BufferedWriter bw=new BufferedWriter(fw);
            for (Sach1 pm : list) {
                bw.write(pm.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Sach1> docFile(){
        try {
            List<Sach1> list=new ArrayList<>();
            FileReader fr=new FileReader("src/Data/Sach.txt");
            BufferedReader br=new BufferedReader(fr);
            String line="";
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                String txt[]=line.split(",");
                list.add(new Sach1(txt[0],txt[1] , txt[2], txt[3]));
            }
            return list;
            
        } catch (Exception e) {
        }
        return null;
    }
    
}
