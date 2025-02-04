/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlykhachsan_btl;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Year;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author itsHuaan
 */
public class ThongKe extends javax.swing.JFrame {

    /**
     * Creates new form ThongKe
     */
    Connection connection;
    double quy1, quy2, quy3, quy4;

    public ThongKe() {
        initComponents();
        GenericClass.centerOnScreen(this);
        try {
            connection = DBConnector.connect();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_doanhThu = new javax.swing.JTable();
        jComboBox_nam = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bảng doanh thu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        jTable_doanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quý 1", "Quý 2", "Quý 3", "Quý 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_doanhThu);
        if (jTable_doanhThu.getColumnModel().getColumnCount() > 0) {
            jTable_doanhThu.getColumnModel().getColumn(0).setResizable(false);
            jTable_doanhThu.getColumnModel().getColumn(1).setResizable(false);
            jTable_doanhThu.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jComboBox_nam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_namItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BÁO CÁO THỐNG KÊ");

        jLabel2.setText("Năm:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBox_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox_nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadCombobox(JComboBox comboBox) {
        Year currentYear = Year.now();
        int yearValue = currentYear.getValue();
        DefaultComboBoxModel model = (DefaultComboBoxModel) comboBox.getModel();
        for (int i = yearValue; i >= yearValue - 50; i--) {
            model.addElement(i);
        }
        comboBox.setSelectedIndex(0);
    }

    private void openFile(String filePath) {
        try {
            File path = new File(filePath);
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void doanhThu() {
        quy1 = tinhDoanhThu("SELECT SUM(TongTien) AS DoanhThu FROM thanhtoan WHERE ThoiDiemThanhToan BETWEEN '" + jComboBox_nam.getSelectedItem().toString() + "-01-01' AND '" + jComboBox_nam.getSelectedItem().toString() + "-03-31'");
        quy2 = tinhDoanhThu("SELECT SUM(TongTien) AS DoanhThu FROM thanhtoan WHERE ThoiDiemThanhToan BETWEEN '" + jComboBox_nam.getSelectedItem().toString() + "-04-01' AND '" + jComboBox_nam.getSelectedItem().toString() + "-06-31'");
        quy3 = tinhDoanhThu("SELECT SUM(TongTien) AS DoanhThu FROM thanhtoan WHERE ThoiDiemThanhToan BETWEEN '" + jComboBox_nam.getSelectedItem().toString() + "-07-01' AND '" + jComboBox_nam.getSelectedItem().toString() + "-09-30'");
        quy4 = tinhDoanhThu("SELECT SUM(TongTien) AS DoanhThu FROM thanhtoan WHERE ThoiDiemThanhToan BETWEEN '" + jComboBox_nam.getSelectedItem().toString() + "-10-01' AND '" + jComboBox_nam.getSelectedItem().toString() + "-12-31'");
    }

    private double tinhDoanhThu(String query) {
        double sum = 0;
        try {
            try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    sum += resultSet.getDouble(1);
                }

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return sum;
    }

    private void loadDoanhThu(double quy1, double quy2, double quy3, double quy4) {
        DefaultTableModel model = (DefaultTableModel) jTable_doanhThu.getModel();
        model.setRowCount(0);
        Object[] col = new Object[model.getColumnCount()];
        col[0] = Double.toString(quy1) + " ₫";
        col[1] = Double.toString(quy2) + " ₫";
        col[2] = Double.toString(quy3) + " ₫";
        col[3] = Double.toString(quy4) + " ₫";
        model.addRow(col);
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        loadCombobox(jComboBox_nam);
        doanhThu();
        loadDoanhThu(quy1, quy2, quy3, quy4);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.dispose();
        TrangChu trangChu = new TrangChu();
        trangChu.show();
    }//GEN-LAST:event_formWindowClosed

    private void jComboBox_namItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_namItemStateChanged
        // TODO add your handling code here:
        TitledBorder titledBorder = (TitledBorder) jPanel1.getBorder();
        titledBorder.setTitle("Bảng doanh thu năm " + jComboBox_nam.getSelectedItem().toString());
        jPanel1.setBorder(titledBorder);
        doanhThu();
        loadDoanhThu(quy1, quy2, quy3, quy4);
    }//GEN-LAST:event_jComboBox_namItemStateChanged

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
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox_nam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_doanhThu;
    // End of variables declaration//GEN-END:variables
}
