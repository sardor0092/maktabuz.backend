package Idrok.net.maktab.uz.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Togarak {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime soat;
    @ManyToOne
    private Fan fan;
    @ManyToOne
    private  Uqtuvchi uqtuvchi;


    public Togarak() {
    }

    public Togarak(Long id, LocalDateTime soat, Fan fan, Uqtuvchi uqtuvchi) {
        this.id = id;
        this.soat = soat;
        this.fan = fan;
        this.uqtuvchi = uqtuvchi;
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
}
