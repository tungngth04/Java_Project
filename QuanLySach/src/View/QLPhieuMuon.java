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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPM = new javax.swing.JTextField();
        txtND = new javax.swing.JTextField();
        txtMS = new javax.swing.JTextField();
        txtTS = new javax.swing.JTextField();
        txtNM = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        btnPM = new javax.swing.JButton();
        btnCTPM = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();
        btnChange1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnSave1 = new javax.swing.JButton();
        btnCancel1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhieuMuon = new javax.swing.JTable();

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CHƯƠNG TRÌNH QUẢN LÝ PHIẾU MƯỢN");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/returnn2.jpg"))); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.setPreferredSize(new java.awt.Dimension(79, 29));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setText("Mã Phiếu mượn:");

        jLabel3.setText("Mã Người đọc:");

        jLabel4.setText("Mã Sách:");

        jLabel5.setText("Tên Sách:");

        jLabel6.setText("Ngày Mượn:");

        txtPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPMActionPerformed(evt);
            }
        });

        txtMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add1.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        btnAdd.setVisible(false);

        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit1.png"))); // NOI18N
        btnChange.setText("Sửa");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        btnChange.setVisible(false);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete1.png"))); // NOI18N
        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        btnDelete.setVisible(false);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save2.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.setVisible(false);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel1.png"))); // NOI18N
        btnCancel.setText("Huỷ bỏ");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        btnCancel.setVisible(false);

        jLabel7.setText("Số lượng:");

        txtSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSLActionPerformed(evt);
            }
        });

        btnPM.setText("Phiếu mượn");
        btnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPMActionPerformed(evt);
            }
        });

        btnCTPM.setText("Chi tiết phiếu mượn");
        btnCTPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTPMActionPerformed(evt);
            }
        });

        btnAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add1.png"))); // NOI18N
        btnAdd1.setText("Thêm");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });
        btnAdd1.setVisible(false);

        btnChange1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit1.png"))); // NOI18N
        btnChange1.setText("Sửa");
        btnChange1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange1ActionPerformed(evt);
            }
        });
        btnChange1.setVisible(false);

        btnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete1.png"))); // NOI18N
        btnDelete1.setText("Xoá");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        btnDelete1.setVisible(false);

        btnSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save2.png"))); // NOI18N
        btnSave1.setText("Save");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        btnSave1.setVisible(false);

        btnCancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel1.png"))); // NOI18N
        btnCancel1.setText("Huỷ bỏ");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });
        btnCancel1.setVisible(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPM, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnChange1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtPM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtND, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMS, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(btnCancel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel)))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCTPM)
                        .addGap(105, 105, 105))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnAdd1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(307, 307, 307)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTS, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtNM, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPM, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnCTPM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd1)
                            .addComponent(btnChange1)
                            .addComponent(btnDelete1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave1)
                            .addComponent(btnCancel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnChange)
                        .addComponent(btnAdd)
                        .addComponent(btnDelete)
                        .addComponent(btnSave))))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
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
                    Sach pm = new Sach(txtMS.getText(), txtTS.getText(), txtNM.getText(),txtSL.getText());
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
                    Sach pm = new Sach(txtMS.getText(), txtTS.getText(), txtNM.getText(),txtSL.getText());
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
        // TODO add your handling code here:
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
        OnOff(false, true);
        check = 2;
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        StringBuilder sb = new StringBuilder();
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
        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        OnOff(true, false);
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void btnChange1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange1ActionPerformed
        this.txtMS.setText("");
        this.txtTS.setText("");
        OnOff(false, true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
