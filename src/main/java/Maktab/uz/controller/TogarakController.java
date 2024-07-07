package Maktab.uz.controller;

import Maktab.uz.entity.Togarak;
import Maktab.uz.service.TogarakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/togaraklar")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TogarakController {
    @Autowired
    TogarakService togarakService;

    @GetMapping
    public Page<Togarak> getAll(Pageable pageable) {

        return togarakService.getAll(pageable);
    }

    @PostMapping
    public Togarak create(@RequestBody Togarak togarak) {
        return togarakService.create(togarak);
    }

    @PutMapping
    public Togarak update(@RequestBody Togarak togarak) {
        return togarakService.update(togarak);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        togarakService.deleteById(id);
    }


}
