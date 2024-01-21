package com.example.Abstract;

public interface BaseServiceRepesitory<T> {
    void add(T entty);

    void delete(T entty);

    void update(T entty);
}
