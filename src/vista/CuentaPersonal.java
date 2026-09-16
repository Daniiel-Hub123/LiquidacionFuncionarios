/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class CuentaPersonal extends javax.swing.JFrame {

    /**
     * Creates new form CuentaPersonal
     */
    public CuentaPersonal() {
        initComponents();
        
        btnactualizar.setBackground(new Color(248,217,217));
        this.getContentPane().setBackground(new Color(229,230,242));
        txtcargo.setLineWrap(true);
        txtcargo.setWrapStyleWord(true);
        
    }

    public JLabel getLogo() {
        return Logo;
    }

    public void setLogo(JLabel Logo) {
        this.Logo = Logo;
    }

    public JButton getBtnactualizar() {
        return btnactualizar;
    }

    public void setBtnactualizar(JButton btnactualizar) {
        this.btnactualizar = btnactualizar;
    }

    public JLabel getBtncuenta() {
        return btncuenta;
    }

    public void setBtncuenta(JLabel btncuenta) {
        this.btncuenta = btncuenta;
    }

    public JLabel getBtnregresar() {
        return btnregresar;
    }

    public void setBtnregresar(JLabel btnregresar) {
        this.btnregresar = btnregresar;
    }

    public JComboBox<String> getComboocupacion() {
        return comboocupacion;
    }

    public void setComboocupacion(JComboBox<String> comboocupacion) {
        this.comboocupacion = comboocupacion;
    }

    public JComboBox<String> getCombotipo() {
        return combotipo;
    }

    public void setCombotipo(JComboBox<String> combotipo) {
        this.combotipo = combotipo;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JLabel getTitleapellido() {
        return titleapellido;
    }

    public void setTitleapellido(JLabel titleapellido) {
        this.titleapellido = titleapellido;
    }

    public JLabel getTitlecargo() {
        return titlecargo;
    }

    public void setTitlecargo(JLabel titlecargo) {
        this.titlecargo = titlecargo;
    }

    public JLabel getTitlecedula() {
        return titlecedula;
    }

    public void setTitlecedula(JLabel titlecedula) {
        this.titlecedula = titlecedula;
    }

    public JLabel getTitlecorreo() {
        return titlecorreo;
    }

    public void setTitlecorreo(JLabel titlecorreo) {
        this.titlecorreo = titlecorreo;
    }

    public JLabel getTitlenombre() {
        return titlenombre;
    }

    public void setTitlenombre(JLabel titlenombre) {
        this.titlenombre = titlenombre;
    }

    public JLabel getTitleocupacion() {
        return titleocupacion;
    }

    public void setTitleocupacion(JLabel titleocupacion) {
        this.titleocupacion = titleocupacion;
    }

    public JLabel getTitleocupacion1() {
        return titleocupacion1;
    }

    public void setTitleocupacion1(JLabel titleocupacion1) {
        this.titleocupacion1 = titleocupacion1;
    }

    public JLabel getTitlepass() {
        return titlepass;
    }

    public void setTitlepass(JLabel titlepass) {
        this.titlepass = titlepass;
    }

    public JLabel getTitlepass1() {
        return titlepass1;
    }

    public void setTitlepass1(JLabel titlepass1) {
        this.titlepass1 = titlepass1;
    }

    public JLabel getTitleusername() {
        return titleusername;
    }

    public void setTitleusername(JLabel titleusername) {
        this.titleusername = titleusername;
    }

    public JTextField getTxtapellido() {
        return txtapellido;
    }

    public void setTxtapellido(JTextField txtapellido) {
        this.txtapellido = txtapellido;
    }

    public JTextArea getTxtcargo() {
        return txtcargo;
    }

    public void setTxtcargo(JTextArea txtcargo) {
        this.txtcargo = txtcargo;
    }

    public JTextField getTxtcedula() {
        return txtcedula;
    }

    public void setTxtcedula(JTextField txtcedula) {
        this.txtcedula = txtcedula;
    }

    public JTextField getTxtcorreo() {
        return txtcorreo;
    }

    public void setTxtcorreo(JTextField txtcorreo) {
        this.txtcorreo = txtcorreo;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JPasswordField getTxtpass() {
        return txtpass;
    }

    public void setTxtpass(JPasswordField txtpass) {
        this.txtpass = txtpass;
    }

    public JTextField getTxttlfn() {
        return txttlfn;
    }

    public void setTxttlfn(JTextField txttlfn) {
        this.txttlfn = txttlfn;
    }

    public JTextField getTxtusername() {
        return txtusername;
    }

    public void setTxtusername(JTextField txtusername) {
        this.txtusername = txtusername;
    }

    public JLabel getUsername() {
        return username;
    }

    public void setUsername(JLabel username) {
        this.username = username;
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        btncuenta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        titlecedula = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        titleapellido = new javax.swing.JLabel();
        titleusername = new javax.swing.JLabel();
        titlenombre = new javax.swing.JLabel();
        titlepass = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        titlecargo = new javax.swing.JLabel();
        comboocupacion = new javax.swing.JComboBox<>();
        titleocupacion = new javax.swing.JLabel();
        titlecorreo = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        titleocupacion1 = new javax.swing.JLabel();
        combotipo = new javax.swing.JComboBox<>();
        username = new javax.swing.JLabel();
        titlepass1 = new javax.swing.JLabel();
        txttlfn = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtcargo = new javax.swing.JTextArea();
        btnregresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/azuay_header9.png"))); // NOI18N

        btncuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cuenta (3).png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(252, 248, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 4, 4), new java.awt.Color(255, 4, 4), new java.awt.Color(255, 4, 4), new java.awt.Color(255, 4, 4)));

        titlecedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titlecedula.setText("Cédula");

        btnactualizar.setBackground(new java.awt.Color(248, 217, 217));
        btnactualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnactualizar.setText("Editar Información");

        titleapellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleapellido.setText("Apellido");

        titleusername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleusername.setText("Nombre de Usuario");

        titlenombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titlenombre.setText("Nombres");

        titlepass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titlepass.setText("Contraseña");

        txtpass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        titlecargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titlecargo.setText("Cargo");

        comboocupacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboocupacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal TTHH", "Funcionario" }));

        titleocupacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleocupacion.setText("Ocupación");

        titlecorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titlecorreo.setText("Correo");

        txtcedula.setEditable(false);
        txtcedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtusername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtapellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtcorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        titleocupacion1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleocupacion1.setText("Trabajador");

        combotipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código de Trabajo", "LOSEP" }));

        username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username.setText("CUENTA Y DATOS PERSONALES");

        titlepass1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titlepass1.setText("Telefono:");

        txttlfn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtcargo.setColumns(20);
        txtcargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcargo.setRows(5);
        jScrollPane3.setViewportView(txtcargo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(titleusername)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titlecedula, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titlepass)
                            .addComponent(titleocupacion)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titlepass1)
                                    .addComponent(titleocupacion1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttlfn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titlecorreo)
                        .addComponent(titlecargo))
                    .addComponent(titlenombre, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(txtcorreo)
                    .addComponent(txtapellido)
                    .addComponent(txtnombre))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(username)
                        .addGap(280, 280, 280))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(username)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titlecorreo)
                                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titlepass)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titleapellido)
                                    .addComponent(titleusername)
                                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titlenombre)
                                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titlecedula))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleocupacion)
                            .addComponent(titlecargo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titlepass1)
                            .addComponent(txttlfn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleocupacion1))
                .addGap(43, 43, 43)
                .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(Logo)
                        .addGap(473, 473, 473)
                        .addComponent(btncuenta))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnregresar)
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btncuenta)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnregresar)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JLabel btncuenta;
    private javax.swing.JLabel btnregresar;
    private javax.swing.JComboBox<String> comboocupacion;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel titleapellido;
    private javax.swing.JLabel titlecargo;
    private javax.swing.JLabel titlecedula;
    private javax.swing.JLabel titlecorreo;
    private javax.swing.JLabel titlenombre;
    private javax.swing.JLabel titleocupacion;
    private javax.swing.JLabel titleocupacion1;
    private javax.swing.JLabel titlepass;
    private javax.swing.JLabel titlepass1;
    private javax.swing.JLabel titleusername;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextArea txtcargo;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txttlfn;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
