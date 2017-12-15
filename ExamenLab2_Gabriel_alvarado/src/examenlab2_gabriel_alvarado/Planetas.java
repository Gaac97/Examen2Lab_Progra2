/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab2_gabriel_alvarado;

/**
 *
 * @author Gabriel Alvarado
 */
public class Planetas {
    public String nombre;
    public int temperatura;
    public String anillos;
    public String tipoSuperficie;
    public int Distancia;

    public Planetas() {
    }
    
    public Planetas(String nombre, int temperatura, String anillos, String tipoSuperficie, int Distancia) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.anillos = anillos;
        this.tipoSuperficie = tipoSuperficie;
        this.Distancia = Distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getAnillos() {
        return anillos;
    }

    public void setAnillos(String anillos) {
        this.anillos = anillos;
    }

    public String getTipoSuperficie() {
        return tipoSuperficie;
    }

    public void setTipoSuperficie(String tipoSuperficie) {
        this.tipoSuperficie = tipoSuperficie;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
