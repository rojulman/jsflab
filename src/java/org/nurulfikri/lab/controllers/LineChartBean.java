/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nurulfikri.lab.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.nurulfikri.lab.models.Births;

/**
 *
 * @author rojul
 */
@ManagedBean
@RequestScoped
public class LineChartBean {
    protected List<Births> boys;
    protected List<Births> girls;
     
    public List<Births> getBoys() {
        return boys;
    }           
     
    public List<Births> getGirls() {
        return girls;
    }   
     
    public LineChartBean() {
        reload();
    }
 
    private void reload() {
        boys = new ArrayList<>();
        girls = new ArrayList<>();
        Random r = new Random();
        for (int i = 2000; i < 2010; i++) {
            boys.add(new Births(Integer.toString(i), r.nextInt(500) + 800));   
            girls.add(new Births(Integer.toString(i), r.nextInt(500) + 800));   
        }  
    }
    
}
