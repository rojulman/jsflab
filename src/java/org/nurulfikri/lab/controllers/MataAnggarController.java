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
import org.nurulfikri.lab.dao.DAOMataAnggaran;
import org.nurulfikri.lab.models.KategoriBelanja;
import org.nurulfikri.lab.models.MataAnggaran;
import org.nurulfikri.lab.models.Propinsi;

/**
 *
 * @author rojul
 */
@ManagedBean
@SessionScoped
public class MataAnggarController implements Serializable{
    
    private DAOMataAnggaran dAOMataAnggaran;
    private MataAnggaran mataAnggaran;

    public MataAnggarController() {
        dAOMataAnggaran = 
           new DAOMataAnggaran(MyBatisConnectionFactory.getSqlSessionFactory());
        this.mataAnggaran = new MataAnggaran();
    }

    public MataAnggaran getMataAnggaran() {
        return mataAnggaran;
    }

    public void setMataAnggaran(MataAnggaran mataAnggaran) {
        this.mataAnggaran = mataAnggaran;
    }
    
    public List<MataAnggaran> getAllMataAnggaran(){
        return dAOMataAnggaran.getAll();
    }
    
    public List<KategoriBelanja> getAllKategori(){
        return dAOMataAnggaran.getAllKategori();
    }
    
    public String saveMataAnggaran(){
        if (this.mataAnggaran.getId() > 0 ){
            this.mataAnggaran 
                = dAOMataAnggaran.update(this.mataAnggaran);
        }else{
          this.mataAnggaran = 
                dAOMataAnggaran.save(this.mataAnggaran);
        }
        return "index";
    }
    
    public String editMataAnggaran(MataAnggaran obj){
        this.mataAnggaran = obj;
        return "form2";
    }
    
    public String deleteMataAnggaran(MataAnggaran obj){
        //this.propinsi = obj;
        dAOMataAnggaran.delete(obj.getId());
        return "index";
    }
    
    public String addMataAnggaran(){
        this.mataAnggaran = new MataAnggaran();
        return "form2";
    }
    
    
}
