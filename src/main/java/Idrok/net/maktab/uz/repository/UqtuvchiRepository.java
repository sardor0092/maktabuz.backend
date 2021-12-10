package Idrok.net.maktab.uz.repository;
import Idrok.net.maktab.uz.entity.Uqtuvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UqtuvchiRepository extends JpaRepository<Uqtuvchi, Long> {

Page<Uqtuvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrIdOrMaoshOrYoshOrJinsIgnoreCase
        (String ism, String fam,Long id,int maosh, int yosh ,String jins ,Pageable pageable);


}