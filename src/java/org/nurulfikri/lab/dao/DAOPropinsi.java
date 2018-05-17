/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nurulfikri.lab.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.nurulfikri.lab.models.Propinsi;

/**
 *
 * @author rojul
 */
public class DAOPropinsi implements IDAO <Propinsi>{

    private SqlSessionFactory sqlSessionFactory = null;
    private SqlSession session = null;

    public DAOPropinsi(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
   
    @Override
    public List<Propinsi> getAll() {
        List<Propinsi> list = null;
        session = sqlSessionFactory.openSession();
        try{
            list = 
              session.selectList("PropinsiMapper.selectAll");
        }finally{
            session.close();
        }
        return list;
    }

    @Override
    public Propinsi findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Propinsi save(Propinsi obj) {
   
        session = sqlSessionFactory.openSession();
        session.insert("PropinsiMapper.insertPropinsi",obj);
        session.commit();
        session.close();
        return obj;
        
    }

    @Override
    public Propinsi update(Propinsi obj) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    session = sqlSessionFactory.openSession();
        session.update("PropinsiMapper.updatePropinsi",obj);
        session.commit();
        session.close();
        return obj;
    }

    @Override
    public void delete(int id) {
        session = sqlSessionFactory.openSession();
        session.delete("PropinsiMapper.deletePropinsi",
                id);
        session.commit();
        session.close();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
