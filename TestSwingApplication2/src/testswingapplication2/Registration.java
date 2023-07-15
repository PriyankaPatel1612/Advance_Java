
package testswingapplication2;

public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
        registeredMessage.setVisible(false);
        registrationFailedMessage.setVisible(false);
        incorrectMessage.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerPanel = new javax.swing.JPanel();
        lastName = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        ageText = new javax.swing.JTextField();
        genderOption1 = new javax.swing.JRadioButton();
        genderOption2 = new javax.swing.JRadioButton();
        registerButton = new javax.swing.JButton();
        resetRegisterButton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        citySelect = new javax.swing.JComboBox<>();
        registeredMessage = new javax.swing.JLabel();
        incorrectMessage = new javax.swing.JLabel();
        registrationFailedMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registerPanel.setBackground(new java.awt.Color(204, 204, 255));
        registerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N

        lastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lastName.setText("Last Name: ");

        age.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        age.setText("Age: ");

        city.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        city.setText("City:");

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
        resetRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetRegisterButtonActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Password:");

        exitButton.setBackground(new java.awt.Color(255, 0, 0));
        exitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        citySelect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        citySelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Indore", "Bhopal", "Gwalior", "Mumbai", "Delhi", "Pune", "Other" }));

        registeredMessage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registeredMessage.setForeground(new java.awt.Color(255, 0, 51));
        registeredMessage.setText("Registration Successfull!!");

        incorrectMessage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        incorrectMessage.setForeground(new java.awt.Color(255, 0, 51));
        incorrectMessage.setText("Try Again..");

        registrationFailedMessage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registrationFailedMessage.setForeground(new java.awt.Color(255, 0, 0));
        registrationFailedMessage.setText("Registration Failed!!");

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstName)
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(age)
                                .addComponent(lastName)
                                .addComponent(city)
                                .addComponent(jLabel1)
                                .addComponent(gender)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addComponent(genderOption1)
                                .addGap(31, 31, 31)
                                .addComponent(genderOption2))
                            .addComponent(citySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(incorrectMessage)))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addComponent(resetRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(registerButton)
                        .addGap(294, 294, 294))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addComponent(exitButton)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addComponent(registrationFailedMessage)
                        .addGap(71, 71, 71)
                        .addComponent(registeredMessage)
                        .addGap(32, 32, 32))))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registeredMessage)
                    .addComponent(registrationFailedMessage))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(citySelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderOption1)
                    .addComponent(genderOption2))
                .addGap(40, 40, 40)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(resetRegisterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(incorrectMessage)
                .addGap(5, 5, 5)
                .addComponent(exitButton)
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextActionPerformed

    private void lastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextActionPerformed

    private void ageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
 
        String fName = firstNameText.getText();
        System.out.println("Firstname = " + fName);
        String lName = lastNameText.getText();
        System.out.println("Lastname = " + lName);
        String a = ageText.getText();
        System.out.println("Age = " + age);
        char pwd[] = password.getPassword();
        String password = new String(pwd);
        System.out.println("Password = " + password);
        
        if(fName!=null && lName!=null && a!=null && pwd!=null && !fName.trim().equals("")&& !lName.trim().equals("") && !a.trim().equals("") && fName.equals("Priyanka") && lName.equals("Patel") && a.equals("21") && password.equalsIgnoreCase("12345") )
        {
            System.out.println("Registered Successfully");
            registeredMessage.setVisible(true);
        }
        else
        {
            System.out.println("Registration Failed");
            registrationFailedMessage.setVisible(true);
            incorrectMessage.setVisible(true);
            registeredMessage.setVisible(false);
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void resetRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetRegisterButtonActionPerformed

        firstNameText.setText("");
        lastNameText.setText("");
        citySelect.getItemAt(0);
        ageText.setText("");
        password.setText("");
        
        registrationFailedMessage.setVisible(false);
        incorrectMessage.setVisible(false);
        registeredMessage.setVisible(false);
        
    }//GEN-LAST:event_resetRegisterButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JTextField ageText;
    private javax.swing.JLabel city;
    private javax.swing.JComboBox<String> citySelect;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel gender;
    private javax.swing.JRadioButton genderOption1;
    private javax.swing.JRadioButton genderOption2;
    private javax.swing.JLabel incorrectMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel registeredMessage;
    private javax.swing.JLabel registrationFailedMessage;
    private javax.swing.JButton resetRegisterButton;
    // End of variables declaration//GEN-END:variables
}
