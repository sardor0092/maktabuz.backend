package Maktab.uz.repository;

import Maktab.uz.entity.Togarak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TogarakRepository extends JpaRepository<Togarak, Long> {
//    Page<Togarak> findAllByFanContainsIgnoreCaseOrOqtuvchiContainsIgnoreCaseOrId(String key ,String key1 ,Long id,Pageable pageable);
}
