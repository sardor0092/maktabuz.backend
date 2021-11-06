package Idrok.net.maktab.uz.controller;

import Idrok.net.maktab.uz.entity.Togarak;
import Idrok.net.maktab.uz.service.TogarakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/togaraklar")
@CrossOrigin(origins = "*" ,maxAge = 3600)
public class TogarakController {
    @Autowired
    TogarakService togarakService;
    @GetMapping
    public List<Togarak> getAll(){
        return togarakService.getAll();
    }

    @PostMapping
    public Togarak create(@RequestBody Togarak togarak){
return togarakService.create(togarak);
    }

    @PutMapping
    public Togarak update(@RequestBody Togarak togarak){
        return togarakService.update(togarak);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        togarakService.deleteById(id);
    }


}
