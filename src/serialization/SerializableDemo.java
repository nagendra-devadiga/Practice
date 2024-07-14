package serialization;

import java.io.*;
// process of storing stream of data into a file.
// Everything is taken care of by JVM and the programmer doesn’t have any control.
// It is always possible to solve the total object to file.
// It is not possible to save part of the object which may create performance problems.
class SerializableDemo implements Serializable {

    // Member variables of this class
    transient String name;
    int age;
    int jobId;

    // Default constructor
    public SerializableDemo(String name, int age, int jobId)
    {
        // This keyword is used to refer
        // current object instance
        this.name = name;
        this.age = age;
        this.jobId = jobId;
    }

    // Method 2
    // Main driver method
    public static void main(String[] args) throws Exception
    {

        // Creating an object of class in main() method
        SerializableDemo t1
                = new SerializableDemo("Ram", 34, 2364);

        // Serialization

        // Saving of object in a file
        FileOutputStream fos
                = new FileOutputStream("abc1.ser");
        ObjectOutputStream oos
                = new ObjectOutputStream(fos);

        // Method for serialization of object
        oos.writeObject(t1);

        System.out.println("Object has been serialized");
        // Deserialization

        // Reading the object from a file
        FileInputStream fis
                = new FileInputStream("abc1.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Method for deserialization of object
        SerializableDemo t2
                = (SerializableDemo)ois.readObject();

        // Display message only
        System.out.println("Object has been deserialized ");

        // Print and display the name and age
        // to illustrate Serializable
        System.out.println("Name:" + t2.name + "\n"
                + "Age:" + t2.age + "\n"
                + t2.jobId);
    }
}