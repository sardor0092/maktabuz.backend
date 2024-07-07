package Maktab.uz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Xona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int sigim;
    private String nom;
    private String bino;


    public Xona() {
    }

    public Xona(Long id, int sigim, String nom, String bino) {
        this.id = id;
        this.sigim = sigim;
        this.nom = nom;
        this.bino = bino;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSigim() {
        return sigim;
    }

    public void setSigim(int sigim) {
        this.sigim = sigim;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBino() {
        return bino;
    }

    public void setBino(String bino) {
        this.bino = bino;
    }
}
