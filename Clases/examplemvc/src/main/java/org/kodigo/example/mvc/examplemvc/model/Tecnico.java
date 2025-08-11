package org.kodigo.example.mvc.examplemvc.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TECNICOS")
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tec_id;
    private String tec_nombres;
    private String tec_apellidos;
    private Date tec_fec_nac;
    private String tec_dui;

    public Tecnico() {
    }

    public Tecnico(long tec_id, String tec_apellidos, String tec_nombres, Date tec_fec_nac, String tec_dui) {
        this.tec_id = tec_id;
        this.tec_apellidos = tec_apellidos;
        this.tec_nombres = tec_nombres;
        this.tec_fec_nac = tec_fec_nac;
        this.tec_dui = tec_dui;
    }

    public long getTec_id() {
        return tec_id;
    }

    public void setTec_id(long tec_id) {
        this.tec_id = tec_id;
    }

    public String getTec_nombres() {
        return tec_nombres;
    }

    public void setTec_nombres(String tec_nombres) {
        this.tec_nombres = tec_nombres;
    }

    public String getTec_apellidos() {
        return tec_apellidos;
    }

    public void setTec_apellidos(String tec_apellidos) {
        this.tec_apellidos = tec_apellidos;
    }

    public Date getTec_fec_nac() {
        return tec_fec_nac;
    }

    public void setTec_fec_nac(Date tec_fec_nac) {
        this.tec_fec_nac = tec_fec_nac;
    }

    public String getTec_dui() {
        return tec_dui;
    }

    public void setTec_dui(String tec_dui) {
        this.tec_dui = tec_dui;
    }
}
