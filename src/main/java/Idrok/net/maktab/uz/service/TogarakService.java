package Idrok.net.maktab.uz.service;
import Idrok.net.maktab.uz.entity.Togarak;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TogarakService extends GeneralService<Togarak, Number>{
    Page<Togarak> findAllByFanContainingIgnoreCase(String key, Pageable pageable);

}
