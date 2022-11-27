package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
/**
 * Сlass used to measure the execution time of various methods ArrayList and LinkedList and compare them
 */
public class СompareArrayListAndLinkedList {
    /**
     * The method marks the time for the execution of the add to the end in ArrayList function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @return time spent on performing operations
     */
    public Long timeAddArrayList(int n)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Date startMethodArrayList = new Date();
        for(int i = 0; i < n; i++)
            arrayList.add(i);
        Date finishMethodArrayList = new Date();
        long methodArrayTime = finishMethodArrayList.getTime() - startMethodArrayList.getTime();
        return methodArrayTime;
    }
    /**
     * The method marks the time for the execution of the add to the end in LinkedList function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @return time spent on performing operations
     */
    public Long timeAddLinkedList(int n)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Date startMethodLinkedList = new Date();
        for(int i = 0; i < n; i++)
            linkedList.add(i);
        Date finishMethodLinkedList = new Date();
        long methodLinkedTime = finishMethodLinkedList.getTime() - startMethodLinkedList.getTime();
        return methodLinkedTime;
    }
    /**
     * The method marks the time for the execution of the add to middle in ArrayList function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @return time spent on performing operations
     */
    public Long timeAddToMiddleArrayList(int n)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Date startMethodArrayList = new Date();
        for(int i = 0; i < n; i++)
            arrayList.add(arrayList.size()/2,i);
        Date finishMethodArrayList = new Date();
        long methodArrayTime = finishMethodArrayList.getTime() - startMethodArrayList.getTime();
        return methodArrayTime;
    }
    /**
     * The method marks the time for the execution of the add to middle in LinkedList function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @return time spent on performing operations
     */
    public Long timeAddToMiddleLinkedList(int n)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Date startMethodLinkedList = new Date();
        for(int i = 0; i < n; i++)
            linkedList.add(linkedList.size()/2,i);
        Date finishMethodLinkedList = new Date();
        long methodLinkedTime = finishMethodLinkedList.getTime() - startMethodLinkedList.getTime();
        return methodLinkedTime;
    }
    /**
     * The method marks the time for the execution of the get from middle in ArrayList function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @return time spent on performing operations
     */
    public Long timeGetFromMiddleArrayList(int n)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
            arrayList.add(i);
        Date startMethodArrayList = new Date();
        for(int i = 0; i < n; i++)
            arrayList.get(arrayList.size()/2);
        Date finishMethodArrayList = new Date();
        long methodArrayTime = finishMethodArrayList.getTime() - startMethodArrayList.getTime();
        return methodArrayTime;
    }
    /**
     * The method marks the time for the execution of the get from middle in LinkedList function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @return time spent on performing operations
     */
    public Long timeGetFromMiddleLinkedList(int n)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int i = 0; i < n; i++)
            linkedList.add(i);
        Date startMethodLinkedList = new Date();
        for(int i = 0; i < n; i++)
            linkedList.get(linkedList.size()/2);
        Date finishMethodLinkedList = new Date();
        long methodLinkedTime = finishMethodLinkedList.getTime() - startMethodLinkedList.getTime();
        return methodLinkedTime;
    }
    /**
     * The method marks the time for the execution of the remove from middle in ArrayList function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @return time spent on performing operations
     */
    public Long timeRemoveFromMiddleArrayList(int n)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < 2*n; i++)
            arrayList.add(i);
        Date startMethodArrayList = new Date();
        for(int i = 0; i < n; i++)
            arrayList.remove(arrayList.size()/2);
        Date finishMethodArrayList = new Date();
        long methodArrayTime = finishMethodArrayList.getTime() - startMethodArrayList.getTime();
        return methodArrayTime;
    }
    /**
     * The method marks the time for the execution of the remove from middle in LinkedList function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @return time spent on performing operations
     */
    public Long timeRemoveFromMiddleLinkedList(int n)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int i = 0; i < 2*n; i++)
            linkedList.add(i);
        Date startMethodLinkedList = new Date();
        for(int i = 0; i < n; i++)
            linkedList.remove(linkedList.size()/2);
        Date finishMethodLinkedList = new Date();
        long methodLinkedTime = finishMethodLinkedList.getTime() - startMethodLinkedList.getTime();
        return methodLinkedTime;
    }
    /**
     * The method marks the time for the execution of the remove from begin in ArrayList function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @return time spent on performing operations
     */
    public Long timeRemoveFromBeginArrayList(int n)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
            arrayList.add(i);
        Date startMethodArrayList = new Date();
        for(int i = 0; i < n; i++)
            arrayList.remove(0);
        Date finishMethodArrayList = new Date();
        long methodArrayTime = finishMethodArrayList.getTime() - startMethodArrayList.getTime();
        return methodArrayTime;
    }
    /**
     * The method marks the time for the execution of the remove from begin in LinkedList function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @return time spent on performing operations
     */
    public Long timeRemoveFromBeginLinkedList(int n)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int i = 0; i < n; i++)
            linkedList.add(i);
        Date startMethodLinkedList = new Date();
        for(int i = 0; i < n; i++)
            //linkedList.remove(0);
            linkedList.removeFirst();
        Date finishMethodLinkedList = new Date();
        long methodLinkedTime = finishMethodLinkedList.getTime() - startMethodLinkedList.getTime();
        return methodLinkedTime;
    }
    /**
     * The method marks the time for the execution of the remove from end in ArrayList function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @return time spent on performing operations
     */
    public Long timeRemoveFromEndArrayList(int n)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < 2*n; i++)
            arrayList.add(i);
        Date startMethodArrayList = new Date();
        for(int i = 0; i < n; i++)
            arrayList.remove(arrayList.size()-1);
        Date finishMethodArrayList = new Date();
        long methodArrayTime = finishMethodArrayList.getTime() - startMethodArrayList.getTime();
        return methodArrayTime;
    }
    /**
     * The method marks the time for the execution of the remove from end in LinkedList function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @return time spent on performing operations
     */
    public Long timeRemoveFromEndLinkedList(int n)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int i = 0; i < 2*n; i++)
            linkedList.add(i);
        Date startMethodLinkedList = new Date();
        for(int i = 0; i < n; i++)
            linkedList.removeLast();
        Date finishMethodLinkedList = new Date();
        long methodLinkedTime = finishMethodLinkedList.getTime() - startMethodLinkedList.getTime();
        return methodLinkedTime;
    }
    /**
     * The method generates a table of comparisons of ArrayList and LinkedList
     * by the execution time of various operations
     * @param n number of operations performed
     */
    public void tableOfСompare (int n)
    {
        if (n<=0)
        {
            System.out.println("Error! The number of executions <=0!");
            return;
        }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        System.out.format("%-20s%24s%16s%16s", "Methods", "Number of executions", "ArrayList", "LinkedList\n");
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        Long timeArrayList = timeAddArrayList(n);
        Long timeLinkedList = timeAddLinkedList(n);
        System.out.format("%-20s%24s%16s%16s", "Add", n, timeArrayList+" ms", timeLinkedList+" ms\n");
        timeArrayList = timeAddToMiddleArrayList(n);
        timeLinkedList = timeAddToMiddleLinkedList(n);
        System.out.format("%-20s%24s%16s%16s", "Add to middle", n, timeArrayList+" ms", timeLinkedList+" ms\n");
        timeArrayList = timeGetFromMiddleArrayList(n);
        timeLinkedList = timeGetFromMiddleLinkedList(n);
        System.out.format("%-20s%24s%16s%16s", "Get from middle", n, timeArrayList+" ms", timeLinkedList+" ms\n");
        timeArrayList = timeRemoveFromBeginArrayList(n);
        timeLinkedList = timeRemoveFromBeginLinkedList(n);
        System.out.format("%-20s%24s%16s%16s", "Remove from begin", n, timeArrayList+" ms", timeLinkedList+" ms\n");
        timeArrayList = timeRemoveFromMiddleArrayList(n);
        timeLinkedList = timeRemoveFromMiddleLinkedList(n);
        System.out.format("%-20s%24s%16s%16s", "Remove from middle", n, timeArrayList+" ms", timeLinkedList+" ms\n");
        timeArrayList = timeRemoveFromEndArrayList(n);
        timeLinkedList = timeRemoveFromEndLinkedList(n);
        System.out.format("%-20s%24s%16s%16s", "Remove from end", n, timeArrayList+" ms", timeLinkedList+" ms\n");
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
    }
    /**
     * The method generates a table of comparisons of ArrayList and LinkedList
     * by the execution time of various operations
     * @param n an array in which various values of the number of operations are stored
     * @param size size of the transmitted array
     */
    public void tableOfСompare (int size, int n[])
    {
        int i = -1;
        int j = 0;
        boolean t = false;
        while (j<size && i<0 && n!= null)
        {
            if (n[j] > 0)
                i = j;
            j++;
        }
        if (i == -1)
        {
            System.out.println("Error! The array is empty or all of its values <=0!");
            return;
        }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        System.out.format("%-20s%24s%16s%16s", "Methods", "Number of executions", "ArrayList", "LinkedList\n");
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        Long timeArrayList = timeAddArrayList(n[i]);
        Long timeLinkedList = timeAddLinkedList(n[i]);
        System.out.format("%-20s%24s%16s%16s", "Add", n[i], timeArrayList+" ms", timeLinkedList+" ms\n");
        for (j=i+1;j<size;j++)
            if (n[j]>0)
            {
                timeArrayList = timeAddArrayList(n[j]);
                timeLinkedList = timeAddLinkedList(n[j]);
                System.out.format("%-20s%24s%16s%16s", "", n[j], timeArrayList+" ms", timeLinkedList+" ms\n");
            }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        timeArrayList = timeAddToMiddleArrayList(n[i]);
        timeLinkedList = timeAddToMiddleLinkedList(n[i]);
        System.out.format("%-20s%24s%16s%16s", "Add to middle", n[i], timeArrayList+" ms", timeLinkedList+" ms\n");
        for (j=i+1;j<size;j++)
            if (n[j]>0)
            {
                timeArrayList = timeAddToMiddleArrayList(n[j]);
                timeLinkedList = timeAddToMiddleLinkedList(n[j]);
                System.out.format("%-20s%24s%16s%16s", "", n[j], timeArrayList+" ms", timeLinkedList+" ms\n");
            }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        timeArrayList = timeGetFromMiddleArrayList(n[i]);
        timeLinkedList = timeGetFromMiddleLinkedList(n[i]);
        System.out.format("%-20s%24s%16s%16s", "Get from middle", n[i], timeArrayList+" ms", timeLinkedList+" ms\n");
        for (j=i+1;j<size;j++)
            if (n[j]>0)
            {
                timeArrayList = timeGetFromMiddleArrayList(n[j]);
                timeLinkedList = timeGetFromMiddleLinkedList(n[j]);
                System.out.format("%-20s%24s%16s%16s", "", n[j], timeArrayList+" ms", timeLinkedList+" ms\n");
            }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        timeArrayList = timeRemoveFromBeginArrayList(n[i]);
        timeLinkedList = timeRemoveFromBeginLinkedList(n[i]);
        System.out.format("%-20s%24s%16s%16s", "Remove from begin", n[i], timeArrayList+" ms", timeLinkedList+" ms\n");
        for (j=i+1;j<size;j++)
            if (n[j]>0)
            {
                timeArrayList = timeRemoveFromBeginArrayList(n[j]);
                timeLinkedList = timeRemoveFromBeginLinkedList(n[j]);
                System.out.format("%-20s%24s%16s%16s", "", n[j], timeArrayList+" ms", timeLinkedList+" ms\n");
            }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        timeArrayList = timeRemoveFromMiddleArrayList(n[i]);
        timeLinkedList = timeRemoveFromMiddleLinkedList(n[i]);
        System.out.format("%-20s%24s%16s%16s", "Remove from middle", n[i], timeArrayList+" ms", timeLinkedList+" ms\n");
        for (j=i+1;j<size;j++)
            if (n[j]>0)
            {
                timeArrayList = timeRemoveFromMiddleArrayList(n[j]);
                timeLinkedList = timeRemoveFromMiddleLinkedList(n[j]);
                System.out.format("%-20s%24s%16s%16s", "", n[j], timeArrayList+" ms", timeLinkedList+" ms\n");
            }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        timeArrayList = timeRemoveFromEndArrayList(n[i]);
        timeLinkedList = timeRemoveFromEndLinkedList(n[i]);
        System.out.format("%-20s%24s%16s%16s", "Remove from end", n[i], timeArrayList+" ms", timeLinkedList+" ms\n");
        for (j=i+1;j<size;j++)
            if (n[j]>0)
            {
                timeArrayList = timeRemoveFromEndArrayList(n[j]);
                timeLinkedList = timeRemoveFromEndLinkedList(n[j]);
                System.out.format("%-20s%24s%16s%16s", "", n[j], timeArrayList+" ms", timeLinkedList+" ms\n");
            }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
    }
}
