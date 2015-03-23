/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftb2om2.ftb2om2;

import com.ftb2om2.model.Difficulty;
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
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author Jamil
 */
public class MultiplePane extends javax.swing.JPanel implements java.beans.Customizer {

    private Object bean;

    /**
     * Creates new customizer MultiplePane
     */
    public MultiplePane() {
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

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        audioFieldMulti = new javax.swing.JTextField();
        BrowseAudio1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        outputFolder = new javax.swing.JTextField();
        BrowseAudio2 = new javax.swing.JButton();
        createDifficulties = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        difficultyTable = new javax.swing.JTable();
        addDifficulty = new javax.swing.JButton();
        removeDifficulty = new javax.swing.JButton();
        mP3TagsPane1 = new com.ftb2om2.ftb2om2.MP3TagsPane();
        createOsuFile = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        hitsoundVolume = new javax.swing.JSpinner();

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Required"));

        jLabel13.setText("Audio (.mp3)");

        audioFieldMulti.setDragEnabled(true);

        BrowseAudio1.setText("...");
        BrowseAudio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseAudio1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Output Folder");

        outputFolder.setDragEnabled(true);

        BrowseAudio2.setText("...");
        BrowseAudio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseAudio2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(audioFieldMulti)
                    .addComponent(outputFolder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BrowseAudio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrowseAudio2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel14))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(audioFieldMulti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(BrowseAudio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrowseAudio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        createDifficulties.setText("Create Difficulties");
        createDifficulties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDifficultiesActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Difficulties"));
        jPanel7.setMinimumSize(new java.awt.Dimension(83, 190));

        difficultyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Path", "Output Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        difficultyTable.setToolTipText("");
        difficultyTable.setDragEnabled(true);
        jScrollPane1.setViewportView(difficultyTable);

        addDifficulty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add-New-24.png"))); // NOI18N
        addDifficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDifficultyActionPerformed(evt);
            }
        });

        removeDifficulty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Minus-24.png"))); // NOI18N
        removeDifficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDifficultyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(addDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addDifficulty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeDifficulty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        createOsuFile.setText("Create Osu! File");
        createOsuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOsuFileActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mP3TagsPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(createDifficulties)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(createOsuFile)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mP3TagsPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createDifficulties)
                    .addComponent(createOsuFile))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dragAndDrop() {
        audioFieldMulti.setDropTarget(new DropTarget() {
            public synchronized void drop(DropTargetDropEvent evt) {
                audioFieldDragAndDrop(evt);
            }
        });
        jScrollPane1.setDropTarget(new DropTarget() {
            public synchronized void drop(DropTargetDropEvent evt) {
                difficultyTableDragAndDrop(evt);
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
            JOptionPane.showMessageDialog(jPanel6, "File not found!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(jPanel6, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void audioFieldDragAndDrop(DropTargetDropEvent evt) {
        try {
            audioFieldMulti.setText(getDragAndDropPath(evt));
            autoFill(audioFieldMulti.getText());
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void difficultyTableDragAndDrop(DropTargetDropEvent evt) {
        try {
            DefaultTableModel model = (DefaultTableModel) difficultyTable.getModel();
            evt.acceptDrop(DnDConstants.ACTION_COPY);
            List<File> droppedFile = (List<File>) evt
                .getTransferable()
                .getTransferData(DataFlavor.javaFileListFlavor);
            droppedFile.forEach(file -> 
                    model.addRow(new Object[]{file.getName(), file.getPath(),FilenameUtils.getBaseName(file.getPath())}));
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);            
        }
    }

    private void autoFill(String path) {
        MP3TagWrapper mp3 = new MP3TagWrapper();
        try {
            mp3.fillTags(path);
        } catch (IOException | InvalidDataException ex) {
            JOptionPane.showMessageDialog(jPanel6, "Your file isn't an mp3!", "Unexpected File", JOptionPane.PLAIN_MESSAGE);
        } catch (UnsupportedTagException ex) {
            JOptionPane.showMessageDialog(jPanel6, "Your selected mp3 has unsupported tags, autofill won't work!", "Unsupported Tags!", JOptionPane.PLAIN_MESSAGE);
        } finally {
            mP3TagsPane1.setTags(mp3.getArtist(), "", "", mp3.getTitle(), mp3.getUnicodeArtist(), mp3.getUnicodeTitle(), "");
        }
    }

    private void BrowseAudio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseAudio1ActionPerformed
        PathGetter file = new PathGetter();
        String path = file.GetPath(false, true, false);
        audioFieldMulti.setText(path);
        if (file.isApproved()) {
            autoFill(path);
        }
    }//GEN-LAST:event_BrowseAudio1ActionPerformed

    private void BrowseAudio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseAudio2ActionPerformed
        PathGetter file = new PathGetter();
        outputFolder.setText(file.GetPath(false, false, true));
    }//GEN-LAST:event_BrowseAudio2ActionPerformed

    private void createDifficultiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDifficultiesActionPerformed

        Converter converter;
        Reader ftbReader = new FtbAirReader();
        Writer osuManiaV14Writer = new OsuManiaV14Writer();
        converter = new Converter(ftbReader, osuManiaV14Writer);

        Metadata metadata = new Metadata(mP3TagsPane1.getTitleField(),
                mP3TagsPane1.getUnicodeTitleField(),
                mP3TagsPane1.getArtistField(),
                mP3TagsPane1.getUnicodeArtistField(),
                mP3TagsPane1.getCreatorField(),
                mP3TagsPane1.getSourceField());

        DefaultTableModel model = (DefaultTableModel) difficultyTable.getModel();
        List<List<Object>> data = model.getDataVector();

        Boolean valid = true;

        for (List row : data) {
            if (row.get(2).toString().isEmpty() && valid == true) {
                JOptionPane.showMessageDialog(jPanel6, "Difficulty " + row.get(1).toString() + " Has no output name!", "Error", JOptionPane.ERROR_MESSAGE);
                valid = false;
            }
        }

        if (valid) {
            try {
                for (List row : data) {
                    converter.Convert(row.get(1).toString(),
                            outputFolder.getText(),
                            row.get(2).toString(),
                            Integer.parseInt(hitsoundVolume.getModel().getValue().toString()),
                            metadata);
                }
                JOptionPane.showMessageDialog(jPanel6, "Difficulty created succesfully!", "Success!", JOptionPane.PLAIN_MESSAGE);
            } catch (IOException e) {
                handleError(e);
            }
        }
    }//GEN-LAST:event_createDifficultiesActionPerformed

    private void addDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDifficultyActionPerformed
        PathGetter file = new PathGetter();
        String name = file.GetPath(false, false, false);
        if (name != null) {
            File fileName = new File(name);
            DefaultTableModel model = (DefaultTableModel) difficultyTable.getModel();
            model.addRow(new Object[]{fileName.getName(), name, FilenameUtils.removeExtension(fileName.getName())});
        }
    }//GEN-LAST:event_addDifficultyActionPerformed

    private void removeDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDifficultyActionPerformed
        int[] rows = difficultyTable.getSelectedRows();

        DefaultTableModel model = (DefaultTableModel) difficultyTable.getModel();
        Arrays.sort(rows);
        for (int i = rows.length - 1; i >= 0; i--) {
            model.removeRow(rows[i]);
            model.fireTableRowsDeleted(rows[i], rows[i]);
        }
    }//GEN-LAST:event_removeDifficultyActionPerformed

    private void createOsuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOsuFileActionPerformed
        Converter converter;
        Reader ftbReader = new FtbAirReader();
        Writer osuManiaV14Writer = new OsuManiaV14Writer();
        converter = new Converter(ftbReader, osuManiaV14Writer);

        Metadata metadata = new Metadata(mP3TagsPane1.getTitleField(),
                mP3TagsPane1.getUnicodeTitleField(),
                mP3TagsPane1.getArtistField(),
                mP3TagsPane1.getUnicodeArtistField(),
                mP3TagsPane1.getCreatorField(),
                mP3TagsPane1.getSourceField());

        DefaultTableModel model = (DefaultTableModel) difficultyTable.getModel();
        List<List<Object>> data = model.getDataVector();

        Boolean valid = true;

        for (List row : data) {
            if (row.get(2).toString().isEmpty() && valid == true) {
                JOptionPane.showMessageDialog(jPanel6,
                        "Difficulty " + row.get(1).toString() + " Has no output name!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                valid = false;
            }
        }

        if (valid) {
            try {
                List<Difficulty> difficulties = new LinkedList<>();
                Zipper zipper = new Zipper();
                for (List row : data) {
                    converter.Convert(row.get(1).toString(),
                            outputFolder.getText(),
                            row.get(2).toString(),
                            Integer.parseInt(hitsoundVolume.getValue().toString()),
                            metadata);
                    
                    difficulties.add(new Difficulty(row.get(2).toString(),
                            outputFolder.getText(),
                            row.get(2).toString()));
                }
                zipper.createOSZ(audioFieldMulti.getText(), outputFolder.getText(), difficulties);

                JOptionPane.showMessageDialog(jPanel6,
                        "Difficulties created succesfully!", "Success!",
                        JOptionPane.PLAIN_MESSAGE);
            } catch (IOException e) {
                handleError(e);
            }
        }
    }//GEN-LAST:event_createOsuFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseAudio1;
    private javax.swing.JButton BrowseAudio2;
    private javax.swing.JButton addDifficulty;
    private javax.swing.JTextField audioFieldMulti;
    private javax.swing.JButton createDifficulties;
    private javax.swing.JButton createOsuFile;
    private javax.swing.JTable difficultyTable;
    private javax.swing.JSpinner hitsoundVolume;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private com.ftb2om2.ftb2om2.MP3TagsPane mP3TagsPane1;
    private javax.swing.JTextField outputFolder;
    private javax.swing.JButton removeDifficulty;
    // End of variables declaration//GEN-END:variables
}
