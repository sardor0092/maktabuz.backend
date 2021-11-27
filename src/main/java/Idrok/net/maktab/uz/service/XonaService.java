package Idrok.net.maktab.uz.service;
import Idrok.net.maktab.uz.entity.Xona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface XonaService extends GeneralService<Xona, Number> {
    Page<Xona>findAllByNomContainsIgnoreCaseOrBinoContainsIgnoreCaseOrSigimOrId(String key, Pageable pageable);


}
