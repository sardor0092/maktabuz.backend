package Idrok.net.maktab.uz.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class UquvYili {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Id;
    private LocalDate boshlanganVaqt;
    private LocalDate tugaganVaqt;
    private String izoh;

    public UquvYili(String izoh) {
        this.izoh = izoh;
    }

    public String getIzoh() {
        return izoh;
    }

    public void setIzoh(String izoh) {
        this.izoh = izoh;
    }

    public UquvYili() {
    }

    public UquvYili(Long id, LocalDate boshlanganVaqt, LocalDate tugaganVaqt) {
        Id = id;
        this.boshlanganVaqt = boshlanganVaqt;
        this.tugaganVaqt = tugaganVaqt;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public LocalDate getBoshlanganVaqt() {
        return boshlanganVaqt;
    }

    public void setBoshlanganVaqt(LocalDate boshlanganVaqt) {
        this.boshlanganVaqt = boshlanganVaqt;
    }

    public LocalDate getTugaganVaqt() {
        return tugaganVaqt;
    }

    public void setTugaganVaqt(LocalDate tugaganVaqt) {
        this.tugaganVaqt = tugaganVaqt;
    }
}
