package Idrok.net.maktab.uz.service.VM;

import Idrok.net.maktab.uz.entity.Xona;

import java.util.List;

public interface XonaService {

    /**
     * Bu metod barcha postlarni yuklaydi
     *
     */

    public List<Xona> getAll();
    public Xona create(Xona xona);
    public Xona update(Xona xona);
    public  void delete(Xona xona);
    public void deleteById(Long id);
}
