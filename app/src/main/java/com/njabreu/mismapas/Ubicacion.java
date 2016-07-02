package com.njabreu.mismapas;

/**
 * Created by Nelson Abreu on 7/2/2016.
 */
public class Ubicacion {
    private double latitud;

    public Ubicacion(double latitud, double longitud, String lugar) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.lugar = lugar;
    }

    private double longitud;
    private String lugar;

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
