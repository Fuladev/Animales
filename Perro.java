/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.animales;


/**
 *
 * @author Usuario
 */

public class Perro extends Canido {

    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris"; 
    }

    @Override
    public String getSonido() {
        return "Ladrido";
    }    

    @Override
    public String getAlimentos() {
        return "Carnivoro"; 
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }
    
}
