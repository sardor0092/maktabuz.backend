package Idrok.net.maktab.uz.repository;

import Idrok.net.maktab.uz.entity.Xona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface XonaRepository extends JpaRepository<Xona ,Long> {

}
