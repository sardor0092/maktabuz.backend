package Idrok.net.maktab.uz.repository;
import Idrok.net.maktab.uz.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DarsRepository extends JpaRepository<Dars,Long> {


//    Page<Dars> findAllByFanContainsIgnoreCaseOrSinfxonaContainsIgnoreCaseOrUqtuvchiContainsIgnoreCaseOrUquvchiContainsIgnoreCaseOrXonaContainsIgnoreCaseOrId(String key, String key1, String key2, String key3, String key4, String key5, Long o, Pageable pageable);
}



