package Maktab.uz.service.Impl;
import Maktab.uz.entity.Xona;
import Maktab.uz.repository.XonaRepository;
import Maktab.uz.service.XonaService;
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
    public Page<Xona> findAllByNomContainsIgnoreCaseOrBinoContainsIgnoreCaseOrSigimOrId(String key, Pageable pageable) {
        try {
            Long n=Long.parseLong(key);
            int i=Integer.parseInt(key);
            return xonaRepository.findAllByNomContainsIgnoreCaseOrBinoContainsIgnoreCaseOrSigimOrId(key ,key,i,n,pageable);
        }
        catch (Exception b){
            return xonaRepository.findAllByNomContainsIgnoreCaseOrBinoContainsIgnoreCaseOrSigimOrId(key,key,-1,(long)-1,pageable);


        }

    }
}
