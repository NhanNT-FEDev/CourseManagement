/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Trung Nhan
 */
public class Course implements Comparable<Course> {

    String code, name; 
           int credit;

    public Course(String code, String name, int credit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return code + " | " + name + " | " + credit + "|";
    }

    @Override
    public int compareTo(Course o) {
        if (this.getCredit() < o.getCredit()) {
            return -1;
        }else if (this.getCredit() == o.getCredit()) {
            return 0;
        }else {
            return 1;
        }
    }
}
