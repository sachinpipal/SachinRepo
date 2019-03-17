/*
 *---------------------------------------------------------------------------
 *
 * Copyright (C) Ericsson AB 2019
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
package array;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
       List<Integer>list=new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       
       System.out.println(list);
       list.remove(2);
       System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }

}
