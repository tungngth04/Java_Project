package Until;

import Model.Sach1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File1 {
    public void luuFile(List<Sach1> list, boolean append) {
        try (FileWriter fw = new FileWriter("src/Data/Sach.txt", append);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (Sach1 pm : list) {
                bw.write(pm.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Sach1> docFile() {
        List<Sach1> list = new ArrayList<>();
        try (FileReader fr = new FileReader("src/Data/Sach.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] txt = line.split(",");
                if (txt.length == 5) { 
                    try {
                        String maSach = txt[0];
                        String tenSach = txt[1];
                        String theLoai = txt[2];
                        String nhaXb = txt[3];
                        int soLuong = Integer.parseInt(txt[4]);
                        list.add(new Sach1(maSach, tenSach, theLoai, nhaXb, soLuong));
                    } catch (NumberFormatException e) {
                        System.err.println("Lỗi định dạng số lượng: " + txt[4]);
                    }
                } else {
                    System.err.println("Dòng không hợp lệ: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
