/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Rebeca Cecilio Bernardi
 */
public class BD {
  public static ArrayList<Empresas> listaempresas= new ArrayList<>();
  
  private static ArrayList<Pessoas> listapessoas= new ArrayList<>();
  
    public static ArrayList<Empresas> getListaempresas() {
        return listaempresas;
    }

    public static ArrayList<Pessoas> getListapessoas() {
        return listapessoas;
    }

    public static void setListapessoas(ArrayList<Pessoas> aListapessoas) {
        listapessoas = aListapessoas;
    }

    public void setListaempresas(ArrayList<Empresas> listaempresas) {
        this.listaempresas = listaempresas;
    }
  
    

    
    
    
    
    
    
    
}
