/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Until;

import Model.Container;
import Model.PhieuMuon;
import Model.Sach;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class PhieuMuonL {
     public void luuFile(List<PhieuMuon> list, boolean t) {
        try {
            FileWriter fw = new FileWriter("src/Data/PhieuMuon.txt", t);
            BufferedWriter bw = new BufferedWriter(fw);
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

    public void ghided1(List<PhieuMuon> list) {
         try {
        // Đọc toàn bộ dữ liệu từ file vào một danh sách tạm thời
        List<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("src/Data/container_data.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        br.close();
        fr.close();

        // Cập nhật dòng đầu tiên của danh sách với số lượng phần tử mới
        lines.set(0, String.valueOf(list.size()));

        // Ghi lại toàn bộ dữ liệu, bao gồm cả dòng đầu đã được cập nhật, vào file
        FileWriter fw = new FileWriter("src/Data/container_data.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (String updatedLine : lines) {
            bw.write(updatedLine);
            bw.newLine();
        }
        bw.close();
        fw.close();
    } catch (Exception e) {
        System.out.println("Lỗi" + e.getMessage());
    }
    }

    public List<PhieuMuon> docFile() {
        try {
            List<PhieuMuon> list = new ArrayList<>();
            FileReader fr = new FileReader("src/Data/PhieuMuon.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String txt[] = line.split(",");
                list.add(new PhieuMuon(txt[0], txt[1]));
            }
            return list;

        } catch (Exception e) {
            System.out.println("Lỗi" + e.getMessage());
        }
        return null;
    }

    public void saveContainersToFile(List<Container> containers, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            List<PhieuMuon> pms = new ArrayList<>();
            bufferedWriter.write(Integer.toString(containers.size()));
            bufferedWriter.newLine();

            for (Container container : containers) {
                for (Sach obj : container.getObjects()) {
                    bufferedWriter.write(obj.toString());
                    bufferedWriter.newLine();
                }
                bufferedWriter.newLine();
            }

            System.out.println("Đã lưu " + containers.size() + " Container vào tệp " + fileName);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi lưu vào tệp " + fileName);
            e.printStackTrace();
        }
    }

    public List<Container> readContainersFromFile(String fileName) {
        List<Container> containers = new ArrayList<>();
        try (FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = bufferedReader.readLine();
            int containerCount = Integer.parseInt(line);

            for (int i = 0; i < containerCount; i++) {
                Container container = new Container();
                while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
                    String[] parts = line.split(",");
                    if (parts.length == 4) {
                        String ms = parts[0];
                        String ts = parts[1];
                        String nm = parts[2];
                        String sl = parts[3];
                        container.addObject(new Sach(ms, ts, nm, sl));
                    } else {
                        System.out.println("Dòng không hợp lệ: " + line);
                    }
                }
                containers.add(container);
            }

            System.out.println("Đã đọc " + containers.size() + " Container từ tệp " + fileName);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc từ tệp " + fileName);
            e.printStackTrace();
        }
        return containers;
    }
    
}
