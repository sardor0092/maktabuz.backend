package Idrok.net.maktab.uz.controller;

import Idrok.net.maktab.uz.entity.Sinf;
import Idrok.net.maktab.uz.service.SinfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sinf")
@CrossOrigin(origins = "*", maxAge = 3600)
public class SinfController {

    @Autowired
    SinfService sinfService;

    @GetMapping
    public Page<Sinf> getAll(Pageable pageable) {
        return sinfService.getAll(pageable);

    }

    @PostMapping
    public Sinf create(@RequestBody Sinf data) {
        return sinfService.create(data);
    }

    @PutMapping
    public Sinf update(@RequestBody Sinf data) {
        return sinfService.update(data);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        sinfService.deleteById(id);
    }

}
