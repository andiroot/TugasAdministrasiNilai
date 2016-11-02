/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MataKuliahController;
import java.awt.event.KeyEvent;


/**
 *
 * @author usman
 */
public class FormMataKuliah extends javax.swing.JInternalFrame {
    private final MataKuliahController mataKuliahController = 
            new MataKuliahController();
    
    private String kodeMataKuliah;
    /**
     * Creates new form FormMataKuliah
     */
    public FormMataKuliah() {
        initComponents();
        setItemComboBox();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kdmatkul = new javax.swing.JTextField();
        nmamatkul = new javax.swing.JTextField();
        jumlahSksComboBox = new javax.swing.JComboBox<>();
        lihat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        tutup = new javax.swing.JButton();

        setTitle("Master Data Mata Kuliah");

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Mata Kuliah"));

        jLabel1.setText("Kode Mata Kuliah");

        jLabel2.setText("Nama Mata Kuliah");

        jLabel3.setText("Jumlah SKS");

        kdmatkul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kdmatkulKeyPressed(evt);
            }
        });

        jumlahSksComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lihat.setText("Lihat");
        lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jumlahSksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kdmatkul))
                        .addGap(18, 18, 18)
                        .addComponent(lihat))
                    .addComponent(nmamatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kdmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lihat))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nmamatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jumlahSksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        tutup.setText("Tutup");
        tutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(simpan)
                .addGap(53, 53, 53)
                .addComponent(hapus)
                .addGap(44, 44, 44)
                .addComponent(tutup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(hapus)
                    .addComponent(tutup))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setItemComboBox(){
        jumlahSksComboBox.removeAllItems();
        for (int i=1; i<=6; i++){
            if(i != 5){
                jumlahSksComboBox.addItem(Integer.toString(i));
            }
        }
    }
    
    public void setKodeMataKuliah(String kodeMataKuliah){
        kdmatkul.setText(kodeMataKuliah);
    }
    
    public String getKodeMataKuliah(){
        return kdmatkul.getText();
    }
    
    public void setNamaMataKuliah(String namaMataKuliah){
        nmamatkul.setText(namaMataKuliah);
    }
    
    public String getNamaMataKuliah(){
        return nmamatkul.getText();
    }
    
    public void setJumlahSks(int jumlahSks){
        jumlahSksComboBox.setSelectedItem(jumlahSks);
    }
    
    public int getJumlahSks(){
        return Integer.parseInt(jumlahSksComboBox.getSelectedItem().toString());
    }
    
    
    private void tutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutupActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tutupActionPerformed

    private void kdmatkulKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kdmatkulKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            mataKuliahController.cari(kdmatkul);
        }
    }//GEN-LAST:event_kdmatkulKeyPressed

    private void lihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatActionPerformed
        // TODO add your handling code here:
        mataKuliahController.tampilkanDaftar();
    }//GEN-LAST:event_lihatActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        mataKuliahController.simpan(kdmatkul, nmamatkul, jumlahSksComboBox);
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        mataKuliahController.hapus(kdmatkul);
    }//GEN-LAST:event_hapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jumlahSksComboBox;
    private javax.swing.JTextField kdmatkul;
    private javax.swing.JButton lihat;
    private javax.swing.JTextField nmamatkul;
    private javax.swing.JButton simpan;
    private javax.swing.JButton tutup;
    // End of variables declaration//GEN-END:variables
}