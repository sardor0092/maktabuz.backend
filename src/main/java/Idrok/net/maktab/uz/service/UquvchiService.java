package Idrok.net.maktab.uz.service;

import Idrok.net.maktab.uz.entity.Uquvchi;
import java.util.List;

public interface UquvchiService {
    /**
     * Bu metod barcha postlarni yuklaydi
     *
     * @return
     */

    public List<Uquvchi> getAll();
    public Uquvchi create(Uquvchi uquvchi);
    public Uquvchi update(Uquvchi uquvchi);
    public  void delete(Uquvchi uquvchi);
    public void deleteById(Long id);

}
