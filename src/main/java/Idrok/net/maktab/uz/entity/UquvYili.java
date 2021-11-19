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
    private Long id;
    private LocalDate boshlanganVaqt;
    private LocalDate tugaganVaqt;
    private String izoh;

    public UquvYili() {
    }

    public UquvYili(Long id, LocalDate boshlanganVaqt, LocalDate tugaganVaqt, String izoh) {
        this.id = id;
        this.boshlanganVaqt = boshlanganVaqt;
        this.tugaganVaqt = tugaganVaqt;
        this.izoh = izoh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getIzoh() {
        return izoh;
    }

    public void setIzoh(String izoh) {
        this.izoh = izoh;
    }
}
