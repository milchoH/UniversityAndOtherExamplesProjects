/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package upr3Adapter1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 *
 * @author George
 */
public class Win extends Frame{
    Adapter ilist;
    Adapter olist;
    public Win(){
        setSize(320,400);
        ilist = new Adapter();
        olist = new Adapter();
        add(ilist,BorderLayout.WEST);
        add(olist,BorderLayout.EAST);
        Button btn = new Button(">");
        add(btn,BorderLayout.SOUTH);

        btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                moveItem();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        fillList();

        setVisible(true);


    }

    void fillList(){
        String names[]={"John", "Mary", "Steve", "Ann", "Vick"};
        for (int i=0;i<names.length;i++)
            ilist.add(names[i]);
        ilist.setMultipleMode(false);

    }

    void moveItem(){
        int numitems=ilist.getItemCount();
        for (int i=0;i<numitems;i++){
            if (ilist.isIndexSelected(i)){
                olist.add(ilist.getItem(i));
                ilist.remove(i);
            }
        }
    }

}
