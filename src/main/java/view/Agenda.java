/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author mila_
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
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

        AgendajLabel1 = new javax.swing.JLabel();
        IdjTextField = new javax.swing.JTextField();
        IdjLabel = new javax.swing.JLabel();
        ClientejComboBox = new javax.swing.JComboBox<>();
        ClientejLabel = new javax.swing.JLabel();
        ServicojComboBox = new javax.swing.JComboBox<>();
        ServicojLabel = new javax.swing.JLabel();
        ValorjTextField = new javax.swing.JTextField();
        ValorjLabel1 = new javax.swing.JLabel();
        DatajTextField = new javax.swing.JTextField();
        DatajLabel = new javax.swing.JLabel();
        HorajTextField = new javax.swing.JTextField();
        HorajLabel = new javax.swing.JLabel();
        ObservacaojScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ObservacaojLabel1 = new javax.swing.JLabel();
        AgendarjToggleButton1 = new javax.swing.JToggleButton();
        tabelajScrollPane = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Fundo2jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgendajLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AgendajLabel1.setText("Agenda");
        getContentPane().add(AgendajLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        IdjTextField.setForeground(new java.awt.Color(255, 255, 255));
        IdjTextField.setText("jTextField1");
        IdjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdjTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(IdjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 180, 30));

        IdjLabel.setText("Id");
        getContentPane().add(IdjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 20));

        ClientejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ana", "Leticia", "Carla" }));
        ClientejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientejComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ClientejComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 180, 30));

        ClientejLabel.setText("Cliente");
        getContentPane().add(ClientejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        ServicojComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ServicojComboBox.setToolTipText("");
        getContentPane().add(ServicojComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 180, 30));

        ServicojLabel.setText("Servico");
        getContentPane().add(ServicojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        getContentPane().add(ValorjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 180, 30));

        ValorjLabel1.setText("Valor ");
        getContentPane().add(ValorjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        getContentPane().add(DatajTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 180, 30));

        DatajLabel.setText("Data");
        getContentPane().add(DatajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        getContentPane().add(HorajTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 180, 30));

        HorajLabel.setText("Hora");
        getContentPane().add(HorajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        ObservacaojScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(ObservacaojScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 290, 190));

        ObservacaojLabel1.setText("Observacao");
        getContentPane().add(ObservacaojLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        AgendarjToggleButton1.setBackground(new java.awt.Color(255, 153, 204));
        AgendarjToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AgendarjToggleButton1.setText("Agendar");
        getContentPane().add(AgendarjToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 290, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cliente", "Servico", "Valor", "Data", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelajScrollPane.setViewportView(jTable1);

        getContentPane().add(tabelajScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 560, 90));

        Fundo2jLabel.setForeground(new java.awt.Color(255, 255, 255));
        Fundo2jLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\mila_\\OneDrive\\Documentos\\NetBeansProjects\\lashShop\\src\\main\\java\\view\\imagens\\icons\\f708df9e37d9f8e416b031b312bc807e.jpg")); // NOI18N
        getContentPane().add(Fundo2jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdjTextFieldActionPerformed

    private void ClientejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientejComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgendajLabel1;
    private javax.swing.JToggleButton AgendarjToggleButton1;
    private javax.swing.JComboBox<String> ClientejComboBox;
    private javax.swing.JLabel ClientejLabel;
    private javax.swing.JLabel DatajLabel;
    private javax.swing.JTextField DatajTextField;
    private javax.swing.JLabel Fundo2jLabel;
    private javax.swing.JLabel HorajLabel;
    private javax.swing.JTextField HorajTextField;
    private javax.swing.JLabel IdjLabel;
    private javax.swing.JTextField IdjTextField;
    private javax.swing.JLabel ObservacaojLabel1;
    private javax.swing.JScrollPane ObservacaojScrollPane1;
    private javax.swing.JComboBox<String> ServicojComboBox;
    private javax.swing.JLabel ServicojLabel;
    private javax.swing.JLabel ValorjLabel1;
    private javax.swing.JTextField ValorjTextField;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane tabelajScrollPane;
    // End of variables declaration//GEN-END:variables
}
