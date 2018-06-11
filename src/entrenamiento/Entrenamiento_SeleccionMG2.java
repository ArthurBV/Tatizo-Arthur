/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrenamiento;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Arturo
 */
public class Entrenamiento_SeleccionMG2 extends javax.swing.JFrame {

    /**
     * Creates new form Entrenamiento_Login
     */
    
    
    int programS=0;
    int img=0;
    int casoS=0;
    final String html1 = "<html><body style='width: ";
    final String html2 = "px'>";
    
    public Entrenamiento_SeleccionMG2(int program, int imgProgram, int caso) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        programS=program;
        img=imgProgram;
        casoS=caso;
        
        
        //Escenario 1
    
        if(program==1 && casoS==1){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_NETRAC.PNG"));
       this.jLabel3.setIcon(icon);
    }
        if(program==2 && casoS==1){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_DOKUVIZ.PNG"));
       this.jLabel3.setIcon(icon);
    }
        if(program==3 && casoS==1){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_CIS.PNG"));
       this.jLabel3.setIcon(icon);
    }
        
        //diferentes CRT
        if(program==4 && imgProgram==1 && casoS==1){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_CRT_UM.PNG"));
       this.jLabel3.setIcon(icon);
       
    }
        if(program==4 && imgProgram==2 && casoS==1){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_CRT_ConfigInt.PNG"));
       this.jLabel3.setIcon(icon);
       
    }
        if(program==4 && imgProgram==3 && casoS==1){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_CRT_TraficoInt.PNG"));
       this.jLabel3.setIcon(icon);
       
    }
        if(program==4 && imgProgram==4 && casoS==1){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_CRT_IPAccounting.PNG"));
       this.jLabel3.setIcon(icon);
       
    }
        
        if(program==5 && casoS==1){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_CORREO.PNG"));
       this.jLabel3.setIcon(icon);
    }
        //no en este escenario
        if(program==6 && casoS==1){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_OpsConsole.PNG"));
       this.jLabel3.setIcon(icon);
    }
        if(program==7 && casoS==1){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_OpsConsole.PNG"));
       this.jLabel3.setIcon(icon);
    }
        if(program==8 && casoS==1){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_HAYSTAC.PNG"));
       this.jLabel3.setIcon(icon);
    }
        
    
    //Escenario 2
    
        if(program==1 && casoS==2){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S2_Netrac.png"));
       this.jLabel3.setIcon(icon);
    }
        if(program==2 && casoS==2){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S2_Dockuviz.PNG"));
       this.jLabel3.setIcon(icon);
    }
        if(program==3 && casoS==2){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_CIS.PNG"));
       this.jLabel3.setIcon(icon);
    }
        
        //diferentes CRT
        if(program==4 && imgProgram==1 && casoS==2){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S2_crt_log_router.PNG"));
       this.jLabel3.setIcon(icon);
       
    }
        if(program==4 && imgProgram==2 && casoS==2){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S2_crt_reinicio.PNG"));
       this.jLabel3.setIcon(icon);
       
    }
        if(program==4 && imgProgram==3 && casoS==2){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_CRT_TraficoInt.PNG"));
       this.jLabel3.setIcon(icon);
       
    }
        if(program==4 && imgProgram==4 && casoS==2){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_CRT_IPAccounting.PNG"));
       this.jLabel3.setIcon(icon);
       
    }
        
        if(program==5 && casoS==2){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_CORREO.PNG"));
       this.jLabel3.setIcon(icon);
    }
        //no en este escenario
        if(program==6 && casoS==2){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_OpsConsole.PNG"));
       this.jLabel3.setIcon(icon);
    }
        if(program==7 && casoS==2 && imgProgram==1){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S2_Opsconsole_casos.PNG"));
       this.jLabel3.setIcon(icon);
    }
        if(program==7 && casoS==2 && imgProgram==2){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S2_OPS_escalamiento.PNG"));
       this.jLabel3.setIcon(icon);
    }
        if(program==8 && casoS==2){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S1_HAYSTAC.PNG"));
       this.jLabel3.setIcon(icon);
    }
     
        
    //Escenario 3
    
        if(program==2 && casoS==3){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S3_Dokuviz.PNG"));
       this.jLabel3.setIcon(icon);
    }
        if(program==4 && casoS==3 && imgProgram==1){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S3_Revision_rutas_estaticas1.PNG"));
       this.jLabel3.setIcon(icon);
    }
        if(program==7 && casoS==3){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S3_Opsconsole.PNG"));
       this.jLabel3.setIcon(icon);
    }   
        if(program==4 && casoS==3 && imgProgram==2){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S3_Revision_rutas_estaticas2.PNG"));
       this.jLabel3.setIcon(icon);
    }
        if(program==4 && casoS==3 && imgProgram==3){
            ImageIcon icon = new ImageIcon(getClass().getResource("/entrenamiento/S3_Revision_rutas_estaticas3.PNG"));
       this.jLabel3.setIcon(icon);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

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

        jButton1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton1.setText("Listo!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Enviar a cesta de pruebas");

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recortar imagen", "Copiar texto" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("Dokuviz     ");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setText("Netrac");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setText("HayStac");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setText("Cis");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setText("CRT");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setText("Ops console");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel11.setText("Console");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("Tiempo: 00:00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(293, 293, 293))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        int op0 = 0;
        String op1 = "";
        String op2 = "";
        String op3 = "";
        
        
    
           //escenario 1 
        
       if(programS==1 && casoS==1){
       //NO EN ESTE CASO - NETRAC
           /*
       this.setVisible(false);
            op0 = 10;
            op1 = "Disculpe la molestia, no era mi intención incomodarlo";
            op2 = "Imagino lo que siente, veré que puedo hacer";
            op3 = "Entiendo. Estoy revisando su solicitud";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(op0, op1, op2, op3);
            seleccionM.setVisible(true);
            
        */
    }
       
        if(programS==2 && casoS==1){
        
            this.setVisible(false);
            op0 = 11;
            op1 = html1 +"300" + html2 +"Puedo ver que tiene instalado un canal de fibra optica de 4M";
            op2 = html1 +"300" + html2 +"Puedo ver que tiene instalado un canal satelital de 1M";
            op3 = html1 +"300" + html2 +"Puedo ver que tiene instalado un canal de fibra optica de 10M";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
        
        if(programS==3 && casoS==1){
        
            this.setVisible(false);
            op0 = 12;
            op1 = html1 +"300" + html2 +"Veo que el ancho de banda configurado en el Backbone es de 1M. ";
            op2 = html1 +"300" + html2 +"Veo que el ancho de banda configurado en el Backbone es de 14M. ";
            op3 = html1 +"300" + html2 +"Veo que el ancho de banda configurado en el Backbone es de 200M. ";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
        
        //diferentes CRT
        if(programS==4 && img==1 && casoS==1){
        
            this.setVisible(false);
            op0 = 13;
            op1 = html1 +"300" + html2 +"Realizando pruebas de rendimiento, puedo ver que el canal no responde, puede ser que en este momento el servicio esté caido.";
            op2 = html1 +"300" + html2 +"Realizando pruebas de rendimiento, puedo ver que el canal tiene pocas pérdidas lo cual no debe afectar el servicio";
            op3 = html1 +"300" + html2 +"Realizando pruebas de rendimiento del canal, puedo ver pérdida de paquetes a la ultima milla.";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
       
    }
        if(programS==4 && img==2 && casoS==1){
        
            this.setVisible(false);
            op0 = 14;
            op1 = html1 +"300" + html2 +"Puedo ver en la interface del enrutador, el ancho de banda configurado a 1M.";
            op2 = html1 +"300" + html2 +"Puedo ver en la interface del enrutador, el ancho de banda configurado a 124M.";
            op3 = html1 +"300" + html2 +"Puedo ver en la interface del enrutador, el ancho de banda configurado a 10,24M.";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
       
    }
        if(programS==4 && img==3 && casoS==1){
        
            this.setVisible(false);
            op0 = 15;
            op1 = html1 +"300" + html2 +"En el momento veo trafico de entrada de 280K y de salida de 9M aproximadamente.";
            op2 = html1 +"300" + html2 +"En el momento no hay trafico en el enrutador, debe estar caido el canal";
            op3 = html1 +"300" + html2 +"En el momento veo trafico de entrada de 28K y de salida de 960k aproximadamente.";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
       
    }
        if(programS==4 && img==4 && casoS==1){
        
            this.setVisible(false);
            op0 = 16;
            op1 = html1 +"300" + html2 +"Listo, quedó configurado su ipaccountig, ahora lo enviaré a su correo";
            op2 = html1 +"300" + html2 +"Lo siento, no fue posible configurar el ipaccounting ya que no tengo acceso al router";
            op3 = html1 +"300" + html2 +"Disculpe, no puede configurar el ipaccountig porque no tengo acceso al modo privilegiado del router";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
       
    }
        
        if(programS==5 && casoS==1){
        
            this.setVisible(false);
            op0 = 17;
            op1 = html1 +"300" + html2 +"Tabla con las ips que consumen mayor tráfico resaltadas";
            op2 = html1 +"300" + html2 +"Gráfica donde se muestra el tráfico del canal durante el dia del reporte";
            op3 = html1 +"300" + html2 +"Consumo del canal en la interface del router";
                        
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
        //no en este escenario
        if(programS==6 && casoS==1){
        /*
            this.setVisible(false);
            op0 = 18;
            op1 = "Veo que en el mes de enero se abrieron 3 casos para este servicio.";
            op2 = "Veo que en el mes de mayo se abrio 1 caso para este servicio";
            op3 = "Veo que no se han abierto casos en el mes de mayo para este servicio.";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(op0, op1, op2, op3);
            seleccionM.setVisible(true);
        */
    }
        if(programS==7 && casoS==1){
        
            this.setVisible(false);
            op0 = 19;
            op1 = html1 +"300" + html2 +"Veo que en el mes de enero se abrieron 3 casos para este servicio.";
            op2 = html1 +"300" + html2 +"Veo que en el mes de mayo se abrio 1 caso para este servicio";
            op3 = html1 +"300" + html2 +"Veo que no se han abierto casos en el mes de mayo para este servicio.";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
        if(programS==8 && casoS==1){
       
            this.setVisible(false);
            op0 = 20;
            op1 = html1 +"300" + html2 +"Veo en la gráfica del canal muy poco trafico de entrada, lo cual no debe ser la causa de la lentitud que se percibe.";
            op2 = html1 +"300" + html2 +"Veo en la gráfica del canal picos de saturación, lo que puede estar ocacionando la lentitud en el canal";
            op3 = html1 +"300" + html2 +"Veo que  el canal ha tenido tráfico de entrada de 1M constante durante todo el dia,  lo cual no debe ser la causa de la lentitud que se percibe en el canal";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }    
        
           //escenario 2 
        
       if(programS==1 && casoS==2){
       
      
       this.setVisible(false);
            op0 = 22;
            op1 = html1 +"300" + html2 +"Puedo ver que el canal ha tenido 4 intermitencias el dia 21/05 desde las 08:33am y las 19:39am";
            op2 = html1 +"300" + html2 +"Puedo ver que el canal ha tenido 8 intermitencias el dia 21/05 desde las 14:23am y las 18:39am";
            op3 = html1 +"300" + html2 +"Puedo ver que el canal ha tenido 12 intermitencias el dia 21/05 desde las 12:23am y las 9:39am";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
            
        
    }
       
        if(programS==2 && casoS==2){
        
            this.setVisible(false);
            op0 = 23;
            op1 = html1 +"300" + html2 +"Puedo ver que tiene instalado un canal de fibra óptica y router cisco con IpLoopback 172.23.9.149";
            op2 = html1 +"300" + html2 +"Puedo ver que tiene instalado un canal de fibra óptica y router cisco con IpLoopback 10.112.112.26";
            op3 = html1 +"300" + html2 +"Puedo ver que tiene instalado un canal de fibra óptica y router cisco con IpLoopback 10.144.5.145";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
        
        if(programS==3 && casoS==2){
        
            this.setVisible(false);
            op0 = 12;
            op1 = html1 +"300" + html2 +"Veo que el ancho de banda configurado en el Backbone es de 1M. ";
            op2 = html1 +"300" + html2 +"Veo que el ancho de banda configurado en el Backbone es de 14M. ";
            op3 = html1 +"300" + html2 +"Veo que el ancho de banda configurado en el Backbone es de 200M. ";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
        
        //diferentes CRT
        if(programS==4 && img==1 && casoS==2){
        
            this.setVisible(false);
            op0 = 24;
            op1 = html1 +"300" + html2 +"Puedo ver en el router que la interface fastEthernet3 tuvo 5 intermitencias el 21/05";
            op2 = html1 +"300" + html2 +"Puedo ver en el router que la interface WAN tuvo 5 intermitencias 21/05";
            op3 = html1 +"300" + html2 +"Puedo ver en el router que la interface LAN tuvo 20 intermitencias el 21/05";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
       
    }
        if(programS==4 && img==2 && casoS==2){
        
            this.setVisible(false);
            op0 = 25;
            op1 = html1 +"300" + html2 +"Veo que el último reinicio eléctrico en el router fue hace 1 dia, 4 horas, 15 minutos";
            op2 = html1 +"300" + html2 +"Veo que el último reinicio eléctrico en el router fue hace 1 semana, 4 horas, 15 minutos";
            op3 = html1 +"300" + html2 +"Veo que el último reinicio eléctrico en el router fue hace 1 mes, 4 horas, 15 minutos";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
       
    }
        if(programS==4 && img==3 && casoS==2){
        
            this.setVisible(false);
            op0 = 15;
            op1 = html1 +"300" + html2 +"En el momento veo trafico de entrada de 280K y de salida de 9M aproximadamente.";
            op2 = html1 +"300" + html2 +"En el momento no hay trafico en el enrutador, debe estar caido el canal";
            op3 = html1 +"300" + html2 +"En el momento veo trafico de entrada de 28K y de salida de 960k aproximadamente.";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
       
    }
        if(programS==4 && img==4 && casoS==2){
        
            this.setVisible(false);
            op0 = 16;
            op1 = html1 +"300" + html2 +"Listo, quedó configurado su ipaccountig, ahora lo enviaré a su correo";
            op2 = html1 +"300" + html2 +"Lo siento, no fue posible configurar el ipaccounting ya que no tengo acceso al router";
            op3 = html1 +"300" + html2 +"Disculpe, no puede configurar el ipaccountig porque no tengo acceso al modo privilegiado del router";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
       
    }
        
        if(programS==5 && casoS==2){
        
            this.setVisible(false);
            op0 = 17;
            op1 = html1 +"300" + html2 +"Tabla con las ips que consumen mayor tráfico resaltadas";
            op2 = html1 +"300" + html2 +"Gráfica donde se muestra el tráfico del canal durante el dia del reporte";
            op3 = html1 +"300" + html2 +"Consumo del canal en la interface del router";
                        
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
        //no en este escenario
        if(programS==6 && casoS==2){
        /*
            this.setVisible(false);
            op0 = 18;
            op1 = "Veo que en el mes de enero se abrieron 3 casos para este servicio.";
            op2 = "Veo que en el mes de mayo se abrio 1 caso para este servicio";
            op3 = "Veo que no se han abierto casos en el mes de mayo para este servicio.";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(op0, op1, op2, op3);
            seleccionM.setVisible(true);
        */
    }
        if(programS==7 && casoS==2 && img==1){
        
            this.setVisible(false);
            op0 = 26;
            op1 = html1 +"300" + html2 +"Veo que en la solapa de 'Related Cases' del OpsConsole se pueden identificar los ultimos casos creados para esta sede.";
            op2 = html1 +"300" + html2 +"Veo que en la solapa de 'Previous Cases' del OpsConsole se pueden identificar los ultimos casos creados para esta sede.";
            op3 = html1 +"300" + html2 +"Veo que en la solapa de 'Parent Circuits' del OpsConsole se pueden identificar los ultimos casos creados para esta sede.";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
        if(programS==7 && casoS==2 && img==2){
        
            this.setVisible(false);
            op0 = 27;
            op1 = html1 +"300" + html2 +"Confirmo caso escalado a la TSC Ecuador en estado Monitor";
            op2 = html1 +"300" + html2 +"Confirmo caso escalado a TSC Colombia en estado In Queue";
            op3 = html1 +"300" + html2 +"Confirmo que el caso no ha sido escalado";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
        if(programS==8 && casoS==2){
       
            this.setVisible(false);
            op0 = 20;
            op1 = html1 +"300" + html2 +"Veo en la gráfica del canal muy poco trafico de entrada, lo cual no debe ser la causa de la lentitud que se percibe.";
            op2 = html1 +"300" + html2 +"Veo en la gráfica del canal picos de saturación, lo que puede estar ocacionando la lentitud en el canal";
            op3 = html1 +"300" + html2 +"Veo que  el canal ha tenido tráfico de entrada de 1M constante durante todo el dia,  lo cual no debe ser la causa de la lentitud que se percibe en el canal";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
        
    //Escenario 3
    
        if(programS==2 && casoS==3){
        
            this.setVisible(false);
            op0 = 29;
            op1 = html1 +"300" + html2 +"Puedo ver que tiene instalado un enrutador con ip LAN 172.27.100.6/26 y WAN 10.230.0.22/30";
            op2 = html1 +"300" + html2 +"Puedo ver que tiene instalado un enrutador con ip LAN 172.27.100.6/24 y WAN 10.230.2.22/30";
            op3 = html1 +"300" + html2 +"Puedo ver que tiene instalado un enrutador con ip WAN 172.27.100.6/26 y LAN 10.230.0.22/30";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
        }
        if(programS==4 && casoS==3 && img==1){
        
            this.setVisible(false);
            op0 = 30;
            op1 = html1 +"300" + html2 +"Puedo ver en el enrutador que ya se tiene enrutada la ruta solicitada";
            op2 = html1 +"300" + html2 +"Puedo ver en el enrutador que no se tiene enrutada la ruta solicitada";
            op3 = html1 +"300" + html2 +"Puedo ver en el enrutador que no se tienen enrutamiento estático";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
            if(programS==7 && casoS==3){
        
            this.setVisible(false);
            op0 = 31;
            op1 = html1 +"300" + html2 +"Confirmo caso Customer Trouble escalado a Ingeniero de Operaciones";
            op2 = html1 +"300" + html2 +"Confirmo subcaso MACD escalado a Ingeniero de Operaciones";
            op3 = html1 +"300" + html2 +"Confirmo subcaso Customer Trouble escalado a Ingeniero de Operaciones";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
            
        if(programS==4 && casoS==3 && img==2){
        
            this.setVisible(false);
            op0 = 32;
            op1 = html1 +"300" + html2 +"Puedo ver en el enrutador que la ruta solicitada aun no ha sido configurada";
            op2 = html1 +"300" + html2 +"Lo siento, no fue posible configurar ruta estática ya que el enrutador solo tiene habilitado el enrutamiento dinámico";
            op3 = html1 +"300" + html2 +"Puedo ver que ya quedó configurada la ruta estatica solicitada en el enrutador";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
        if(programS==4 && casoS==3 && img==3){
        
            this.setVisible(false);
            op0 = 33;
            op1 = html1 +"300" + html2 +"Puedo ver que la ruta 172.18.1.0/24 esta enrutada de manera estatica y sale por el equipo con ip 172.27.100.17";
            op2 = html1 +"300" + html2 +"Puedo ver que la ruta 172.18.1.0 se conoce via BGP hacia la ip 172.27.100.17";
            op3 = html1 +"300" + html2 +"Puedo ver que la ruta 172.27.100.17/24 esta enrutada de manera estatica y sale por el equipo con ip 172.18.1.0";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(casoS, op0, op1, op2, op3);
            seleccionM.setVisible(true);
    }
    
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    // End of variables declaration//GEN-END:variables
}
