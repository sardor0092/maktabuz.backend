package Idrok.net.maktab.uz.service.Impl;
import Idrok.net.maktab.uz.entity.Uquvchi;
import Idrok.net.maktab.uz.repository.UquvchiRepository;
import Idrok.net.maktab.uz.service.UquvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UquvchiserviceImpl implements UquvchiService {

    @Autowired
    UquvchiRepository uquvchiRepository;

    @Override
    public Page<Uquvchi> getAll(Pageable pageable) {
        return uquvchiRepository.findAll(pageable);
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
