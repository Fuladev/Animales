/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.animales;

/**
 *
 * @author Usuario
 */
public class Leon extends Felino{

    @Override
    public String getNombreCientifico() {
        return "Panthera leo";
    }

    @Override
    public String getSonido() {
        return "Rugido";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoro";
    }

    @Override
    public String getHabitat() {
        return "Praderas";
    }
    
}
