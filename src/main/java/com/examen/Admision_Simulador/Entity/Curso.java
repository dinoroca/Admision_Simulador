package com.examen.Admision_Simulador.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    private Examen examen;

    @OneToMany(mappedBy = "curso")
    private List<Pregunta> pregunta;

    public Curso() {
    }

    public Curso(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Examen getExamen() {
        return examen;
    }

    public List<Pregunta> getPregunta() {
        return pregunta;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
