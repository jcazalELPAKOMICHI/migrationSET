/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import javax.swing.JProgressBar;

/**
 *
 * @author josec
 */
public class Cargar extends Thread {

    JProgressBar progreso;
    int porcentaje;
    int total;
    int carga;

    public Cargar(JProgressBar progreso, int total, int carga) {
        super();
        this.progreso = progreso;
        this.total = total;
        this.carga = carga;
        int result = carga * 100 / total;
        progreso.setValue(result);
        pausa(1);
        progreso.setString(String.valueOf(result) + "%");
        if (result == 100) {

        }
    }

    @Override
    public void run() {
        //   for(int i=1;i<=100;i++){

        //}
    }

    public void pausa(int mlSeg) {
        try {
            Thread.sleep(mlSeg);
        } catch (Exception e) {

        }
    }
}
