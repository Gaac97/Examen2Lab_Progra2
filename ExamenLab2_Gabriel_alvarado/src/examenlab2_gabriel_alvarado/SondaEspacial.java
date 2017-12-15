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
public class SondaEspacial  extends NavesEspaciales implements Tiempo {
    private String material;
    private int peso;

    public SondaEspacial(String material, int peso, String serie, Planetas destino, int velocidad) {
        super(serie, destino, velocidad);
        this.material = material;
        this.peso = peso;
    }

    

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public double timepoIda(int d, int v) {
       NavesEspaciales n = new NavesEspaciales();
        Planetas p = new Planetas();
     double tiempo = p.getDistancia()*n.getVelocidad();
     
        return tiempo;
     
       
    }

    @Override
    public double regreso(double gravedad, int velocidadIda) {
         NavesEspaciales n = new NavesEspaciales();
        Planetas p = new Planetas();
        gravedad = 9.8;
        double tiempo = gravedad*p.getDistancia();
        return tiempo;
    
    }

    
}
