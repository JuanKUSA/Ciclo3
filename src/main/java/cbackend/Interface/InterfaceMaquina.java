/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cbackend.Interface;

import cbackend.Modelo.Maquina;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Juan Valero
 */
public interface InterfaceMaquina extends CrudRepository<Maquina, Integer>{
    
}
