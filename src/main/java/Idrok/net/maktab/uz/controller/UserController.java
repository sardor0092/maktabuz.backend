package Idrok.net.maktab.uz.controller;
import Idrok.net.maktab.uz.entity.User;
import Idrok.net.maktab.uz.service.dto.UserDTO;
import Idrok.net.maktab.uz.service.vm.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@PreAuthorize("hasAnyAuthority(\"ADMIN\", \"DIREKTOR\")")
@RequestMapping("api/user")
@CrossOrigin(origins = "*", maxAge = 3600)

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<UserDTO> getAll(){
    return userService.getAll();

    }

    @PostMapping
    public UserDTO create(@RequestBody User user){
        return userService.create(user);
    }

    @PutMapping
    public UserDTO update(@RequestBody UserDTO User){
        return userService.update(User);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.deleteById(id);
    }
  
}
