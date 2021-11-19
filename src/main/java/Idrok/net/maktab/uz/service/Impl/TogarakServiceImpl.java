package Idrok.net.maktab.uz.service.Impl;

import Idrok.net.maktab.uz.entity.Togarak;
import Idrok.net.maktab.uz.repository.TogarakRepository;
import Idrok.net.maktab.uz.service.TogarakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class TogarakServiceImpl implements TogarakService {
    @Autowired
    TogarakRepository togarakRepository;


    @Override
    public Page<Togarak> getAll(Pageable pageable) {
        return togarakRepository.findAll(pageable);
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
