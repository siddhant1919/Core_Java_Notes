package com.wrapperClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class WrapperClasses {

	public static void main(String[] args) {
		
		// Create an ArrayList of wrapper classes
        ArrayList<Number> wrapperList = new ArrayList<>();
        wrapperList.add(new Integer(10));
        wrapperList.add(new Double(3.14));
//        wrapperList.add(new Boolean(true));
        wrapperList.add(new Byte((byte) 127));
//        wrapperList.add(new Character('A'));
        wrapperList.add(new Short((short) 32767));
        wrapperList.add(new Long(123456789L));
        wrapperList.add(new Float(2.718f));
        
        // Insert a new wrapper class
        wrapperList.add(new Integer(20));
        System.out.println("After inserting a new wrapper class:");
        printList(wrapperList);
        
        // Delete a wrapper class
        wrapperList.remove(new Double(3.14));
        System.out.println("After deleting a wrapper class:");
        printList(wrapperList);
        
        // Search for a wrapper class
        int index = wrapperList.indexOf(new Character('A'));
        System.out.println("Index of 'A': " + index);
        
        // Iterate over the list
        System.out.println("Iterating over the list:");
        Iterator<Number> iterator = wrapperList.iterator();
        while (iterator.hasNext()) {
            Number wrapper = iterator.next();
            System.out.println(wrapper.getClass().getSimpleName() + ": " + wrapper);
        }
        
        // Sort the list
//        Collections.sort(wrapperList);
//        System.out.println("After sorting the list:");
//        printList(wrapperList);
    }
    
    private static void printList(ArrayList<Number> list) {
        for (Number wrapper : list) {
            System.out.println(wrapper.getClass().getSimpleName() + ": " + wrapper);
        }

	}

}
