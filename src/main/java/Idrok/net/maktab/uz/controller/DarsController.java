package Idrok.net.maktab.uz.controller;


import Idrok.net.maktab.uz.entity.Dars;
import Idrok.net.maktab.uz.service.DarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/dars")
@CrossOrigin(origins = "*", maxAge = 3600)
public class DarsController {
    @Autowired
    DarsService darsService;


    @GetMapping
    public List<Dars> getAll(){
        return darsService.getAll();
    }
     @PostMapping
    public Dars create(@RequestBody Dars dars){
        return darsService.create(dars);
     }
     @PutMapping
    public Dars update(@RequestBody Dars dars){
      return   darsService.update(dars);
     }
     @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        darsService.deleteById(id);
     }

}
