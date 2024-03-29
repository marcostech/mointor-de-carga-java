/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto1;

import com.fazecast.jSerialComm.*;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author projeto
 */
public class Tela01 extends javax.swing.JFrame {
    //Global ports
    UpdateUtils updater = new UpdateUtils();
    SerialPort portasSerial[] = updater.updateSerial();
    /**
     * Creates new form Tela01
     */
    public Tela01() {
        initComponents();
        //Make a button group for the BaudRate checkboxes
        ButtonGroup group = new ButtonGroup();
        group.add(jCheckBox4);
        group.add(jCheckBox2);
        group.add(jCheckBox1);
        group.add(jCheckBox3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblPortaCom = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPortaStatus = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTensaoMax = new javax.swing.JLabel();
        lblTensaoMin = new javax.swing.JLabel();
        lblTempoMax = new javax.swing.JLabel();
        lblModoSistema = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblTempoTotal = new javax.swing.JLabel();
        lblTensaoBateria = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblEstadoSistema = new javax.swing.JLabel();
        lblCiclosCarga = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monitor de Carga");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon(getClass().getResource("images/icon2.png")).getImage());

        jButton1.setText("Ler Portas COM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Porta COM Selecionada:");

        lblPortaCom.setForeground(new java.awt.Color(102, 0, 102));
        lblPortaCom.setText("-");

        jLabel5.setText("BaudRate");

        jLabel6.setText("Status:");

        lblPortaStatus.setForeground(new java.awt.Color(102, 0, 102));
        lblPortaStatus.setText("-");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Porta" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Estabelecer Conexão");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("9600");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("57600");
        jCheckBox2.setToolTipText("");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("115200");

        jCheckBox3.setText("19200");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurações de carga"));
        jPanel1.setPreferredSize(new java.awt.Dimension(311, 115));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Tensão carga Completa");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("Tensão de Recarga");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("Tempo limite de Carga");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setText("Modo do Sistema");

        lblTensaoMax.setForeground(new java.awt.Color(102, 0, 102));
        lblTensaoMax.setText("0");

        lblTensaoMin.setForeground(new java.awt.Color(102, 0, 102));
        lblTensaoMin.setText("0");

        lblTempoMax.setForeground(new java.awt.Color(102, 0, 102));
        lblTempoMax.setText("-");

        lblModoSistema.setForeground(new java.awt.Color(102, 0, 102));
        lblModoSistema.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModoSistema)
                    .addComponent(lblTensaoMax)
                    .addComponent(lblTensaoMin)
                    .addComponent(lblTempoMax))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblTensaoMax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblTensaoMin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblTempoMax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblModoSistema))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setText("Seleciona a porta a ser aberta");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Leitura Tempo Real"));
        jPanel2.setPreferredSize(new java.awt.Dimension(245, 55));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Tempo total");

        lblTempoTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTempoTotal.setForeground(new java.awt.Color(0, 153, 204));
        lblTempoTotal.setText("00:00:00");

        lblTensaoBateria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTensaoBateria.setForeground(new java.awt.Color(0, 153, 204));
        lblTensaoBateria.setText("00.00");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Tensão na Bateria");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTensaoBateria)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTempoTotal)
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTensaoBateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTempoTotal)
                    .addComponent(jLabel8))
                .addGap(12, 12, 12))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sistema"));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Estado do sistema");

        lblEstadoSistema.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEstadoSistema.setForeground(new java.awt.Color(102, 0, 102));
        lblEstadoSistema.setText("Inativo");

        lblCiclosCarga.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCiclosCarga.setForeground(new java.awt.Color(102, 0, 102));
        lblCiclosCarga.setText("0");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Ciclos de carga");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCiclosCarga)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblEstadoSistema)
                        .addGap(25, 25, 25))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(lblEstadoSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCiclosCarga)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Monitor de Carga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblPortaCom))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(127, 127, 127)
                                .addComponent(jToggleButton1))
                            .addComponent(lblPortaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox4)))
                        .addContainerGap(9, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPortaCom)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPortaStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Combobox populate
        UpdateUtils updater = new UpdateUtils();
        portasSerial = updater.updateSerial();
        Boolean addItem = false;
        for(SerialPort porta : portasSerial){
            for(int i = 0; i < jComboBox1.getItemCount(); i++){
                //Check if there is already a port entry
                if(jComboBox1.getItemAt(i).contains(porta.getSystemPortName()) ) {
                    addItem = false;
                    break;
                } else {
                    addItem = true; 
                }
            } 
            if(addItem) {
               jComboBox1.addItem(
                   String.format("%s in %s", porta.getPortDescription(), porta.getSystemPortName())                                
               );
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //On action select serial port
        //Get selected serial port
        var portaSelecionada = portasSerial[jComboBox1.getSelectedIndex()-1];
        //Status change
        lblPortaCom.setText(portaSelecionada.getSystemPortName());
        if(portaSelecionada.isOpen())
        {
            lblPortaStatus.setText("Porta Aberta");
        }
        else if(!portaSelecionada.isOpen())
        {
            lblPortaStatus.setText("Porta Fechada");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
             
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        //On action open selected serial port
        var portaSelecionada = portasSerial[jComboBox1.getSelectedIndex()-1];
        //Port Config
        int dataBits = 8;
        int stopBits = SerialPort.ONE_STOP_BIT;
        int parity   = SerialPort.NO_PARITY;        
        //Set a default BaudRate
        int baudRate = 115200;
        //Get baudRate selected via checkBox
        if(jCheckBox1.isSelected())
        {
            baudRate = 115200;
        }
        if(jCheckBox2.isSelected())
        {
            baudRate = 57600;
        }
        if(jCheckBox3.isSelected())
        {
            baudRate = 19200;
        }
        if(jCheckBox4.isSelected())
        {
            baudRate = 9800;
        }
        //Set port parameters
        portaSelecionada.setBaudRate(baudRate);
        portaSelecionada.setParity(parity);
        portaSelecionada.setNumDataBits(dataBits);
        portaSelecionada.setNumStopBits(stopBits);
        portaSelecionada.setComPortTimeouts(
            SerialPort.TIMEOUT_READ_BLOCKING,
            1000,
            0
        ); 
        //Open port
        portaSelecionada.openPort();
        //Add Listener - only on Data Recieved
        MessageListener listener = new MessageListener();
        portaSelecionada.addDataListener(listener);
        //Port status change
         if(portaSelecionada.isOpen())
        {
            lblPortaStatus.setText("Porta Aberta");
        }
        else if(!portaSelecionada.isOpen())
        {
            lblPortaStatus.setText("Porta Fechada");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed
       
    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            //System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            //for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            //    if ("Nimbus".equals(info.getName())) {
            //        javax.swing.UIManager.setLookAndFeel(info.getClassName());
            //        break;
            //    }
            //}
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela01().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblCiclosCarga;
    private javax.swing.JLabel lblEstadoSistema;
    private javax.swing.JLabel lblModoSistema;
    private javax.swing.JLabel lblPortaCom;
    private javax.swing.JLabel lblPortaStatus;
    private javax.swing.JLabel lblTempoMax;
    private javax.swing.JLabel lblTempoTotal;
    private javax.swing.JLabel lblTensaoBateria;
    private javax.swing.JLabel lblTensaoMax;
    private javax.swing.JLabel lblTensaoMin;
    // End of variables declaration//GEN-END:variables

//Port Listener implementation, data processing done here
private final class MessageListener implements SerialPortMessageListener
{
    //Set the events to be listened
    @Override
    public int getListeningEvents() { return SerialPort.LISTENING_EVENT_DATA_RECEIVED; }
    
    //Set the character to indicate the end of a transmission
    @Override
    public byte[] getMessageDelimiter() { return new byte[] { (byte)0x0a }; } //End message on LF (new line)
    
    @Override
    public boolean delimiterIndicatesEndOfMessage() { return true; }

    //Event triggered when recieving data from de the serial port
    @Override
    public void serialEvent(SerialPortEvent event)
    {
        //Status change 
        lblPortaStatus.setText("Recebendo Dados -> Stream Aberta");
         //Data processing
         byte[] delimitedMessage = event.getReceivedData();
         //Buffer to store data bytes
         StringBuffer hexStringBuffer = new StringBuffer();
         //Data array to data string
         for (int i = 0; i < delimitedMessage.length; i++) {
             hexStringBuffer.append((char)delimitedMessage[i]);
         }            
         //Done
         //jTextArea1.setText(hexStringBuffer.toString());
         //Call Updater
         UpdateUtils labelUpdater = new UpdateUtils();
            labelUpdater.updateLabels(hexStringBuffer.toString());
    }
}

public class UpdateUtils{
    
    public SerialPort[] updateSerial(){
        SerialPort serialPorts[] = SerialPort.getCommPorts();            
        return serialPorts;
    }
    
    public void updateLabels(String data){
        //String processing
        int startIndex = data.indexOf('<');
        int endIndex = data.indexOf('>', startIndex);
        String dadosSerialTratados = data.substring(startIndex + 2, endIndex - startIndex - 1);
        String[] leituraArray = dadosSerialTratados.split(",");
        /*
            leituraArray anatomy
            leituraArray[0] ->  V: xxxxx = Voltage being read
            leituraArray[1] ->  T: xxxxx = Time elapsed
            leituraArray[2] ->  C: xxxxx = Total charge cycles 
            leituraArray[3] ->  S: xxxxx = Charge status
            leituraArray[4] ->  CFG1: xxxxx = minimum/start voltage
            leituraArray[5] ->  CFG2: xxxxx = max/end voltage
            leituraArray[6] ->  CFG3: xxxxx = max/limit charge time
            leituraArray[7] ->  CFG4: xxxxx = system current mode
        */
        lblTensaoBateria.setText(leituraArray[0].substring(3));
        lblTempoTotal.setText(leituraArray[1].substring(3));
        lblCiclosCarga.setText(leituraArray[2].substring(3));
        lblEstadoSistema.setText(leituraArray[3].substring(3));
        lblTensaoMax.setText(leituraArray[4].substring(6));
        lblTensaoMin.setText(leituraArray[5].substring(6));
        lblTempoMax.setText(leituraArray[6].substring(6)+" Horas");
        
        /*  
            System mode descripton
            System mode 0 = Default do sistema
            System mode 1 = Modo Automatico
            System mode 2 = Modo Tracionario
            System mode 3 = Modo Bloqueador
        */
        if("0".equals(leituraArray[7].substring(6))) { lblModoSistema.setText("Default"); }
        if("1".equals(leituraArray[7].substring(6))) { lblModoSistema.setText("Automático"); }
        if("2".equals(leituraArray[7].substring(6))) { lblModoSistema.setText("Tracionário"); }
        if("3".equals(leituraArray[7].substring(6))) { lblModoSistema.setText("Bloqueador"); }
    }    
}

}


