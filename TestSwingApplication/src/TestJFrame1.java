
import java.awt.Color;


public class TestJFrame1 extends javax.swing.JFrame {

    public TestJFrame1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lowerPanel = new javax.swing.JPanel();
        upperPanel = new javax.swing.JPanel();
        message1 = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lowerPanel.setBackground(new java.awt.Color(204, 255, 255));
        lowerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lower Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        lowerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lowerPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lowerPanelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout lowerPanelLayout = new javax.swing.GroupLayout(lowerPanel);
        lowerPanel.setLayout(lowerPanelLayout);
        lowerPanelLayout.setHorizontalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        lowerPanelLayout.setVerticalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        upperPanel.setBackground(new java.awt.Color(204, 204, 255));
        upperPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Upper Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(153, 0, 0))); // NOI18N
        upperPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                upperPanelMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                upperPanelMouseMoved(evt);
            }
        });
        upperPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upperPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                upperPanelMouseExited(evt);
            }
        });

        message1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        message1.setText("Hello");
        message1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                message1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                message1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                message1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                message1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                message1MouseReleased(evt);
            }
        });

        message2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout upperPanelLayout = new javax.swing.GroupLayout(upperPanel);
        upperPanel.setLayout(upperPanelLayout);
        upperPanelLayout.setHorizontalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(message1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(message2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        upperPanelLayout.setVerticalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(message1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(message2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(upperPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(upperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upperPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upperPanelMouseEntered
        upperPanel.setBackground(Color.red);
    }//GEN-LAST:event_upperPanelMouseEntered

    private void upperPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upperPanelMouseExited
        upperPanel.setBackground(Color.cyan);
    }//GEN-LAST:event_upperPanelMouseExited

    private void lowerPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowerPanelMouseEntered
        lowerPanel.setBackground(Color.green);
    }//GEN-LAST:event_lowerPanelMouseEntered

    private void lowerPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowerPanelMouseExited
        lowerPanel.setBackground(Color.pink);
    }//GEN-LAST:event_lowerPanelMouseExited

    private void message1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_message1MousePressed
        message1.setText("mouse pressed");
    }//GEN-LAST:event_message1MousePressed

    private void message1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_message1MouseReleased
        message1.setText("mouse released");
    }//GEN-LAST:event_message1MouseReleased

    private void message1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_message1MouseExited
        message1.setText("mouse exited");
    }//GEN-LAST:event_message1MouseExited

    private void upperPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upperPanelMouseMoved
        message2.setText("Mouse moving at" + evt.getX()+ " and at " + evt.getY());
    }//GEN-LAST:event_upperPanelMouseMoved

    private void message1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_message1MouseEntered
        message1.setText("Mouse Entered");
    }//GEN-LAST:event_message1MouseEntered

    private void message1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_message1MouseClicked
        message1.setText("Mouse Exited");
    }//GEN-LAST:event_message1MouseClicked

    private void upperPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upperPanelMouseDragged
       message2.setText("Mouse dragging at" + evt.getX()+ " and at " + evt.getY());
    }//GEN-LAST:event_upperPanelMouseDragged

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel lowerPanel;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel message2;
    private javax.swing.JPanel upperPanel;
    // End of variables declaration//GEN-END:variables
}
