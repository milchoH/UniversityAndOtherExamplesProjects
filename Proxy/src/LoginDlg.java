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
public class LoginDlg extends Dialog{
    private TextField name;
    private TextField pass;
    String sName="";
    String sPass="";
    public LoginDlg(){
        super((Frame)null);
        setLayout(new FlowLayout());
        setSize(280,150);
        add(new Label("Username"));    add(name = new TextField(20));
        add(new Label("Password"));    add(pass = new TextField(20));
        pass.setEchoChar('*');
        Button ok=new Button("OK");
        Button cancel=new Button("Cancel");
        add(ok);add(cancel);
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sName = name.getText();
                sPass = pass.getText();
                dispose();
            }
        });
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sName = "";
                sPass = "";
                dispose();
            }
        });
		setModal(true);
		setVisible(true);
    }

    String getUserName(){
        return sName;
    }

    String getPassword(){
        return sPass;

    }

}
