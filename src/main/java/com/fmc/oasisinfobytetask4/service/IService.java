package com.fmc.oasisinfobytetask4.service;

import java.util.Optional;

public interface IService <T,V>{
    V save (T t);
    V update (T t);
    Optional<T > read(V v);
    void delete (V v);
}
