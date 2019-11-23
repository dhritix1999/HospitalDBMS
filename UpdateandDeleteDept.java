/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcgui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class UpdateandDeleteDept extends javax.swing.JFrame {
   
   

    ResultSet rsDept;
    ResultSet rsEmp;
    int currentDeptNo = 999;
    myDBCon dBCon;
    /**
     * Creates new form UpdateandDeleteDept
     */
    public UpdateandDeleteDept() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ERRORdeptno.setVisible(false);
        ERRORdeptname.setVisible(false);
        ERRORdeptloc.setVisible(false);
        dBCon = new myDBCon();
        getNewData();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    
    private void getNewData(){
    
      try {
            // populate deptno field
            rsDept = dBCon.executeStatement("SELECT deptno, dname, loc FROM dept ORDER BY deptno ASC ");
            rsDept.first();
            
            rsEmp = dBCon.executeStatement("SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno FROM emp ORDER BY empno ASC ");
            rsEmp.first();
            populateFields();
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected dept.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
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

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        LBdeptno = new javax.swing.JLabel();
        LBdeptname = new javax.swing.JLabel();
        LBdeptloc = new javax.swing.JLabel();
        TXTdeptno = new javax.swing.JTextField();
        TXTdeptname = new javax.swing.JTextField();
        TXTdeptloc = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        ERRORdeptname = new javax.swing.JLabel();
        ERRORdeptno = new javax.swing.JLabel();
        ERRORdeptloc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Update/Delete Department");
        jLabel1.setPreferredSize(new java.awt.Dimension(670, 456));

        LBdeptno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBdeptno.setText("DEPARTMENT NUMBER:");

        LBdeptname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBdeptname.setText("DEPARTMENT NAME:");

        LBdeptloc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBdeptloc.setText("DEPARTMENT LOCATION:");

        TXTdeptno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TXTdeptno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTdeptnoActionPerformed(evt);
            }
        });

        TXTdeptloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTdeptlocActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNext.setText("Next >>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPrevious.setText("<< Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        ERRORdeptname.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        ERRORdeptname.setForeground(new java.awt.Color(255, 0, 51));
        ERRORdeptname.setText("error label");

        ERRORdeptno.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        ERRORdeptno.setForeground(new java.awt.Color(255, 0, 51));
        ERRORdeptno.setText("error label");

        ERRORdeptloc.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        ERRORdeptloc.setForeground(new java.awt.Color(255, 0, 51));
        ERRORdeptloc.setText("error label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPrevious)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBdeptloc)
                    .addComponent(LBdeptname)
                    .addComponent(LBdeptno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXTdeptno, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ERRORdeptno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXTdeptloc, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ERRORdeptloc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXTdeptname, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ERRORdeptname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBdeptno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTdeptno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ERRORdeptno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LBdeptname, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTdeptname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ERRORdeptname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBdeptloc)
                    .addComponent(TXTdeptloc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ERRORdeptloc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnNext))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTdeptnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTdeptnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTdeptnoActionPerformed

    private void populateFields(){
    try {
            TXTdeptno.setText(rsDept.getString("deptno"));
            TXTdeptname.setText(rsDept.getString("dname"));
            TXTdeptloc.setText(rsDept.getString("loc"));
            
            currentDeptNo = rsDept.getInt("deptno");
            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
     private void EnableDisableButtons() {
        try {
            if (rsDept.isFirst()) {
                btnPrevious.setEnabled(false);
            } else {
                btnPrevious.setEnabled(true);
            }
            if (rsDept.isLast()) {
                btnNext.setEnabled(false);
            } else {
                btnNext.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
     private void MoveNext(){
                 try {
            // TODO add your handling code here:

            if (!rsDept.isLast()) {

                rsDept.next();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
   private void MovePrevious(){
        try {
            // TODO add your handling code here:

            if (!rsDept.isFirst()) {
                rsDept.previous();
                populateFields();

            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   private boolean IsDeptAssignedToEmp(String deptno){
       try {
           while(rsEmp.next())
           {if (deptno.equals(rsEmp.getString("deptno"))) {
                   return true;
               }
           }
       } catch (Exception ex) {
           Logger.getLogger(UpdateDeleteEmployee.class.getName()).log(Level.SEVERE, null,ex);
       }
       return false;
   }
    private boolean DoesDeptExist(String deptno) throws SQLException {
       boolean duplicate = false;
       String sqlt = "SELECT deptno FROM dept WHERE deptno ="+ deptno;
       rsDept = dBCon.executeStatement(sqlt);
       duplicate = rsDept.isBeforeFirst();
       return duplicate;
    }
   void clearErrorLabel()
   { ERRORdeptno.setText("");
     ERRORdeptno.setVisible(false);
     ERRORdeptname.setText("");
     ERRORdeptname.setVisible(false);
     ERRORdeptloc.setText("");
     ERRORdeptloc.setVisible(false);
   }
   
    
   boolean isValidData(){
   clearErrorLabel();
   
        boolean result = true;
        if (TXTdeptno.getText().trim().isEmpty() || !isInteger(TXTdeptno.getText().trim())) {
            if (TXTdeptno.getText().trim().isEmpty()) {
                ERRORdeptno.setText("Invalid. Cannot be empty.");
            } else if (!isInteger(TXTdeptno.getText().trim())) {
                ERRORdeptno.setText("Invalid. Must be integer.");
            }

            ERRORdeptno.setVisible(true);
            result = false;
        }

        if (TXTdeptname.getText().trim().isEmpty() || (TXTdeptname.getText().trim().length() > 10)) {
            if (TXTdeptname.getText().trim().isEmpty()) {
                ERRORdeptname.setText("Invalid. Cannot be empty.");
            } else if ((TXTdeptname.getText().trim().length() > 10)) {
                ERRORdeptname.setText("Invalid. Must be < 10 chars.");
            }

            ERRORdeptname.setVisible(true);
            result = false;
        }

        if (TXTdeptloc.getText().trim().isEmpty() || (TXTdeptloc.getText().trim().length() > 9)) {
            if (TXTdeptloc.getText().trim().isEmpty()) {
                ERRORdeptloc.setText("Invalid. Cannot be empty.");
            } else if (TXTdeptloc.getText().trim().length() > 9) {
                ERRORdeptloc.setText("Invalid. Must be < 9 chars.");
            }
            ERRORdeptloc.setVisible(true);
            result = false;
        }


        return result;
   }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        //confirm dialog
        int confirmationChoice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this?", "Confirm update", JOptionPane.WARNING_MESSAGE);
        if (confirmationChoice != JOptionPane.OK_OPTION){
            return;
        }
        
        
        try {
            if (isValidData()) {
                
                //check if department number exists
                if ((Integer.parseInt(TXTdeptno.getText().trim()) != rsDept.getInt("deptno")) && DoesDeptExist(TXTdeptno.getText().trim())) 
                {
                    ERRORdeptno.setText("Department number already exists");
                    ERRORdeptno.setVisible(true);
                    
                     javax.swing.JLabel label = new javax.swing.JLabel("Department number already exists");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
        
                
                String SQL = "UPDATE dept SET deptno ="+ TXTdeptno.getText().trim() +
                        " ,dname = " + "'"+TXTdeptname.getText().trim().toUpperCase() +"'"
                        +" ,loc = " + "'" +TXTdeptloc.getText().trim().toUpperCase()+"'"+ "where deptno = "+ currentDeptNo;
               
             
               
                
                int result = dBCon.executePrepared(SQL);
               

                if (result > 0) {
                    //updated succesfully
                    javax.swing.JLabel label = new javax.swing.JLabel("Dept No " + TXTdeptno.getText() + " updated successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
               
                    getNewData();
                } else {
                    System.out.println("Error! Failed server side");
                    // check validation errors 
                }
                dBCon.prepStatement.close();


            } else {
                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

        } catch (SQLException e) {
            //error updating department
            JOptionPane.showMessageDialog(null, "Error updating department." + e.getMessage());

        }
        
        try {          
                //Change employee dept nos
                String SQL2 = "UPDATE EMP SET DEPTNO = "+TXTdeptno.getText().trim()+ "where deptno = "+ currentDeptNo;
       
                int empResult = dBCon.executePrepared(SQL2);
                System.out.println("new: " + Integer.parseInt(TXTdeptno.getText()) + "old: " + currentDeptNo + "result: " + empResult);
                dBCon.prepStatement.close();
                
                currentDeptNo = Integer.parseInt(TXTdeptno.getText());
                getNewData();
        }
        catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error updating employees." + e.getMessage());

        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete ?", "Confirm updation", JOptionPane.WARNING_MESSAGE);
        if (choice != JOptionPane.OK_OPTION) {
            return;
        }

        if (IsDeptAssignedToEmp(TXTdeptno.getText().trim())){
            JOptionPane.showMessageDialog(null, "Error! Employee assigned to this dept", "Delete Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // make the result set scrolable forward/backward updatable
        //            statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        try {
            // make the result set scrolable forward/backward updatable
            
            String SQL3 = "DELET dept WHERE deptno = " +TXTdeptno.getText().trim();
        
            int result = dBCon.executePrepared(SQL3);
            if (result > 0) {
                javax.swing.JLabel label = new javax.swing.JLabel("Dept No " + TXTdeptno.getText().trim() + " deleted successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                getNewData();
            }

            dBCon.prepStatement.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error deleting employee.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void TXTdeptlocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTdeptlocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTdeptlocActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateandDeleteDept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateandDeleteDept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateandDeleteDept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateandDeleteDept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateandDeleteDept().setVisible(true);
            }
        });
    }
    //check if the String passed is an integer
public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
//check if the String passed is a double
    public boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ERRORdeptloc;
    private javax.swing.JLabel ERRORdeptname;
    private javax.swing.JLabel ERRORdeptno;
    private javax.swing.JLabel LBdeptloc;
    private javax.swing.JLabel LBdeptname;
    private javax.swing.JLabel LBdeptno;
    private javax.swing.JTextField TXTdeptloc;
    private javax.swing.JTextField TXTdeptname;
    private javax.swing.JTextField TXTdeptno;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables

   
}
