package Maktab.uz.repository;


import Maktab.uz.entity.Uquvchi;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UquvchiRepository extends JpaRepository<Uquvchi, Long> {
//    Page<Uquvchi> findAllByIsmOrFamiliyaOrSharifOrIdOrderByYosh(String key);



    public Page<Uquvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrIdOrYoshOrSinf
            (String ism, String fam,String sharif ,Long id, int yosh ,int sinf ,Pageable pageable);


}
