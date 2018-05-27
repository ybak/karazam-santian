package com.klzan.core.persist.mybatis.pagehelper.cache;

/**
 * Simple cache interface
 */
public interface Cache<K, V> {

    V get(K key);

    void put(K key, V value);
}
