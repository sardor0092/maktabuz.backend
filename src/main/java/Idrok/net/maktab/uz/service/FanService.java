package Idrok.net.maktab.uz.service;

import Idrok.net.maktab.uz.entity.Fan;
import java.util.List;

public interface FanService {

  public List<Fan> getAll(Fan fan);
  public Fan create(Fan fan);
  public Fan update(Fan fan);
  public void delete(Fan fan);
  public void deleteById(Long id);



}
