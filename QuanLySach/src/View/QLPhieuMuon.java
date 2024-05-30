/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Container;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Until.PhieuMuonL;
import Model.PhieuMuon;
import Model.Sach;

public class QLPhieuMuon extends javax.swing.JFrame {

    private static int pos = 0;
    private static int check = 0;
    private static int pos1 = 0;

    public QLPhieuMuon() {
        initComponents();
        view();
        loadDataToTable2();

    }

    public void view() {
        PhieuMuonL pml = new PhieuMuonL();
        List<PhieuMuon> list = pml.docFile();
        PhieuMuon x = list.get(pos);
        this.txtPM.setText(x.getMaPM());
        this.txtND.setText(x.getMaND());
        OnOff(true, false);
    }

    public void view1() {
        PhieuMuonL pml = new PhieuMuonL();
        List<Container> list = pml.readContainersFromFile("src/Data/container_data.txt");
        Container c = list.get(pos);
        Sach x = c.getObjects().get(pos1);
        this.txtMS.setText(x.getMaSach());
        this.txtTS.setText(x.getTenSach());
        this.txtNM.setText(x.getTgMuon());
        this.txtSL.setText(x.getSoLuong());
        OnOff(true, false);
    }

    public void loadDataToTable() {
        DefaultTableModel tblModel = (DefaultTableModel) this.tblSach.getModel();
        try {
            PhieuMuonL pml = new PhieuMuonL();
            List<Container> loadedContainers = pml.readContainersFromFile("src/Data/container_data.txt");
            tblModel.setRowCount(0);
            Container pms = loadedContainers.get(pos);
            for (Sach pm : pms.getObjects()) {
                tblModel.addRow(new Object[]{
                    pm.getMaSach(), pm.getTenSach(), pm.getTgMuon(), pm.getSoLuong()
                });
            }

            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void loadDataToTable2() {
        DefaultTableModel tblModel = (DefaultTableModel) this.tblPhieuMuon.getModel();
        try {
            PhieuMuonL pml = new PhieuMuonL();
            List<PhieuMuon> list = pml.docFile();
            tblModel.setRowCount(0);
            for (PhieuMuon pms : list) {
//                for (PhieuMuon pm : pms.getlistPM()) {
                tblModel.addRow(new Object[]{
                    pms.getMaPM(), pms.getMaND()
                });
//                }

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
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();
        btnChange1 = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnPM = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPM = new javax.swing.JTextField();
        txtND = new javax.swing.JTextField();
        txtMS = new javax.swing.JTextField();
        btnDelete1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCTPM = new javax.swing.JButton();
        btnSave1 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtTS = new javax.swing.JTextField();
        txtNM = new javax.swing.JTextField();
        txtSL = new javax.swing.JTextField();
        btnCancel1 = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhieuMuon = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

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

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add1.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        btnAdd.setVisible(false);
        jPanel4.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        btnAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add1.png"))); // NOI18N
        btnAdd1.setText("Thêm");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });
        btnAdd1.setVisible(false);
        jPanel4.add(btnAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        btnChange1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit1.png"))); // NOI18N
        btnChange1.setText("Sửa");
        btnChange1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange1ActionPerformed(evt);
            }
        });
        btnChange1.setVisible(false);
        jPanel4.add(btnChange1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 92, -1));

        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit1.png"))); // NOI18N
        btnChange.setText("Sửa");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        btnChange.setVisible(false);
        jPanel4.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 92, -1));

        btnPM.setText("Phiếu mượn");
        btnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPMActionPerformed(evt);
            }
        });
        jPanel4.add(btnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 114, 34));

        jLabel4.setText("Mã Sách:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 80, -1));

        jLabel3.setText("Mã Người đọc:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 80, -1));

        jLabel2.setText("Mã Phiếu mượn:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        txtPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPMActionPerformed(evt);
            }
        });
        jPanel4.add(txtPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 198, -1));
        jPanel4.add(txtND, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 198, -1));

        txtMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSActionPerformed(evt);
            }
        });
        jPanel4.add(txtMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 198, -1));

        btnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete1.png"))); // NOI18N
        btnDelete1.setText("Xoá");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        btnDelete1.setVisible(false);
        jPanel4.add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 87, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete1.png"))); // NOI18N
        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        btnDelete.setVisible(false);
        jPanel4.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 87, -1));

        jLabel5.setText("Tên Sách:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 59, -1));

        jLabel6.setText("Ngày Mượn:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        jLabel7.setText("Số lượng:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 59, 20));

        btnCTPM.setText("Chi tiết phiếu mượn");
        btnCTPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTPMActionPerformed(evt);
            }
        });
        jPanel4.add(btnCTPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, -1, 34));

        btnSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save2.png"))); // NOI18N
        btnSave1.setText("Save");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        btnSave1.setVisible(false);
        jPanel4.add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 87, -1));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save2.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.setVisible(false);
        jPanel4.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 87, -1));
        jPanel4.add(txtTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 187, -1));
        jPanel4.add(txtNM, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 187, -1));

        txtSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSLActionPerformed(evt);
            }
        });
        jPanel4.add(txtSL, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 187, -1));

        btnCancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel1.png"))); // NOI18N
        btnCancel1.setText("Huỷ bỏ");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });
        btnCancel1.setVisible(false);
        jPanel4.add(btnCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel1.png"))); // NOI18N
        btnCancel.setText("Huỷ bỏ");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        btnCancel.setVisible(false);
        jPanel4.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, -1, -1));

        tblPhieuMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Mã phiếu mượn", "Mã người đọc"
            }
        ));
        tblPhieuMuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuMuonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPhieuMuon);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, 200));

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Mã Sách", "Tên Sách", "Ngày Mượn", "Số lượng"
            }
        ));
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        tblSach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSachKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblSach);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 50, 460, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CHƯƠNG TRÌNH QUẢN LÝ PHIẾU MƯỢN");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/returnn2.jpg"))); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.setPreferredSize(new java.awt.Dimension(79, 29));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/background1.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSActionPerformed

    private void txtPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPMActionPerformed

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
        pos1 = this.tblSach.getSelectedRow();
        view1();
    }//GEN-LAST:event_tblSachMouseClicked

    private void tblSachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSachKeyReleased
        pos1 = this.tblSach.getSelectedRow();
        view1();
    }//GEN-LAST:event_tblSachKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
//        this.txtPM.setText("");
//        this.txtND.setText("");
        this.txtMS.setText("");
        this.txtTS.setText("");
        this.txtNM.setText("");
        this.txtSL.setText("");
        OnOff(false, true);
        check = 1;
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String maMS = txtMS.getText();
        String tenSach = txtTS.getText();
        String ngayMuon = txtNM.getText();
        String soLuong = txtSL.getText();
        StringBuilder sb = new StringBuilder();  // cho phép tạo ra 1 chuỗi rỗng và bổ sung nội dung Username is empty or Password is empty vào sb
        if (maMS.trim().equals("")) {
            sb.append("Mã sách không được để trống\n");
        }
        if (tenSach.trim().equals("")) {
            sb.append("Tên sách không được để trống\n");
        }
        if (ngayMuon.trim().equals("")) {
            sb.append("Ngày mượn không được để trống\n");
        }
        if (soLuong.trim().equals("")) {
            sb.append("Số lượng không được để trống\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invaidation", JOptionPane.ERROR_MESSAGE);
            return;

        } else {
            if (check == 1) {
                try {
                    PhieuMuonL pml = new PhieuMuonL();
                    List<Container> list = pml.readContainersFromFile("src/Data/container_data.txt");
                    Container c = list.get(pos);
                    Sach pm = new Sach(txtMS.getText(), txtTS.getText(), txtNM.getText(), txtSL.getText());
                    c.addObject(pm);

                    pml.saveContainersToFile(list, "src/Data/container_data.txt");
                    JOptionPane.showMessageDialog(this, "Phiếu mượn đã được lưu", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    loadDataToTable();

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, sb.toString(), "Invaidation", JOptionPane.ERROR_MESSAGE);

                }
            }

            if (check == -1) {
                try {
                    PhieuMuonL pml = new PhieuMuonL();
                    List<Container> list = pml.readContainersFromFile("src/Data/container_data.txt");
                    Container c = list.get(pos);
                    Sach pm = new Sach(txtMS.getText(), txtTS.getText(), txtNM.getText(), txtSL.getText());
                    boolean found = false;

                    // Lặp qua các đối tượng để tìm đối tượng cần thay thế
                    for (int i = 0; i < c.getObjects().size(); i++) {
                        Sach p = c.getObjects().get(i);
                        if (p.getMaSach().equals(txtMS.getText())) { // Giả sử getName() trả về định danh
                            c.getObjects().set(i, pm);
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        JOptionPane.showMessageDialog(this, "Phiếu mượn đã được sửa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Phiếu mượn chưa được sửa", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    }
                    pml.saveContainersToFile(list, "src/Data/container_data.txt");
                    loadDataToTable();
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, sb.toString(), "Invaidation", JOptionPane.ERROR_MESSAGE);

                }
            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
//        view();
        OnOff(true, false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        OnOff(false, true);
        check = -1;
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        StringBuilder sb = new StringBuilder();
        try {
            PhieuMuonL pml = new PhieuMuonL();
            List<Container> list = pml.readContainersFromFile("src/Data/container_data.txt");
            Container c = list.get(pos);
            c.getObjects().remove(pos1);
            JOptionPane.showMessageDialog(this, "Phiếu mượn đã được xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
            pml.saveContainersToFile(list, "src/Data/container_data.txt");
            loadDataToTable();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        TrangChu1 tc = new TrangChu1();
        tc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblPhieuMuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuMuonMouseClicked
        pos = this.tblPhieuMuon.getSelectedRow();
        this.txtMS.setText("");
        this.txtTS.setText("");
        view();
        loadDataToTable();
    }//GEN-LAST:event_tblPhieuMuonMouseClicked

    private void txtSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSLActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        this.txtPM.setText("");
        this.txtND.setText("");
        this.txtMS.setText("");
        this.txtTS.setText("");
        this.txtNM.setText("");
        this.txtSL.setText("");
        OnOff1(false, true);
        check = 2;
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        OnOff1(false, true);
        check = -3;

    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        String maPM = txtPM.getText();
        String maND = txtND.getText();
        StringBuilder sb = new StringBuilder();  // cho phép tạo ra 1 chuỗi rỗng và bổ sung nội dung Username is empty or Password is empty vào sb
        if (maPM.trim().equals("")) {
            sb.append("Mã sách không được để trống\n");
        }
        if (maND.trim().equals("")) {
            sb.append("Mã người đọc không được để trống\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invaidation", JOptionPane.ERROR_MESSAGE);
            return;

        } else {
            if (check == 2) {
                try {
                    PhieuMuonL pml = new PhieuMuonL();
                    List<PhieuMuon> list = new ArrayList<>();
                    PhieuMuon pm = new PhieuMuon(txtPM.getText(), txtND.getText());
                    list.add(pm);
                    pml.luuFile(list, true);
                    JOptionPane.showMessageDialog(this, "Phiếu mượn đã được lưu", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    loadDataToTable2();
                    List<PhieuMuon> lists = pml.docFile();
                    pml.ghided1(lists);
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, sb.toString(), "Invaidation", JOptionPane.ERROR_MESSAGE);

                }
            }
            if (check == -2) {
                try {
                    PhieuMuonL pml = new PhieuMuonL();
                    List<PhieuMuon> list = pml.docFile();
                    PhieuMuon newPM = new PhieuMuon(txtPM.getText(), txtND.getText());
                    PhieuMuon pm = new PhieuMuon(txtPM.getText());
                    if (list.contains(pm)) {
                        list.set(pos, newPM);
                        JOptionPane.showMessageDialog(this, "Phiếu mượn đã được sửa", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Phiếu mượn chưa được sửa", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    }
                    pml.luuFile(list, false);
                    loadDataToTable2();
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, sb.toString(), "Invaidation", JOptionPane.ERROR_MESSAGE);

                }
            }
            if (check == -3) {
                try {
                    PhieuMuonL pml = new PhieuMuonL();
                    List<PhieuMuon> list = pml.docFile();
                    if (pos >= 0 && pos < list.size()) {
                        list.remove(pos);
                    } else {
                        JOptionPane.showMessageDialog(this, "Vị trí không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    List<Container> containers = pml.readContainersFromFile("src/Data/container_data.txt");
                    if (pos >= 0 && pos < containers.size()) {
                        containers.remove(pos);
                    } else {
                        JOptionPane.showMessageDialog(this, "Vị trí không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    JOptionPane.showMessageDialog(this, "Phiếu mượn đã được xóa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    pml.luuFile(list, false);
                    pml.saveContainersToFile(containers, "src/Data/container_data.txt");
                    loadDataToTable();
                    loadDataToTable2();
                    pml.ghided1(list);

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        OnOff1(true, false);
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void btnChange1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange1ActionPerformed
        this.txtMS.setText("");
        this.txtTS.setText("");
        OnOff1(false, true);
        check = -2;
    }//GEN-LAST:event_btnChange1ActionPerformed

    private void btnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPMActionPerformed
//        OnOff1(false, true);
        btnAdd1.setVisible(true);
        btnChange1.setVisible(true);
        btnCancel1.setVisible(true);
        btnSave1.setVisible(true);
        btnDelete1.setVisible(true);

        btnAdd.setVisible(false);
        btnChange.setVisible(false);
        btnDelete.setVisible(false);
        btnSave.setVisible(false);
        btnCancel.setVisible(false);

    }//GEN-LAST:event_btnPMActionPerformed

    private void btnCTPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTPMActionPerformed
//        OnOff1(true, false);

        btnAdd.setVisible(true);
        btnChange.setVisible(true);
        btnDelete.setVisible(true);
        btnSave.setVisible(true);
        btnCancel.setVisible(true);

        btnAdd1.setVisible(false);
        btnChange1.setVisible(false);
        btnCancel1.setVisible(false);
        btnSave1.setVisible(false);
        btnDelete1.setVisible(false);

    }//GEN-LAST:event_btnCTPMActionPerformed

    public void OnOff(boolean a, boolean b) {
        this.btnSave.show(b);
        this.btnCancel.show(b);

        this.btnAdd.show(a);
        this.btnChange.show(a);
        this.btnDelete.show(a);

    }
    
    public void OnOff1(boolean a, boolean b) {
        this.btnSave1.show(b);
        this.btnCancel1.show(b);

        this.btnAdd1.show(a);
        this.btnChange1.show(a);
        this.btnDelete1.show(a);

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
            java.util.logging.Logger.getLogger(QLPhieuMuon.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLPhieuMuon.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLPhieuMuon.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLPhieuMuon.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLPhieuMuon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCTPM;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnChange1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnPM;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPhieuMuon;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtMS;
    private javax.swing.JTextField txtND;
    private javax.swing.JTextField txtNM;
    private javax.swing.JTextField txtPM;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTS;
    // End of variables declaration//GEN-END:variables
}
