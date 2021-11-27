package Idrok.net.maktab.uz.service.Impl;

import Idrok.net.maktab.uz.entity.Sinf;
import Idrok.net.maktab.uz.repository.SinfRrepository;
import Idrok.net.maktab.uz.service.SinfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SinfServiceimpl implements SinfService {

    @Autowired
    SinfRrepository sinfRrepository;

    @Override
    public Page<Sinf> getAll(Pageable pageable) {
        return sinfRrepository.findAll(pageable);
    }

    @Override
    public Sinf create(Sinf data) {
        return sinfRrepository.save(data);
    }

    @Override
    public Sinf update(Sinf data) {
        return sinfRrepository.save(data);
    }

    @Override
    public void delete(Sinf data) {
        sinfRrepository.delete(data);
    }

    @Override
    public void deleteById(Long id) {
        sinfRrepository.deleteById(id);

    }

    @Override
    public Page<Sinf> findAllByNomContainsIgnoreCaseOrId(String key, Pageable pageable) {

        try {
            Long n=Long.parseLong(key);
            int i=Integer.parseInt(key);
            return sinfRrepository.findAllByNomContainsIgnoreCaseOrId(key,n, pageable);
        }
        catch (Exception t){
            return sinfRrepository.findAllByNomContainsIgnoreCaseOrId(key,(long)-1, pageable);


        }

    }
}
