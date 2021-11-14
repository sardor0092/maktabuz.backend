package Idrok.net.maktab.uz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Togarak {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime soat;
    private String fan;
    private String oqtuvchi;

    public Togarak() {
    }

    public Togarak(Long id, LocalDateTime soat, String fan, String oqtuvchi) {
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

    public LocalDateTime getSoat() {
        return soat;
    }

    public void setSoat(LocalDateTime soat) {
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
