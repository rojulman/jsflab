/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nurulfikri.lab.models;

import java.io.Serializable;

/**
 *
 * @author rojul
 */
public class MataAnggaran implements Serializable{
    private int id;
    private String nama;
    private double maksimal;
    private int kategoriId;
    private KategoriBelanja kategoriBelanja;

    public MataAnggaran() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getMaksimal() {
        return maksimal;
    }

    public void setMaksimal(double maksimal) {
        this.maksimal = maksimal;
    }

    public int getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }

    @Override
    public String toString() {
        return "MataAnggaran{" + "nama=" + nama + '}';
    }

    public KategoriBelanja getKategoriBelanja() {
        return kategoriBelanja;
    }

    public void setKategoriBelanja(KategoriBelanja kategoriBelanja) {
        this.kategoriBelanja = kategoriBelanja;
    }

   
}
