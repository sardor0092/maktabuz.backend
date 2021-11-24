package Idrok.net.maktab.uz.controller;

import Idrok.net.maktab.uz.entity.Uqtuvchi;
import Idrok.net.maktab.uz.entity.Uquvchi;
import Idrok.net.maktab.uz.service.UquvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/uquvchilar")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UquvchiController {
    @Autowired
    UquvchiService uquvchiService;
    @GetMapping()
    public Page<Uquvchi> getAllByIsm(@RequestParam(required = false) String key, Pageable pageable) {
        return uquvchiService.findAllByIsmContainingIgnoreCase( key, pageable);

    }

    @PostMapping
    public Uquvchi create(@RequestBody Uquvchi uquvchi) {
        return uquvchiService.create(uquvchi);
    }

    @PutMapping
    public Uquvchi update(@RequestBody Uquvchi uquvchi) {
        return uquvchiService.update(uquvchi);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        uquvchiService.deleteById(id);
    }


}
