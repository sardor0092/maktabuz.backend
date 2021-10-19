package Idrok.net.maktab.uz.service;


import Idrok.net.maktab.uz.entity.Uqtuvchi;

import java.util.List;

public interface UqtuvchiService {

    /**
     * Bu metod barcha postlarni yuklaydi
     *
     */

    public List<Uqtuvchi> getAll();
    public Uqtuvchi create(Uqtuvchi uqtuvchi);
    public Uqtuvchi update(Uqtuvchi uqtuvchi);
    public  void delete(Uqtuvchi uqtuvchi);
    public void deleteById(Long id);

}
