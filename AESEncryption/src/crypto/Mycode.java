/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Sanduni Geethma
 */
public class Mycode {
    private Formatter x;
    
    public void openFile(){
	try{
            x = new Formatter("logfile.txt");
            JOptionPane.showMessageDialog(null, "Created a logfile");
	}
	catch(Exception e){
            System.out.println("ERROR");
	}
    }
    public void addRecord(String key){
        x.format("%s", key);
    }
    public void closeFile(){
        x.close();
    }
}
