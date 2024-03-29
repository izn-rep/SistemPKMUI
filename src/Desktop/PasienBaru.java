/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PasienBaru.java
 *
 * Created on May 10, 2013, 8:08:10 PM
 */
package Desktop;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

/**
 *
 * @author Izani Note-PC1
 */
public class PasienBaru extends javax.swing.JFrame {

    /** Creates new form PasienBaru */
    public PasienBaru() {
        initComponents();
        setTitle("Formulir Pendaftaran PKM-UI");
        reset();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_kode = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_nim = new javax.swing.JTextField();
        txt_telepon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_alamat = new javax.swing.JTextArea();
        date_tanggal = new com.toedter.calendar.JDateChooser();
        combo_fakultas = new javax.swing.JComboBox();
        rb_laki = new javax.swing.JRadioButton();
        rb_perempuan = new javax.swing.JRadioButton();
        btn_daftar = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_kunjungan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buat Pendaftaran Pasien Baru"));

        jLabel1.setText("Kode Pasien");

        jLabel2.setText("Nama Pasien");

        jLabel3.setText("Identitas");

        jLabel4.setText("Fakultas");

        jLabel5.setText("Tanggal Lahir");

        jLabel7.setText("Jenis Kelamin");

        jLabel8.setText("No Telepon");

        jLabel6.setText("Alamat");

        txt_kode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_kodeKeyReleased(evt);
            }
        });

        txta_alamat.setColumns(20);
        txta_alamat.setRows(5);
        jScrollPane1.setViewportView(txta_alamat);

        date_tanggal.setDateFormatString("yyyy-MM-dd");

        combo_fakultas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-pilih fakultas-", "Kedokteran", "Kedokteran Gigi", "MIPA", "Teknik", "Hukum", "Ekonomi", "Sastra", "Psikologi", "ISIP", "Kesehatan Masyarakat", "Ilmu Komputer", "Ilmu Keperawatan", "Farmasi", "Pascasarjana", "Vokasi", "Umum" }));

        buttonGroup1.add(rb_laki);
        rb_laki.setText("Laki-Laki");

        buttonGroup1.add(rb_perempuan);
        rb_perempuan.setText("Perempuan");

        btn_daftar.setText("Daftar");
        btn_daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_daftarActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_kunjungan.setText("Form Kunjungan");
        btn_kunjungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kunjunganActionPerformed(evt);
            }
        });

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_daftar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_kunjungan)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_fakultas, 0, 172, Short.MAX_VALUE)
                            .addComponent(date_tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(txt_telepon, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(txt_nim, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_laki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_perempuan))
                            .addComponent(txt_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(txt_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(212, 212, 212))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rb_laki)
                            .addComponent(rb_perempuan))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(txt_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(date_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_fakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_reset)
                    .addComponent(btn_daftar)
                    .addComponent(btn_kunjungan))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
// TODO add your handling code here:
    reset();
}//GEN-LAST:event_btn_resetActionPerformed

private void btn_daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_daftarActionPerformed
// TODO add your handling code here:
        String kode, nama, nim, tanggal_lahir, fakultas, telepon, alamat;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        kode = txt_kode.getText();
        nama = txt_nama.getText();
        nim = txt_nim.getText();
        
        fakultas = (String) combo_fakultas.getSelectedItem();
        telepon = txt_telepon.getText();
        alamat = txta_alamat.getText();
        
   try {
        String query = "select * from pasien where kode = '" + txt_kode.getText() + "'";
        koneksi objkoneksi = new koneksi();
        Connection con = (Connection) koneksi.bukakoneksi();
        Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(query);
        if (rs.next()) {
            JOptionPane.showMessageDialog(this, "Data dengan kode " + txt_kode.getText() +" sudah ada!", "Message",
                    JOptionPane.INFORMATION_MESSAGE);
            txt_kode.requestFocus();
        } else if (kode.equals("") || kode.length() < 1) {
            JOptionPane.showMessageDialog(null, "Kode harus diisi!", "Warning",
                    JOptionPane.INFORMATION_MESSAGE);
            txt_kode.requestFocus();
        } else if (kode.length() > 5 || kode.length() < 5) {
            JOptionPane.showMessageDialog(null,"Kode harus terdiri dari 5 karakter!", "Message",
                    JOptionPane.INFORMATION_MESSAGE);
            txt_kode.requestFocus();
        } else if (nama.equals("") || nama.length() < 1) {
            JOptionPane.showMessageDialog(null, "Nama harus diisi!", "Warning",
                    JOptionPane.INFORMATION_MESSAGE);
            txt_nama.requestFocus();
        } else if (buttonGroup1.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Jenis Kelamin harus diisi!", "Warning",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (nim.equals("") || nim.length() < 1) {
            JOptionPane.showMessageDialog(this, "Identitas harus diisi!", "Warning",
                    JOptionPane.INFORMATION_MESSAGE);
            txt_nim.requestFocus();
        } else if (date_tanggal.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Tanggal Lahir harus diisi!", "Warning",
                    JOptionPane.INFORMATION_MESSAGE);
            date_tanggal.requestFocus();
        } else if (fakultas.equals("-pilih fakultas-")) {
            JOptionPane.showMessageDialog(null, "Fakultas belum dipilih!", "Warning",
                    JOptionPane.INFORMATION_MESSAGE);
            combo_fakultas.requestFocus();
        } else if (telepon.equals("") || telepon.length() < 1) {
            JOptionPane.showMessageDialog(this, "Nomor Telepon harus diisi!", "Warning",
                    JOptionPane.INFORMATION_MESSAGE);
            txt_telepon.requestFocus();
        } else if (alamat.equals("") || alamat.length() < 1) {
            JOptionPane.showMessageDialog(this, "Alamat harus diisi!", "Warning",
                    JOptionPane.INFORMATION_MESSAGE);
            txta_alamat.requestFocus();
        } else {
            daftar();
        }
    } catch (SQLException e) {
    }

}//GEN-LAST:event_btn_daftarActionPerformed

private void btn_kunjunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kunjunganActionPerformed
// TODO add your handling code here:
    new Kunjungan().show();
    this.dispose();
}//GEN-LAST:event_btn_kunjunganActionPerformed

private void txt_kodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kodeKeyReleased
// TODO add your handling code here:
    btn_daftar.setEnabled(true);
    btn_reset.setEnabled(true);
    btn_kunjungan.setEnabled(true);
}//GEN-LAST:event_txt_kodeKeyReleased

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    new TampilanUtama().show();
    this.dispose();
}//GEN-LAST:event_jButton1ActionPerformed

    public void reset() {
        txt_kode.setText("");
        txt_nama.setText("");
        buttonGroup1.clearSelection();
        txt_nim.setText("");
        date_tanggal.setDate(null);
        combo_fakultas.setSelectedItem("-pilih fakultas-");
        txt_telepon.setText("");
        txta_alamat.setText("");

        btn_reset.setEnabled(false);
        btn_daftar.setEnabled(false);
    }

    public void daftar() {
        try {
            koneksi objkoneksi = new koneksi();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Connection con = (Connection) koneksi.bukakoneksi();
            Statement stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String jenis_kelamin = "";
            if (rb_laki.isSelected()) {
                jenis_kelamin = rb_laki.getText();
            } else if (rb_perempuan.isSelected()) {
                jenis_kelamin = rb_perempuan.getText();
            }
            String query = "insert into pasien values"
                    + "('" + txt_kode.getText() + "','" + txt_nama.getText() + "','" + jenis_kelamin + "',"
                    + "'" + txt_nim.getText() + "','" + df.format(date_tanggal.getDate()) + "',"
                    + "'" + combo_fakultas.getSelectedItem().toString() + "','" + txt_telepon.getText() + "',"
                    + "'" + txta_alamat.getText() + "')";
            int rows = stmt.executeUpdate(query);
            reset();
            JOptionPane.showMessageDialog(this, "Data telah tersimpan", "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PasienBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasienBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasienBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasienBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PasienBaru().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_daftar;
    private javax.swing.JButton btn_kunjungan;
    private javax.swing.JButton btn_reset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox combo_fakultas;
    private com.toedter.calendar.JDateChooser date_tanggal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_laki;
    private javax.swing.JRadioButton rb_perempuan;
    private javax.swing.JTextField txt_kode;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nim;
    private javax.swing.JTextField txt_telepon;
    private javax.swing.JTextArea txta_alamat;
    // End of variables declaration//GEN-END:variables
}
