package Idrok.net.maktab.uz.service.vm;

import Idrok.net.maktab.uz.entity.User;
import Idrok.net.maktab.uz.service.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public Optional<User> getByIdEntity(Long id);

    public List<UserDTO> getAll();

    UserDTO update(User user);

    public Optional<UserDTO> getById(Long id);

    UserDTO create(User user);

    User getCurrentUserEntity();

    public void deleteById(Long id);

    public void changePassword(UserParolVM userParolVM);

    UserDTO getCurrentUser();

    Optional<User> getByLogin(String login);

    public String getCurrentLogin();
}