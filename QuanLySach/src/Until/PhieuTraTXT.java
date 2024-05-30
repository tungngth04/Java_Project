package Until;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import Model.PhieuTra;

public class PhieuTraTXT {
    // Ghi danh sách PhieuTra vào file
    public void filewrite(List<PhieuTra> list, boolean append) {
        try (FileWriter fw = new FileWriter("src/Data/phieutra.txt", append);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (PhieuTra pt : list) {
                bw.write(pt.toString()); // Assuming PhieuTra has a proper toString method
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Đọc danh sách PhieuTra từ file
    public List<PhieuTra> fileread() {
        List<PhieuTra> list = new ArrayList<>();
        try (FileReader fr = new FileReader("src/Data/phieutra.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] txt = line.split(",");
                // Assuming the order of attributes in toString method is same as in the constructor
                PhieuTra pt = new PhieuTra(txt[0], txt[1], txt[2], txt[3], txt[4],txt[5]);
                list.add(pt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        List<PhieuTra> phieuTraList = new ArrayList<>();
        phieuTraList.add(new PhieuTra("PT001", "MS001", "ND001", "Sach 1", "2024-05-29","1"));
        phieuTraList.add(new PhieuTra("PT002", "MS002", "ND002", "Sach 2", "2024-05-30","7"));

       
        PhieuTraTXT phieuTraTXT = new PhieuTraTXT();

        
        phieuTraTXT.filewrite(phieuTraList, false); 

       
        List<PhieuTra> phieuTraListFromFile = phieuTraTXT.fileread();

               for (PhieuTra pt : phieuTraListFromFile) {
            System.out.println(pt);
        }
    }
}
