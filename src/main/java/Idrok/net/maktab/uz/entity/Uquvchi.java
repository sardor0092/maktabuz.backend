package Idrok.net.maktab.uz.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Uquvchi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ism;
    private String familiya;
    private String sharif;
    private int yosh;
    private int sinf;

    public Uquvchi() {
    }

    public Uquvchi(Long id, String ism, String familiya, String sharif, int yosh, int sinf) {
        this.id = id;
        this.ism = ism;
        this.familiya = familiya;
        this.sharif = sharif;
        this.yosh = yosh;
        this.sinf = sinf;
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

    public String getSharif() {
        return sharif;
    }

    public void setSharif(String sharif) {
        this.sharif = sharif;
    }

    public int getYosh() {
        return yosh;
    }

    public void setYosh(int yosh) {
        this.yosh = yosh;
    }

    public int getSinf() {
        return sinf;
    }

    public void setSinf(int sinf) {
        this.sinf = sinf;
    }
}
