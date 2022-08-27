package storage;

import model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile {
    public static List<Book> readFile(){
        List<Book> books =new ArrayList<>();
        try {
            FileInputStream fis=new FileInputStream("book.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            books=(List<Book>)ois.readObject();
            ois.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return books;
    }
    public static void writeFile(List<Book> books){
        try {
            FileOutputStream  fos = new FileOutputStream("book.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(books);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }


    }
}
