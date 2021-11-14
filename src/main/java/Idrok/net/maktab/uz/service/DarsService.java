package Idrok.net.maktab.uz.service;

import Idrok.net.maktab.uz.entity.Dars;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface DarsService {

    public List<Dars> getAll();

    public Dars create(Dars dars);
    public Dars update(Dars dars);
    public void delete(Dars dars);
    public  void deleteById(Long id);

}
