package lab7_paulinaeuceda;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Hilo extends Thread {

    private int tiempo;
    private JProgressBar progBar;
    private boolean vive, avanzar;

    public Hilo(JProgressBar progBar) {
        this.progBar=progBar;
        vive = true;
        avanzar = true;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                progBar.setValue(progBar.getValue() + 1);
                if (progBar.getValue() == tiempo) {
                    vive = false;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }

    }

}
