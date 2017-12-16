/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab2_gabriel_alvarado;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Gabriel Alvarado
 */
public class Hilo extends Thread {

    JLabel label1;
    JLabel label2;
    double inicio;
    double finaly;
    boolean vive;

    public Hilo(JLabel label1, JLabel label2, double inicio, double finaly, boolean vive) {
        this.label1 = label1;
        this.label2 = label2;
        this.inicio = inicio;
        this.finaly = finaly;
        this.vive = vive;
    }

   

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public double getInicio() {
        return inicio;
    }

    public void setInicio(double inicio) {
        this.inicio = inicio;
    }

    public double getFinaly() {
        return finaly;
    }

    public void setFinaly(double finaly) {
        this.finaly = finaly;
    }

    @Override
    public void run() {

        try {
            while (vive) {
                int seg = 0;
                String segundos = "" + seg;
                label1.setText(segundos);
                if (seg == inicio) {

                    seg += 1;
                    label1.setText(segundos);
                }

            }
        } catch (Exception e) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }

}
