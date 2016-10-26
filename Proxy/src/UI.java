/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//package fileloaderproxy;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author George
 */
public class UI extends Frame{

    private TextArea ta;

    public UI(){
        setSize(640,320);
        ta=new TextArea(25,80);
        add(ta, BorderLayout.CENTER);
        Button open=new Button("Browse for file");
        add(open, BorderLayout.SOUTH);
        open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OpenFile();
            }
        });


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        setVisible(true);

    }

    public void OpenFile(){
        FileDialog fdlg=new FileDialog(this, "Browse for a text file");
        fdlg.setModal(true);
        fdlg.setVisible(true);
        String fnm=fdlg.getDirectory() + fdlg.getFile();
        FileLoader f=new FileLoader(fnm);
        ta.setText(f.readFile());
    }
        
}
