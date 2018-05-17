/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nurulfikri.lab;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author rojul
 */
@ManagedBean(name="hello")
@SessionScoped
public class HelloBean implements Serializable{
    private String name;

    public HelloBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getSayWelcome(){
        if("".equals(name) || name==null){
            return "";
        }else{
            return "Mr/Mrs. " + name;
        }
    }
}
