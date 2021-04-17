package mediacleaning.controller.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GetList {
    private FileReader file;
    private BufferedReader writeFile; 
    private ArrayList<String> listID;
    
    public GetList(String address) throws FileNotFoundException, IOException {
        this.file = new FileReader (address);
        this.writeFile = new BufferedReader (getFile());
        this.listID = new ArrayList<String> ();
        this.saveList();
    }

    private void saveList() throws IOException {
        String linha = getWriteFile().readLine(); 
        while (linha != null) {
            getListID().add(linha);
            linha = getWriteFile().readLine();
        }
    }
    
    public FileReader getFile() {
        return this.file;
    }

    public void setFile(FileReader file) {
        this.file = file;
    }

    public BufferedReader getWriteFile() {
        return writeFile;
    }

    public void setWriteFile(BufferedReader writeFile) {
        this.writeFile = writeFile;
    }

    public ArrayList<String> getListID() {
        return listID;
    }

    public void setListID(ArrayList<String> listID) {
        this.listID = listID;
    }
    
}