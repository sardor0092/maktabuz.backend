package Idrok.net.maktab.uz.service.Impl;

import Idrok.net.maktab.uz.entity.Uqtuvchi;
import Idrok.net.maktab.uz.repository.UqtuvchiRepository;
import Idrok.net.maktab.uz.service.UqtuvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UqtuvchiServiceImpl implements UqtuvchiService {
    @Autowired
    UqtuvchiRepository uqtuvchiRepository;

    @Override
    public Page<Uqtuvchi> getAll( Pageable pageable) {
        return uqtuvchiRepository.findAll(pageable);
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

    @Override
    public Page<Uqtuvchi> findAllByIsmContainingIgnoreCase(String key, Pageable pageable) {
        return uqtuvchiRepository.findAllByIsmContainingIgnoreCase(key, pageable);
    }
}
