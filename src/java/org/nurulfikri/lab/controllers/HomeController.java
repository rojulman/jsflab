/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nurulfikri.lab.controllers;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author rojul
 */
@ManagedBean
@SessionScoped
public class HomeController implements Serializable{
    
    public String welcomePage(){
        return "welcome";//welcome.xhtml
    }
}
