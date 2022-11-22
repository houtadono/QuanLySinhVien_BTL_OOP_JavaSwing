/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.myapp.ui;

import com.mycompany.myapp.dao.SinhVienDao;
import com.mycompany.myapp.model.SinhVien;
import java.awt.Color;
import javax.swing.JFileChooser;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

/**
 *
 * @author Nakaa2314
 */
public class OutExelFile extends javax.swing.JFrame {

    private JFileChooser chooser;
    private String choosePath = System.getProperty("user.home") + "\\Desktop";
    private List<SinhVien> listSV = null;

//  Check Coulumn Index
    private boolean sexCheck = false;
    private boolean dobCheck = false;
    private boolean phoneCheck = false;
    private boolean emailCheck = false;
    private boolean addressCheck = false;
    private boolean noteCheck = false;

    /**
     * Creates new form IOExelFile
     *
     */
    public OutExelFile() {
        super("Xuất File Exel");
        initComponents();
        statusSave.setText("");
        setLocationRelativeTo(null);
        setResizable(false);
        JlabelPath.setText("Nơi Lưu: " + choosePath);
        listSV = new SinhVienDao().findAll("", "", "", true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        gioiTinh = new javax.swing.JCheckBox();
        ngaySinh = new javax.swing.JCheckBox();
        soDienThoai = new javax.swing.JCheckBox();
        dirPath = new javax.swing.JButton();
        saveExel = new javax.swing.JButton();
        nameFile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailT = new javax.swing.JCheckBox();
        diaChi = new javax.swing.JCheckBox();
        ghiChu = new javax.swing.JCheckBox();
        JlabelPath = new javax.swing.JLabel();
        statusSave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Lựa chọn");

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Mã Sinh Viên");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox1.setEnabled(false);
        jCheckBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox1FocusGained(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Họ Và Tên");
        jCheckBox2.setEnabled(false);

        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Lớp");
        jCheckBox3.setEnabled(false);

        gioiTinh.setText("Giới Tính");
        gioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gioiTinhActionPerformed(evt);
            }
        });

        ngaySinh.setText("Ngày Sinh");
        ngaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngaySinhActionPerformed(evt);
            }
        });

        soDienThoai.setText("Số Điện Thoại");
        soDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soDienThoaiActionPerformed(evt);
            }
        });

        dirPath.setText("Đường Dẫn");
        dirPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirPathActionPerformed(evt);
            }
        });

        saveExel.setText("Save");
        saveExel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveExel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveExelActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên File:");

        emailT.setText("Email");
        emailT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTActionPerformed(evt);
            }
        });

        diaChi.setText("Địa Chỉ");
        diaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaChiActionPerformed(evt);
            }
        });

        ghiChu.setText("Ghi Chú");
        ghiChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ghiChuActionPerformed(evt);
            }
        });

        JlabelPath.setText("Nơi Lưu:");
        JlabelPath.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JlabelPathPropertyChange(evt);
            }
        });

        statusSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statusSave.setText("Trạng Thái: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(258, 258, 258))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addGap(80, 80, 80))
                                    .addComponent(gioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(soDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ghiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameFile, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(JlabelPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(156, 156, 156)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusSave, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(dirPath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveExel)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(gioiTinh)
                    .addComponent(emailT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(ngaySinh)
                    .addComponent(diaChi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(soDienThoai)
                    .addComponent(ghiChu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JlabelPath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveExel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dirPath, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1FocusGained

    private void JlabelPathPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JlabelPathPropertyChange

    }//GEN-LAST:event_JlabelPathPropertyChange

    private void dirPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirPathActionPerformed
        // Đường dẫn
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File(choosePath));
        chooser.setDialogTitle("Chọn đường dẫn");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            choosePath = (chooser.getSelectedFile()).toString();
        }
        JlabelPath.setText("Nơi Lưu: " + choosePath);
    }//GEN-LAST:event_dirPathActionPerformed

    private void saveExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveExelActionPerformed
        String fileName = nameFile.getText();
        if (!fileName.isEmpty()) {
            choosePath += "\\" + nameFile.getText() + ".xlsx";
            System.out.println(choosePath);

            // Create Workbook
            SXSSFWorkbook workbook = new SXSSFWorkbook();

            // Create sheet with sheet name
            SXSSFSheet sheet = workbook.createSheet("DanhSachSinhVien");

            // register the columns you wish to track and compute the column width
            sheet.trackAllColumnsForAutoSizing();

            int rowIndex = 0;

            // Write header
            writeHeader(sheet, rowIndex);

            //Write data
            rowIndex++;
            for (SinhVien sinhVien : listSV) {
                // Create row
                SXSSFRow row = sheet.createRow(rowIndex);
                // Write data on row
                writeBook(sinhVien, row, rowIndex);
                rowIndex++;
            }
            // Auto resize column witdth
            int numberOfColumn = 9; // sheet.getRow(0).getPhysicalNumberOfCells();
            autosizeColumn(sheet, numberOfColumn);

            try {
                // Create file excel
                createOutputFile(workbook, choosePath);
                statusSave.setText("Trạng Thái: Lưu File Thành Công");
                statusSave.setForeground(Color.black);
            } catch (IOException ex) {
                Logger.getLogger(OutExelFile.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            statusSave.setText("Trạng thái: Vui lòng đặt tên file");
            statusSave.setForeground(Color.red);
        }


    }//GEN-LAST:event_saveExelActionPerformed

    private void gioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gioiTinhActionPerformed
        if (gioiTinh.isSelected()) {
            sexCheck = true;
        } else {
            sexCheck = false;
        }
    }//GEN-LAST:event_gioiTinhActionPerformed

    private void ngaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngaySinhActionPerformed
        if (ngaySinh.isSelected()) {
            dobCheck = true;
        } else {
            dobCheck = false;
        }
    }//GEN-LAST:event_ngaySinhActionPerformed

    private void soDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soDienThoaiActionPerformed
        if (soDienThoai.isSelected()) {
            phoneCheck = true;
        } else {
            phoneCheck = false;
        }
    }//GEN-LAST:event_soDienThoaiActionPerformed

    private void emailTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTActionPerformed
        if (emailT.isSelected()) {
            emailCheck = true;
        } else {
            emailCheck = false;
        }
    }//GEN-LAST:event_emailTActionPerformed

    private void diaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaChiActionPerformed
        if (diaChi.isSelected()) {
            addressCheck = true;
        } else {
            addressCheck = false;
        }
    }//GEN-LAST:event_diaChiActionPerformed

    private void ghiChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ghiChuActionPerformed
        if (ghiChu.isSelected()) {
            noteCheck = true;
        } else {
            noteCheck = false;
        }
    }//GEN-LAST:event_ghiChuActionPerformed

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
            java.util.logging.Logger.getLogger(OutExelFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutExelFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutExelFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutExelFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OutExelFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelPath;
    private javax.swing.JCheckBox diaChi;
    private javax.swing.JButton dirPath;
    private javax.swing.JCheckBox emailT;
    private javax.swing.JCheckBox ghiChu;
    private javax.swing.JCheckBox gioiTinh;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameFile;
    private javax.swing.JCheckBox ngaySinh;
    private javax.swing.JButton saveExel;
    private javax.swing.JCheckBox soDienThoai;
    private javax.swing.JLabel statusSave;
    // End of variables declaration//GEN-END:variables

//    Xử Lý ExelFile
    private void writeHeader(SXSSFSheet sheet, int rowIndex) {
        // Create row
        SXSSFRow row = sheet.createRow(rowIndex);
        SXSSFCell cell;
        // Create cells
        int current_column = 0;

        cell = row.createCell(current_column++);
        cell.setCellValue("STT");
        cell = row.createCell(current_column++);
        cell.setCellValue("Mã Sinh Viên");
        cell = row.createCell(current_column++);
        cell.setCellValue("Họ Và Tên");
        cell = row.createCell(current_column++);
        cell.setCellValue("Lớp");

        if (sexCheck) {
            cell = row.createCell(current_column++);
            cell.setCellValue("Giới Tính");
        }
        if (dobCheck) {
            cell = row.createCell(current_column++);
            cell.setCellValue("Ngày Sinh");
        }
        if (phoneCheck) {
            cell = row.createCell(current_column++);
            cell.setCellValue("Số Điện Thoại");
        }
        if (emailCheck) {
            cell = row.createCell(current_column++);
            cell.setCellValue("Email");
        }
        if (addressCheck) {
            cell = row.createCell(current_column++);
            cell.setCellValue("Địa Chỉ");
        }
        if (noteCheck) {
            cell = row.createCell(current_column++);
            cell.setCellValue("Ghi Chú");
        }
    }

    // Write data
    private void writeBook(SinhVien sinhVien, SXSSFRow row, int index) {
        int current_column = 0;

        SXSSFCell cell;
        cell = row.createCell(current_column++);
        cell.setCellValue(index);

        cell = row.createCell(current_column++);
        cell.setCellValue(sinhVien.getMaSV());

        cell = row.createCell(current_column++);
        cell.setCellValue(sinhVien.getTenSV());

        cell = row.createCell(current_column++);
        cell.setCellValue(sinhVien.getLopSV());

        if (sexCheck) {
            cell = row.createCell(current_column++);
            cell.setCellValue(sinhVien.getGioiTinh());
        }
        if (dobCheck) {
            cell = row.createCell(current_column++);
            cell.setCellValue(sinhVien.getNgaySinh());
        }
        if (phoneCheck) {
            cell = row.createCell(current_column++);
            cell.setCellValue(sinhVien.getSoDienThoai());
        }
        if (emailCheck) {
            cell = row.createCell(current_column++);
            cell.setCellValue(sinhVien.getEmail());
        }
        if (addressCheck) {
            cell = row.createCell(current_column++);
            cell.setCellValue(sinhVien.getDiaChi());
        }
        if (noteCheck) {
            cell = row.createCell(current_column++);
            cell.setCellValue(sinhVien.getGhiChu());
        }
    }

    // Auto resize column width
    private static void autosizeColumn(SXSSFSheet sheet, int lastColumn) {
        for (int columnIndex = 0; columnIndex < lastColumn; columnIndex++) {
            sheet.autoSizeColumn(columnIndex);
        }
    }

    // Create output file
    private static void createOutputFile(SXSSFWorkbook workbook, String excelFilePath) throws IOException {
        try ( OutputStream os = new FileOutputStream(excelFilePath)) {
            workbook.write(os);
            os.close();
        }
    }
}
