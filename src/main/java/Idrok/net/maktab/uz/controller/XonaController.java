package Idrok.net.maktab.uz.controller;

import Idrok.net.maktab.uz.entity.Xona;
import Idrok.net.maktab.uz.service.XonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/xona")
@CrossOrigin(origins = "*", maxAge = 3600)
public class XonaController {
    @Autowired
    XonaService xonaService;

    @GetMapping
    public List<Xona> getAll() {
        return xonaService.getAll();
    }

    @PostMapping
    public Xona create(@RequestBody Xona xona) {
        return xonaService.create(xona);

    }

    @PutMapping
    public Xona update(@RequestBody Xona xona){
        return xonaService.update(xona);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable Long id){
        xonaService.deleteById(id);
    }
}
