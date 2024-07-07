package Maktab.uz.controller;
import Maktab.uz.entity.Xona;
import Maktab.uz.service.XonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/xona")
@CrossOrigin(origins = "*", maxAge = 3600)
public class XonaController {
    @Autowired
    XonaService xonaService;

    @GetMapping
    public Page<Xona> getAll(@RequestParam(required = false)String key, Pageable pageable) {
        if(key == null) key = "";
        return xonaService.findAllByNomContainsIgnoreCaseOrBinoContainsIgnoreCaseOrSigimOrId(key, pageable);
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
