package Idrok.net.maktab.uz.service.vm;

import Idrok.net.maktab.uz.entity.User;
import Idrok.net.maktab.uz.service.dto.UserDTO;

import java.util.Optional;

public interface UserService extends GeneralService<UserDTO,Long>{
    public Optional<User> getByIdEntity(Long id);

    UserDTO create(User user);

    User getCurrentUserEntity();

    public void changePassword(UserParolVM userParolVM);
    UserDTO getCurrentUser();

    Optional<User> getByLogin(String login);

    public String getCurrentLogin();
}