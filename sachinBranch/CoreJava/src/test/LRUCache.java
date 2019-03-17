/*
 *---------------------------------------------------------------------------
 *
 * Copyright (C) Ericsson AB 2018
 *
 * The copyright to the computer program(s) herein is the property of Ericsson
 * AB, Sweden. The program and the source code may used and/or copied only
 * with the written permission of Ericsson AB or in accordance with the terms
 * and conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *
 * All rights reserved.
 *
 *
 *---------------------------------------------------------------------------
 */
package test;

import java.util.HashMap;

public class LRUCache
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        LRUCacheHolder lrucache = new LRUCacheHolder();
        lrucache.put(1, 1);
        lrucache.put(10, 15);
        lrucache.put(15, 10);
        lrucache.put(10, 16);
        lrucache.put(12, 15);
        lrucache.put(10, 9);

        System.out.println(lrucache.getKey(1));
        System.out.println(lrucache.getKey(10));
        System.out.println(lrucache.getKey(15));
    }

}

class Entry
{
    int key;
    int value;
    Entry left;
    Entry right;
}

class LRUCacheHolder
{

    HashMap<Integer, Entry> myHashMap;
    Entry start, end;
    int size = 4;

    /**
     * 
     */
    public LRUCacheHolder()
    {
        myHashMap = new HashMap<>();
    }

    public int getKey(int key)
    {
        if (myHashMap.containsKey(key))
        {
            Entry entry = myHashMap.get(key);
            removeNode(entry);
            addAtTop(entry);
            return entry.value;
        }
        else
        {
            return -1;
        }
    }

    public void put(int key, int value)
    {
        if (myHashMap.containsKey(key))
        {
            Entry entry = myHashMap.get(key);
            entry.value = value;
            removeNode(entry);
            addAtTop(entry);
        }
        else
        {
            Entry newNode = new Entry();
            newNode.key = key;
            newNode.value = value;
            newNode.left = null;
            newNode.right = null;
            if (myHashMap.size() > size)
            {
                myHashMap.remove(end.key);
                removeNode(end);
                addAtTop(newNode);
            }
            else
            {
                addAtTop(newNode);
            }
            myHashMap.put(key, newNode);
        }

    }

    /**
     * @param entry
     */
    private void removeNode(Entry node)
    {
        if (node.left != null)
        {
            node.left.right = node.right;
        }
        else
        {
            start = node.right;
        }
        if (node.right != null)
        {
            node.right.left = node.left;
        }
        else
        {
            end = node.left;
        }
    }

    /**
     * @param entry
     */
    private void addAtTop(Entry node)
    {
        node.right = start;
        node.left = null;
        if (start != null)
        {
            start.left = node;
        }
        start = node;
        if (end == null)
        {
            end = start;
        }
    }

}
