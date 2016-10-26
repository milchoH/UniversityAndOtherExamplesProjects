/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package upr4Proxy1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author George
 */
public class FileLoader implements TextFileReader{
    File f;
    public FileLoader(String fname){
        f=new File(fname);
    }
    public String readFile(){
        InputStream is=null;
        try {
            is = new FileInputStream(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        byte buf[]=new byte[(int)f.length()];
        try {
            is.read(buf, 0, buf.length);
        } catch (IOException ex) {
            Logger.getLogger(FileLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new String(buf);

    }


}
