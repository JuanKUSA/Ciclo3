/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbackend.Repositorio;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import cbackend.Interface.InterfaceMaquina;
import cbackend.Modelo.Maquina;

/**
 *
 * @author USUARIO
 */
@Repository
public class MaquinaRepositorio {
      @Autowired
    private InterfaceMaquina crud;
    

    public List<Maquina> getAll(){
        return (List<Maquina>) crud.findAll();       
    }
    
    public Optional <Maquina> getMaquina(int id){
        return crud.findById(id);
    }
    
    public Maquina save(Maquina maquina){
        return crud.save(maquina);
    }
     public void delete(Maquina maquina){
        crud.delete(maquina);
    }
    
}
