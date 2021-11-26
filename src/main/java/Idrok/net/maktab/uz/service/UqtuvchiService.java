package Idrok.net.maktab.uz.service;
import Idrok.net.maktab.uz.entity.Uqtuvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface UqtuvchiService extends GeneralService<Uqtuvchi, Number>{
    public Page<Uqtuvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrIdOrMaoshOrYoshOrJinsIgnoreCase(String key,Pageable pageable);


}
