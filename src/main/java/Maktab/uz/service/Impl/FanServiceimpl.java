package Maktab.uz.service.Impl;

import Maktab.uz.entity.Fan;
import Maktab.uz.repository.FanRepository;
import Maktab.uz.service.FanService;
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
    public Page<Fan> findAllByNomContainsIgnoreCaseOrId(String key, Pageable pageable) {

        try {
            Long n=Long.parseLong(key);
            int i=Integer.parseInt(key);
            return fanRepository.findAllByNomContainsIgnoreCaseOrId(key,n , pageable);
        }
        catch (Exception f){

            return fanRepository.findAllByNomContainsIgnoreCaseOrId(key,(long)-1 , pageable);
        }

    }
}
