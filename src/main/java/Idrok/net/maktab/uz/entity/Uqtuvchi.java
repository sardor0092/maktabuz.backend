package Idrok.net.maktab.uz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Uqtuvchi {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ism;
    private String familiya;
    private int yosh;
    private String jins;
    private int maosh;

    public Uqtuvchi() {
    }


    public Uqtuvchi(Long id, String ism, String familiya, int yosh, String jins, int maosh) {
        this.id = id;
        this.ism = ism;
        this.familiya = familiya;
        this.yosh = yosh;
        this.jins = jins;
        this.maosh = maosh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public int getYosh() {
        return yosh;
    }

    public void setYosh(int yosh) {
        this.yosh = yosh;
    }

    public String getJins() {
        return jins;
    }

    public void setJins(String jins) {
        this.jins = jins;
    }

    public int getMaosh() {
        return maosh;
    }

    public void setMaosh(int maosh) {
        this.maosh = maosh;
    }
}
