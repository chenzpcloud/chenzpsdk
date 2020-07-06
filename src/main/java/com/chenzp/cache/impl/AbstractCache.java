package com.chenzp.cache.impl;

import com.chenzp.cache.Cache;

import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class AbstractCache<K, V> implements Cache<K, V> {

    private static final long serialVersionUID = 1L;


    private final ReentrantReadWriteLock cacheLock = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock.ReadLock readLock = cacheLock.readLock();
    private final ReentrantReadWriteLock.WriteLock writeLock = cacheLock.writeLock();

    /** 返回缓存容量，<code>0</code>表示无大小限制 */
    protected int capacity;
    /** 缓存失效时长， <code>0</code> 表示无限制，单位毫秒 */
    protected long timeout;

    /** 每个对象是否有单独的失效时长，用于决定清理过期对象是否有必要。 */
    protected boolean existCustomTimeout;

    /** 命中数 */
    protected int hitCount;
    /** 丢失数 */
    protected int missCount;

}
