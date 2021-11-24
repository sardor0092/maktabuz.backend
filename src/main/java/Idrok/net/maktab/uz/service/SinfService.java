package Idrok.net.maktab.uz.service;

import Idrok.net.maktab.uz.entity.Sinf;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SinfService extends GeneralService<Sinf, Number> {
    Page<Sinf> findAllByNomContainingIgnoreCase(String key, Pageable pageable);
}
