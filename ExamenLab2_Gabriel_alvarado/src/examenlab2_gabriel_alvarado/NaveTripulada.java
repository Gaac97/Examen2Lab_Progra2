/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab2_gabriel_alvarado;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Alvarado
 */
public class NaveTripulada extends NavesEspaciales implements Tiempo {

    private Planetas lugar;
    private ArrayList<Astronautas> ListAstronauta = new ArrayList();

    public NaveTripulada(Planetas lugar, String serie, Planetas destino, int velocidad) {
        super(serie, destino, velocidad);
        this.lugar = lugar;
    }

    public Planetas getLugar() {
        return lugar;
    }

    public void setLugar(Planetas lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Astronautas> getListAstronauta() {
        return ListAstronauta;
    }

    public void setListAstronauta(ArrayList<Astronautas> ListAstronauta) {
        this.ListAstronauta = ListAstronauta;
    }

    @Override
    public String toString() {
        return "NaveTripulada{" + "lugar=" + lugar + ", ListAstronauta=" + ListAstronauta + '}';
    }

    @Override
    public double timepoIda(int d, int v) {
        NavesEspaciales n = new NavesEspaciales();
        Planetas p = new Planetas();

       double tiempo = p.getDistancia() / n.getVelocidad();

        return tiempo;

    }

    @Override
    public double regreso(double gravedad, int velocidadIda) {
        NavesEspaciales n = new NavesEspaciales();
        Planetas p = new Planetas();
        gravedad = 9.8;
        double tiempo = p.getDistancia()*n.getVelocidad();
        int pesos=0;
        for (Astronautas t : ListAstronauta) {
         pesos += t.getPeso();
        }
      double total = pesos/100;
     double total2 = tiempo*pesos;
        return total2;
    }

}
