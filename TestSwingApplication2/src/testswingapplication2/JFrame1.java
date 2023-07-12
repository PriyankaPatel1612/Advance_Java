
package testswingapplication2;

public class JFrame1 extends javax.swing.JFrame {

    public JFrame1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        passwordText = new javax.swing.JTextField();
        userNameText = new javax.swing.JTextField();
        resetLoginButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        registerPanel = new javax.swing.JPanel();
        lastName = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        cityText = new javax.swing.JTextField();
        ageText = new javax.swing.JTextField();
        genderOption1 = new javax.swing.JRadioButton();
        genderOption2 = new javax.swing.JRadioButton();
        registerButton = new javax.swing.JButton();
        resetRegisterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setBackground(new java.awt.Color(204, 204, 204));
        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 0, 51))); // NOI18N

        userName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userName.setText("Username: ");

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password.setText("Password: ");

        passwordText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });

        userNameText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextActionPerformed(evt);
            }
        });

        resetLoginButton.setBackground(new java.awt.Color(0, 153, 255));
        resetLoginButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        resetLoginButton.setText("Reset");
        resetLoginButton.setActionCommand("Reset");
        resetLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetLoginButtonActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(0, 153, 255));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(resetLoginButton)
                        .addGap(40, 40, 40)
                        .addComponent(loginButton))
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetLoginButton)
                    .addComponent(loginButton))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        registerPanel.setBackground(new java.awt.Color(204, 204, 255));
        registerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 102, 255))); // NOI18N

        lastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lastName.setText("Last Name: ");

        age.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        age.setText("Age: ");

        city.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        city.setText(" City:");

        gender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gender.setText("Gender:");

        firstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstName.setText("First Name: ");

        firstNameText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });

        lastNameText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextActionPerformed(evt);
            }
        });

        cityText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextActionPerformed(evt);
            }
        });

        ageText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextActionPerformed(evt);
            }
        });

        genderOption1.setBackground(new java.awt.Color(204, 204, 255));
        genderOption1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        genderOption1.setSelected(true);
        genderOption1.setText("Male");

        genderOption2.setBackground(new java.awt.Color(204, 204, 255));
        genderOption2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        genderOption2.setText("Female");

        registerButton.setBackground(new java.awt.Color(0, 0, 255));
        registerButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.setActionCommand("Login");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        resetRegisterButton.setBackground(new java.awt.Color(0, 0, 255));
        resetRegisterButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetRegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        resetRegisterButton.setText("Reset");

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPanelLayout.createSequentialGroup()
                        .addComponent(firstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age)
                                    .addComponent(lastName)
                                    .addComponent(city)
                                    .addComponent(gender))
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(registerPanelLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(registerPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(registerPanelLayout.createSequentialGroup()
                                                .addComponent(genderOption1)
                                                .addGap(31, 31, 31)
                                                .addComponent(genderOption2)))))
                                .addGap(334, 334, 334))
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addComponent(registerButton)
                                .addGap(324, 324, 324))))))
            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerPanelLayout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(resetRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(459, Short.MAX_VALUE)))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderOption1)
                    .addComponent(genderOption2))
                .addGap(39, 39, 39)
                .addComponent(registerButton)
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                    .addContainerGap(317, Short.MAX_VALUE)
                    .addComponent(resetRegisterButton)
                    .addGap(173, 173, 173)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void userNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextActionPerformed

    private void resetLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetLoginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetLoginButtonActionPerformed

    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextActionPerformed

    private void lastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextActionPerformed

    private void cityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextActionPerformed

    private void ageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JTextField ageText;
    private javax.swing.JLabel city;
    private javax.swing.JTextField cityText;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel gender;
    private javax.swing.JRadioButton genderOption1;
    private javax.swing.JRadioButton genderOption2;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel password;
    private javax.swing.JTextField passwordText;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JButton resetLoginButton;
    private javax.swing.JButton resetRegisterButton;
    private javax.swing.JLabel userName;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}
