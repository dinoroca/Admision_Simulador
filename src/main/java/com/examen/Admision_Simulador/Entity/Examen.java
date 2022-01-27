package com.examen.Admision_Simulador.Entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "examen")
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "respCorrecta")
    private Integer respCorrecta;

    @Column(name = "respIncorrecta")
    private Integer respIncorreta;

    private double puntaje;

    private Time duracion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    public Examen() {
    }

    public Examen(Integer id, Integer respCorrecta, Integer respIncorreta, double puntaje, Time duracion) {
        this.id = id;
        this.respCorrecta = respCorrecta;
        this.respIncorreta = respIncorreta;
        this.puntaje = puntaje;
        this.duracion = duracion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRespCorrecta() {
        return respCorrecta;
    }

    public void setRespCorrecta(Integer respCorrecta) {
        this.respCorrecta = respCorrecta;
    }

    public Integer getRespIncorreta() {
        return respIncorreta;
    }

    public void setRespIncorreta(Integer respIncorreta) {
        this.respIncorreta = respIncorreta;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "id=" + id +
                ", respCorrecta=" + respCorrecta +
                ", respIncorreta=" + respIncorreta +
                ", puntaje=" + puntaje +
                ", duracion=" + duracion +
                '}';
    }
}
