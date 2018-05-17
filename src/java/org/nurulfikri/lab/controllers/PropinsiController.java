/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nurulfikri.lab.controllers;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.nurulfikri.lab.MyBatisConnectionFactory;
import org.nurulfikri.lab.dao.DAOPropinsi;
import org.nurulfikri.lab.models.Propinsi;

/**
 *
 * @author rojul
 */
@ManagedBean
@SessionScoped
public class PropinsiController implements Serializable {

    DAOPropinsi dAOPropinsi = null;
    private Propinsi propinsi;

    public PropinsiController() {
        dAOPropinsi
                = new DAOPropinsi(MyBatisConnectionFactory.getSqlSessionFactory());
    
        propinsi = new Propinsi();
    }

    public List<Propinsi> findAll() {
        return dAOPropinsi.getAll();
    }

    public DAOPropinsi getdAOPropinsi() {
        return dAOPropinsi;
    }

    public void setdAOPropinsi(DAOPropinsi dAOPropinsi) {
        this.dAOPropinsi = dAOPropinsi;
    }

    public Propinsi getPropinsi() {
        return propinsi;
    }

    public void setPropinsi(Propinsi propinsi) {
        this.propinsi = propinsi;
    }
    
    
    public String savePropinsi(){
        
        if(this.propinsi.getId() > 0 ){
            this.propinsi = dAOPropinsi.update(this.propinsi);
        }else{
            this.propinsi = dAOPropinsi.save(this.propinsi);
        }
        return "propinsi?faces-redirect=true";
        
    }
    
    public String editPropinsi(Propinsi obj){
        this.propinsi = obj;
        return "form";
    }
    
    public String deletePropinsi(Propinsi obj){
        //this.propinsi = obj;
        dAOPropinsi.delete(obj.getId());
        return "propinsi";
    }
    
    public String addPropinsi(){
        this.propinsi = new Propinsi();
        return "form";
    }

}
