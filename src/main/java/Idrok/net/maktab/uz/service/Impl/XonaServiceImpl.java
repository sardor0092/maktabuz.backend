package Idrok.net.maktab.uz.service.Impl;
import Idrok.net.maktab.uz.entity.Xona;
import Idrok.net.maktab.uz.repository.XonaRepository;
import Idrok.net.maktab.uz.service.XonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class XonaServiceImpl implements XonaService {
    @Autowired
    XonaRepository xonaRepository;

    @Override
    public Page<Xona> getAll(Pageable pageable) {
        return xonaRepository.findAll(pageable);
    }

    @Override
    public Xona create(Xona xona) {
        return xonaRepository.save(xona);
    }

    @Override
    public Xona update(Xona xona) {
        return xonaRepository.save(xona);
    }

    @Override
    public void delete(Xona xona) {
        xonaRepository.delete(xona);
    }

    @Override
    public void deleteById(Long id) {
        xonaRepository.deleteById(id);
    }

    @Override
    public Page<Xona> findAllByNomContainingIgnoreCase(String key, Pageable pageable) {
        return xonaRepository.findAllByNomContainingIgnoreCase(key, pageable);
    }
}
