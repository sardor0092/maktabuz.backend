package Maktab.uz.service.dto;

import Maktab.uz.entity.Lavozim;
import Maktab.uz.entity.User;

import java.util.Set;

public class UserDTO {

    private Long id;
    private String ism;
    private String familiya;
    private String login;
    private Set<Lavozim> lavozimlar;
    private Boolean aktiv;

    public UserDTO() {

    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.ism = user.getIsm();
        this.familiya = user.getFamiliya();
        this.login = user.getLogin();
        this.aktiv = user.getAktiv();
        this.lavozimlar = user.getLavozimlar();

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

    public String getLogin() {
        return login;
    }

    public Boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(Boolean aktiv) {
        this.aktiv = aktiv;
    }


    public void setLogin(String login) {
        this.login = login;
    }

    public Set<Lavozim> getLavozimlar() {
        return lavozimlar;
    }

    public void setLavozimlar(Set<Lavozim> lavozimlar) {
        this.lavozimlar = lavozimlar;
    }

    public Boolean getAktiv() {
        return aktiv;
    }
}
