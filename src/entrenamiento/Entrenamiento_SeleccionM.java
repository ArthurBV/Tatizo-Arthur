/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrenamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Entrenamiento_SeleccionM extends javax.swing.JFrame {

    /**
     * Creates new form Entrenamiento_Login
     */
    
    int accionSeleccionada=1;
    final String html1 = "<html><body style='width: ";
    final String html2 = "px'>";
    
    public Entrenamiento_SeleccionM(int op0, String op1, String op2, String op3) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.jRadioButton4.setVisible(false);
        this.jLabel8.setVisible(false);
        
        
    if(op0==1){
        accion1(op1, op2, op3);
    }
    if(op0==2){
        accion2(op1, op2, op3);
    }
    if(op0==3){
        accion3(op1, op2, op3);
    }
    if(op0==4){
        accion4(op1, op2, op3);
    }
    if(op0==5){
        accion5(op1, op2, op3);
    }
    if(op0==6){
        accion6(op1, op2, op3);
    }
    if(op0==7){
        accion7(op1, op2, op3);
    }
    if(op0==8){
        accion8(op1, op2, op3);
    }
    
    //Acciones que involucran el menu con imagenes
    if(op0==10){
        accion10(op1, op2, op3);
    }
    if(op0==11){
        accion11(op1, op2, op3);
    }
    if(op0==12){
        accion12(op1, op2, op3);
    }
    if(op0==13){
        accion13(op1, op2, op3);
    }
    if(op0==14){
        accion14(op1, op2, op3);
    }
    if(op0==15){
        accion15(op1, op2, op3);
    }
    if(op0==16){
        accion16(op1, op2, op3);
    }
    if(op0==17){
        accion17(op1, op2, op3);
    }
    if(op0==18){
        accion18(op1, op2, op3);
    }
    if(op0==19){
        accion19(op1, op2, op3);
    }
    if(op0==20){
        accion20(op1, op2, op3);
    }
        
        
    }
    
    
    //Acciones
    private void accion1(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=1;
        
        
    }
    private void accion2(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=2;
    }
    private void accion3(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=3;
    }
    private void accion4(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=4;
    }
    private void accion5(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=5;
    }
    private void accion6(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=6;
    }
    private void accion7(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=7;
    }
    private void accion8(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=8;
    }
    private void accion10(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=10;
    }
    private void accion11(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=11;
    }
    private void accion12(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=12;
    }
    private void accion13(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=13;
    }
    private void accion14(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=14;
    }
    private void accion15(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=15;
    }
    private void accion16(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=16;
    }
    private void accion17(String op1, String op2, String op3){
        this.jRadioButton4.setVisible(true);
        this.jLabel8.setVisible(rootPaneCheckingEnabled);
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        this.jRadioButton4.setText(html1 +"300" + html2 +"Archivo en excel adjunto con el ip accounting completo e indentificando el tiempo en el que se corrió la prueba");
        accionSeleccionada=17;
        
    }
    private void accion18(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=18;
    }
    private void accion19(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=19;
    }
    private void accion20(String op1, String op2, String op3){
        this.jRadioButton1.setText(op1);
        this.jRadioButton2.setText(op2);
        this.jRadioButton3.setText(op3);
        accionSeleccionada=20;
    }

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel1.setText("TATIZO");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Beta");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entrenamiento/cliente.PNG"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" Esfuerzo: 40% ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entrenamiento/reloj.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tiempo de soporte: 15 min");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jRadioButton1.setText("jRadioButton1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jRadioButton2.setText("jRadioButton2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton1.setText("Listo!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entrenamiento/check.png"))); // NOI18N

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jRadioButton4.setText("jRadioButton4");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel8.setText("Qué información del tráfico del canal debe tener el correo que se le envía al cliente?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton4)
                            .addComponent(jLabel8))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)
                        .addComponent(jRadioButton1)
                        .addGap(40, 40, 40)
                        .addComponent(jRadioButton2)
                        .addGap(40, 40, 40)
                        .addComponent(jRadioButton3)
                        .addGap(40, 40, 40)
                        .addComponent(jRadioButton4)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(293, 293, 293))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(accionSeleccionada==1){
            
            if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Ok. Las palabras \"Entiendo\", \"Estoy revisando\", \"permitame reviso\", demuestran gestión e interes por ayudar al cliente.");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
            }else
                JOptionPane.showMessageDialog(null, "No. Las palabras \"disculpe\", \"lo siento\", \"imagino lo que siente\", son buenas pero no demuestra gestion.");
        }
        
        if(accionSeleccionada==2){
            
            if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Ok. Las palabras \"Entiendo\", \"Estoy revisando\", \"permitame reviso\", demuestran gestión e interes por ayudar al cliente.");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
            }else
                JOptionPane.showMessageDialog(null, "No. Las palabras \"disculpe\", \"lo siento\", \"imagino lo que siente\", son buenas pero no demuestra gestion.");
        }
        
        if(accionSeleccionada==3){

                JOptionPane.showMessageDialog(null, "Nuestros clientes y sus solicitudes son nuestra razon de ser. Siempre estaremos dispuestos para ellos!. Esta acción finaliza tu soporte.");
                Entrenamiento_Resumen resumen = new Entrenamiento_Resumen();
                resumen.setVisible(true);
                this.setVisible(false);
        }
        if(accionSeleccionada==4){

            if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Ok. Las palabras \"Entiendo\", \"Estoy revisando\", \"permitame reviso\", demuestran gestión e interes por ayudar al cliente.");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
            }else
                JOptionPane.showMessageDialog(null, "No. Las palabras \"disculpe\", \"lo siento\", \"imagino lo que siente\", son buenas pero no demuestra gestion.");
        }
        if(accionSeleccionada==5){

            if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Ok. Las palabras \"Entiendo\", \"Estoy revisando\", \"permitame reviso\", demuestran gestión e interes por ayudar al cliente.");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
            }else
                JOptionPane.showMessageDialog(null, "No. Las palabras \"disculpe\", \"lo siento\", \"imagino lo que siente\", son buenas pero no demuestra gestion.");
        }
        if(accionSeleccionada==6){

            if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Si! Espera que alguien conteste, explica la solicitud del cliente y ahi si pasa la llamada. Esto demuetra tu esfuerzo por ayudar.");
                Entrenamiento_Resumen resumen = new Entrenamiento_Resumen();
                resumen.setVisible(true);
                this.setVisible(false);
            }else if(this.jRadioButton1.isSelected()){
                JOptionPane.showMessageDialog(null, "Mejor no usarla!. Estas frases de cajon no demuestran esfuerzo y por el contrario demuestran poco interes hacia la solicitud del cliente.");
            }else if(this.jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(null, "No. Enviar la llamada del cliente a un grupo en general no garantiza que le contesten. Espera que alguien conteste, explica la solicitud del cliente y ahi si pasa la llamada. Esto demuetra tu esfuerzo por ayudar.");
            }
        }
        if(accionSeleccionada==7){

            if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Si! Espera que alguien conteste, explica la solicitud del cliente y ahi si pasa la llamada. Esto demuetra tu esfuerzo por ayudar.");
                Entrenamiento_Resumen resumen = new Entrenamiento_Resumen();
                resumen.setVisible(true);
                this.setVisible(false);
            }else if(this.jRadioButton1.isSelected()){
                JOptionPane.showMessageDialog(null, "Mejor no usarla!. Estas frases de cajon no demuestran esfuerzo y por el contrario demuestran poco interes hacia la solicitud del cliente.");
            }else if(this.jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(null, "No. Enviar la llamada del cliente a un grupo en general no garantiza que le contesten. Espera que alguien conteste, explica la solicitud del cliente y ahi si pasa la llamada. Esto demuetra tu esfuerzo por ayudar.");
            }
        }
        if(accionSeleccionada==8){

            if(this.jRadioButton1.isSelected()){
                JOptionPane.showMessageDialog(null, "Perfecto! El ip accounting se configura en la interface del equipo, ya sea en la wan o en la lan, para identificar cuales son las ip que consumen mayor trafico en el canal. Esta información le ayuda al cliente a identificar las maquinas en su red y realizar acciones sobres estas para evitar saturación en el canal.");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
            }else if(this.jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(null, "No! intentalo de nuevo. Las políticas de calidad QoS, se configuran en el enrutador para reservar un porcentaje del ancho de banda del canal a servicios especificos como por ejemplo Voz y Video. El cliente decide los servicios y el porcentaje del ancho de banda designado a cada política.");
            }else if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "No! intentalo de nuevo. Cuando un cliente nota que su canal se satura constantemente y requiere mayor capacidad, puede optar por la posibilidad de ampliar el canal. Esta solicitud la realiza el cliente al Service Manager por medio de correo electronico e implica costos adicionales para el cliente.");
            }
        }
        
        //acciones de Entrenamiento_SeleccionMG2
        
        if(accionSeleccionada==10){

            //No en este escenario
            
        }
        if(accionSeleccionada==11){

            if(this.jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(null, "Correcto");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
            }else if(this.jRadioButton1.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }else if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }
        }
        if(accionSeleccionada==12){

            if(this.jRadioButton1.isSelected()){
                JOptionPane.showMessageDialog(null, "Correcto");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
            }else if(this.jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }else if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }
        }
        if(accionSeleccionada==13){

            if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Correcto");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
            }else if(this.jRadioButton1.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }else if(this.jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }
        }
        if(accionSeleccionada==14){

            if(this.jRadioButton1.isSelected()){
                JOptionPane.showMessageDialog(null, "Correcto");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
            }else if(this.jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }else if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }
        }
        if(accionSeleccionada==15){

            if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Correcto");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
            }else if(this.jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }else if(this.jRadioButton1.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }
        }
        if(accionSeleccionada==16){

            if(this.jRadioButton1.isSelected()){
                JOptionPane.showMessageDialog(null, "Correcto. Enviar la información del ip accountig al correo del cliente demuestra tu esfuerzo para ayudar al cliente. Buena decision!.");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
            }else if(this.jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }else if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }
        }
        if(accionSeleccionada==17){

            if(this.jRadioButton1.isSelected() ||this.jRadioButton2.isSelected() || this.jRadioButton3.isSelected() || this.jRadioButton4.isSelected()){
                JOptionPane.showMessageDialog(null, "Correcto");
                this.jRadioButton1.setText(html1 +"300" + html2 +"He enviado un mensaje con la información solicitada al correo manuel.perez@dulcesdecolombia.com");
                this.jRadioButton2.setText(html1 +"300" + html2 +"He enviado un mensaje con la información solicitada al correo manuel.vargas@dulcescolombianos.com");
                this.jRadioButton3.setText(html1 +"300" + html2 +"He enviado un mensaje con la información solicitada al correo jorge.diaz@dulcescolombianos.com");
                //envia al otro submenu
                accionSeleccionada=21;
                this.jRadioButton4.setVisible(false);
                this.jLabel8.setVisible(false);
            }else{} 
            
        }
        if(accionSeleccionada==18){

            //no en este escenario
        }
        if(accionSeleccionada==19){

            if(this.jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(null, "Correcto");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
                }else if(this.jRadioButton1.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
                }else if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }
        }
        if(accionSeleccionada==20){

            if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Correcto");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
                }else if(this.jRadioButton1.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
                }else if(this.jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }
        }
        //submenu del envio de correo
        if(accionSeleccionada==21){
                if(this.jRadioButton1.isSelected()){
                JOptionPane.showMessageDialog(null, "Correcto");
                Entrenamiento_Acciones acciones = new Entrenamiento_Acciones();
                acciones.setVisible(true);
                this.setVisible(false);
                }else if(this.jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
                }else if(this.jRadioButton3.isSelected()){
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
