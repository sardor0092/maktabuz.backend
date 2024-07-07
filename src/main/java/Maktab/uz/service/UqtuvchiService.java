package Maktab.uz.service;
import Maktab.uz.entity.Uqtuvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface UqtuvchiService extends GeneralService<Uqtuvchi, Number>{
    public Page<Uqtuvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrIdOrMaoshOrYoshOrJinsIgnoreCase(String key,Pageable pageable);


}
