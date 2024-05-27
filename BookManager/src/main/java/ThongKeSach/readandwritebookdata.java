/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongKeSach;

import com.mycompany.bookmanager.ReaderManaging;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class readandwritebookdata {
    public void luuFile(ArrayList<ThongKeSach> listbookmanager, boolean t) throws IOException{
        try{
            FileWriter fw = new FileWriter("src/main/java/ThongKeSach/thongkesach.txt", t);
            BufferedWriter bw = new BufferedWriter(fw);
            for(ThongKeSach book:listbookmanager){
                bw.write(book.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public ArrayList<ThongKeSach> docFileBook() throws FileNotFoundException{
        try{
            ArrayList<ThongKeSach> listbookmanager = new ArrayList<>();
            FileReader fr = new FileReader("src/main/java/ThongKeSach/thongkesach.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while(true){
                line = br.readLine();
                if(line == null){
                    break;
                }
                String txt[] = line.split(",");
                listbookmanager.add(new ThongKeSach(txt[0],txt[1],txt[2],txt[3]));
            }
            return listbookmanager;
        } catch(IOException e){}
        return null;
    }
    
}
