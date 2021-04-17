package mediacleaning.controller;

import java.io.IOException;
import java.util.ArrayList;
import mediacleaning.controller.model.GetList;
import mediacleaning.controller.model.WriteNewFile;

public class Facade {
    private SelectionFile fileTXT;
    private ArrayList<String> listID;
    private GetList list;
    private WriteNewFile write;
    
    public Facade () { 
        this.fileTXT = new SelectionFile ();
        this.listID = new ArrayList<String>();
    }
    
    public String getAddress () {
        return fileTXT.getFile() + fileTXT.getFileName();
    }

    public void setListID (String address) throws IOException {
        this.list = new GetList(address);
        this.listID = this.list.getListID();
    }
    
    public void writeNewFile() throws IOException {
        write = new WriteNewFile (this.listID);
    }
    
    public ArrayList<String> getListID () {
        return this.listID;
    }
}