package com.serialization;

import java.io.*;

public class SerializationDemo {
	
	 public static void main(String[] args) {
	        // Create an object to serialize
	        Person person = new Person("John", 30);
	        
	        // Serialize the object
	        try {
	            FileOutputStream fileOut = new FileOutputStream("person.ser");
	            ObjectOutputStream out = new ObjectOutputStream(fileOut);
	            out.writeObject(person);
	            out.close();
	            fileOut.close();
	            System.out.println("Serialized data saved to person.ser");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        // Deserialize the object
	        try {
	            FileInputStream fileIn = new FileInputStream("person.ser");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            Person deserializedPerson = (Person) in.readObject();
	            in.close();
	            fileIn.close();
	            System.out.println("Deserialized data:");
	            System.out.println("Name: " + deserializedPerson.getName());
	            System.out.println("Age: " + deserializedPerson.getAge());
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }

}
