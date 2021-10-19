package Idrok.net.maktab.uz.service.Impl;

import Idrok.net.maktab.uz.entity.Uqtuvchi;
import Idrok.net.maktab.uz.repository.UqtuvchiRepository;
import Idrok.net.maktab.uz.repository.UquvchiRepository;
import Idrok.net.maktab.uz.service.UqtuvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UqtuvchiServiceImpl implements UqtuvchiService   {
    @Autowired
    UqtuvchiRepository uqtuvchiRepository;

    @Override
    public List<Uqtuvchi> getAll() {
        return uqtuvchiRepository.findAll();
    }

    @Override
    public Uqtuvchi create(Uqtuvchi uqtuvchi) {
        return uqtuvchiRepository.save(uqtuvchi);
    }

    @Override
    public Uqtuvchi update(Uqtuvchi uqtuvchi) {
        return uqtuvchiRepository.save(uqtuvchi);
    }

    @Override
    public void delete(Uqtuvchi uqtuvchi) {
    uqtuvchiRepository.delete(uqtuvchi);
    }

    @Override
    public void deleteById(Long id) {
    uqtuvchiRepository.deleteById(id);
    }
}
