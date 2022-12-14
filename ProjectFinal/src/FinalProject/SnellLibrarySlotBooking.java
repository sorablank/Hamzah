/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FinalProject;

import static FinalProject.SnellLibraryDatePicker.BookingDate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hamza
 */
public class SnellLibrarySlotBooking extends javax.swing.JFrame {
    Timer t;
    SimpleDateFormat st;
    SimpleDateFormat st1;
  
    /**
     * Creates new form SnellLibrarySlotBooking
     */
    public SnellLibrarySlotBooking() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        slotTable = new javax.swing.JTable();
        numberField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bookButton = new javax.swing.JButton();
        timingField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        slotTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        slotTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Slot Number", "Slot Timing"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        slotTable.setGridColor(new java.awt.Color(255, 255, 255));
        slotTable.setRowHeight(25);
        slotTable.setSelectionBackground(new java.awt.Color(153, 0, 0));
        slotTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        slotTable.getTableHeader().setReorderingAllowed(false);
        slotTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slotTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(slotTable);
        if (slotTable.getColumnModel().getColumnCount() > 0) {
            slotTable.getColumnModel().getColumn(0).setResizable(false);
            slotTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(230, 330, 690, 630);

        numberField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFieldActionPerformed(evt);
            }
        });
        jPanel1.add(numberField);
        numberField.setBounds(1280, 490, 170, 26);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Slot Number");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1100, 490, 100, 16);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Slot Timing");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1100, 570, 90, 20);

        bookButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        bookButton.setText("BOOK");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        jPanel1.add(bookButton);
        bookButton.setBounds(1210, 670, 150, 50);

        timingField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jPanel1.add(timingField);
        timingField.setBounds(1280, 570, 170, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
         
     
         
         
     
         
         Date dt = new Date();
         st = new SimpleDateFormat("HH");
         String tt = st.format(dt); 
         System.out.println(tt);
         
         st1 = new SimpleDateFormat("yyyy-MM-dd");
         String tt1 = st1.format(SnellLibraryDatePicker.BookingDate.getDate()); 
         
         
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection StudentConnection = DriverManager.getConnection("jdbc:mysql://192.168.161.158:3306/finalproject","root", "");
            Statement StudentStatement = (Statement) StudentConnection.createStatement();
            String slotSql = ("Select slots, slot_time from slots_available where  slots > '"+tt+"' and slots NOT IN (select slot from slot_info where date = '"+tt1+"' and seat_name = '"+SnellLibraryBookingPage.seatNumber.getText()+"') " );
            PreparedStatement slotPreparedStatement = StudentConnection.prepareStatement(slotSql);
            ResultSet patientResultSet = slotPreparedStatement.executeQuery();
            DefaultTableModel washingtonModel = (DefaultTableModel)slotTable.getModel();
            washingtonModel.setRowCount(0);
            while(patientResultSet.next())
            {
            Object washington[] = { patientResultSet.getString("slots"),patientResultSet.getString("slot_time")};
            washingtonModel.addRow(washington);
            }
    
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    
    }  
         
        
        
        
         
    }//GEN-LAST:event_formWindowActivated

    private void numberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberFieldActionPerformed

    private void slotTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slotTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel slotTableModel = (DefaultTableModel)slotTable.getModel();
            int selectedRowIndex = slotTable.getSelectedRow();
           
            numberField.setText((String) slotTableModel.getValueAt(selectedRowIndex, 0));          
            timingField.setText((String) slotTableModel.getValueAt(selectedRowIndex, 1));
            
    }//GEN-LAST:event_slotTableMouseClicked

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        // TODO add your handling code here:
          String numberFieldNew = numberField.getText();
          String timingFieldNew = timingField.getText();
          String username = StudentLoginPage.usernameField.getText();
          String seatName = SnellLibraryBookingPage.seatNumber.getText();
          st1 = new SimpleDateFormat("yyyy-MM-dd");
         String tt1 = st1.format(SnellLibraryDatePicker.BookingDate.getDate()); 
          
          
          
          try{  
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection StudentConnection = DriverManager.getConnection("jdbc:mysql://192.168.161.158:3306/finalproject","root", "");
            Statement StudentStatement = (Statement) StudentConnection.createStatement();
           
            
            
            
            String HospitalAdminSql = "Insert into slot_info values (?,?,?,?,?,?,?)";
            PreparedStatement HospitalAdminApp = StudentConnection.prepareStatement(HospitalAdminSql);
           
            HospitalAdminApp.setString(1, username);
            HospitalAdminApp.setString(2, seatName);          
            HospitalAdminApp.setString(3, numberFieldNew);
            HospitalAdminApp.setString(4, timingFieldNew);
            HospitalAdminApp.setString(5, tt1);
            HospitalAdminApp.setString(6, null);
            HospitalAdminApp.setString(7, null);
           
            HospitalAdminApp.executeUpdate();
            
            
            
            
           
           
            StudentConnection.close();

        
           
        }    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
   
    }
          
          
          
      
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection StudentConnection = DriverManager.getConnection("jdbc:mysql://192.168.161.158:3306/finalproject","root", "");
            Statement StudentStatement = (Statement) StudentConnection.createStatement();
            
            String update = ("UPDATE slot_info, codes SET slot_info.code = codes.code WHERE slot_info.seat_name = codes.seat_name;");
             PreparedStatement slotPreparedStatement = StudentConnection.prepareStatement(update);
            slotPreparedStatement.execute();
            
             JOptionPane.showMessageDialog(null,"Slot booked succesfully");
            
            
             
             numberField.setText("");
             timingField.setText("");
             
             
            
            
    
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    
    }
    }//GEN-LAST:event_bookButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SnellLibrarySlotBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SnellLibrarySlotBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SnellLibrarySlotBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SnellLibrarySlotBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SnellLibrarySlotBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numberField;
    private javax.swing.JTable slotTable;
    private javax.swing.JTextField timingField;
    // End of variables declaration//GEN-END:variables
}
