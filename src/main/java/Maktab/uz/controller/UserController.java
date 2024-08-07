package Maktab.uz.controller;
import Maktab.uz.entity.User;
import Maktab.uz.service.dto.UserDTO;
import Maktab.uz.service.vm.UserService;
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
    public UserDTO update(@RequestBody User User){
        return userService.update(User);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.deleteById(id);
    }
  
}
