package com.rafaelgscc.diagnosticoSubmarino.Model;

public class DiagnosticoResultado {
    private int gama;
    private int episilon;

    public DiagnosticoResultado() {
    }

    public DiagnosticoResultado(int gama, int episilon) {
        this.gama = gama;
        this.episilon = episilon;
    }

    public int getGama() {
        return gama;
    }

    public void setGama(int gama) {
        this.gama = gama;
    }

    public int getEpisilon() {
        return episilon;
    }

    public void setEpisilon(int episilon) {
        this.episilon = episilon;
    }

    public int getConsumoEnergia(){
        return gama*episilon;
    }

    @Override
    public String toString(){
        return "Resultado = {" + "gama ="+ gama + ", episilon="+ episilon + ", Consumo de Energia="
                + getConsumoEnergia() + "}";
    }
}
