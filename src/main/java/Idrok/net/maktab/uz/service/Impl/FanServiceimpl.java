package Idrok.net.maktab.uz.service.Impl;

import Idrok.net.maktab.uz.entity.Fan;
import Idrok.net.maktab.uz.repository.FanRepository;
import Idrok.net.maktab.uz.service.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FanServiceimpl implements FanService {

    @Autowired
    FanRepository fanRepository;

    @Override
    public Page<Fan> getAll(Pageable pageable) {
        return fanRepository.findAll(pageable);
    }

    @Override
    public Fan create(Fan fan) {
        return fanRepository.save(fan);
    }

    @Override
    public Fan update(Fan fan) {
        return fanRepository.save(fan);
    }

    @Override
    public void delete(Fan fan) {
        fanRepository.delete(fan);

    }

    @Override
    public void deleteById(Long id) {
        fanRepository.deleteById(id);

    }

    @Override
    public Page<Fan> findAllByNomContainingIgnoreCase(String key, Pageable pageable) {
        return fanRepository.findAllByNomContainingIgnoreCase(key, pageable);
    }
}
