package Idrok.net.maktab.uz.service.dto;

import Idrok.net.maktab.uz.entity.User;

public class UserDTO {

    private Long id;
    private String ism;
    private String familiya;
    private String login;


    private  Boolean aktiv;



    public UserDTO() {

    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.ism = user.getIsm();
        this.familiya = user.getFamiliya();
        this.login = user.getLogin();
        this.aktiv = user.getAktiv();
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


}
