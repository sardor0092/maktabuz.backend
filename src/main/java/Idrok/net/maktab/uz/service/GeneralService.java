package Idrok.net.maktab.uz.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GeneralService<T> {
    public Page<T> getAll(Pageable pageable);
    public T create(T data);
    public T update(T data);
    public void delete(T data);
    public void deleteById(Long id);

}
