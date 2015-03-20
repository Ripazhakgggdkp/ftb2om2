/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftb2om2.ftb2om2;

import com.ftb2om2.model.Metadata;
import com.ftb2om2.util.PathGetter;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ripazhakgggdkp
 */
public class MultiplePane extends javax.swing.JPanel implements java.beans.Customizer {

    private Object bean;

    /**
     * Creates new customizer MultiplePane
     */
    public MultiplePane() {
        initComponents();
    }

    public void setObject(Object bean) {
        this.bean = bean;
    }

    /*private void fillMetadata(Metadata metadata) {
     metadata.setTitle(titleField.getText());
     metadata.setUnicodeTitle(unicodeTitleField.getText());
     metadata.setArtist(artistField.getText());
     metadata.setUnicodeArtist(unicodeArtistField.getText());
     metadata.setCreator(creatorField.getText());
     metadata.setVersion(versionField.getText());
     metadata.setSource(sourceField.getText());
     }*/
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
        outputName2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        BrowseAudio3 = new javax.swing.JButton();
        createDifficulties = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        difficultyTable = new javax.swing.JTable();
        addDifficulty = new javax.swing.JButton();
        removeDifficulty = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

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

        outputName2.setDragEnabled(true);

        jLabel15.setText("Output Name");

        BrowseAudio3.setText("...");
        BrowseAudio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseAudio3ActionPerformed(evt);
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
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(outputName2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BrowseAudio3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(audioFieldMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BrowseAudio1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addComponent(outputFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BrowseAudio2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(BrowseAudio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BrowseAudio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outputFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(audioFieldMulti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(BrowseAudio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        createDifficulties.setText("Create Difficulties");
        createDifficulties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDifficultiesActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Difficulties"));

        difficultyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Path", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        difficultyTable.setToolTipText("");
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
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addDifficulty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeDifficulty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(createDifficulties)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(createDifficulties)
                .addContainerGap())
        );

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseAudio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseAudio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrowseAudio1ActionPerformed

    private void BrowseAudio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseAudio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrowseAudio2ActionPerformed

    private void BrowseAudio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseAudio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrowseAudio3ActionPerformed

    private void createDifficultiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDifficultiesActionPerformed
        
        Converter converter;
        Reader ftbReader = new FtbAirReader();
        Writer osuManiaV13Writer = new OsuManiaV13Writer();
        converter = new Converter(ftbReader, osuManiaV13Writer);

        Metadata metadata = new Metadata();
        //fillMetadata(metadata);

        if (outputName2.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(jPanel6, "Your file needs a name!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                DefaultTableModel model = (DefaultTableModel) difficultyTable.getModel();
                List<List<Object>> data = model.getDataVector();

                for (List row : data) {
                    converter.Convert(row.get(1).toString(), outputFolder.getText(), outputName2.getText(), 100 /*hitsoundmodel*/, metadata);
                }
                JOptionPane.showMessageDialog(jPanel6, "Difficulty created succesfully!", "Success!", JOptionPane.PLAIN_MESSAGE);
            } catch (IOException e) {
                //handleError(e);
            }
        }
    }//GEN-LAST:event_createDifficultiesActionPerformed

    private void addDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDifficultyActionPerformed
        PathGetter file = new PathGetter();
        String name = file.GetPath(false, false, false);
        File fileName = new File(name);

        DefaultTableModel model = (DefaultTableModel) difficultyTable.getModel();

        model.addRow(new Object[]{fileName.getName(), name, "Not Converted"});
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseAudio1;
    private javax.swing.JButton BrowseAudio2;
    private javax.swing.JButton BrowseAudio3;
    private javax.swing.JButton addDifficulty;
    private javax.swing.JTextField audioFieldMulti;
    private javax.swing.JButton createDifficulties;
    private javax.swing.JTable difficultyTable;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField outputFolder;
    private javax.swing.JTextField outputName2;
    private javax.swing.JButton removeDifficulty;
    // End of variables declaration//GEN-END:variables
}