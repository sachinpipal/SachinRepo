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

import java.util.Arrays;
import java.util.List;

import clone.CloneExample;

public class Hexa 
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
    	
        int array[]=new int[5];
        for (int i = 5; i >0; i--)
        {
            array[5-i]=i;
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
        }
        Box myBox=new Box();
        myBox.x=10;
        myBox.y=2;
        myBox.z=10;
        int y=myBox.x*myBox.y*myBox.z;
        System.out.println(y);
        
        List<String>peerList=Arrays.asList("Peer1","Peer2");
        String sessionId="session_1";
        String sessionId2="session_1session_1";
            int  hashKey = Math.abs(sessionId.hashCode() % peerList.size());
            String peer = peerList.get(hashKey);
            System.out.println( "sessionId : "+ sessionId +" hashKey :"+hashKey +"peer "+peer);
            int  hashKey2 = Math.abs(sessionId2.hashCode() % peerList.size());
            String peer2= peerList.get(hashKey2);
            System.out.println( "sessionId2 : "+ sessionId2 +" hashKey2 :"+hashKey2 +"peer2 "+peer2);
      
       
        
        
        
        
        
        
        
    }
    
}
class Box extends Hexa{
    int x,y,z;
    void dispalay() {
    	CloneExample cloneExample=new CloneExample();
    	//cloneExample.myName();
    }
}
