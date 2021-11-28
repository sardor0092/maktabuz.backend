package Idrok.net.maktab.uz.service.Impl;

import Idrok.net.maktab.uz.entity.User;
import Idrok.net.maktab.uz.repository.UserRepository;
import Idrok.net.maktab.uz.service.dto.UserDTO;
import Idrok.net.maktab.uz.service.vm.UserParolVM;
import Idrok.net.maktab.uz.service.vm.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDTO> getAll() {

        return userRepository.findAll().
                stream()
                .map(UserDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UserDTO> getById(Long id) {
        return userRepository.findById(id).map(UserDTO::new);
    }

    @Override
    public Optional<User> getByIdEntity(Long id) {
        return userRepository.findById(id);
    }






    @Override
    public User getCurrentUserEntity(){
        String username = getPrincipal();
        if (username != null)
            return userRepository.findByLogin(username).orElse(null);
        return null;
    }




    private String getPrincipal() {
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }





    @Override
    public UserDTO create(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        return null;
    }





    @Override
    public void delete(UserDTO userDTO) {

    }




    @Override
    public void deleteById(Long id) {

    }






    @Override
    public void changePassword(UserParolVM userParolVM) {
        Optional<User> user = userRepository.findByLogin(userParolVM.getLogin());
        if(user.isPresent() && user.get().getParol().equals(userParolVM.getEskiParol())){
            user.get().setParol(userParolVM.getYangiParol());
            userRepository.save(user.get());
        } else {
            throw new RuntimeException("xatolik ro'y berdi");
        }

    }

    @Override
    public UserDTO getCurrentUser(){
        String username = getPrincipal();
        if (username != null)
            return userRepository.findByLogin(username).map(UserDTO::new).orElse(null);
        return null;
    }

    @Override
    public Optional<User> getByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public String getCurrentLogin() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}