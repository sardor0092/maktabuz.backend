package Idrok.net.maktab.uz.controller;

import Idrok.net.maktab.uz.entity.Uqtuvchi;
import Idrok.net.maktab.uz.service.UqtuvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/uqituvchilar")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UqtuvchiController {

    @Autowired
    UqtuvchiService uqtuvchiService;



 @GetMapping()
    public Page<Uqtuvchi> getAllByIsm(@RequestParam(required = false) String key, Pageable pageable) {
     if(key == null) key = "";
        return uqtuvchiService.findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrIdOrMaoshOrYoshOrJinsIgnoreCase( key, pageable);


    }

    @PostMapping
    public Uqtuvchi create(@RequestBody Uqtuvchi data) {
        return uqtuvchiService.create(data);
    }

    @PutMapping
    public Uqtuvchi update(@RequestBody Uqtuvchi data) {
        return uqtuvchiService.update(data);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        uqtuvchiService.deleteById(id);
    }

}
