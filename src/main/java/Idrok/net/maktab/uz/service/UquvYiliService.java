package Idrok.net.maktab.uz.service;


import Idrok.net.maktab.uz.entity.UquvYili;

import java.util.List;

public interface UquvYiliService {
    public List<UquvYili> getAll(UquvYili uquvYili);

    public UquvYili create(UquvYili uquvYili);
    public UquvYili update(UquvYili uquvYili);
    public  void delete(UquvYili uquvYili);
    public void deleteById(Long id);

}
