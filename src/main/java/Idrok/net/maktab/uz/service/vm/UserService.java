package Idrok.net.maktab.uz.service.vm;

import Idrok.net.maktab.uz.entity.User;
import Idrok.net.maktab.uz.service.dto.UserDTO;

import java.util.Optional;

public interface UserService extends GeneralService<UserDTO,Long>{

    public Optional<User> getByIdEntity(Long id);
    public void changePassword(UserParolVM userParolVM);

    Optional<User> getByLogin(String login);

    public String getCurrentLogin();
}
