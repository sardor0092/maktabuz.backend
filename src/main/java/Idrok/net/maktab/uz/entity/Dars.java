package Idrok.net.maktab.uz.entity;

import javax.persistence.*;

@Entity
public class Dars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Uquvchi uquvchi;
    @ManyToOne
    private Fan fan;
    @ManyToOne
    private Uqtuvchi uqtuvchi;
    @ManyToOne
    private Xona xona;
    @ManyToOne
    private UquvYili uquvYili;
    @ManyToOne
    private Sinf sinfxona;

    public Dars() {
    }

    public Dars(Long id, Uquvchi uquvchi, Fan fan, Uqtuvchi uqtuvchi, Xona xona, UquvYili uquvYili, Sinf sinfxona) {
        this.id = id;
        this.uquvchi = uquvchi;
        this.fan = fan;
        this.uqtuvchi = uqtuvchi;
        this.xona = xona;
        this.uquvYili = uquvYili;
        this.sinfxona = sinfxona;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Uquvchi getUquvchi() {
        return uquvchi;
    }

    public void setUquvchi(Uquvchi uquvchi) {
        this.uquvchi = uquvchi;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public Uqtuvchi getUqtuvchi() {
        return uqtuvchi;
    }

    public void setUqtuvchi(Uqtuvchi uqtuvchi) {
        this.uqtuvchi = uqtuvchi;
    }

    public Xona getXona() {
        return xona;
    }

    public void setXona(Xona xona) {
        this.xona = xona;
    }

    public UquvYili getUquvYili() {
        return uquvYili;
    }

    public void setUquvYili(UquvYili uquvYili) {
        this.uquvYili = uquvYili;
    }

    public Sinf getSinfxona() {
        return sinfxona;
    }

    public void setSinfxona(Sinf sinfxona) {
        this.sinfxona = sinfxona;
    }
}
