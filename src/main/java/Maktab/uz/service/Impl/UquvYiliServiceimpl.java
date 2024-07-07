package Maktab.uz.service.Impl;


import Maktab.uz.entity.UquvYili;
import Maktab.uz.repository.UquvYiliRepository;
import Maktab.uz.service.UquvYiliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UquvYiliServiceimpl implements UquvYiliService {

    @Autowired
    UquvYiliRepository uquvYiliRepository;

    @Override
    public Page<UquvYili> getAll(Pageable pageable) {
        return uquvYiliRepository.findAll(pageable);
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
