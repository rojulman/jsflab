/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nurulfikri.lab.dao;

import java.util.List;

/**
 *
 * @author rojul
 */
public interface IDAO <E>{
    public List<E> getAll();
    public E findByID(int id);
    public E save(E obj);
    public E update(E obj);
    public void delete(int id);
    
}
