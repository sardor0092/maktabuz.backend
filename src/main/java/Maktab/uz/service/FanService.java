package Maktab.uz.service;

import Maktab.uz.entity.Fan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FanService extends GeneralService<Fan, Number>{
    Page<Fan> findAllByNomContainsIgnoreCaseOrId(String key , Pageable pageable);




}
