package Idrok.net.maktab.uz.service.vm;

public class UserParolVM {

    private String login;
    private String eskiParol;
    private String yangiParol;
    private  String confirm;

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEskiParol() {
        return eskiParol;
    }

    public void setEskiParol(String eskiParol) {
        this.eskiParol = eskiParol;
    }

    public String getYangiParol() {
        return yangiParol;
    }

    public void setYangiParol(String yangiParol) {
        this.yangiParol = yangiParol;
    }
}
