package View;

import Model.ReaderManaging;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Until.NguoiDoc;

public class ReaderInterface extends javax.swing.JFrame {

    ArrayList<ReaderManaging> listreader = new ArrayList();
    ReaderManaging reader;
    private static int position = 0;
    private static int check = 0;

    public ReaderInterface() {
        initComponents();
        loadDatatoTable();
    }

    public void viewinglistreader() {
        DefaultTableModel model = (DefaultTableModel) this.ReaderTable.getModel();
        try {
            ReaderManaging rm = new ReaderManaging();
            model.setNumRows(0);
            for (ReaderManaging r : listreader) {
                model.addRow(new Object[]{r.getReaderID(), r.getReaderName(), r.getReaderAddress(), r.getReaderPhone(), r.getReaderEmail()});
            }
            model.fireTableDataChanged();
            OnOffButton(false, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadDatatoTable() {
        DefaultTableModel model = (DefaultTableModel) this.ReaderTable.getModel();
        try {
            NguoiDoc nd = new NguoiDoc();
            listreader = nd.docFile();
            ReaderManaging rm = new ReaderManaging();
            model.setNumRows(0);
            for (ReaderManaging r : listreader) {
                model.addRow(new Object[]{r.getReaderID(), r.getReaderName(), r.getReaderAddress(), r.getReaderPhone(), r.getReaderEmail()});
            }
            model.fireTableDataChanged();
            OnOffButton(false, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtReaderEmail = new javax.swing.JTextField();
        txtReaderPhone = new javax.swing.JTextField();
        txtReaderAddress = new javax.swing.JTextField();
        txtNameReader = new javax.swing.JTextField();
        txtReaderID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReaderTable = new javax.swing.JTable();
        AddReaderInfo = new javax.swing.JButton();
        DelReaderInfo = new javax.swing.JButton();
        SaveReaderInfo = new javax.swing.JButton();
        ChangeReaderInfo = new javax.swing.JButton();
        SearchReaderInfo = new javax.swing.JButton();
        NoChangingReaderInfo = new javax.swing.JButton();
        CombackHome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Email người đọc");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Số điện thoại");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Địa chỉ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Tên người đọc");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Mã số người đọc");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));
        jPanel1.add(txtReaderEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 171, -1));
        jPanel1.add(txtReaderPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 171, -1));
        jPanel1.add(txtReaderAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 171, -1));

        txtNameReader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameReaderActionPerformed(evt);
            }
        });
        jPanel1.add(txtNameReader, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 171, -1));

        txtReaderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReaderIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtReaderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 171, -1));

        ReaderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Mã số", "Tên người đọc", "Địa chỉ", "Số điện thoại", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ReaderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReaderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ReaderTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 800, 200));

        AddReaderInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddReaderInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add1.png"))); // NOI18N
        AddReaderInfo.setText("Thêm");
        AddReaderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddReaderInfoActionPerformed(evt);
            }
        });
        jPanel1.add(AddReaderInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 180, 40));

        DelReaderInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DelReaderInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete1.png"))); // NOI18N
        DelReaderInfo.setText("Xóa thông tin");
        DelReaderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelReaderInfoActionPerformed(evt);
            }
        });
        jPanel1.add(DelReaderInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 180, 40));

        SaveReaderInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SaveReaderInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save2.png"))); // NOI18N
        SaveReaderInfo.setText("Đồng ý");
        SaveReaderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveReaderInfoActionPerformed(evt);
            }
        });
        jPanel1.add(SaveReaderInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 180, 40));

        ChangeReaderInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ChangeReaderInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit1.png"))); // NOI18N
        ChangeReaderInfo.setText("Sửa thông tin");
        ChangeReaderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeReaderInfoActionPerformed(evt);
            }
        });
        jPanel1.add(ChangeReaderInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 180, 40));

        SearchReaderInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SearchReaderInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search1.jpg"))); // NOI18N
        SearchReaderInfo.setText("Tìm kiếm");
        SearchReaderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchReaderInfoActionPerformed(evt);
            }
        });
        jPanel1.add(SearchReaderInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 180, 40));

        NoChangingReaderInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NoChangingReaderInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel1.png"))); // NOI18N
        NoChangingReaderInfo.setText("Hủy bỏ");
        NoChangingReaderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoChangingReaderInfoActionPerformed(evt);
            }
        });
        jPanel1.add(NoChangingReaderInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 180, 40));

        CombackHome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CombackHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/returnn2.jpg"))); // NOI18N
        CombackHome.setText("Quay lại");
        CombackHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombackHomeActionPerformed(evt);
            }
        });
        jPanel1.add(CombackHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Quản lý người đọc");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/background1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CombackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombackHomeActionPerformed
        TrangChu1 tc = new TrangChu1();
        tc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CombackHomeActionPerformed

    private void txtReaderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReaderIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReaderIDActionPerformed

    private void AddReaderInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddReaderInfoActionPerformed
        this.txtReaderID.setText("");
        this.txtNameReader.setText("");
        this.txtReaderPhone.setText("");
        this.txtReaderAddress.setText("");
        this.txtReaderEmail.setText("");
        OnOffButton(true, false);
        check = 1;
    }//GEN-LAST:event_AddReaderInfoActionPerformed

    private void ChangeReaderInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeReaderInfoActionPerformed
        OnOffButton(true, false);
        check = -1;
    }//GEN-LAST:event_ChangeReaderInfoActionPerformed

    private void DelReaderInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelReaderInfoActionPerformed
        OnOffButton(true, false);
        check = -2;
    }//GEN-LAST:event_DelReaderInfoActionPerformed

    public static int tb = 0;
    private void SearchReaderInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchReaderInfoActionPerformed
        outsearching(true, false);
        String id = this.txtReaderID.getText();
        DefaultTableModel model = (DefaultTableModel) this.ReaderTable.getModel();
        model.setNumRows(0);
        for (ReaderManaging r : listreader) {
            if (id.equals(r.getReaderID())) {
                tb++;
                model.addRow(new Object[]{r.getReaderID(), r.getReaderName(), r.getReaderAddress(), r.getReaderPhone(), r.getReaderEmail()});
            }
        }
        if (tb == 0) {
            JOptionPane.showConfirmDialog(this, "Không có khách hàng nào phù hợp", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        check = 2;
    }//GEN-LAST:event_SearchReaderInfoActionPerformed

    private void txtNameReaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameReaderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameReaderActionPerformed

    private void SaveReaderInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveReaderInfoActionPerformed
        String id = txtReaderID.getText();
        String name = txtNameReader.getText();
        String address = txtReaderAddress.getText();
        String phone = txtReaderPhone.getText();
        String email = txtReaderEmail.getText();
        StringBuilder sb = new StringBuilder();
        if (id.equals("")) {
            sb.append("Không được để trống mã người đọc\n");
        }
        if (name.equals("")) {
            sb.append("Không được để trống tên người đọc!\n");
        }
        if (phone.trim().equals("")) {
            sb.append("Không được để trống số điện thoại!\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invaidation", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            if (check == 1) {
                try {
                    NguoiDoc nd = new NguoiDoc();
                    String test = txtReaderID.getText();
                    int kt = 0;
                    for (ReaderManaging r : listreader) {
                        if (test.equals(r.getReaderID())) {
                            kt += 1;
                        }
                    }
                    if (kt == 0) {
                        ReaderManaging rm = new ReaderManaging(txtReaderID.getText(), txtNameReader.getText(), txtReaderAddress.getText(), txtReaderPhone.getText(), txtReaderEmail.getText());
                        listreader.add(rm);
                        nd.luuFile(listreader, false);
                        JOptionPane.showMessageDialog(this, "Đã lưu thành công", "Trạng thái", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Đã tồn tại người đọc", "Trạng thái", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (check == -1) {
                try {
                    NguoiDoc nd = new NguoiDoc();
                    ReaderManaging rm = new ReaderManaging(txtReaderID.getText(), txtNameReader.getText(), txtReaderAddress.getText(), txtReaderPhone.getText(), txtReaderEmail.getText());
                    listreader.set(position, rm);
                    JOptionPane.showConfirmDialog(this, "Đã sửa thành công!", "Trạng thái", JOptionPane.ERROR_MESSAGE);
                    nd.luuFile(listreader, false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (check == -2) {
                try {
                    NguoiDoc nd = new NguoiDoc();
                    listreader.remove(position);
                    JOptionPane.showConfirmDialog(this, "Đã xóa thành công!", "Trạng thái", JOptionPane.ERROR_MESSAGE);
                    nd.luuFile(listreader, false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        this.txtReaderID.setText("");
        this.txtNameReader.setText("");
        this.txtReaderPhone.setText("");
        this.txtReaderAddress.setText("");
        this.txtReaderEmail.setText("");
        viewinglistreader();
    }//GEN-LAST:event_SaveReaderInfoActionPerformed

    private void NoChangingReaderInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoChangingReaderInfoActionPerformed
        this.txtReaderID.setText("");
        this.txtNameReader.setText("");
        this.txtReaderPhone.setText("");
        this.txtReaderAddress.setText("");
        this.txtReaderEmail.setText("");
        OnOffButton(false, true);
        if (check == 2) {
            loadDatatoTable();
        }
    }//GEN-LAST:event_NoChangingReaderInfoActionPerformed

    private void ReaderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReaderTableMouseClicked
        position = this.ReaderTable.getSelectedRow();
        ReaderManaging reader = listreader.get(position);
        this.txtReaderID.setText(reader.getReaderID());
        this.txtNameReader.setText(reader.getReaderName());
        this.txtReaderAddress.setText(reader.getReaderAddress());
        this.txtReaderPhone.setText(reader.getReaderPhone());
        this.txtReaderEmail.setText(reader.getReaderEmail());
    }//GEN-LAST:event_ReaderTableMouseClicked
    private void OnOffButton(boolean a, boolean b) {
        this.SaveReaderInfo.show(a);
        this.NoChangingReaderInfo.show(a);
        this.AddReaderInfo.show(b);
        this.DelReaderInfo.show(b);
        this.ChangeReaderInfo.show(b);
        this.SearchReaderInfo.show(b);
    }

    private void outsearching(boolean a, boolean b) {
        this.NoChangingReaderInfo.show(a);
        this.SaveReaderInfo.show(b);
        this.AddReaderInfo.show(b);
        this.DelReaderInfo.show(b);
        this.ChangeReaderInfo.show(b);
        this.SearchReaderInfo.show(b);
    }

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
            java.util.logging.Logger.getLogger(ReaderInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReaderInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReaderInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReaderInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReaderInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddReaderInfo;
    private javax.swing.JButton ChangeReaderInfo;
    private javax.swing.JButton CombackHome;
    private javax.swing.JButton DelReaderInfo;
    private javax.swing.JButton NoChangingReaderInfo;
    private javax.swing.JTable ReaderTable;
    private javax.swing.JButton SaveReaderInfo;
    private javax.swing.JButton SearchReaderInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNameReader;
    private javax.swing.JTextField txtReaderAddress;
    private javax.swing.JTextField txtReaderEmail;
    private javax.swing.JTextField txtReaderID;
    private javax.swing.JTextField txtReaderPhone;
    // End of variables declaration//GEN-END:variables
}
