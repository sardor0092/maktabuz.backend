package Idrok.net.maktab.uz.service;
import Idrok.net.maktab.uz.entity.Uquvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface UquvchiService extends GeneralService<Uquvchi, Number> {

    Page<Uquvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrIdOrYoshOrSinf (String key ,Pageable pageable);


}
