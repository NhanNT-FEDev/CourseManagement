/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import ui.MyTool;

/**
 *
 * @author Trung Nhan
 */
public class NormalForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a  = "abc asdasdasdasdasd HHHJHJJJHH";
        String done = "";
        MyTool cl = new MyTool();
        cl.normalFormatString(a);
        ArrayList<String> list = cl.getList();
        for (int i = 0; i < list.size(); i++) {
            done = done + " " + list.get(i);
        }
        System.out.println(done.trim());
    }
    
}
