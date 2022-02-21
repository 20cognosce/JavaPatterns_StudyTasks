package Prac3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class ImaginaryThreadSafeHashMap<K, V> implements Map<K, V> {
    private final Map<K, V> coreHashMap = new HashMap<>();
    private final Semaphore semaphore = new Semaphore(1);

    @Override
    public V put(K key, V value) {
        V returnValue = null;
        try {
            semaphore.acquire();
            returnValue = coreHashMap.put(key, value);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }


    @Override
    public V get(Object key) { //в семафор оборачивать нужно всё тело метода!!!
        V returnValue = null;
        try {
            semaphore.acquire();
            returnValue = coreHashMap.get(key); //а делать return прямо отсюда не освободит semaphore
            semaphore.release();
            //и в этот момент когда отпустили семафор, но еще нет return'а возможен доступ из другого потока
            //который например поменял значение по такому ключу, и по факту get уже другой
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }

    @Override
    public void putAll(Map m) {
        try {
            semaphore.acquire();
            coreHashMap.putAll(m);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public V remove(Object key) {
        V returnValue = null;
        try {
            semaphore.acquire();
            returnValue = coreHashMap.remove(key);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }

    @Override
    public int size() {
        return coreHashMap.size();
    }

    @Override
    public boolean isEmpty() {
        return coreHashMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return coreHashMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return coreHashMap.containsValue(value);
    }

    @Override
    public void clear() {
        coreHashMap.clear();
    }

    @Override
    public Set<K> keySet() {
        return coreHashMap.keySet();
    }

    @Override
    public Collection<V> values() {
        return coreHashMap.values();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return coreHashMap.entrySet();
    }

    @Override
    public String toString() {
        return coreHashMap.toString();
    }
}
