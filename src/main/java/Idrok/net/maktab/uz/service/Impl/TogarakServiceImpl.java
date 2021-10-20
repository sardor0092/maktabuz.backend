package Idrok.net.maktab.uz.service.Impl;

import Idrok.net.maktab.uz.entity.Togarak;
import Idrok.net.maktab.uz.repository.TogarakRepository;
import Idrok.net.maktab.uz.service.VM.TogarakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TogarakServiceImpl implements TogarakService {
    @Autowired
    TogarakRepository togarakRepository;

    @Override
    public List<Togarak> getAll() {
        return togarakRepository.findAll();
    }

    @Override
    public Togarak create(Togarak togarak) {
        return togarakRepository.save(togarak);
    }

    @Override
    public Togarak update(Togarak togarak) {
        return togarakRepository.save(togarak);
    }

    @Override
    public void delete(Togarak togarak) {
        togarakRepository.delete(togarak);
    }

    @Override
    public void deleteById(Long id) {
        togarakRepository.deleteById(id);
    }


}