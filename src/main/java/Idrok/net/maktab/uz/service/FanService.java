package Idrok.net.maktab.uz.service;

import Idrok.net.maktab.uz.entity.Fan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FanService extends GeneralService<Fan, Number>{
    Page<Fan> findAllByNomContainsIgnoreCaseOrId(String key , Pageable pageable);




}
