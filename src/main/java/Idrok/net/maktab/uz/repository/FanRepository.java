package Idrok.net.maktab.uz.repository;
import Idrok.net.maktab.uz.entity.Fan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FanRepository extends JpaRepository<Fan,Long> {
    Page<Fan> findAllByNomContainsIgnoreCaseOrId(String key ,Long id , Pageable pageable);


}
