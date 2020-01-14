/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

/**
 *
 * @author Rosa
 */
public class Perro {
    
    int chip;
    String raza;
    String color;

    public Perro(int chip, String raza, String color) {
        this.chip = chip;
        this.raza = raza;
        this.color = color;
    }

    public Perro() {
        
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" + "chip=" + chip + ", raza=" + raza + ", color=" + color + '}';
    }
    
    
}


