package Maktab.uz.service;
import Maktab.uz.entity.Uquvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface UquvchiService extends GeneralService<Uquvchi, Number> {

    Page<Uquvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrIdOrYoshOrSinf (String key ,Pageable pageable);


}
