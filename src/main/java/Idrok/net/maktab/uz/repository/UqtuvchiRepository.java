package Idrok.net.maktab.uz.repository;

import Idrok.net.maktab.uz.entity.Uqtuvchi;
import Idrok.net.maktab.uz.entity.Uquvchi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UqtuvchiRepository extends JpaRepository<Uqtuvchi,Long >{
}
