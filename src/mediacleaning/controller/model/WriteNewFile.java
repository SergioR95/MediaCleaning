package mediacleaning.controller.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class WriteNewFile {
    private FileWriter file;
    private PrintWriter saveFile;
    private ArrayList <String> list;
    private GregorianCalendar calendar = new GregorianCalendar();
    private int dia;
    private int mes;
    private int hour;
    private int minute;
    
    public WriteNewFile (ArrayList <String> listID) throws IOException {
        this.list = listID;
        this.dia = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        this.mes = calendar.get(GregorianCalendar.MONTH);
        this.hour = calendar.get(GregorianCalendar.HOUR_OF_DAY);
        this.minute = calendar.get(GregorianCalendar.MINUTE);
        this.file = new FileWriter("Apagao " + this.dia + " " + this.mes + " " + this.hour + "h" + this.minute + ".mjl");
        this.saveFile = new PrintWriter(this.file);
        this.write();
        file.close();
    }
    
    private void write(){
        this.saveFile.printf("<?xml version=\"1.0\" encoding=\"UTF-8\"?><marinaJobList version=\"3.0\"><jobList>\n");
        for(int i = 0; i < this.list.size(); i++) {
            this.saveFile.printf("<job type=\"Delete\" enabled=\"true\" timerMarker=\"false\" uid=\"-1\"><properties><media mediaType=\"Video\" mediaName=\"" + this.list.get(i) + "\"><mediaInstances><mediaInstance directory=\"V:/default\" directoryId=\"100\" mediaSetName=\"SVR1\"/></mediaInstances></media><delete confirmed=\"false\"/><progress percentComplete=\"0\"/></properties></job>\n");
        }
        this.saveFile.printf("</jobList></marinaJobList>");
    }
}
