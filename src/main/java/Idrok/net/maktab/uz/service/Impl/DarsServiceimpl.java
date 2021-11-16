package Idrok.net.maktab.uz.service.Impl;

import Idrok.net.maktab.uz.entity.Dars;
import Idrok.net.maktab.uz.repository.DarsRepository;
import Idrok.net.maktab.uz.service.DarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DarsServiceimpl implements DarsService {

    @Autowired
    DarsRepository darsRepository;

    @Override
    public Page<Dars> getAll( Pageable pageable ) {
        return darsRepository.findAll(pageable);
    }

    @Override
    public Dars create(Dars dars) {
        return darsRepository.save(dars);
    }

    @Override
    public Dars update(Dars dars) {
        return darsRepository.save(dars);

    }

    @Override
    public void delete(Dars dars) {
        darsRepository.delete(dars);
    }

    @Override
    public void deleteById(Long id) {
        darsRepository.deleteById(id);

    }
}
