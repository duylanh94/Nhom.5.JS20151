/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Khoa;

import Check.Check;
import javax.swing.JOptionPane;

/**
 *
 * @author Tran Xuan Hao
 */
public class JfrmKhoa extends javax.swing.JPanel {

    /**
     * Creates new form JfrmKhoa
     */
    public JfrmKhoa() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txMaKhoa2 = new javax.swing.JTextField();
        txTenKhoa2 = new javax.swing.JTextField();
        txSDT2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btUp = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongTinKhoa = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FACULTY INFORMATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Mã Khoa");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Tên Khoa");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Số Điện Thoại");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTenKhoa2)
                            .addComponent(txSDT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txMaKhoa2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txMaKhoa2, txSDT2, txTenKhoa2});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txMaKhoa2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txTenKhoa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txSDT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txMaKhoa2, txSDT2, txTenKhoa2});

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        btAdd.setBackground(new java.awt.Color(102, 255, 255));
        btAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAdd.setForeground(new java.awt.Color(255, 0, 0));
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/new.png"))); // NOI18N
        btAdd.setText("New");

        btUp.setBackground(new java.awt.Color(102, 255, 255));
        btUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btUp.setForeground(new java.awt.Color(255, 0, 0));
        btUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Update.png"))); // NOI18N
        btUp.setText("Update");

        btDel.setBackground(new java.awt.Color(102, 255, 255));
        btDel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btDel.setForeground(new java.awt.Color(255, 0, 0));
        btDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Remove.png"))); // NOI18N
        btDel.setText("Delete");

        btReset.setBackground(new java.awt.Color(102, 255, 255));
        btReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btReset.setForeground(new java.awt.Color(255, 0, 0));
        btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/reset.png"))); // NOI18N
        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReset, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btDel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAdd, btDel, btReset, btUp});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btUp)
                .addGap(18, 18, 18)
                .addComponent(btDel)
                .addGap(18, 18, 18)
                .addComponent(btReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAdd, btDel, btReset, btUp});

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        tbThongTinKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Khoa", "Tên Khoa", "Số Điện Thoại"
            }
        ));
        tbThongTinKhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThongTinKhoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbThongTinKhoa);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btResetActionPerformed

    private void tbThongTinKhoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThongTinKhoaMouseClicked
        // TODO add your handling code here:
        txMaKhoa.setText(tbThongTinKhoa.getValueAt(tbThongTinKhoa.getSelectedRow(), 0).toString());
        txTenKhoa.setText(tbThongTinKhoa.getValueAt(tbThongTinKhoa.getSelectedRow(), 1).toString());
        txSDT.setText(tbThongTinKhoa.getValueAt(tbThongTinKhoa.getSelectedRow(), 2).toString());

        btAdd.setEnabled(false);
        btUp.setEnabled(true);
        btDel.setEnabled(true);
        txMaKhoa.setEnabled(false);
    }//GEN-LAST:event_tbThongTinKhoaMouseClicked
    public void reset(){
        txMaKhoa.setText("");
        txTenKhoa.setText("");
        txSDT.setText("");
        txMaKhoa.requestFocus();
    }    private boolean checkInfomation(){
        Check c = new Check();
        if(!c.checkID(txMaKhoa.getText())){
            JOptionPane.showMessageDialog(null,"Error Information Faculty's ID","Error",JOptionPane.ERROR_MESSAGE);
            txMaKhoa.setText("");
            txMaKhoa.requestFocus();
            return false;
        }else if(!c.checkSpace(txTenKhoa.getText())||!c.checkSpace(txTenKhoa.getText())){
            JOptionPane.showMessageDialog(null,"Error Information Faculty's Name","Error",JOptionPane.ERROR_MESSAGE);
            txTenKhoa.setText("");
            txTenKhoa.requestFocus();
            return false;
        }else if(!c.checkSpace(txSDT.getText())||!c.checkSpace(txSDT.getText())){
            JOptionPane.showMessageDialog(null,"Erro Information Faculty' Phonenumber","Error", JOptionPane.ERROR_MESSAGE);
            txSDT.setText("");
            txSDT.requestFocus();
        }
        return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbThongTinKhoa;
    private javax.swing.JTextField txMaKhoa;
    private javax.swing.JTextField txMaKhoa1;
    private javax.swing.JTextField txMaKhoa2;
    private javax.swing.JTextField txSDT;
    private javax.swing.JTextField txSDT1;
    private javax.swing.JTextField txSDT2;
    private javax.swing.JTextField txTenKhoa;
    private javax.swing.JTextField txTenKhoa1;
    private javax.swing.JTextField txTenKhoa2;
    // End of variables declaration//GEN-END:variables
}
