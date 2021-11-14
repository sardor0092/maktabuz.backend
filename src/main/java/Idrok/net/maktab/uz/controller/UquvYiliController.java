package Idrok.net.maktab.uz.controller;
import Idrok.net.maktab.uz.entity.UquvYili;
import Idrok.net.maktab.uz.service.UquvYiliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/uquvYili")
@CrossOrigin(origins = "*" , maxAge = 3600)
public class UquvYiliController {

    @Autowired
    UquvYiliService uquvYiliService;

    @GetMapping
    public List<UquvYili> getAll(UquvYili uquvYili){
        return uquvYiliService.getAll(uquvYili);

    }
    @PostMapping
    public  UquvYili create(@RequestBody UquvYili uquvYili){
        return uquvYiliService.create(uquvYili);
    }

    @PutMapping
    public UquvYili update(@RequestBody UquvYili uquvYili){
        return uquvYiliService.update(uquvYili);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        uquvYiliService.deleteById(id);
    }

}
