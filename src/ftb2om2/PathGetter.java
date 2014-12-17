/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftb2om2;

import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ripazhakgggdkp
 */
public class PathGetter extends JFileChooser {

    private static JFileChooser filechooser;

    public void GetPath(JTextField textField, boolean saveDialog, boolean mp3, boolean directory) {
        filechooser = new JFileChooser();
        FileNameExtensionFilter filter;

        if (mp3) {
            filter = new FileNameExtensionFilter(".mp3", "mp3");
        } else {
            filter = new FileNameExtensionFilter("FTB Difficulty", "txt");
        }
        if (directory) {
            filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        } else {
            filechooser.setFileFilter(filter);
        }

        int status;

        if (saveDialog == true) {
            status = filechooser.showSaveDialog(this);
        } else {
            status = filechooser.showOpenDialog(this);
        }

        if (status == JFileChooser.APPROVE_OPTION) {
            textField.setText(filechooser.getSelectedFile().getAbsoluteFile().toString());
        }
    }
}
