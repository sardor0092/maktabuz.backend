package Maktab.uz.controller;
import Maktab.uz.entity.UquvYili;
import Maktab.uz.service.UquvYiliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/uquvYili")
@CrossOrigin(origins = "*" , maxAge = 3600)
public class UquvYiliController {

    @Autowired
    UquvYiliService uquvYiliService;

    @GetMapping
    public Page<UquvYili> getAll(Pageable pageable){
        return uquvYiliService.getAll(pageable);

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
