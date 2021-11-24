package Idrok.net.maktab.uz.service;
import Idrok.net.maktab.uz.entity.Uqtuvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.parameters.P;

public interface UqtuvchiService extends GeneralService<Uqtuvchi, Number>{
    public Page<Uqtuvchi> findAllByIsmContainingIgnoreCase(String key,Pageable pageable);


}
