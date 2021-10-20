package Idrok.net.maktab.uz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Togarak {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int soat;
    private String fan;
    private String oqtuvchi;

    public Togarak() {
    }

    public Togarak(Long id, int soat, String fan, String oqtuvchi) {
        this.id = id;
        this.soat = soat;
        this.fan = fan;
        this.oqtuvchi = oqtuvchi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSoat() {
        return soat;
    }

    public void setSoat(int soat) {
        this.soat = soat;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public String getOqtuvchi() {
        return oqtuvchi;
    }

    public void setOqtuvchi(String oqtuvchi) {
        this.oqtuvchi = oqtuvchi;
    }
}
