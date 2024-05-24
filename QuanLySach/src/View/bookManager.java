/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Sach1;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Until.File1;

public class bookManager extends javax.swing.JFrame {

    private static int pos = 0;
    private static int check = 0;

    public bookManager() {
        initComponents();
        view();
        loadDataToTable();
    }

    public void view() {
        File1 f1 = new File1();
        List<Sach1> list = f1.docFile();
        Sach1 x = list.get(pos);
        this.txtMS.setText(x.getMaSach());
        this.txtTS.setText(x.getTenSach());
        this.txtTL.setText(x.getTheLoai());
        this.txtNXB.setText(x.getNhaXb());
        
       
    }

    public void loadDataToTable() {
        DefaultTableModel tblModel = (DefaultTableModel) this.tblPhieuMuon.getModel();
        try {
            File1 f1 = new File1();
            List<Sach1> list = f1.docFile();
            tblModel.setRowCount(0);
            for (Sach1 pm : list) {
                tblModel.addRow(new Object[]{
                    pm.getMaSach(), pm.getTenSach(), pm.getTheLoai(), pm.getNhaXb()
                });
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        Home = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fix = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Save = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Huybo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhieuMuon = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        theLoai = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMS = new javax.swing.JTextField();
        txtTL = new javax.swing.JTextField();
        txtNXB = new javax.swing.JTextField();
        txtTS = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(66, 5, 96));
        jPanel6.setPreferredSize(new java.awt.Dimension(50, 5));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Books Manager");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 210, 50));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 10));

        jPanel2.setBackground(new java.awt.Color(102, 0, 153));

        Home.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home-icon (1).png"))); // NOI18N
        Home.setText("Trang chủ");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 330, 70));

        add.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Thêm");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel6.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 60, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("+");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 30, 20));

        fix.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        fix.setForeground(new java.awt.Color(255, 255, 255));
        fix.setText("Sửa");
        fix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fixMouseClicked(evt);
            }
        });
        jPanel6.add(fix, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 40, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("+");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 30, 20));

        Delete.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Xóa");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        jPanel6.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 40, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("+");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 30, 20));

        Search.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Tìm kiếm");
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        jPanel6.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("+");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 30, 20));

        Save.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        jPanel6.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 70, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("+");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 30, 20));

        Huybo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Huybo.setForeground(new java.awt.Color(255, 255, 255));
        Huybo.setText("Huỷ bỏ");
        Huybo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HuyboMouseClicked(evt);
            }
        });
        jPanel6.add(Huybo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 80, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("+");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 30, 20));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 680));

        tblPhieuMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Mã Sách", "Tên Sách", "Thể Loại", "Nhà Xuất Bản"
            }
        ));
        tblPhieuMuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuMuonMouseClicked(evt);
            }
        });
        tblPhieuMuon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPhieuMuonKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhieuMuon);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 800, 420));

        jPanel4.setBackground(new java.awt.Color(127, 58, 230));
        jPanel4.setForeground(new java.awt.Color(102, 0, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tên sách");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 89, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mã sách");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 70, -1));

        theLoai.setBackground(new java.awt.Color(0, 51, 204));
        theLoai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        theLoai.setForeground(new java.awt.Color(255, 255, 255));
        theLoai.setText("Thể loại");
        jPanel4.add(theLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nhà xuất bản");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        txtMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSActionPerformed(evt);
            }
        });
        jPanel4.add(txtMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 380, 30));
        jPanel4.add(txtTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 380, 30));

        txtNXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNXBActionPerformed(evt);
            }
        });
        jPanel4.add(txtNXB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 380, 30));
        jPanel4.add(txtTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 380, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 840, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPhieuMuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuMuonMouseClicked
        pos = this.tblPhieuMuon.getSelectedRow();
        view();
    }//GEN-LAST:event_tblPhieuMuonMouseClicked

    private void tblPhieuMuonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPhieuMuonKeyReleased
        pos = this.tblPhieuMuon.getSelectedRow();
        view();
    }//GEN-LAST:event_tblPhieuMuonKeyReleased

    private void txtNXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNXBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNXBActionPerformed

    private void txtMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSActionPerformed

    private void HuyboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HuyboMouseClicked
        view();
    }//GEN-LAST:event_HuyboMouseClicked

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        String maPM = txtNXB.getText();
        String maND = txtTL.getText();
        String maMS = txtMS.getText();
        String tenSach = txtTS.getText();

        StringBuilder sb = new StringBuilder();  // cho phép tạo ra 1 chuỗi rỗng và bổ sung nội dung Username is empty or Password is empty vào sb
        if (maPM.trim().equals("")) {
            sb.append("Mã sách không được để trống\n");
        }
        if (maND.trim().equals("")) {
            sb.append("Mã người đọc không được để trống\n");
        }
        if (maMS.trim().equals("")) {
            sb.append("Mã sách không được để trống\n");
        }
        if (tenSach.trim().equals("")) {
            sb.append("Tên sách không được để trống\n");
        }

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invaidation", JOptionPane.ERROR_MESSAGE);
            return;

        } else {
            if (check == 1) {
                try {
                    File1 pml = new File1();
                    List<Sach1> list = new ArrayList<>();
                    Sach1 pm = new Sach1(txtMS.getText(), txtTS.getText(), txtNXB.getText(), txtTL.getText());
                    list.add(pm);
                    pml.luuFile(list, true);
                    JOptionPane.showMessageDialog(this, "Thông tin sách vừa nhập đã được lưu", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    loadDataToTable();

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, sb.toString(), "Invaidation", JOptionPane.ERROR_MESSAGE);

                }
            }
            if (check == -1){
                try {
                    File1 pml = new File1();
                    List<Sach1> list = pml.docFile();
                    Sach1 newPM = new Sach1(txtMS.getText(), txtTS.getText(), txtNXB.getText(), txtTL.getText());
                    Sach1 pm = new Sach1(txtNXB.getText());
                    if (list.contains(pm)) {
                        list.set(pos, newPM);
                        JOptionPane.showMessageDialog(this, "Thông tin sách vừa chọn đã được sửa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Thông tin sách vừa chọn chưa được sửa", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    }
                    pml.luuFile(list, false);
                    loadDataToTable();
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, sb.toString(), "Invaidation", JOptionPane.INFORMATION_MESSAGE);

                }
            }

        }
    }//GEN-LAST:event_SaveMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        StringBuilder sb = new StringBuilder();
        try {
            File1 f1 = new File1();
            List<Sach1> list = f1.docFile();
            list.remove(pos);
            JOptionPane.showMessageDialog(this, "Thông tin sách vừa chọn đã được xóa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            f1.luuFile(list, false);
            loadDataToTable();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteMouseClicked

    private void fixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fixMouseClicked

        check = -1;
    }//GEN-LAST:event_fixMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        this.txtNXB.setText("");
        this.txtTL.setText("");
        this.txtMS.setText("");
        this.txtTS.setText("");

        check = 1;
    }//GEN-LAST:event_addMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        TrangChu dt1 = new TrangChu();
        dt1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
       String maSach = txtMS.getText().trim();
    if (maSach.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sách để tìm kiếm", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }

    File1 f1 = new File1();
    List<Sach1> list = f1.docFile();
    boolean found = false;
    for (Sach1 x : list) {
        if (x.getMaSach().equals(maSach)) {
            DefaultTableModel tblModel = (DefaultTableModel) tblPhieuMuon.getModel();
            tblModel.setRowCount(0); 
            tblModel.addRow(new Object[]{
                x.getMaSach(), x.getTenSach(), x.getTheLoai(), x.getNhaXb()
            });
            tblModel.fireTableDataChanged();
            found = true;
            break;
        }
    }

    if (!found) {
        JOptionPane.showMessageDialog(this, "Không tìm thấy sách với mã sách đã nhập", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_SearchMouseClicked



    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
                new bookManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Delete;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Huybo;
    private javax.swing.JLabel Save;
    private javax.swing.JLabel Search;
    private javax.swing.JLabel add;
    private javax.swing.JLabel fix;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblPhieuMuon;
    private javax.swing.JLabel theLoai;
    private javax.swing.JTextField txtMS;
    private javax.swing.JTextField txtNXB;
    private javax.swing.JTextField txtTL;
    private javax.swing.JTextField txtTS;
    // End of variables declaration//GEN-END:variables
}
