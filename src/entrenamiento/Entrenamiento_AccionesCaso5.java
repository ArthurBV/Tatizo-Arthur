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
public class Entrenamiento_AccionesCaso5 extends javax.swing.JFrame {

    
    int row=0;
    final String html1 = "<html><body style='width: ";
    final String html2 = "px'>";
    
    /**
     * Creates new form Entrenamiento_Login
     */
    public Entrenamiento_AccionesCaso5() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    
        private void selectScene(){
            
            int caso=5;
            int program = 0;
            int stage = 0;
            int op0 = 0;
            String op1 = "";
            String op2 = "";
            String op3 = "";
            
            
            //Podría por favor repetir su solicitud? 

        if(row==1){
            
            this.setVisible(false);
            op0 = 1;
            op1 = html1 +"300" + html2 +"Disculpe la molestia, no era mi intención incomodarlo";
            op2 = html1 +"300" + html2 +"Imagino lo que siente, veré que puedo hacer";
            op3 = html1 +"300" + html2 +"Entiendo. Estoy revisando su solicitud";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(caso,op0, op1, op2, op3);
            seleccionM.setVisible(true);
            this.setVisible(false);
            
        }
        
            //Podría por favor indicarme la ip Lan o Wan del servicio?
            
        if(row==2){
            
            op0 = 2;
            op1 = html1 +"300" + html2 +"Disculpe la molestia, no era mi intención incomodarlo";
            op2 = html1 +"300" + html2 +"Imagino lo que siente, veré que puedo hacer";
            op3 = html1 +"300" + html2 +"Entiendo. Estoy revisando su solicitud";
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(caso,op0, op1, op2, op3);
            seleccionM.setVisible(true);
            this.setVisible(false);
        }
        
            //Para responder a su solicitud debe comunicarse mas tarde
	
        if(row==3){
            
            op0 = 3;
            op1 = html1 +"300" + html2 +"Tenga buen dia";
            op2 = html1 +"300" + html2 +"Gracias por comunicarse con nosotros";
            op3 = html1 +"300" + html2 +"Estaremos conmunicandonos con usted en cuanto tengamos tiempo";
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(caso,op0, op1, op2, op3);
            seleccionM.setVisible(true);
            this.setVisible(false);
        }
        
            //Podría indicarme de cuanto ancho de banda es su canal?
            
        if(row==4){
            
            op0 = 4;
            op1 = html1 +"300" + html2 +"Disculpe la molestia, no era mi intención incomodarlo";
            op2 = html1 +"300" + html2 +"Imagino lo que siente, veré que puedo hacer";
            op3 = html1 +"300" + html2 +"Entiendo. Estoy revisando su solicitud";
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(caso,op0, op1, op2, op3);
            seleccionM.setVisible(true);
            this.setVisible(false);
        }
        
            //Recuerda cúal fue la última caida de su servicio?
        
        if(row==5){
            
            op0 = 5;
            op1 = html1 +"300" + html2 +"Disculpe la molestia, no era mi intención incomodarlo";
            op2 = html1 +"300" + html2 +"Imagino lo que siente, veré que puedo hacer";
            op3 = html1 +"300" + html2 +"Entiendo. Estoy revisando su solicitud";
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(caso,op0, op1, op2, op3);
            seleccionM.setVisible(true);
            this.setVisible(false);
        }
        
            //Permitame lo comunico con el área encargada

        if(row==6){
            
            
            op0 = 6;
            op1 = html1 +"300" + html2 +"Su llamada es muy importante para nosotros, espere en linea";
            op2 = html1 +"300" + html2 +"Lo dejo en linea con el area encargada, alguna personal del grupo le contestará";
            op3 = html1 +"300" + html2 +"Lo dejo comunicado con mi compaño Juan Diaz quien le ayudará con su solicitud";
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(caso,op0, op1, op2, op3);
            seleccionM.setVisible(true);
            this.setVisible(false);
        }
        
            //Permítame lo comunico con el ingeniero que tiene el caso
        
        if(row==7){
            
            op0 = 7;
            op1 = html1 +"300" + html2 +"Su llamada es muy importante para nosotros, espere en linea";
            op2 = html1 +"300" + html2 +"Lo dejo en linea con el area encargada, alguna personal del grupo le contestará";
            op3 = html1 +"300" + html2 +"Lo dejo comunicado con mi compaño Juan Diaz quien le ayudará con su solicitud";
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(caso,op0, op1, op2, op3);
            seleccionM.setVisible(true);
            this.setVisible(false);
        }
        
            //Estoy revisando la infraestructura tecnológica instalada - Dokuviz - 2

        if(row==8){
            
            program = 2;
            String question = html1 +"300" + html2 +"¿Qué aplicación debo usar para verificar la infraestructura instalada?";
            Entrenamiento_SeleccionMG1 seleccionMG = new Entrenamiento_SeleccionMG1(question, program, 0, caso);
            seleccionMG.setVisible(true);
            this.setVisible(false);
          
        }
        
            //Estoy revisando en nuestro sistema de monitoreo las ultimas caidas que ha tenido el canal - Netrac - 1

        if(row==9){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
            
        }
        
            //Estoy revisando la gráfica de trafico del canal - Haystac - 8
        
        if(row==10){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
        }
        
            //Estoy haciendo pruebas de rendimiento del canal - CRT - 4 ---- TIENEN PORCENTAJES DISTINTOS - 80/10

        if(row==11){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
        }
        
            //Estoy revisando el ancho de banda configurado en la interface del enrutador - CRT - 4 ---- TIENEN PORCENTAJES DISTINTOS - 70/10
        
        if(row==12){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
        }
        
            //Estoy verificando la configuración del ancho de banda en los equipos del backbone - CIS - 3
        
        if(row==13){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
        }
        
            //Estoy revisando si existen errores en la interface del enrutador
        
        if(row==14){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
            
        }
        
            //Estoy revisando la configuración de la negociación en la interface del enrutador
        
        if(row==15){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
            
        }
        
            //Estoy verificando el trafico actual en la interface del enrutador - CRT - 4 - 80/10

        if(row==16){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
        }
        
            //Estoy revisando los últimos casos abiertos para esta sede - 7

        if(row==17){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
        }
        
            //Estoy verificando la configuración de enrutamiento estático en el enrutador

        if(row==18){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
          
        }
        
            //Estoy revisando las últimas caidas que ha tenido el canal en el enrutador

        if(row==19){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
        }
        
            //Estoy verificando el último reinicio eléctrico en el router

        if(row==20){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
        }
              
            //Estoy revisando el protocolo de entrega de ips configurado en el enrutador
        
        if(row==21){
            
           JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
        }
        
            //De acuerdo con las pruebas realizadas, se observa saturación en el canal. Voy a proceder con la apertura del caso, de acuerdo?
            
        if(row==22){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
        }
        
            //Confirmo su solicitud de configuración de ruta estatica en el enrutador. Voy a proceder con la apertura del caso, de acuerdo?

        if(row==23){
            
          JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en acordar con el cliente el reporte preciso y presta mucha atención a lo que dice.");
        
        }
        
            //De acuerdo con las pruebas realizadas, se observa intermitencias en el canal, posiblemente por inconvenientes en la Ultima milla. Voy a proceder con la apertura del caso, de acuerdo?

        if(row==24){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en la solicitud del cliente y presta mucha atención a lo que dice.");
        
            
        }
        
            //De acuerdo con las pruebas realizadas, se observa bloqueo de ips. Voy a proceder con la apertura del caso, de acuerdo?

        if(row==25){
            
          stage=5;
          Entrenamiento_Caso seleccionCaso = new Entrenamiento_Caso(stage);
          seleccionCaso.setVisible(true);
          this.setVisible(false);
            
         
        }
            //De acuerdo con las pruebas realizadas, se observan errores en la interface Lan. Voy a proceder con la apertura del caso, de acuerdo?

        if(row==26){
            
          JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en acordar con el cliente el reporte preciso y presta mucha atención a lo que dice.");
          
         
        }
            //Puedo ofrecerle las siguientes alternativas:

        if(row==27){
            
            this.setVisible(false);
            op0 = 51;
            op1 = html1 +"300" + html2 +"Reiniciar equipo para restablecer la asignacion de ips";
            op2 = html1 +"300" + html2 +"Reiniciar el protocolo DHCP";
            op3 = html1 +"300" + html2 +"Configurar direccionamiento ip de manera manual";
            
            Entrenamiento_SeleccionM seleccionM = new Entrenamiento_SeleccionM(caso,op0, op1, op2, op3);
            seleccionM.setVisible(true);
            this.setVisible(false);
        }
        
            //Estoy configurando el ip_accounting solicitado - CRT - 4 -  80/10

        if(row==28){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en acordar con el cliente el reporte preciso y presta mucha atención a lo que dice.");
          
        }
            //Le estoy enviando correo con la información del tráfico para su revisión

        if(row==29){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en acordar con el cliente el reporte preciso y presta mucha atención a lo que dice.");
          
        }
        
            //Estoy comunicandole al Service Manager su solicitud
        
        if(row==30){
            
            JOptionPane.showMessageDialog(null, "No. Esta acción no ayuda al entendimiento del problema. Concentrate en actuar segun la solicitud del cliente y no hagas que el cliente tenga un esfuerzo innecesario y pierda su tiempo.");
         
        }
            //Estoy escalando caso para Ingeniero de Operaciones para el cambio solicitado

        if(row==31){
            
            JOptionPane.showMessageDialog(null, "No, Este no es el requerimiento del cliente, concentrate en acordar con el cliente el reporte preciso y presta mucha atención a lo que dice.");
          
            
        }
            //Estoy reiniciando el DHCP en el enrutador

        if(row==32){
            
            program = 4;
            String question = html1 +"300" + html2 +"¿Qué aplicación debo usar para reinicar el protocolo DHCP?";
            Entrenamiento_SeleccionMG1 seleccionMG = new Entrenamiento_SeleccionMG1(question, program, 0, caso);
            seleccionMG.setVisible(true);
            this.setVisible(false);
            
          
        }
        
        //Estoy cambiando la negociación en el enrutador

        if(row==33){
            
            JOptionPane.showMessageDialog(null, "No. Este no es el requerimiento del cliente, concentrate en entender su solicitud y presta mucha atención a lo que dice.");
         
            
        }
        
        //Estoy escalando el caso a segundo nivel para revisión con el proveedor

        if(row==34){
          
            JOptionPane.showMessageDialog(null, "No. Esta acción no ayuda al entendimiento del problema. Concentrate en actuar segun la solicitud del cliente y no hagas que el cliente tenga un esfuerzo innecesario y pierda su tiempo.");
         
        }
        
        //Usted puede crear un caso con su solicitud, estaremos informando avances

        if(row==35){
        
            JOptionPane.showMessageDialog(null, "No. Esta acción no ayuda al entendimiento del problema. Concentrate en actuar segun la solicitud del cliente y no hagas que el cliente tenga un esfuerzo innecesario y pierda su tiempo.");
         
        }
        
        //Usted puede enviarnos un correo electronico y nos comunicaremos con usted cuando este resuelta su solcitud

        if(row==36){
            
          JOptionPane.showMessageDialog(null, "No. Esta acción no ayuda al entendimiento del problema. Concentrate en actuar segun la solicitud del cliente y no hagas que el cliente tenga un esfuerzo innecesario y pierda su tiempo.");
                   
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel1.setText("TATIZO");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Beta");

        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setText("Escenario");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton2.setText("Contacto");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton3.setText("Cliente");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton4.setText("Acción");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N

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
        jLabel6.setText(" Tiempo de soporte: 15 min ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {html1 +"200" + html2 +"Podría por favor repetir su solicitud?  ", "3", "Actuar"},
                {html1 +"200" + html2 +"Podría por favor indicarme la ip Lan o Wan del servicio  ", "3", "Actuar"},
                {html1 +"200" + html2 +"Para responder a su solicitud debe comunicarse mas tarde ", "0", "Actuar"},
                {html1 +"200" + html2 +"Podría confirmarme cual es el ancho de banda de su canal ", "3", "Actuar"},
                {html1 +"200" + html2 +"Recuerda cuando fue la ultima caida de su servicio? ", "3", "Actuar"},
                {html1 +"200" + html2 +"Permitame lo comunico con el área encargada ", "0", "Actuar"},
                {html1 +"200" + html2 +"Permítame lo comunico con el ingeniero que tiene el caso ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy revisando la infraestructura tecnológica instalada ", "2", "Actuar"},
                {html1 +"200" + html2 +"Estoy revisando en nuestro sistema de monitoreo las ultimas caidas que ha tenido el canal ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy revisando la gráfica de trafico del canal ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy haciendo pruebas de rendimiento del canal  ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy revisando el ancho de banda configurado en la interface del enrutador ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy verificando la configuración del ancho de banda en los equipos del backbone ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy revisando si existen errores en la interface del enrutador ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy revisando la configuración de la negociación en la interface del enrutador ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy verificando el trafico actual en la interface del enrutador ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy revisando los últimos casos abiertos para esta sede ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy verificando la configuración de enrutamiento estático en el enrutador ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy revisando las últimas caidas que ha tenido el canal en el enrutador ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy verificando el último reinicio eléctrico en el router ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy revisando el protocolo de entrega de ips configurado en DHCP ", "2", "Actuar"},
                {html1 +"200" + html2 +"De acuerdo con las pruebas realizadas, se observa saturación en el canal. Voy a proceder con la apertura del caso, de acuerdo? ", "0", "Actuar"},
                {html1 +"200" + html2 +"Confirmo que solicita la configuración de ruta estatica en el enrutador. Voy a proceder con la apertura del caso, de acuerdo? ", "0", "Actuar"},
                {html1 +"200" + html2 +"De acuerdo con las pruebas realizadas, se observa intermitencias en el canal, posiblemente por inconvenientes en la Ultima milla. Voy a proceder con la apertura del caso, de acuerdo? ", "0", "Actuar"},
                {html1 +"200" + html2 +"De acuerdo con las pruebas realizadas, se observa bloqueo de ips. Voy a proceder con la apertura del caso, de acuerdo? ", "1", "Actuar"},
                {html1 +"200" + html2 +"De acuerdo con las pruebas realizadas, se observa perdida de paquetes en la interface por errores en la interface Lan. Voy a proceder con la apertura del caso, de acuerdo? ", "0", "Actuar"},
                {html1 +"200" + html2 +"Puedo ofrecerle las siguientes alternativas: ", "2", "Actuar"},
                {html1 +"200" + html2 +"Estoy configurando el ip_accounting solicitado ", "0", "Actuar"},
                {html1 +"200" + html2 +"Le estoy enviando correo con la información del tráfico para su revisión ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy comunicandole al Service Manager su solicitud ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy escalando caso para Ingeniero de Operaciones para el cambio solicitado ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy reiniciando el DHCP en el enrutador ", "3", "Actuar"},
                {html1 +"200" + html2 +"Estoy cambiando la negociación en el enrutador ", "0", "Actuar"},
                {html1 +"200" + html2 +"Estoy escalando el caso a segundo nivel para revisión con el proveedor de Ultima milla ", "0", "Actuar"},
                {html1 +"200" + html2 +"Usted puede crear un caso con su solicitud, estaremos informando avances ", "3", "Actuar"},
                {html1 +"200" + html2 +"Usted puede enviarnos un correo electronico y nos comunicaremos con usted cuando este resuelta su solcitud ", "3", "Actuar"}
            },
            new String [] {
                "Acción", "Tiempo (min)", "Actuar"
            }
        ));
        jTable1.setRowHeight(80);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(320);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entrenamiento/arrow.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setText("Tiempo: 00:00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(293, 293, 293))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Entrenamiento_LlamadaCaso5 llamada = new Entrenamiento_LlamadaCaso5();
        llamada.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Entrenamiento_ClienteCaso5 cliente = new Entrenamiento_ClienteCaso5();
        cliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Entrenamiento_DescripcionCaso5 descripcion = new Entrenamiento_DescripcionCaso5();
        descripcion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      row = jTable1.getSelectedRow() + 1;
        selectScene();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      Entrenamiento_Resumen resumen = new Entrenamiento_Resumen();
      resumen.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
