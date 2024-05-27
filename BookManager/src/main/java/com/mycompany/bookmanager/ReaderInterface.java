package com.mycompany.bookmanager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import storeinfo.readandwrite;

public class ReaderInterface extends javax.swing.JFrame {
    ArrayList<ReaderManaging> listreader = new ArrayList();
    ReaderManaging reader;
    private static int position = 0;
    private static int check = 0;
    
    public ReaderInterface() {
        initComponents();
        loadDatatoTable();
    }
    public void viewinglistreader(){
        DefaultTableModel model = (DefaultTableModel) this.ReaderTable.getModel();
        try{
            ReaderManaging rm = new ReaderManaging();
            model.setNumRows(0);
            for(ReaderManaging r:listreader){
                model.addRow(new Object[]{r.getReaderID(),r.getReaderName(),r.getReaderAddress(),r.getReaderPhone(),r.getReaderEmail()});
            }
            model.fireTableDataChanged();
            OnOffButton(false, true);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public void loadDatatoTable(){
        DefaultTableModel model = (DefaultTableModel) this.ReaderTable.getModel();
        try{
            readandwrite rw = new readandwrite();
            listreader = rw.docFile();
            ReaderManaging rm = new ReaderManaging();
            model.setNumRows(0);
            for(ReaderManaging r:listreader){
                model.addRow(new Object[]{r.getReaderID(),r.getReaderName(),r.getReaderAddress(),r.getReaderPhone(),r.getReaderEmail()});
            }
            model.fireTableDataChanged();
            OnOffButton(false, true);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CombackHome = new javax.swing.JButton();
        txtNameReader = new javax.swing.JTextField();
        txtReaderID = new javax.swing.JTextField();
        txtReaderPhone = new javax.swing.JTextField();
        txtReaderAddress = new javax.swing.JTextField();
        txtReaderEmail = new javax.swing.JTextField();
        AddReaderInfo = new javax.swing.JButton();
        ChangeReaderInfo = new javax.swing.JButton();
        DelReaderInfo = new javax.swing.JButton();
        SearchReaderInfo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReaderTable = new javax.swing.JTable();
        SaveReaderInfo = new javax.swing.JButton();
        NoChangingReaderInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Quản lý người đọc");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Mã số người đọc");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Tên người đọc");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Địa chỉ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Số điện thoại");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Email người đọc");

        CombackHome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CombackHome.setText("Quay lại");
        CombackHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombackHomeActionPerformed(evt);
            }
        });

        txtNameReader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameReaderActionPerformed(evt);
            }
        });

        txtReaderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReaderIDActionPerformed(evt);
            }
        });

        AddReaderInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddReaderInfo.setText("Thêm");
        AddReaderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddReaderInfoActionPerformed(evt);
            }
        });

        ChangeReaderInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ChangeReaderInfo.setText("Sửa thông tin");
        ChangeReaderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeReaderInfoActionPerformed(evt);
            }
        });

        DelReaderInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DelReaderInfo.setText("Xóa thông tin");
        DelReaderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelReaderInfoActionPerformed(evt);
            }
        });

        SearchReaderInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SearchReaderInfo.setText("Tìm kiếm");
        SearchReaderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchReaderInfoActionPerformed(evt);
            }
        });

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

        SaveReaderInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SaveReaderInfo.setText("Đồng ý");
        SaveReaderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveReaderInfoActionPerformed(evt);
            }
        });

        NoChangingReaderInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NoChangingReaderInfo.setText("Hủy bỏ");
        NoChangingReaderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoChangingReaderInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CombackHome)
                        .addGap(215, 215, 215)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(txtReaderPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(119, 119, 119)
                            .addComponent(txtReaderAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(41, 41, 41)
                                .addComponent(txtReaderEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtNameReader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddReaderInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ChangeReaderInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SaveReaderInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DelReaderInfo))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchReaderInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoChangingReaderInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CombackHome)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNameReader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtReaderAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtReaderPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddReaderInfo)
                            .addComponent(ChangeReaderInfo))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchReaderInfo)
                            .addComponent(DelReaderInfo))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoChangingReaderInfo)
                            .addComponent(SaveReaderInfo))
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtReaderEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CombackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombackHomeActionPerformed
        System.exit(0);
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
        for(ReaderManaging r:listreader){
            if(id.equals(r.getReaderID())){
                tb++;
                model.addRow(new Object[]{r.getReaderID(),r.getReaderName(),r.getReaderAddress(),r.getReaderPhone(),r.getReaderEmail()});
            }
        }
        if(tb == 0) JOptionPane.showConfirmDialog(this, "Khong co khach hang phu hop", "Thong bao", JOptionPane.ERROR_MESSAGE);
        check = 2;
    }//GEN-LAST:event_SearchReaderInfoActionPerformed

    private void txtNameReaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameReaderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameReaderActionPerformed

    private void SaveReaderInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveReaderInfoActionPerformed
        String id = this.txtReaderID.getText();
        String name = this.txtNameReader.getText();
        String address = this.txtReaderAddress.getText();
        String phone = this.txtReaderPhone.getText();
        String email = this.txtReaderEmail.getText();
        StringBuilder sb = new StringBuilder();
        if(id.equals("")){
            sb.append("Khong duoc de trong\n");
        }
        if(name.equals("")){
            sb.append("Khong duoc de trong\n");
        }
        if(address.trim().equals("")){
            sb.append("Khong duoc de trong\n");
        }
        if(phone.trim().equals("")){
            sb.append("Khong duoc de trong\n");
        }
        if(email.trim().equals("")){
            sb.append("Khong duoc de trong\n");
        }
        if(check == 1){
            try{
                readandwrite rw = new readandwrite();
                ReaderManaging rm = new ReaderManaging(txtReaderID.getText(),txtNameReader.getText(), txtReaderAddress.getText(), txtReaderPhone.getText(), txtReaderEmail.getText());
                listreader.add(rm);
                rw.luuFile(listreader, false);
                JOptionPane.showMessageDialog(this, "Da luu thanh cong", "Trang thai", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(check == -1){
            try{
                readandwrite rw = new readandwrite();
                ReaderManaging rm = new ReaderManaging(txtReaderID.getText(),txtNameReader.getText(), txtReaderAddress.getText(), txtReaderPhone.getText(), txtReaderEmail.getText());
                listreader.set(position, rm);
                JOptionPane.showConfirmDialog(this, "Da sua thanh cong", "Trang thai", JOptionPane.ERROR_MESSAGE);
                rw.luuFile(listreader, false);
            }catch(Exception e){
                e.printStackTrace();
            }
//            listreader.set(position, new ReaderManaging(id,name,address,phone,email));
        }else if(check == -2){
            try{
                readandwrite rw = new readandwrite();
                listreader.remove(position);
                JOptionPane.showConfirmDialog(this, "Da xoa thanh cong", "Trang thai", JOptionPane.ERROR_MESSAGE);
                rw.luuFile(listreader, false);
            }catch(Exception e){
                e.printStackTrace();
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
        if(check == 2){
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
    private void OnOffButton(boolean a, boolean b){
        this.SaveReaderInfo.show(a);
        this.NoChangingReaderInfo.show(a);
        this.AddReaderInfo.show(b);
        this.DelReaderInfo.show(b);
        this.ChangeReaderInfo.show(b);
        this.SearchReaderInfo.show(b);
    }
    private void outsearching(boolean a, boolean b){
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNameReader;
    private javax.swing.JTextField txtReaderAddress;
    private javax.swing.JTextField txtReaderEmail;
    private javax.swing.JTextField txtReaderID;
    private javax.swing.JTextField txtReaderPhone;
    // End of variables declaration//GEN-END:variables
}
