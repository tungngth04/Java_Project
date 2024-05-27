/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storeinfo;

import com.mycompany.bookmanager.ReaderManaging;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class readandwrite {
    public void luuFile(ArrayList<ReaderManaging> listreader, boolean t) throws IOException{
        try{
            FileWriter fw = new FileWriter("src/main/java/Data/reader.txt", t);
            BufferedWriter bw = new BufferedWriter(fw);
            for(ReaderManaging rm:listreader){
                bw.write(rm.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public ArrayList<ReaderManaging> docFile() throws FileNotFoundException{
        try{
            ArrayList<ReaderManaging> listreader = new ArrayList<>();
            FileReader fr = new FileReader("src/main/java/Data/reader.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while(true){
                line = br.readLine();
                if(line == null){
                    break;
                }
                String txt[] = line.split(",");
                listreader.add(new ReaderManaging(txt[0],txt[1],txt[2],txt[3],txt[4]));
                
            }
            return listreader;
        } catch(IOException e){}
        return null;
    }
}
