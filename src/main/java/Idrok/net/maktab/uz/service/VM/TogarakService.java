package Idrok.net.maktab.uz.service.VM;


import Idrok.net.maktab.uz.entity.Togarak;

import java.util.List;

public interface TogarakService {

    /**
     * Bu metod barcha postlarni yuklaydi
     */

    public List<Togarak> getAll();
    public Togarak create(Togarak togarak);
    public Togarak update(Togarak togarak);
    public void delete(Togarak togarak);
    public void deleteById(Long id);

}
