package Idrok.net.maktab.uz.repository;

import Idrok.net.maktab.uz.entity.Lavozim;
import Idrok.net.maktab.uz.entity.User;
import Idrok.net.maktab.uz.service.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByLogin(String login);

    List<User> findAllByLavozimlarContains(Lavozim lavozim);


}
