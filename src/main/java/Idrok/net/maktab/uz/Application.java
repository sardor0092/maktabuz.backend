package Idrok.net.maktab.uz;
import Idrok.net.maktab.uz.entity.Lavozim;
import Idrok.net.maktab.uz.entity.User;
import Idrok.net.maktab.uz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;
import java.util.Set;

@SpringBootApplication
public class Application  implements ApplicationRunner {


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
@Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Optional<User> uk = userRepository.findByLogin("admin123");
        if(!uk.isPresent()){
            User u = new User();
            u.setIsm("admin");
            u.setFamiliya("Admin");
            u.setLogin("admin123");
            u.setParol(passwordEncoder.encode("admin123"));
            u.setAktiv(true);
            u.setLavozimlar(Set.of(Lavozim.ADMIN));
            userRepository.save(u);
        }
    }
}

