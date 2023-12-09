package Tasks.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    public static void main(String[] args) {

        String filename = "person.obj";
        Person p1 = new Person("Bob", "Bobbins");

        try (
            var fs = new FileOutputStream(filename);
            var os = new ObjectOutputStream(fs);
        ) {
            os.writeObject(p1);
            System.out.println("Object has been written to a file");
        } catch (IOException e) {
            System.out.println("Error while saving a file " + filename);
            e.printStackTrace();
        }

    }
}
