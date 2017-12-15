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
public class NavesEspaciales {
    private String serie;
    private Planetas destino;
    private int velocidad;

    public NavesEspaciales() {
    }

    public NavesEspaciales(String serie, Planetas destino, int velocidad) {
        this.serie = serie;
        this.destino = destino;
        this.velocidad = velocidad;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Planetas getDestino() {
        return destino;
    }

    public void setDestino(Planetas destino) {
        this.destino = destino;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "NavesEspaciales{" + "destino=" + destino + ", velocidad=" + velocidad + '}';
    }

    
}
