package com.ardecs.CacheWithSpring.cache;

import com.ardecs.CacheWithSpring.cache.exceptions.FileAccessException;
import com.ardecs.CacheWithSpring.cache.storage.StorageStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cache<T, V> {
    private static final Logger LOGGER = LoggerFactory.getLogger(Cache.class);
    private final StorageStrategy<T, V> storageStrategy;

    @Autowired
    public Cache(StorageStrategy storageStrategy) {
        LOGGER.info("CacheBean");
        this.storageStrategy = storageStrategy;
    }

    public void put(T key, V value) throws FileAccessException {
        storageStrategy.put(key, value);
    }

    public Object get(T key) throws FileAccessException {
        return storageStrategy.get(key);
    }

    public void clear() {
        storageStrategy.clear();
    }
}