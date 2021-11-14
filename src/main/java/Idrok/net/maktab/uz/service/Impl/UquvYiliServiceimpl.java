package Idrok.net.maktab.uz.service.Impl;


import Idrok.net.maktab.uz.entity.UquvYili;
import Idrok.net.maktab.uz.repository.UquvYiliRepository;
import Idrok.net.maktab.uz.service.UquvYiliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UquvYiliServiceimpl implements UquvYiliService {

    @Autowired
    UquvYiliRepository uquvYiliRepository;

    @Override
    public List<UquvYili> getAll(UquvYili uquvYili) {
        return uquvYiliRepository.findAll();
    }

    @Override
    public UquvYili create(UquvYili uquvYili) {
        return uquvYiliRepository.save(uquvYili);
    }

    @Override
    public UquvYili update(UquvYili uquvYili) {
        return uquvYiliRepository.save(uquvYili);
    }

    @Override
    public void delete(UquvYili uquvYili) {
        uquvYiliRepository.delete(uquvYili);

    }

    @Override
    public void deleteById(Long id) {
        uquvYiliRepository.deleteById(id);

    }
}
