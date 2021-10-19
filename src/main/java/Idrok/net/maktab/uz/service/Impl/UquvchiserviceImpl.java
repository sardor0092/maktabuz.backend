package Idrok.net.maktab.uz.service.Impl;


import Idrok.net.maktab.uz.entity.Uquvchi;
import Idrok.net.maktab.uz.repository.UquvchiRepository;
import Idrok.net.maktab.uz.service.UquvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UquvchiserviceImpl implements UquvchiService {

    @Autowired
    UquvchiRepository uquvchiRepository;

    @Override
    public List<Uquvchi> getAll() {
        return uquvchiRepository.findAll();
    }

    @Override
    public Uquvchi create(Uquvchi uquvchi) {
        return uquvchiRepository.save(uquvchi);
    }

    @Override
    public Uquvchi update(Uquvchi uquvchi) {
        return uquvchiRepository.save(uquvchi);
    }

    @Override
    public void delete(Uquvchi uquvchi) {
        uquvchiRepository.delete(uquvchi);
    }

    @Override
    public void deleteById(Long id) {
        uquvchiRepository.deleteById(id);
    }
}
