/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_booking;

import java.awt.HeadlessException;
import java.sql.Connection;
import static java.sql.JDBCType.NULL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thasni
 */
public class userdetails extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public userdetails() {
        initComponents();
        showDetails();
    }
    
    public ArrayList<show> showList(){
        ArrayList<show> showList= new ArrayList<>();
        try{
            Connection conn = DbConnection.ConnectDb();
        String Sql="Select * from employee ";
            PreparedStatement pst = conn.prepareStatement(Sql);
            ResultSet rs = pst.executeQuery();
            show show;
            
            while(rs.next()){
                show = new show(rs.getString("emp_id"),rs.getString("emp_name"),rs.getString("emp_nic"),rs.getString("emp_phone"),rs.getString("emp_address"),rs.getString("emp_mail"),rs.getString("emp_password"));
                
                showList.add(show);
                        }
            
        }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        } 
        return showList;
    }
    
    
    void showDetails(){
        //userdetails ud = new userdetails();
        ArrayList<show> list = showList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[7];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getEmp_id();
            row[1]=list.get(i).getEmp_name();
            row[2]=list.get(i).getEmp_nic();
            row[3]=list.get(i).getEmp_phone();
            row[4]=list.get(i).getEmp_address();
            row[5]=list.get(i).getEmp_mail();
            row[6]=list.get(i).getBus_to();
            model.addRow(row);
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
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tEmpID = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        lMessage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tEmpNIC = new javax.swing.JTextField();
        tEmpName = new javax.swing.JTextField();
        tEmpPhoneNo = new javax.swing.JTextField();
        tEmpAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tEmpMail = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tEmpPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 48)); // NOI18N
        jLabel1.setText("BOOK MY BUS");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.setActionCommand("Search");
        jButton2.setName("searchorupdate"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Employee NIC", "Employee Phone", "Employee Address", "Employee Mail", "Employee Password"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 13)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Employee ID");

        tEmpID.setText(" ");
        tEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpIDActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 13)); // NOI18N
        jButton5.setText("update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lMessage.setForeground(new java.awt.Color(255, 0, 0));
        lMessage.setText(" ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Employee NIC");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Employee Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Employee Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Employee Phone");

        tEmpNIC.setText(" ");
        tEmpNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpNICActionPerformed(evt);
            }
        });

        tEmpName.setText(" ");
        tEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpNameActionPerformed(evt);
            }
        });

        tEmpPhoneNo.setText(" ");
        tEmpPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpPhoneNoActionPerformed(evt);
            }
        });

        tEmpAddress.setText(" ");
        tEmpAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpAddressActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Employee Mail");

        tEmpMail.setText(" ");
        tEmpMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpMailActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 13)); // NOI18N
        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jButton3.setText("Log Out ");
        jButton3.setActionCommand("Search");
        jButton3.setName("searchorupdate"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel9.setText("USER DETAILS");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Employee Password");

        tEmpPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(343, 343, 343)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(70, 70, 70))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(57, 57, 57)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tEmpPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tEmpAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(tEmpMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                            .addComponent(tEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tEmpNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tEmpPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel9)
                        .addGap(130, 130, 130)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(lMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jButton5)
                        .addGap(37, 37, 37)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tEmpNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tEmpPhoneNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tEmpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(tEmpMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tEmpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addComponent(lMessage)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus_booking/Bus.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new admin().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpIDActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            
    
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    if(jTable1.getSelectedRow()==-1){
        if(jTable1.getRowCount()==0){
            lMessage.setText("Table is empty");
        }else{lMessage.setText("You must select a product");
        
    }
    }
        else{
        
        try{
        //DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            Connection conn = DbConnection.ConnectDb();
            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row,0).toString());
            String sql  = "UPDATE bus  SET bus_id=?,bus_route=?,route_no=?,bus_no=?,bus_time=?,bus_from=?,bus_to=?"+value;
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,tEmpID.getText());
            pst.setString(2,tEmpName.getText());
            pst.setString(3,tEmpNIC.getText());
            pst.setString(4,tEmpPhoneNo.getText());
            pst.setString(5,tEmpAddress.getText());
            pst.setString(6,tEmpMail.getText());
            pst.setString(7,tEmpPassword.getText());
            
            
            pst.executeUpdate();
                   
            model.setRowCount(0);
            showDetails();
            JOptionPane.showMessageDialog(null, "Updated successfully");
            tEmpID.setText(null);
        tEmpName.setText(null);
        tEmpNIC.setText(null);
        tEmpPhoneNo.setText(null);
        tEmpAddress.setText(null);
        tEmpMail.setText(null);
        tEmpPassword.setText(null);

        }
    
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }      // TODO add your handling code here:
    }
        
        /*    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    if(jTable1.getSelectedRow()==-1){
        if(jTable1.getRowCount()==0){
            lMessage.setText("Table is empty");
        }else{lMessage.setText("You must select a product");
        
    }
    }
        else{
        model.setValueAt(tEmpID.getText(),jTable1.getSelectedRow(),0);
        model.setValueAt(tEmpName.getText(),jTable1.getSelectedRow(),1);
        model.setValueAt(tEmpNIC.getText(),jTable1.getSelectedRow(),2);
        model.setValueAt(tEmpPhoneNo.getText(),jTable1.getSelectedRow(),3);
        model.setValueAt(tEmpAddress.getText(),jTable1.getSelectedRow(),4);
        model.setValueAt(tEmpMail.getText(),jTable1.getSelectedRow(),5);
        }
    // TODO add your handling code here:*/
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
        
        if(jTable1.getSelectedRow()==-1){
        if(jTable1.getRowCount()==0){
            lMessage.setText("Table is empty");
        }else{lMessage.setText("You must select a product");
        
    }
    }
       
   
    else{
         try{
            Connection conn = DbConnection.ConnectDb();
        int row=jTable1.getSelectedRow();
        String value=(jTable1.getModel().getValueAt(row, 0).toString());
        String sql="DELETE FROM bus where bus_id="+value;
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.executeUpdate();
        model.setRowCount(0);
        showDetails();
        JOptionPane.showMessageDialog(null, "Deleted successfully");
        
        
       // model.removeRow(jTable1.getSelectedRow());
        
    
        tEmpID.setText(null);
        tEmpName.setText(null);
        tEmpNIC.setText(null);
        tEmpPhoneNo.setText(null);
        tEmpAddress.setText(null);
        tEmpMail.setText(null);
        tEmpPassword.setText(null);
    }
    
    //}
    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
      
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tEmpNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpNICActionPerformed

    private void tEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpNameActionPerformed

    private void tEmpPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpPhoneNoActionPerformed

    private void tEmpAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpAddressActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        tEmpID.setText(model.getValueAt(jTable1.getSelectedRow(),0).toString());
        tEmpName.setText(model.getValueAt(jTable1.getSelectedRow(),1).toString());
        tEmpNIC.setText(model.getValueAt(jTable1.getSelectedRow(),2).toString());
        tEmpPhoneNo.setText(model.getValueAt(jTable1.getSelectedRow(),3).toString());
        tEmpAddress.setText(model.getValueAt(jTable1.getSelectedRow(),4).toString()); 
        tEmpMail.setText(model.getValueAt(jTable1.getSelectedRow(),5).toString());
        tEmpPassword.setText(model.getValueAt(jTable1.getSelectedRow(),6).toString());
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void tEmpMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpMailActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try { DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    if(tEmpID.getText().trim().isEmpty()|| tEmpName.getText().trim().isEmpty()||tEmpNIC.getText().trim().isEmpty()||tEmpPhoneNo.getText().trim().isEmpty()||tEmpAddress.getText().trim().isEmpty()||tEmpMail.getText().trim().isEmpty()|| tEmpPassword.getText().trim().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "!!!!!!!  Please File all details..");
        }
    
        
    else{
    
        model.addRow(new Object[]{tEmpID.getText(),tEmpName.getText(),tEmpNIC.getText(),tEmpPhoneNo.getText(),tEmpAddress.getText(),tEmpMail.getText(),tEmpName.getText()});    
        Connection conn = DbConnection.ConnectDb();
            String sql  = "INSERT INTO bus(bus_id, bus_route, route_no, bus_no, bus_time, bus_from,bus_to) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            
      
           pst.setString(1,tEmpID.getText());
           pst.setString(2,tEmpName.getText());
           pst.setString(3,tEmpNIC.getText());
           pst.setString(4,tEmpPhoneNo.getText());
           pst.setString(5,tEmpAddress.getText());
           pst.setString(6,tEmpMail.getText());
           pst.setString(7,tEmpPassword.getText());
           pst.execute();
           model.setRowCount(0);
           showDetails();
           
          // pst.executeUpdate(sql);
//
          JOptionPane.showMessageDialog(this, "Success !");
          tEmpID.setText(null);
        tEmpName.setText(null);
        tEmpNIC.setText(null);
        tEmpPhoneNo.setText(null);
        tEmpAddress.setText(null);
        tEmpMail.setText(null);
        tEmpPassword.setText(null);

                 }
        }
    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } 
//, TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new adminLogIn().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tEmpPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpPasswordActionPerformed

    /*public static void listed(){
        DefaultTableModel table=new DefaultTableModel();
        table.addColumn("emp_id");
        table.addColumn("emp_name");
        table.addColumn("emp_nic");
        table.addColumn("emp_phone");
        table.addColumn("emp_address");
        table.addColumn("emp_mail");
        
        try{
            Connection conn=DbConnection.ConnectDb();
        String Sql="Select * from employee ";
       Statement pst=conn.createStatement();
          ResultSet rs;
            rs = pst.executeQuery(Sql);
          
          while(rs.next())
           {
            table.addRow(new Object[]{
              rs.getString(1),
              rs.getString(2),
                
              rs.getString(3),
              rs.getString(4),
              rs.getString(5),
              rs.getString(6),
              
          });
        }
          jTable1.setModel(table);
          
            
        }
        catch(Exception e){
            
            
        }
    
}*/
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
        //listed();
        
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
            java.util.logging.Logger.getLogger(userdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JLabel lMessage;
    private javax.swing.JTextField tEmpAddress;
    private javax.swing.JTextField tEmpID;
    private javax.swing.JTextField tEmpMail;
    private javax.swing.JTextField tEmpNIC;
    private javax.swing.JTextField tEmpName;
    private javax.swing.JTextField tEmpPassword;
    private javax.swing.JTextField tEmpPhoneNo;
    // End of variables declaration//GEN-END:variables
}
