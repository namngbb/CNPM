/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpm;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tiennguyen
 */
public class bangluongnv extends javax.swing.JFrame {

    /**
     * Creates new form bangluongnv
     */
    public bangluongnv() {
        initComponents();
        // loadTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        bangluong = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 27, 72));
        jLabel1.setText("BẢNG LƯƠNG CHI TIẾT");

        bangluong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
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
                "Giờ vào", "Giờ ra", "Ghi chú"
            }
        ));
        bangluong.setRowHeight(20);
        bangluong.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(bangluong);

        jLabel3.setText("Tên Nhân viên");

        btnthem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(id))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        int i;
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) bangluong.getModel();
        i = bangluong.getSelectedRow();
        //System.out.println(i+" ");

        if (i >= 0) {
            try {
                String dbURL = "jdbc:sqlserver://localhost;databaseName=QL_NHA_HANG;user=sa;password=sa";
                Connection conn = DriverManager.getConnection(dbURL);
                Statement statement = conn.createStatement();
                if (conn != null) {
                    System.out.println("Connected");
                    DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();

                    String tamm = (String) model.getValueAt(i, 0);
                    System.out.println(tamm);
                    System.out.println(jTextField1.getText());
                    String getid = "select * from NHANVIEN where tenNV= N'" + jTextField1.getText() + "'";
                    ResultSet getidnv = statement.executeQuery(getid);
                    int ID = -1;
                    while (getidnv.next()) {
                        ID = getidnv.getInt("idNV");
                    }
                    String datetime1 =(String) model.getValueAt(i, 0);
                    String datetime2 = "";
                    String[] output=datetime1.split(" ");
                    String[] outputt=output[1].split("-");
                    //datetime1 = output[1]+ " " + output[0];
                    //output=datetime2.split(" ");
                    datetime2=outputt[2]+"-"+outputt[1]+"-"+outputt[0];
                    datetime2=datetime2 + " "+output[0];
                    System.out.println(ID +" "+datetime2);
                    String sql1 = "delete from BANGLUONG where idNV = '" + ID + "' and timevao = '" + datetime2 + "'";

                    boolean rs;
                    rs = statement.execute(sql1);
                    if (rs == false) {
                        JOptionPane.showMessageDialog(this, "Xóa thành công ");
                    } else {
                        JOptionPane.showMessageDialog(this, "Xóa thất bại !!! ");
                    }
                }
                model.removeRow(i);
                conn.close();
            } catch (SQLException ex) {
                System.err.println("Cannot connect database, " + ex);
            } 
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ca xoá !!!");
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        Themcong z = new Themcong();
        z.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        z.setLocationRelativeTo(null);
        z.setVisible(true);
        z.setid(id.getText());
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        Themcong z = new Themcong();
        z.setid(jTextField1.getText());
        z.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        DefaultTableModel model = new DefaultTableModel();
        int i = -1;
        z.setid(id.getText());
        model = (DefaultTableModel) bangluong.getModel();
        i = bangluong.getSelectedRow();
        if (i >= 0) {
            z.setTextjarea((String) model.getValueAt(i, 2));
            z.setTextjtext1((String) model.getValueAt(i, 0));
            z.setTextjtext2((String) model.getValueAt(i, 1));
            z.setLocationRelativeTo(null);
            z.setTextjbutton1("Sửa");
            z.setTextjlabel3("Sửa ca");
            z.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ca cần sửa !!!");
        }
    }//GEN-LAST:event_btnsuaActionPerformed
    public void setidan(int str) {
        id.setText(String.valueOf(str));
        System.out.println(str);
        id.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(bangluongnv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bangluongnv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bangluongnv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bangluongnv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                bangluongnv z = new bangluongnv();
                z.setLocationRelativeTo(null);
                z.setVisible(true);
                z.loadTable(1);
            }
        });
    }

    public void hidebutton() {
        btnsua.setVisible(false);
        btnthem.setVisible(false);
        btnxoa.setVisible(false);
    }

    public static void loadTable(int i) {
        try {
            String dbURL = "jdbc:sqlserver://localhost;databaseName=QL_NHA_HANG;user=sa;password=sa";
            Connection conn = DriverManager.getConnection(dbURL);
            Statement statement = conn.createStatement();

            Object[] columm = {"Giờ vào", "Giờ ra", "Ghi chú"};
            DefaultTableModel model = new DefaultTableModel();

            //SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
                //String strDate = dateFormat.format(jTable1.getValueAt(i, 4));

            //model = (DefaultTableModel) bangdanhsachtk.getModel();
            model.setColumnIdentifiers(columm);
            bangluong.setModel(model);
            if (conn != null) {
                System.out.println("Connected");
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                String sql1 = "select * from BANGLUONG where idNV =" + i;

                ResultSet rs;
                rs = statement.executeQuery(sql1);
//                    rr =statement.executeQuery(sqlname);
//                    String strname="";
//                    while(rr.next())
//                    {
//                        strname=rr.getString("tenNV");
//                    }
//                    jTextField1.setText(strname);
//                    jTextField1.setEditable(false);
//                    jTextField1.setEnabled(false);
                String str1 = "", str2 = "", str = "";
                Object[] rows = new Object[10];

                while (rs.next()) {
                    //System.out.println(rows[0]);

                    str1 = dateFormat.format(rs.getTime("timevao"));
                    String[] output = str1.split(" ");
                    str1 = output[0];
                    str2 = dateFormat.format(rs.getDate("timevao"));
                    output = str2.split(" ");
                    str2 = output[1];
                    str = str1 + " " + str2;
                    rows[0] = str;
                    //System.out.println(rows[2]);

                    str1 = dateFormat.format(rs.getTime("timera"));
                    output = str1.split(" ");
                    str1 = output[0];
                    str2 = dateFormat.format(rs.getDate("timera"));
                    output = str2.split(" ");
                    str2 = output[1];
                    str = str1 + " " + str2;
                    rows[1] = str;
                    //System.out.println(rows[1]);
                    rows[2] = rs.getString("ghichu");
                    model.addRow(rows);
                }
            }
            ResultSet rr;
            String sqlname = "select tenNV from NHANVIEN where idNV =" + i;
            rr = statement.executeQuery(sqlname);
            String strname = "";
            while (rr.next()) {
                strname = rr.getString("tenNV");
            }
            jTextField1.setText(strname);
            jTextField1.setEditable(false);
            jTextField1.setEnabled(false);
            conn.close();
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable bangluong;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}