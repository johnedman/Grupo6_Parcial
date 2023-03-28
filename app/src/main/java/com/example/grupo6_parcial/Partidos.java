package com.example.grupo6_parcial;

import java.io.Serializable;

public class Partidos implements Serializable {

    private String nombre_rival;
    private String titular;
    private Double goles;
    private Double goles_rival;
    private String url_escudo_rival;



    public Partidos(String Nombre_Rival, String Titular, Double Goles, Double Goles_Rival, String Url_Escudo) {
        this.nombre_rival = Nombre_Rival;
        this.titular = Titular;
        this.goles = Goles;
        this.goles_rival = Goles_Rival;
        this.url_escudo_rival = Url_Escudo;
    }

    public Partidos() {

    }

    public String getNombre_Rival() {
        return nombre_rival;
    }
    public void setNombre(String nombre) {
        this.nombre_rival = nombre_rival;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Double getGoles() {
        return goles;
    }
    public void setGoles(Double goles) {
        this.goles = goles;
    }
    public Double getGoles_Rival() {
        return goles_rival;
    }
    public void setGoles_Rival(Double goles_rival) {
        this.goles_rival = goles_rival;
    }
    public String getUrl_Escudo() {
        return url_escudo_rival;
    }
    public void setUrl_Escudo(String Url_Escudo) {
        this.url_escudo_rival = url_escudo_rival;
    }
}
