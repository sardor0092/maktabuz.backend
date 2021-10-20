package Idrok.net.maktab.uz.repository;

import Idrok.net.maktab.uz.entity.Togarak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TogarakRepository extends JpaRepository<Togarak, Long> {
}
