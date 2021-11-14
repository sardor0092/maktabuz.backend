package Idrok.net.maktab.uz.service.Impl;

import Idrok.net.maktab.uz.entity.Fan;
import Idrok.net.maktab.uz.repository.FanRepository;
import Idrok.net.maktab.uz.service.FanService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FanServiceimpl implements FanService {

    @Autowired
    FanRepository fanRepository;

    @Override
    public List<Fan> getAll(Fan fan) {
        return fanRepository.findAll();
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
}
