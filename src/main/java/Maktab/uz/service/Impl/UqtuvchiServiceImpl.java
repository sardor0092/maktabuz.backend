package Maktab.uz.service.Impl;

import Maktab.uz.entity.Uqtuvchi;
import Maktab.uz.repository.UqtuvchiRepository;
import Maktab.uz.service.UqtuvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UqtuvchiServiceImpl implements UqtuvchiService {
    @Autowired
    UqtuvchiRepository uqtuvchiRepository;

    @Override
    public Page<Uqtuvchi> getAll(Pageable pageable) {
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
    public Page<Uqtuvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrIdOrMaoshOrYoshOrJinsIgnoreCase(String key,  Pageable pageable) {
        try {
            Long n=Long.parseLong(key);
            int i=Integer.parseInt(key);
            return uqtuvchiRepository.findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrIdOrMaoshOrYoshOrJinsIgnoreCase(key ,key,n,i,i ,key,pageable);
        }
        catch (Exception b){
            return uqtuvchiRepository.findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrIdOrMaoshOrYoshOrJinsIgnoreCase(key ,key,(long) -1,-1,-1,key,pageable);


        }

    }
}
