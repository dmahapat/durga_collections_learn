package com.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* Map(interface)
* 1. if we want to represent a group of objects as a key value pair,then we should go for MAP
* 2. Both key and values are objects
* 3. Duplicate keys are not allowed but values can be duplicated
* 4. Each key-value pair is called Entry
* 5. There is no relationship between Collection and Map
* 6. Collection is meant for a group of individual objects Where as Map is meant for group of key value pairs
* 7. Map is not child interface of Collection
*
* Methods of Map interface:
*  1. Object put(Object key,Object value) - if the key is already available the old value is replaced with new value
*  2. void putAll(Map m) - to add a group of key-value pair
*  3. Object get(key) - returns value associated with particular key - if the key is not available we get null
*  4. Object remove(Object key)
*  5. boolean containsKey(Object key)
*  6. boolean containsValue(Object value)
*  7. int size()
*  8. boolean isEmpty()
*  9. void clear()
*
*  Collection views of the map
*  1. Set keySet()
*  2. Collection values()
*  3. Set entrySet()
*
*  Entry Interface:
*  1. Each key value pair is called Entry
*  2. Without existing map object there is no Entry object
*  3. hence Entry interface is defined inside Map interface
*
*  HashMap:
*  1. underlying DS is HashTable
*  2. Heterogeneous objects are allowed
*  3. duplicate keys are not allowed
*  4. values can be duplicated
*  5. insertion order is not preserved - as it is based on hashcode keys
*  6. null key is allowed - only once
*  7. null values are allowed - any number of times
*
* */
public class MapExample1 {
    static public void main(String... args) {
        HashMap hashMap = new HashMap(); // creates empty hashmap object - default initial capacity is 16
        //defines initial capacity - HashMap hashMap1 = new HashMap(18);
        // HashMap hm = new HashMap(Map m)

        hashMap.put("Robin Williams",100);
        hashMap.put("Martin Lawrence", 200);
        hashMap.put("Jack Black",300);

        System.out.println(hashMap);
        System.out.println(hashMap.put("Robin Williams",1000));// prints the value replaced
        System.out.println(hashMap);

        Set set = hashMap.keySet();
        System.out.println("Key set: "+set);

        Collection values = hashMap.values();
        System.out.println("Map values: "+values);

        Set entrySet1 = hashMap.entrySet();
        entrySet1.iterator()
                .forEachRemaining(o -> {
                    Map.Entry entry = (Map.Entry) o;
                    if(entry.getKey().toString().equalsIgnoreCase("Robin Williams")){
                        entry.setValue(15000);
                    }
                    System.out.println("Key: "+entry.getKey());
                    System.out.println("Value: "+entry.getValue());
                });
        System.out.println(hashMap);
    }
}
