/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftb2om2.ftb2om2;

/**
 *
 * @author Ripazhakgggdkp
 */
import com.ftb2om2.model.Metadata;
import com.ftb2om2.util.MP3TagWrapper;
import com.ftb2om2.util.PathGetter;
import com.ftb2om2.util.Zipper;
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

public class SinglePane extends javax.swing.JPanel implements java.beans.Customizer {

    private Object bean;

    /**
     * Creates new customizer SinglePane
     */
    public SinglePane() {
        initComponents();
        dragAndDrop();
    }

    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        mP3TagsPane1 = new com.ftb2om2.ftb2om2.MP3TagsPane();
        createDifficulty = new javax.swing.JButton();

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
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(audioField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BrowseAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputName)
                            .addComponent(outputField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(browseOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(difficultyField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(browseDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        createDifficulty.setText("Create difficulty");
        createDifficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDifficultyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mP3TagsPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(createDifficulty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(createOsuFile)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mP3TagsPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createOsuFile)
                    .addComponent(createDifficulty, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
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
            JOptionPane.showMessageDialog(jPanel1, "File not found!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(jPanel1, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void fillMetadata(Metadata metadata) {
        metadata.setTitle(mP3TagsPane1.getTitleField());
        metadata.setUnicodeTitle(mP3TagsPane1.getUnicodeTitleField());
        metadata.setArtist(mP3TagsPane1.getArtistField());
        metadata.setUnicodeArtist(mP3TagsPane1.getUnicodeArtistField());
        metadata.setCreator(mP3TagsPane1.getCreatorField());
        metadata.setVersion(mP3TagsPane1.getVersionField());
        metadata.setSource(mP3TagsPane1.getSourceField());
    }

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
            JOptionPane.showMessageDialog(jPanel1, "Your file isn't an mp3!", "Unexpected File", JOptionPane.PLAIN_MESSAGE);
        } catch (UnsupportedTagException ex) {
            JOptionPane.showMessageDialog(jPanel1, "Your selected mp3 has unsupported tags, autofill won't work!", "Unsupported Tags!", JOptionPane.PLAIN_MESSAGE);
        } finally {
            mP3TagsPane1.setTags(mp3.getArtist(), "", "", mp3.getTitle(), mp3.getUnicodeArtist(), mp3.getUnicodeTitle(), "");
        }
    }

    private void createDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDifficultyActionPerformed
        Converter converter;
        Reader ftbReader = new FtbAirReader();
        Writer osuManiaV14Writer = new OsuManiaV14Writer();
        converter = new Converter(ftbReader, osuManiaV14Writer);

        Metadata metadata = new Metadata();
        fillMetadata(metadata);

        if (outputName.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(jPanel1, "Your file needs a name!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                converter.Convert(difficultyField.getText(), outputField.getText(), outputName.getText(), (Integer) hitsoundVolume.getModel().getValue(), metadata);
                JOptionPane.showMessageDialog(jPanel1, "Difficulty created succesfully!", "Success!", JOptionPane.PLAIN_MESSAGE);
            } catch (IOException e) {
                handleError(e);
            }
        }
    }//GEN-LAST:event_createDifficultyActionPerformed

    private void createOsuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOsuFileActionPerformed
        Converter converter;
        if (false) { //TODO: Change to toggle in menubar
            Reader ftbReader = new FtbAirReader();
            Writer osuManiaV13Writer = new OsuManiaV13Writer();
            converter = new Converter(ftbReader, osuManiaV13Writer);
        } else {
            Reader ftbReader = new FtbAirReader();
            Writer osuManiaV14Writer = new OsuManiaV14Writer();
            converter = new Converter(ftbReader, osuManiaV14Writer);
        }

        Metadata metadata = new Metadata();
        fillMetadata(metadata);
        Zipper zip = new Zipper();

        if (outputName.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(jPanel1, "Your file needs a name!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                converter.Convert(difficultyField.getText(), outputField.getText(), outputName.getText(), (Integer) hitsoundVolume.getModel().getValue(), metadata);
                zip.createOSZ(audioField.getText(), difficultyField.getText(), outputField.getText(), outputName.getText());
                JOptionPane.showMessageDialog(jPanel1, "File converted succesfully!", "Success!", JOptionPane.PLAIN_MESSAGE);
                Path path = FileSystems.getDefault().getPath(outputField.getText(), outputName.getText() + ".osu");
                Files.deleteIfExists(path);
            } catch (IOException e) {
                handleError(e);
            }
        }
    }//GEN-LAST:event_createOsuFileActionPerformed

    private void BrowseAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseAudioActionPerformed
        PathGetter file = new PathGetter();
        String path = file.GetPath(false, true, false);
        audioField.setText(path);
        if (file.isApproved()) {
            autoFill(path);
        }
    }//GEN-LAST:event_BrowseAudioActionPerformed

    private void browseDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseDifficultyActionPerformed

        PathGetter file = new PathGetter();
        difficultyField.setText(file.GetPath(false, false, false));
    }//GEN-LAST:event_browseDifficultyActionPerformed

    private void browseOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseOutputActionPerformed
        PathGetter file = new PathGetter();
        outputField.setText(file.GetPath(true, false, true));
    }//GEN-LAST:event_browseOutputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseAudio;
    private javax.swing.JTextField audioField;
    private javax.swing.JButton browseDifficulty;
    private javax.swing.JButton browseOutput;
    private javax.swing.JButton createDifficulty;
    private javax.swing.JButton createOsuFile;
    private javax.swing.JTextField difficultyField;
    private javax.swing.JSpinner hitsoundVolume;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.ftb2om2.ftb2om2.MP3TagsPane mP3TagsPane1;
    private javax.swing.JTextField outputField;
    private javax.swing.JTextField outputName;
    // End of variables declaration//GEN-END:variables
}
