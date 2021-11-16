package Idrok.net.maktab.uz.repository;
import Idrok.net.maktab.uz.entity.Fan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FanRepository extends JpaRepository<Fan,Long> {


}
