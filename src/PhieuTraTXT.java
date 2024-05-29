/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class PhieuTraTXT {
    public void filewrite(List<PhieuTra> list, boolean t){
        try{
            FileWriter fw = new FileWriter("phieumuon.txt",t);
            BufferedWriter bw = new BufferedWriter(fw);
            for(PhieuTra pt : list){
                bw.write(pt.toString());
                bw.newLine();
            }
            fw.close();
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public List<PhieuTra> fileread(){
        try{
            List<PhieuTra> list = new ArrayList<>();
            FileReader fr = new FileReader("phieutra.txt");
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                String txt[]=line.split(",");
                list.add(new PhieuTra(txt[0],txt[1],txt[2],txt[3],txt[4]));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
    