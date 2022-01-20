package com.examen.Admision_Simulador.Entity;

import javax.persistence.*;

@Entity
@Table(name = "pregunta")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "contenido")
    private String contenido;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "alternativaA")
    private String alternativaA;

    @Column(name = "alternativaB")
    private String alternativaB;

    @Column(name = "alternativaC")
    private String alternativaC;

    @Column(name = "alternativaD")
    private String alternativaD;

    @Column(name = "alternativaE")
    private String alternativaE;

    @Column(name = "alternativaCorrecta")
    private char alternativaCorrecta;

    @ManyToOne
    private Curso curso;

    public Pregunta() {
    }

    public Pregunta(Integer id, String contenido, String imagen, String alternativaA, String alternativaB, String alternativaC, String alternativaD, String alternativaE, char alternativaCorrecta) {
        this.id = id;
        this.contenido = contenido;
        this.imagen = imagen;
        this.alternativaA = alternativaA;
        this.alternativaB = alternativaB;
        this.alternativaC = alternativaC;
        this.alternativaD = alternativaD;
        this.alternativaE = alternativaE;
        this.alternativaCorrecta = alternativaCorrecta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAlternativaA() {
        return alternativaA;
    }

    public void setAlternativaA(String alternativaA) {
        this.alternativaA = alternativaA;
    }

    public String getAlternativaB() {
        return alternativaB;
    }

    public void setAlternativaB(String alternativaB) {
        this.alternativaB = alternativaB;
    }

    public String getAlternativaC() {
        return alternativaC;
    }

    public void setAlternativaC(String alternativaC) {
        this.alternativaC = alternativaC;
    }

    public String getAlternativaD() {
        return alternativaD;
    }

    public void setAlternativaD(String alternativaD) {
        this.alternativaD = alternativaD;
    }

    public String getAlternativaE() {
        return alternativaE;
    }

    public void setAlternativaE(String alternativaE) {
        this.alternativaE = alternativaE;
    }

    public char getAlternativaCorrecta() {
        return alternativaCorrecta;
    }

    public void setAlternativaCorrecta(char alternativaCorrecta) {
        this.alternativaCorrecta = alternativaCorrecta;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "id=" + id +
                ", contenido='" + contenido + '\'' +
                ", imagen='" + imagen + '\'' +
                ", alternativaA='" + alternativaA + '\'' +
                ", alternativaB='" + alternativaB + '\'' +
                ", alternativaC='" + alternativaC + '\'' +
                ", alternativaD='" + alternativaD + '\'' +
                ", alternativaE='" + alternativaE + '\'' +
                ", alternativaCorrecta=" + alternativaCorrecta +
                '}';
    }
}

