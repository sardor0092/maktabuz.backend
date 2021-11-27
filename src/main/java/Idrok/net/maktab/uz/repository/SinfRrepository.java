package Idrok.net.maktab.uz.repository;

import Idrok.net.maktab.uz.entity.Sinf;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinfRrepository extends JpaRepository<Sinf,Long> {
    Page<Sinf> findAllByNomContainsIgnoreCaseOrId(String key, Long n, Pageable pageable);

}
