package Idrok.net.maktab.uz.repository;


import Idrok.net.maktab.uz.entity.Uquvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UquvchiRepository extends JpaRepository<Uquvchi, Long> {
    Page<Uquvchi> findAllByIsmContainingIgnoreCase(String key, Pageable pageable);

}
