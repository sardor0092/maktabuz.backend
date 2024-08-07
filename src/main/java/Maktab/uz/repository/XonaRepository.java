package Maktab.uz.repository;

import Maktab.uz.entity.Xona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface XonaRepository extends JpaRepository<Xona,Long> {
    Page<Xona> findAllByNomContainsIgnoreCaseOrBinoContainsIgnoreCaseOrSigimOrId(String key,String key1,int sig ,Long id ,Pageable pageable);

}
