/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nurulfikri.lab.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.nurulfikri.lab.models.KategoriBelanja;
import org.nurulfikri.lab.models.MataAnggaran;

/**
 *
 * @author rojul
 */
@ManagedBean
@SessionScoped
public class AnggaranController implements Serializable{
    private MataAnggaran mataAnggaran;
    private List<KategoriBelanja> listKategori;

    public AnggaranController() {
        this.mataAnggaran = new MataAnggaran();
        listKategori = new ArrayList<>();
        
        KategoriBelanja kb1 = new KategoriBelanja();
        kb1.setId(1);
        kb1.setNama("Operasi");
        listKategori.add(kb1);
        KategoriBelanja kb2 = new KategoriBelanja();
        kb2.setId(2);
        kb2.setNama("Modal");
        listKategori.add(kb2);
        KategoriBelanja kb3 = new KategoriBelanja();
        kb3.setId(3);
        kb3.setNama("Lain-Lain");
        listKategori.add(kb3);
    }

    public List<KategoriBelanja> getListKategori() {
        return listKategori;
    }

    public void setListKategori(List<KategoriBelanja> listKategori) {
        this.listKategori = listKategori;
    }
    
    
    
    public MataAnggaran getMataAnggaran() {
        return mataAnggaran;
    }

    public void setMataAnggaran(MataAnggaran mataAnggaran) {
        this.mataAnggaran = mataAnggaran;
    }
    
    public String saveAnggaran(){
        
        KategoriBelanja obj = 
   listKategori.get(this.mataAnggaran.getKategoriId());
        mataAnggaran.setKategoriBelanja(obj);
        
        return "success";//success.xhtml
    }
}
