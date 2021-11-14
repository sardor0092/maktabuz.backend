package Idrok.net.maktab.uz.repository;

import Idrok.net.maktab.uz.entity.Dars;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DarsRepository extends JpaRepository<Dars,Long> {
//    Page<Dars> findAllByFanContaining( Pageable pageable);
}
