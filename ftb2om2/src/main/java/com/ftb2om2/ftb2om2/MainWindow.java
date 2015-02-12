/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftb2om2.ftb2om2;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Ripazhakgggdkp
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        dragAndDrop();
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
        createDifficulty = new javax.swing.JButton();
        createOsuFile = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        audioField = new javax.swing.JTextField();
        BrowseAudio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        outputName = new javax.swing.JTextField();
        outputField = new javax.swing.JTextField();
        difficultyField = new javax.swing.JTextField();
        browseDifficulty = new javax.swing.JButton();
        browseOutput = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        hitsoundVolume = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        unicodeTitleField = new javax.swing.JTextField();
        artistField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        creatorField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        unicodeArtistField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        versionField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        sourceField = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        OldToggle = new javax.swing.JCheckBoxMenuItem();
        About = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Feel The Beats to osu!mania");
        setResizable(false);

        createDifficulty.setText("Create difficulty");
        createDifficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDifficultyActionPerformed(evt);
            }
        });

        createOsuFile.setText("Create Osu! file");
        createOsuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOsuFileActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Required"));

        jLabel4.setText("Audio (.mp3)");

        audioField.setDragEnabled(true);

        BrowseAudio.setText("...");
        BrowseAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseAudioActionPerformed(evt);
            }
        });

        jLabel1.setText("Difficulty (.txt)");

        jLabel2.setText("Output folder");

        jLabel3.setText("Output name");

        outputField.setDragEnabled(true);

        difficultyField.setDragEnabled(true);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(audioField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BrowseAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(difficultyField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(browseDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(outputName, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(outputField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(browseOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(audioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrowseAudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(difficultyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseDifficulty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(browseOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputName))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Extra"));

        jLabel5.setText("Hitsound Volume");

        hitsoundVolume.setModel(new javax.swing.SpinnerNumberModel(100, 0, 100, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hitsoundVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(hitsoundVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("MP3 Tags"));

        jLabel6.setText("Title:");

        jLabel7.setText("Unicode Title:");

        jLabel8.setText("Artist");

        jLabel9.setText("Artist Unicode:");

        jLabel10.setText("Creator:");

        jLabel11.setText("Version (Difficulty) :");

        jLabel12.setText("Source:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(63, 63, 63)
                        .addComponent(sourceField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(artistField, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(unicodeTitleField)
                            .addComponent(titleField)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creatorField)
                            .addComponent(unicodeArtistField)
                            .addComponent(versionField))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(unicodeTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(artistField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(unicodeArtistField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(creatorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(versionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sourceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(createDifficulty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createOsuFile))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createOsuFile)
                    .addComponent(createDifficulty))
                .addContainerGap())
        );

        File.setText("File");

        OldToggle.setText("Use old file format");
        File.add(OldToggle);

        jMenuBar2.add(File);

        About.setText("About");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.jpg"))); // NOI18N
        jMenuItem1.setText(":)");
        About.add(jMenuItem1);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dragAndDrop() {
        audioField.setDropTarget(new DropTarget() {
            public synchronized void drop(DropTargetDropEvent evt) {
                audioFieldDragAndDrop(evt);
            }
        });
        difficultyField.setDropTarget(new DropTarget() {
            public synchronized void drop(DropTargetDropEvent evt) {
                difficultyFieldDragAndDrop(evt);
            }
        });
        outputField.setDropTarget(new DropTarget() {
            public synchronized void drop(DropTargetDropEvent evt) {
                outputFieldDragAndDrop(evt);
            }
        });
    }

    private String getDragAndDropPath(DropTargetDropEvent evt) throws Exception {
        evt.acceptDrop(DnDConstants.ACTION_COPY);
        List<File> droppedFile = (List<File>) evt
                .getTransferable()
                .getTransferData(DataFlavor.javaFileListFlavor);
        return droppedFile.get(0).getAbsolutePath();
    }

    private void handleError(IOException e) {
        if (e.getMessage() == null || e.getMessage().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "File not found!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void fillMetadata(Metadata metadata) {
        metadata.setTitle(titleField.getText());
        metadata.setUnicodeTitle(unicodeTitleField.getText());
        metadata.setArtist(artistField.getText());
        metadata.setUnicodeArtist(unicodeArtistField.getText());
        metadata.setCreator(creatorField.getText());
        metadata.setVersion(versionField.getText());
        metadata.setSource(sourceField.getText());
    }

    private void browseOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseOutputActionPerformed
        PathGetter file = new PathGetter();
        outputField.setText(file.GetPath(true, false, true));
    }//GEN-LAST:event_browseOutputActionPerformed

    private void browseDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseDifficultyActionPerformed

        PathGetter file = new PathGetter();
        difficultyField.setText(file.GetPath(false, false, false));
    }//GEN-LAST:event_browseDifficultyActionPerformed

    private void BrowseAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseAudioActionPerformed
        PathGetter file = new PathGetter();
        String path = file.GetPath(false, true, false);
        audioField.setText(path);
        if (file.isApproved()) {
            autoFill(path);
        }
    }//GEN-LAST:event_BrowseAudioActionPerformed

    private void createOsuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOsuFileActionPerformed
        Converter converter;
        if (OldToggle.getState()) {
            converter = new OsuManiaV13();
        }
        else {
            converter = new OsuManiaV14();            
        }
        
        Metadata metadata = new Metadata();
        fillMetadata(metadata);
        Zipper zip = new Zipper();

        if (outputName.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Your file needs a name!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                converter.Convert(difficultyField.getText(), outputField.getText(), outputName.getText(), (Integer) hitsoundVolume.getModel().getValue(), metadata);
                zip.createOSZ(audioField.getText(), difficultyField.getText(), outputField.getText(), outputName.getText());
                JOptionPane.showMessageDialog(rootPane, "File converted succesfully!", "Success!", JOptionPane.PLAIN_MESSAGE);
                Path path = FileSystems.getDefault().getPath(outputField.getText(), outputName.getText()+".osu");
                Files.deleteIfExists(path);
            } catch (IOException e) {
                handleError(e);
            }
        }
    }//GEN-LAST:event_createOsuFileActionPerformed

    private void createDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDifficultyActionPerformed
        Converter converter;
        if (OldToggle.getState()) {
            converter = new OsuManiaV13();
        }
        else {
            converter = new OsuManiaV14();            
        }
        
        Metadata metadata = new Metadata();
        fillMetadata(metadata);
        
        if (outputName.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Your file needs a name!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {            
            try {
                converter.Convert(difficultyField.getText(), outputField.getText(), outputName.getText(), (Integer) hitsoundVolume.getModel().getValue(), metadata);
                JOptionPane.showMessageDialog(rootPane, "Difficulty created succesfully!", "Success!", JOptionPane.PLAIN_MESSAGE);
            } catch (IOException e) {
                handleError(e);
            }
        }
    }//GEN-LAST:event_createDifficultyActionPerformed

    private void audioFieldDragAndDrop(DropTargetDropEvent evt) {
        try {
            audioField.setText(getDragAndDropPath(evt));
            autoFill(audioField.getText());
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void difficultyFieldDragAndDrop(DropTargetDropEvent evt) {
        try {
            difficultyField.setText(getDragAndDropPath(evt));
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void outputFieldDragAndDrop(DropTargetDropEvent evt) {
        try {
            outputField.setText(getDragAndDropPath(evt));
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void autoFill(String path) {
        MP3TagWrapper mp3 = new MP3TagWrapper();
        try {
            mp3.fillTags(path);
        } catch (IOException | InvalidDataException ex) {
            JOptionPane.showMessageDialog(rootPane, "Your file isn't an mp3!", "Unexpected File", JOptionPane.PLAIN_MESSAGE);
        } catch (UnsupportedTagException ex) {
            JOptionPane.showMessageDialog(rootPane, "Your selected mp3 has unsupported tags, autofill won't work!", "Unsupported Tags!", JOptionPane.PLAIN_MESSAGE);
        } finally {
            titleField.setText(mp3.getTitle());
            unicodeTitleField.setText(mp3.getUnicodeTitle());
            artistField.setText(mp3.getArtist());
            unicodeArtistField.setText(mp3.getUnicodeArtist());
        }
    }

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
    private javax.swing.JMenu File;
    private javax.swing.JCheckBoxMenuItem OldToggle;
    private javax.swing.JTextField artistField;
    private javax.swing.JTextField audioField;
    private javax.swing.JButton browseDifficulty;
    private javax.swing.JButton browseOutput;
    private javax.swing.JButton createDifficulty;
    private javax.swing.JButton createOsuFile;
    private javax.swing.JTextField creatorField;
    private javax.swing.JTextField difficultyField;
    private javax.swing.JSpinner hitsoundVolume;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField outputField;
    private javax.swing.JTextField outputName;
    private javax.swing.JTextField sourceField;
    private javax.swing.JTextField titleField;
    private javax.swing.JTextField unicodeArtistField;
    private javax.swing.JTextField unicodeTitleField;
    private javax.swing.JTextField versionField;
    // End of variables declaration//GEN-END:variables
}
