/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlykhachsan_btl;

import java.awt.HeadlessException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author itsHuaan
 */
public class QuanLyDichVu extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyDichVu
     */
    Connection connection;
    String maDichVu, _maDichVu;

    public QuanLyDichVu() {
        initComponents();
        GenericClass.centerOnScreen(this);
        try {
            connection = DBConnector.connect();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_dsDichVu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextField_tenDichVu = new javax.swing.JTextField();
        jTextField_chiPhi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton_them = new javax.swing.JButton();
        jButton_xoa = new javax.swing.JButton();
        jButton_sua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản lý dịch vụ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách dịch vụ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTable_dsDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Chi phí dịch vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_dsDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_dsDichVuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_dsDichVu);
        if (jTable_dsDichVu.getColumnModel().getColumnCount() > 0) {
            jTable_dsDichVu.getColumnModel().getColumn(0).setResizable(false);
            jTable_dsDichVu.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin dịch vụ"));

        jTextField_chiPhi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_chiPhiKeyTyped(evt);
            }
        });

        jLabel5.setText("Tên dịch vụ:");

        jLabel6.setText("Chi phí:");

        jButton_them.setText("Thêm");
        jButton_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_themActionPerformed(evt);
            }
        });

        jButton_xoa.setText("Xóa");
        jButton_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_xoaActionPerformed(evt);
            }
        });

        jButton_sua.setText("Sửa");
        jButton_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_suaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(145, 145, 145))
                            .addComponent(jTextField_tenDichVu))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(168, 168, 168))
                            .addComponent(jTextField_chiPhi)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(114, 114, 114)
                        .addComponent(jButton_sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(110, 110, 110)
                        .addComponent(jButton_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_tenDichVu)
                    .addComponent(jTextField_chiPhi))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void jTable_dsDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_dsDichVuMouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable_dsDichVu.getSelectedRow();

        _maDichVu = jTable_dsDichVu.getValueAt(selectedRow, 0).toString();
        jTextField_tenDichVu.setText(jTable_dsDichVu.getValueAt(selectedRow, 1).toString());
        jTextField_chiPhi.setText(jTable_dsDichVu.getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_jTable_dsDichVuMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        maDichVu = GenericClass.generateRandomString("dv", 100, 900);
        GenericClass.loadData(connection, GenericClass.selectDichVu, jTable_dsDichVu);
    }//GEN-LAST:event_formWindowActivated

    private void jButton_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_themActionPerformed
        // TODO add your handling code here:
        try {
            // Lấy dữ liệu từ các component
            String tenDichVu = jTextField_tenDichVu.getText();
            double chiPhi = Double.parseDouble(jTextField_chiPhi.getText());

            // Kiểm tra nếu một trong các trường là trống
            if (tenDichVu.isEmpty() || jTextField_chiPhi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                if (chiPhi <= 0) {
                    JOptionPane.showMessageDialog(this, "Phí dịch vụ không hợp lệ.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                } else {
                    String query = "INSERT INTO dichvu(MaDichVu, TenDichVu, ChiPhi) VALUES (?, ?, ?)";
                    try (java.sql.PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                        preparedStatement.setString(1, maDichVu);
                        preparedStatement.setString(2, tenDichVu);
                        preparedStatement.setDouble(3, chiPhi);

                        // Thực hiện câu lệnh SQL
                        preparedStatement.executeUpdate();
                    }

                    // Thêm dữ liệu vào DefaultTableModel của jTable_dsphong
                    clear_input();
                    DefaultTableModel model = (DefaultTableModel) jTable_dsDichVu.getModel();
                    model.addRow(new Object[]{maDichVu, tenDichVu, chiPhi});

                    JOptionPane.showMessageDialog(this, "Thêm dịch vụ thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(QuanLyPhong.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Lỗi khi thêm dịch vụ.", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_themActionPerformed

    private void jButton_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_xoaActionPerformed
        // TODO add your handling code here:
        int[] selectedRows = jTable_dsDichVu.getSelectedRows();

        if (selectedRows.length > 0) {
            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa " + selectedRows.length + " dịch vụ đã chọn?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                try {
                    for (int i = selectedRows.length - 1; i >= 0; i--) {
                        String ma = jTable_dsDichVu.getValueAt(selectedRows[i], 0).toString();
                        String deleteQuery = "DELETE FROM dichvu WHERE MaDichVu = ?";
                        try (java.sql.PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                            preparedStatement.setString(1, ma);
                            preparedStatement.executeUpdate();
                        }
                        DefaultTableModel model = (DefaultTableModel) jTable_dsDichVu.getModel();
                        model.removeRow(selectedRows[i]);
                    }
                    JOptionPane.showMessageDialog(this, "Đã xóa " + selectedRows.length + " dịch vụ.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyDichVu.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Lỗi khi xóa dịch vụ: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ít nhất một dòng để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_xoaActionPerformed

    private void jButton_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_suaActionPerformed
        // TODO add your handling code here:
        try {
            String tenDichVu = jTextField_tenDichVu.getText();
            double chiPhi = Double.parseDouble(jTextField_chiPhi.getText());

            // Kiểm tra nếu một trong các trường là trống
            if (tenDichVu.isEmpty() || jTextField_chiPhi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                if (chiPhi <= 0) {
                    JOptionPane.showMessageDialog(this, "Phí dịch vụ không hợp lệ.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                } else {
                    String query = "UPDATE dichvu SET TenDichVu = ?, ChiPhi = ? WHERE MaDichVu = ?";
                    try (java.sql.PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                        preparedStatement.setString(1, tenDichVu);
                        preparedStatement.setDouble(2, chiPhi);
                        preparedStatement.setString(3, _maDichVu);

                        // Thực hiện câu lệnh SQL
                        preparedStatement.executeUpdate();
                    }

                    clear_input();
                    JOptionPane.showMessageDialog(this, "Thêm dịch vụ thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(QuanLyPhong.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Lỗi khi thêm dịch vụ.", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_suaActionPerformed

    private void jTextField_chiPhiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_chiPhiKeyTyped
        // TODO add your handling code here:
        GenericClass.numbersOnly(evt);
    }//GEN-LAST:event_jTextField_chiPhiKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(QuanLyDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyDichVu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_sua;
    private javax.swing.JButton jButton_them;
    private javax.swing.JButton jButton_xoa;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_dsDichVu;
    private javax.swing.JTextField jTextField_chiPhi;
    private javax.swing.JTextField jTextField_tenDichVu;
    // End of variables declaration//GEN-END:variables

    private void clear_input() {
        jTextField_tenDichVu.requestFocus();
        jTextField_tenDichVu.setText("");
        jTextField_chiPhi.setText("");
    }
}
