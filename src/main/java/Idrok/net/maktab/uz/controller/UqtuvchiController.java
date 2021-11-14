package Idrok.net.maktab.uz.controller;
import Idrok.net.maktab.uz.entity.Uqtuvchi;
import Idrok.net.maktab.uz.service.UqtuvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/uqituvchilar")
@CrossOrigin(origins = "*" ,maxAge = 3600)
public class UqtuvchiController {

    @Autowired
    UqtuvchiService uqtuvchiService;
    @GetMapping
    public List<Uqtuvchi> getAll(Uqtuvchi uqtuvchi){
return uqtuvchiService.getAll(uqtuvchi);

    }
    @PostMapping
    public Uqtuvchi create(@RequestBody Uqtuvchi uqtuvchi){
        return uqtuvchiService.create(uqtuvchi);
    }

    @PutMapping
    public Uqtuvchi update(@RequestBody Uqtuvchi uqtuvchi){
        return uqtuvchiService.update(uqtuvchi);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        uqtuvchiService.deleteById(id);
    }

}
