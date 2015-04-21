public class Rules extends javax.swing.JFrame {

    public Rules() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rules", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("The computer selects a secret combination of 4 pegs. \nYour aim is to guess the combination, in the same order, in 6/10 tries to win.\nHow to play?\n1.) Only colors-\nFor each of the computer's 4 peg positions, it has chosen from 6 possible \npeg colors. As repetitions are allowed, you can use a peg color more than \nonce, so the combination could contain anything from 4 different colors \nto 4 of the same color.\nTo create your guess, click on the peg of your choice, from the choices \navailable and place it in the space left for your guess. Do this until you \nhav all your 4 pegs are guessed. Then click the 'submit' button. \nEach time you submit a guess, we will generate hints to let you know how \nclose that guess is:\n~A black dot indicates that one of your pegs is of the right color and at the \nright position.\n~A pink dot indicates that one of the pegs has only the color right but \nposition wrong. \n~Blank indicates tat one of your pegs is not in the final answer.\n\nIf your guess scores 4 black dots within 10 tries, YOU WIN!!\n\n2.) For each of the computer's 4 peg positions, it has chosen from 8 possible \npegs. As repetitions are allowed, you can use a peg more than once, so the \ncombination could contain anything from 4 different pegs to 4 of the same kind.\nTo create your guess, click on the peg of your choice, from the choices available \nand place it in the space left for your guess. Do this until you hav all your 4 pegs \nare guessed. Then click the 'submit' button. \nEach time you submit a guess, we will generate hints to let you know how close \nthat guess is:\n~A green tick indicates that one of your pegs is completely right.\n~A yellow tick indicates that one of your pegs has the right shape and color \nbut the position is wrong.\n~A blank indicates that one of your pegs is not in the final answer.\n\nIf your guess scores 4 green ticks within 10 tries, YOU WIN!!\n\n                 GOOD LUCK!!");
        jScrollPane1.setViewportView(jTextArea1);

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(backButton)
                .add(238, 238, 238))
            .add(layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 530, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 625, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(backButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
   
        StartPage start = new StartPage();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rules().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}