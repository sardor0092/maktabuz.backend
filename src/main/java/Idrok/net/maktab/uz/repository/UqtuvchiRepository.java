package Idrok.net.maktab.uz.repository;

import Idrok.net.maktab.uz.entity.Uqtuvchi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UqtuvchiRepository extends JpaRepository<Uqtuvchi,Long >{
//    List<Uqtuvchi> findByUqituvchiContaining(String u);
}
