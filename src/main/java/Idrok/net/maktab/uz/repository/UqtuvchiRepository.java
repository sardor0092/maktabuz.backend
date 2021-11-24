package Idrok.net.maktab.uz.repository;
import Idrok.net.maktab.uz.entity.Uqtuvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UqtuvchiRepository extends JpaRepository<Uqtuvchi, Long> {
    Page<Uqtuvchi> findAllByIsmContainingIgnoreCase(String key, Pageable pageable);
    Page<Uqtuvchi> findAllByFamiliyaContainingIgnoreCase(String key, Pageable pageable);
    Page<Uqtuvchi> findAllByYoshIsGreaterThanEqual(String key, Pageable pageable);



}