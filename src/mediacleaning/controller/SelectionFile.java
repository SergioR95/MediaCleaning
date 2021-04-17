package mediacleaning.controller;

import java.awt.FileDialog;
import java.awt.Frame;

public class SelectionFile {
    private FileDialog dialog;
    private String file;
    private String fileName;
        
    public SelectionFile() {
        this.dialog = new FileDialog((Frame)null, "SelecFileDialog dialogt File to Open");
        this.dialog.setMode(FileDialog.LOAD);
        this.dialog.setVisible(true);
        this.file = dialog.getDirectory();
        this.fileName = dialog.getFile();
    }

    public FileDialog getDialog() {
        return dialog;
    }

    public void setDialog(FileDialog dialog) {
        this.dialog = dialog;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
