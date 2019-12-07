
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class DeleteTreats extends javax.swing.JFrame {

    myDBCon dbCon;
    ResultSet rsTreats;

    /**
     * Creates new form AddEmployee
     */
    public DeleteTreats() {
    
        initComponents();
             this.setTitle("Delete Treatment");
        this.setLocationRelativeTo(null);
        
//        lblDocIdError.setVisible(false);
//        lblPatIdError.setVisible(false);
        lblStartDateError.setVisible(false);
        lblEndDateError.setVisible(false);
        dbCon = new myDBCon();
        getNewData();
    }

     private void RetreiveDocName(String doc_id){
        
        try {
            ResultSet docname = dbCon.executeStatement("select first_name||' '||last_name \"Name\" from doctor where doctor_id = "+doc_id);
            docname.first();
            txtDocName2.setText(docname.getString("Name"));
        } catch (SQLException ex) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Getting doctor name.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    private void RetreivePatientName(String patient_id){
        
        try {
            ResultSet patientname= dbCon.executeStatement("select fname||' '||lname \"Name\" from patient where patient_id = "+patient_id);
            patientname.first();
            txtPatientName.setText(patientname.getString("Name"));
        } catch (SQLException ex) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Getting patient name.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    private void getNewData() {

        try {

            rsTreats = dbCon.executeStatement("SELECT doctors_id, patients_id, first_date, last_date FROM treats ORDER BY doctors_id ASC ");

            // populate rest of fields
            rsTreats.beforeFirst();
            rsTreats.first();
            populateFields();
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected treatment.");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPatId = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        txtDocId = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        lblStartDateError = new javax.swing.JLabel();
        lblEndDateError = new javax.swing.JLabel();
        ftxtStartDate = new javax.swing.JFormattedTextField();
        ftxtEndDate = new javax.swing.JFormattedTextField();
        txtPatientName = new javax.swing.JTextField();
        txtDocName2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update/Delete Employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Delete Treatment");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DOCTOR ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PATIENT ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("START DATE:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("END DATE:");

        txtPatId.setEditable(false);
        txtPatId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtDocId.setEditable(false);
        txtDocId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        lblStartDateError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblStartDateError.setForeground(new java.awt.Color(255, 0, 0));
        lblStartDateError.setText("error label");

        lblEndDateError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblEndDateError.setForeground(new java.awt.Color(255, 0, 0));
        lblEndDateError.setText("error label");

        ftxtStartDate.setEditable(false);
        ftxtStartDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d-MMM-yyyy"))));
        ftxtStartDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ftxtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtStartDateActionPerformed(evt);
            }
        });

        ftxtEndDate.setEditable(false);
        ftxtEndDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d-MMM-yyyy"))));
        ftxtEndDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ftxtEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtEndDateActionPerformed(evt);
            }
        });

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        txtDocName2.setEditable(false);
        txtDocName2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDocName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocName2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(btnPrevious))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDocId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(ftxtStartDate)
                            .addComponent(ftxtEndDate))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblStartDateError, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(lblEndDateError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(51, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDocName2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDocId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPatId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDocName2)
                        .addGap(8, 8, 8)
                        .addComponent(txtPatientName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblStartDateError)
                    .addComponent(ftxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblEndDateError)
                    .addComponent(ftxtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String getFormattedDate(String inpDate){
        DateTimeFormatter inpFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate retrievedTime = LocalDate.parse(inpDate.substring(0, 10));
        DateTimeFormatter outFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return retrievedTime.format(outFormatter);
    }
    
    private void populateFields() {
        try {
            txtDocId.setText(rsTreats.getString("doctors_id"));
            txtPatId.setText(rsTreats.getString("patients_id"));
            ftxtStartDate.setText(getFormattedDate(rsTreats.getString("first_date")));
            ftxtEndDate.setText(getFormattedDate(rsTreats.getString("last_date")));
            RetreiveDocName(rsTreats.getString("doctors_id"));
            RetreivePatientName(rsTreats.getString("patients_id"));
            
            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void MoveNext() {
        try {
            // TODO add your handling code here:
            if (!rsTreats.isLast()) {
                rsTreats.next();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void MovePrevious() {
        try {
            // TODO add your handling code here:
            if (!rsTreats.isFirst()) {
                rsTreats.previous();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void EnableDisableButtons() {
        try {
            if (rsTreats.isFirst()) {
                btnPrevious.setEnabled(false);
            } else {
                btnPrevious.setEnabled(true);
            }
            if (rsTreats.isLast()) {
                btnNext.setEnabled(false);
            } else {
                btnNext.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //ask confirmation
         int confirmationChoice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this?", "Confirm delete", JOptionPane.WARNING_MESSAGE);
        if (confirmationChoice != JOptionPane.OK_OPTION){
            return;
        }
        try {
            // make the result set scrolable forward/backward updatable
            String prepSQL = "DELETE FROM treats WHERE doctors_id = " + txtDocId.getText().trim()
                    + " AND patients_id = " + txtPatId.getText().trim() 
                    + " AND first_date = '" + ftxtStartDate.getText().trim() 
                    + "'";
            int result = dbCon.executePrepared(prepSQL);
            if (result > 0) {
                javax.swing.JLabel label = new javax.swing.JLabel("Treatment deleted successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                getNewData();
            }
        } catch (SQLException e) {
            //error deleting employee
            JOptionPane.showMessageDialog(null, "Error deleting treatment.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    void clearErrorLabels() {
//        lblDocIdError.setText("");
//        lblDocIdError.setVisible(false);
//        lblPatIdError.setText("");
//        lblPatIdError.setVisible(false);
        lblStartDateError.setText("");
        lblStartDateError.setVisible(false);
        lblEndDateError.setText("");
        lblEndDateError.setVisible(false);
    }

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    


    private void ftxtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtStartDateActionPerformed

    private void ftxtEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtEndDateActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtDocName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocName2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JFormattedTextField ftxtEndDate;
    private javax.swing.JFormattedTextField ftxtStartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblEndDateError;
    private javax.swing.JLabel lblStartDateError;
    private javax.swing.JTextField txtDocId;
    private javax.swing.JTextField txtDocName2;
    private javax.swing.JTextField txtPatId;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
