/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wissam
 */
public class Menu extends javax.swing.JFrame {

    LoginUser luser; // the login user details are obtained from the Login form

    /**
     * Creates new form Menu
     */
    public Menu(LoginUser user) {
        initComponents();
        this.setLocationRelativeTo(null); // center form in screen 

        luser = user; // user details are obtained from the Login form and passed to constructor of Menu form object
        if (user.type == 1) { // hide the user management menu if the logged in user is NOT administrator 
            menuUser.setVisible(false);
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

        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemLogout = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuPatient = new javax.swing.JMenu();
        menuItemAddPat = new javax.swing.JMenuItem();
        menuItemUpdDelPat = new javax.swing.JMenuItem();
        menuDoctor = new javax.swing.JMenu();
        menuItemAddDoc = new javax.swing.JMenuItem();
        menuItemUpdDelDoc = new javax.swing.JMenuItem();
        menuWard = new javax.swing.JMenu();
        menuItemAddWard = new javax.swing.JMenuItem();
        menuItemUpdDelWard = new javax.swing.JMenuItem();
        menuTreats = new javax.swing.JMenu();
        menuItemAddTreats = new javax.swing.JMenuItem();
        menuItemDeleteTreatment = new javax.swing.JMenuItem();
        menuUser = new javax.swing.JMenu();
        menuItemAddUser = new javax.swing.JMenuItem();
        menuItemUpdDelUser = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - JDBC GUI");
        setResizable(false);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        menuFile.setText("File");
        menuFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        menuItemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuItemLogout.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuItemLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        menuItemLogout.setText("Logout");
        menuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLogoutActionPerformed(evt);
            }
        });
        menuFile.add(menuItemLogout);

        menuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuItemExit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuItemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        menuFile.add(menuItemExit);

        jMenuBar1.add(menuFile);

        menuPatient.setText("Patient");
        menuPatient.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        menuItemAddPat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAddPat.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuItemAddPat.setText("Add New Patient");
        menuItemAddPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddPatActionPerformed(evt);
            }
        });
        menuPatient.add(menuItemAddPat);

        menuItemUpdDelPat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuItemUpdDelPat.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuItemUpdDelPat.setText("Update/Delete Patient");
        menuItemUpdDelPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUpdDelPatActionPerformed(evt);
            }
        });
        menuPatient.add(menuItemUpdDelPat);

        jMenuBar1.add(menuPatient);

        menuDoctor.setText("Doctor");
        menuDoctor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        menuItemAddDoc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuItemAddDoc.setText("Add New Doctor");
        menuItemAddDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddDocActionPerformed(evt);
            }
        });
        menuDoctor.add(menuItemAddDoc);

        menuItemUpdDelDoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuItemUpdDelDoc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuItemUpdDelDoc.setText("Update/Delete Doctor");
        menuItemUpdDelDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUpdDelDocActionPerformed(evt);
            }
        });
        menuDoctor.add(menuItemUpdDelDoc);

        jMenuBar1.add(menuDoctor);

        menuWard.setText("Ward");
        menuWard.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        menuItemAddWard.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuItemAddWard.setText("Add New Ward");
        menuItemAddWard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddWardActionPerformed(evt);
            }
        });
        menuWard.add(menuItemAddWard);

        menuItemUpdDelWard.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuItemUpdDelWard.setText("Update/Delete Ward");
        menuItemUpdDelWard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUpdDelWardActionPerformed(evt);
            }
        });
        menuWard.add(menuItemUpdDelWard);

        jMenuBar1.add(menuWard);

        menuTreats.setText("Treats");
        menuTreats.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        menuItemAddTreats.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuItemAddTreats.setText("Add Treatment");
        menuItemAddTreats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddTreatsActionPerformed(evt);
            }
        });
        menuTreats.add(menuItemAddTreats);

        menuItemDeleteTreatment.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuItemDeleteTreatment.setText("Delete Treatment");
        menuItemDeleteTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDeleteTreatmentActionPerformed(evt);
            }
        });
        menuTreats.add(menuItemDeleteTreatment);

        jMenuBar1.add(menuTreats);

        menuUser.setText("User");
        menuUser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        menuItemAddUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAddUser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuItemAddUser.setText("Add New User");
        menuItemAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddUserActionPerformed(evt);
            }
        });
        menuUser.add(menuItemAddUser);

        menuItemUpdDelUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuItemUpdDelUser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuItemUpdDelUser.setText("Update/Delete User");
        menuItemUpdDelUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUpdDelUserActionPerformed(evt);
            }
        });
        menuUser.add(menuItemUpdDelUser);

        jMenuBar1.add(menuUser);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAddPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddPatActionPerformed
        // TODO add your handling code here:
        (new AddPatient()).setVisible(true);
    }//GEN-LAST:event_menuItemAddPatActionPerformed

    private void menuItemUpdDelPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUpdDelPatActionPerformed
        // TODO add your handling code here:
        (new UpdateDeletePatient()).setVisible(true);

    }//GEN-LAST:event_menuItemUpdDelPatActionPerformed

    private void menuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLogoutActionPerformed
        // TODO add your handling code here:
        (new LoginForm()).setVisible(true);
        this.dispose(); // the Menu form is disposed ONLY when the currently logged in user logs out
    }//GEN-LAST:event_menuItemLogoutActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void menuItemAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddUserActionPerformed
        // TODO add your handling code here:
        (new AddNewLoginUser()).setVisible(true);
    }//GEN-LAST:event_menuItemAddUserActionPerformed

    private void menuItemUpdDelUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUpdDelUserActionPerformed
        // TODO add your handling code here:
        (new UpdateDeleteLoginUser()).setVisible(true);
    }//GEN-LAST:event_menuItemUpdDelUserActionPerformed

    private void menuItemUpdDelDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUpdDelDocActionPerformed
        (new UpdateDeleteDoctor()).setVisible(true);
    }//GEN-LAST:event_menuItemUpdDelDocActionPerformed

    private void menuItemAddWardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddWardActionPerformed
        (new AddWard()).setVisible(true);
    }//GEN-LAST:event_menuItemAddWardActionPerformed

    private void menuItemAddDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddDocActionPerformed
        (new AddDoctor()).setVisible(true);
    }//GEN-LAST:event_menuItemAddDocActionPerformed

    private void menuItemUpdDelWardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUpdDelWardActionPerformed
        (new UpdateDeleteWard()).setVisible(true);
    }//GEN-LAST:event_menuItemUpdDelWardActionPerformed

    private void menuItemAddTreatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddTreatsActionPerformed
        (new AddTreats()).setVisible(true);
    }//GEN-LAST:event_menuItemAddTreatsActionPerformed

    private void menuItemDeleteTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDeleteTreatmentActionPerformed
        (new DeleteTreats()).setVisible(true);
    }//GEN-LAST:event_menuItemDeleteTreatmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuDoctor;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemAddDoc;
    private javax.swing.JMenuItem menuItemAddPat;
    private javax.swing.JMenuItem menuItemAddTreats;
    private javax.swing.JMenuItem menuItemAddUser;
    private javax.swing.JMenuItem menuItemAddWard;
    private javax.swing.JMenuItem menuItemDeleteTreatment;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemLogout;
    private javax.swing.JMenuItem menuItemUpdDelDoc;
    private javax.swing.JMenuItem menuItemUpdDelPat;
    private javax.swing.JMenuItem menuItemUpdDelUser;
    private javax.swing.JMenuItem menuItemUpdDelWard;
    private javax.swing.JMenu menuPatient;
    private javax.swing.JMenu menuTreats;
    private javax.swing.JMenu menuUser;
    private javax.swing.JMenu menuWard;
    // End of variables declaration//GEN-END:variables
}
