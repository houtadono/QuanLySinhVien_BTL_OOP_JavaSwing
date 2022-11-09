/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.myapp.ui;

/**
 *
 * @author Houta
 */
public class TeacherInfor extends javax.swing.JPanel {

    /**
     * Creates new form PersonalInfor
     */
    public TeacherInfor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonXoa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        buttonReset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtTenSV = new javax.swing.JTextField();
        txtLopSV = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblAvatar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonDangAnh = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        buttonSua = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        buttonLuu = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Ngày Sinh");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("Số Điện Thoại:");

        buttonXoa.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        buttonXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/myapp/icons/remove_user_avatar_profile_person_icon_196568.png"))); // NOI18N
        buttonXoa.setText("Xóa");
        buttonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setText("Email:");

        buttonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/myapp/icons/reset_icon_217000.png"))); // NOI18N
        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setText("Địa Chỉ:");

        txtMaSV.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtMaSV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtTenSV.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTenSV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtLopSV.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtLopSV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtNgaySinh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtSoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtSoDienThoai.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtDiaChi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        radioMale.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioMale.setText("Nam");

        radioFemale.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        radioFemale.setText("Nữ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setText("Ghi chú:");

        txtGhiChu.setColumns(20);
        txtGhiChu.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtGhiChu.setRows(5);
        jScrollPane1.setViewportView(txtGhiChu);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Thông Tin Cá Nhân");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Mã Giảng Viên:");

        lblAvatar.setForeground(new java.awt.Color(102, 204, 255));
        lblAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Tên Giảng Viên:");

        buttonDangAnh.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        buttonDangAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/myapp/icons/open-file-icon-16.png"))); // NOI18N
        buttonDangAnh.setText("Chọn Ảnh");
        buttonDangAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDangAnhActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Lớp:");

        buttonSua.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        buttonSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/myapp/icons/edit_user_avatar_profile_person_icon_196565.png"))); // NOI18N
        buttonSua.setText("Sửa");
        buttonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSuaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("Giới Tính");

        buttonLuu.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        buttonLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/myapp/icons/save_icon_152767.png"))); // NOI18N
        buttonLuu.setText("Lưu");
        buttonLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(buttonReset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioFemale, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addComponent(txtSoDienThoai, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLopSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(txtTenSV, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMaSV, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(buttonDangAnh)
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(buttonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(buttonXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                            .addComponent(buttonLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLopSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(radioMale)
                            .addComponent(radioFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(40, 40, 40)
                                .addComponent(buttonReset))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDangAnh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonSua)
                            .addComponent(buttonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        // TODO add your handling code here:
        System.out.print(pos);
        if(pos==-1){
            txtMaSV.setText("");
            txtTenSV.setText("");
            txtLopSV.setText("");
            radioButtonGioiTinh.clearSelection();
            txtNgaySinh.setText("");
            txtSoDienThoai.setText("");
            txtEmail.setText("");
            txtDiaChi.setText("");
            txtGhiChu.setText("");
            lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/myapp/avatar/student_256px.png")));
        }else{
            SinhVien sv = listM.get(pos);
            txtMaSV.setText(sv.getMaSV());
            txtTenSV.setText(sv.getTenSV());
            txtLopSV.setText(sv.getLopSV());
            if(sv.getGioiTinh().equals("Nam")) radioMale.setSelected(true);
            else radioFemale.setSelected(true);
            txtNgaySinh.setText(sv.getNgaySinh());
            txtSoDienThoai.setText(sv.getSoDienThoai());
            txtEmail.setText(sv.getEmail());
            txtDiaChi.setText(sv.getDiaChi());
            txtGhiChu.setText(sv.getGhiChu());
            if(sv.getAvatar()!=null) lblAvatar.setIcon(new ImageIcon(ImageHelper.createImgFromByteArray(sv.getAvatar(), "jpg")));
            else lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/myapp/avatar/student_256px.png")));;
        }
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonDangAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDangAnhActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory( new File(System.getProperty("user.dir")+"\\src\\main\\resources\\com\\mycompany\\myapp\\avatar") );
        //        chooser.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "png"));
        // read only jpg
        // png error backgroumd,,,,,
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if(f.isDirectory()) return true;
                else return f.getName().toLowerCase().endsWith(".jpg");
            }

            @Override
            public String getDescription() {
                return "Image File(*.jpg)";
            }
        });

        if(chooser.showOpenDialog(this)==JFileChooser.CANCEL_OPTION){
            return;
        }
        File file = chooser.getSelectedFile();
        ImageIcon icon = new ImageIcon(file.getPath());
        Image img = ImageHelper.resize(icon.getImage(), 171, 202);
        lblAvatar.setIcon(new ImageIcon(img));
        //        if(file.getName().endsWith("jpg"))
        //            byteAvatar = ImageHelper.toByteArray(img, "jpg");
        byteAvatar = ImageHelper.toByteArray(img, file.getName().substring(file.getName().length()-3));
    }//GEN-LAST:event_buttonDangAnhActionPerformed

    private void buttonLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLuuActionPerformed
        // TODO add your handling code here:
        //check input
        StringBuilder notice = new StringBuilder();
        DataValidator.validateEmpty(txtMaSV, notice, "Mã Sinh Viên không được để trống.");
        DataValidator.validateEmpty(txtTenSV, notice, "Tên Sinh Viên không được để trống.");
        DataValidator.validateEmpty(txtLopSV, notice, "Lớp Sinh Viên không được để trống.");
        DataValidator.validateEmpty(txtNgaySinh, notice, "Ngày Sinh không được để trống.");
        DataValidator.validateErrorDate(txtNgaySinh, notice, "Ngày Sinh không đúng định dạng dd/mm/yyyy.");
        if(notice.length()>0){
            MessageDialogHelper.showErrorDialog(this, notice.toString(), "Lỗi!");
            return;
        }
        //confirm
        int confirm = MessageDialogHelper.showConfirmDialog(this, "Xác nhận thay đổi?", "Thông báo!");
        if(confirm != 1) return;
        try{
            SinhVien svUpdate = new SinhVien();
            svUpdate.setMaSV(txtMaSV.getText());
            svUpdate.setTenSV(txtTenSV.getText());
            svUpdate.setLopSV(txtLopSV.getText());
            svUpdate.setGioiTinh(radioMale.isSelected()?1:0);
            svUpdate.setNgaySinh(Date.valueOf(LocalDate.parse(txtNgaySinh.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
            svUpdate.setSoDienThoai(txtSoDienThoai.getText());
            svUpdate.setEmail(txtEmail.getText());
            svUpdate.setDiaChi(txtDiaChi.getText());
            svUpdate.setGhiChu(txtGhiChu.getText());
            svUpdate.setAvatar(byteAvatar);
            boolean k = new SinhVienDao().updateSinhVien(svUpdate, listM.get(pos).getMaSV());
            if(k){
                txtMaSV.setBackground(Color.white);
                MessageDialogHelper.showMessageDialog(this, "Sinh viên được sửa thành công", "Thông báo");
                listM.set(pos, svUpdate);
                tableModelM.removeRow(pos);
                tableModelM.insertRow(pos,new Object[]{svUpdate.getMaSV(),svUpdate.getTenSV(),svUpdate.getLopSV()
                    ,svUpdate.getGioiTinh(),svUpdate.getNgaySinh(),svUpdate.getSoDienThoai(),svUpdate.getEmail(),svUpdate.getDiaChi()});
            //reset data in this Frame
            txtMaSV.setEditable(false);
            txtTenSV.setEditable(false);
            txtLopSV.setEditable(false);
            if(svUpdate.getGioiTinh().equals("Nam")) radioFemale.setEnabled(false);
            else radioMale.setEnabled(false);
            txtNgaySinh.setEditable(false);
            txtSoDienThoai.setEditable(false);
            txtEmail.setEditable(false);
            txtDiaChi.setEditable(false);
            txtGhiChu.setEditable(false);
            buttonDangAnh.setEnabled(false);
            buttonLuu.setEnabled(false);
            buttonReset.setEnabled(false);
            buttonXoa.setEnabled(true);
            buttonSua.setEnabled(true);
        }else{
            txtMaSV.setBackground(Color.red);
            txtMaSV.requestFocus();
            MessageDialogHelper.showErrorDialog(this, "Mã Sinh Viên "+svUpdate.getMaSV()+" đã tồn tại!", "Lỗi!");
        }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(this, e.getMessage(), "Lỗi!");
        }
    }//GEN-LAST:event_buttonLuuActionPerformed

    private void buttonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaActionPerformed
        // TODO add your handling code here:
        txtMaSV.setEditable(true);
        txtTenSV.setEditable(true);
        txtLopSV.setEditable(true);
        if(radioMale.isSelected()) radioFemale.setEnabled(true);
        else radioMale.setEnabled(true);
        txtNgaySinh.setEditable(true);
        txtSoDienThoai.setEditable(true);
        txtEmail.setEditable(true);
        txtDiaChi.setEditable(true);
        txtGhiChu.setEditable(true);
        buttonDangAnh.setEnabled(true);
        buttonLuu.setEnabled(true);
        buttonReset.setEnabled(true);
        buttonXoa.setEnabled(false);
        buttonSua.setEnabled(false);
    }//GEN-LAST:event_buttonSuaActionPerformed

    private void buttonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaActionPerformed
        // TODO add your handling code here:
        int confirm = MessageDialogHelper.showConfirmDialog(this, "Xác nhận xóa sinh viên có mã "+listM.get(pos).getMaSV()+"?", "Thông báo!");
        if(confirm != 1) return;
        boolean k = new SinhVienDao().deleteSinhVien(listM.get(pos));
        if(k==false){
            MessageDialogHelper.showErrorDialog(this, "Xóa sinh viên không thành công!", "Có lỗi!");
            return;
        }
        MessageDialogHelper.showMessageDialog(this, "Xóa sinh viên thành công!", "Thông báo");
        listM.remove(pos);
        tableModelM.removeRow(pos);
        this.dispose();
    }//GEN-LAST:event_buttonXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDangAnh;
    private javax.swing.JButton buttonLuu;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSua;
    private javax.swing.JButton buttonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtLopSV;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenSV;
    // End of variables declaration//GEN-END:variables
}