/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import data.Course;
import java.util.ArrayList;

/**
 *
 * @author Trung Nhan
 */
public class MyTool {
    private ArrayList<String> list = new ArrayList();

    public ArrayList<String> getList() {
        return list;
    }
    
    
    public String upperCaseFirstLetter(String original){
        String tmp = original.toLowerCase();
        if (tmp.trim().isEmpty()) {
            return tmp;
        }else{
            return tmp.substring(0,1).toUpperCase().trim() + tmp.substring(1).trim();
        }
    }
        public  String normalFormatString(String normal){
            int check = normal.trim().indexOf(" ");
            if (check == -1) {
                String out = upperCaseFirstLetter(normal);
                list.add(out);
                return out;
            }else{
                String[] tmp = new String[3];
                tmp = normal.split(" ",2);
                String out = upperCaseFirstLetter(tmp[0].trim());
                list.add(out);
                return out + " " + normalFormatString(tmp[1].trim());
            }
        }



  

}