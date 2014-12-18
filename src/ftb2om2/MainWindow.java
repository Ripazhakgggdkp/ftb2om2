/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftb2om2;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Jamil
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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
        jLabel1 = new javax.swing.JLabel();
        difficultyField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        outputField = new javax.swing.JTextField();
        browseDifficulty = new javax.swing.JButton();
        browseOutput = new javax.swing.JButton();
        createDifficulty = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        audioField = new javax.swing.JTextField();
        BrowseAudio = new javax.swing.JButton();
        createOsuFile = new javax.swing.JButton();
        outputName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        About = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Feel The Beats to osu!mania");
        setResizable(false);

        jLabel1.setText("Difficulty (.txt)");

        difficultyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Output folder");

        browseDifficulty.setText("...");
        browseDifficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseDifficultyActionPerformed(evt);
            }
        });

        browseOutput.setText("...");
        browseOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseOutputActionPerformed(evt);
            }
        });

        createDifficulty.setText("Create difficulty");
        createDifficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDifficultyActionPerformed(evt);
            }
        });

        jLabel4.setText("Audio (.mp3)");

        audioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audioFieldActionPerformed(evt);
            }
        });

        BrowseAudio.setText("...");
        BrowseAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseAudioActionPerformed(evt);
            }
        });

        createOsuFile.setText("Create Osu! file");
        createOsuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOsuFileActionPerformed(evt);
            }
        });

        jLabel3.setText("Output name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(outputName)
                    .addComponent(audioField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(difficultyField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputField, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(browseDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(browseOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BrowseAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createDifficulty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createOsuFile)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(audioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrowseAudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(difficultyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseDifficulty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputField)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(browseOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputName))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createDifficulty)
                    .addComponent(createOsuFile))
                .addContainerGap())
        );

        About.setText("About");

        jMenuItem2.setForeground(new java.awt.Color(153, 153, 153));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon.jpg"))); // NOI18N
        jMenuItem2.setText(":)");
        jMenuItem2.setIconTextGap(0);
        jMenuItem2.setInheritsPopupMenu(true);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        About.add(jMenuItem2);

        jMenuBar2.add(About);

        setJMenuBar(jMenuBar2);

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

    private void handleError(IOException e) {
        if (e.getMessage() == null || e.getMessage().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "File not found!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void difficultyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyFieldActionPerformed

    }//GEN-LAST:event_difficultyFieldActionPerformed

    private void browseDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseDifficultyActionPerformed

        PathGetter file = new PathGetter();
        file.GetPath(difficultyField, false, false, false);
    }//GEN-LAST:event_browseDifficultyActionPerformed

    private void browseOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseOutputActionPerformed
        PathGetter file = new PathGetter();
        file.GetPath(outputField, true, false, true);
    }//GEN-LAST:event_browseOutputActionPerformed

    private void createDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDifficultyActionPerformed
        if (outputName.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Your file needs a name!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Converter converter = new Converter();
            try {
                converter.Convert(difficultyField.getText(), outputField.getText(), outputName.getText());
                JOptionPane.showMessageDialog(rootPane, "Difficulty created succesfully!", "Success!", JOptionPane.PLAIN_MESSAGE);
            } catch (IOException e) {
                handleError(e);
            }
        }
    }//GEN-LAST:event_createDifficultyActionPerformed

    private void audioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_audioFieldActionPerformed

    private void BrowseAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseAudioActionPerformed
        PathGetter file = new PathGetter();
        file.GetPath(audioField, false, true, false);
    }//GEN-LAST:event_BrowseAudioActionPerformed

    private void createOsuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOsuFileActionPerformed
        Converter converter = new Converter();
        Zipper zip = new Zipper();

        if (outputName.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Your file needs a name!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                converter.Convert(difficultyField.getText(), outputField.getText(), outputName.getText());
                JOptionPane.showMessageDialog(rootPane, "File converted succesfully!", "Success!", JOptionPane.PLAIN_MESSAGE);
                zip.createOSZ(audioField.getText(), difficultyField.getText(), outputField.getText(), outputName.getText());
            } catch (IOException e) {
                handleError(e);
            }
        }
    }//GEN-LAST:event_createOsuFileActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        // Tries to set look and feel to windows
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JButton BrowseAudio;
    private javax.swing.JTextField audioField;
    private javax.swing.JButton browseDifficulty;
    private javax.swing.JButton browseOutput;
    private javax.swing.JButton createDifficulty;
    private javax.swing.JButton createOsuFile;
    private javax.swing.JTextField difficultyField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField outputField;
    private javax.swing.JTextField outputName;
    // End of variables declaration//GEN-END:variables
}
