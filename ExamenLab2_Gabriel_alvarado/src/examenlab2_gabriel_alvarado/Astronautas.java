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
public class Astronautas {
    public String nombre;
    public String nacionalidad;
    public String sueldo;
    public String experiencia;
    public String sexo;
    public int peso;

    public Astronautas() {
    }

    public Astronautas(String nombre, String nacionalidad, String sueldo, String experiencia, String sexo, int peso) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.experiencia = experiencia;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
