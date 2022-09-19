package com.ardecs.CacheWithSpring.cache.storage;

import com.ardecs.CacheWithSpring.cache.exceptions.FileAccessException;

public interface StorageStrategy<T, V> {

    void put(T key, V value) throws FileAccessException;

    V get(T key) throws FileAccessException;

    void clear();
}
