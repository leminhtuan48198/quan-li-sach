package controller;

import model.Book;
import model.FictionBook;
import model.ProgrammingBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static storage.WriteReadFile.readFile;
import static storage.WriteReadFile.writeFile;

public class Manager {
   public static List<Book> listBook=readFile();
   static Scanner scanner=new Scanner(System.in);

   public static void addProgrammingBook(){
       System.out.println("Nhập mã sách");
       String bookCode=scanner.nextLine();
       System.out.println("Nhập tên sách");
       String name=scanner.nextLine();
       System.out.println("Nhập giá");
       int price=scanner.nextInt();
       Scanner scanner1=new Scanner(System.in);
       System.out.println("Nhập tên tác giả");
       String author=scanner1.nextLine();
       System.out.println("Nhập ngôn ngữ");
       String language=scanner1.nextLine();
       System.out.println("Nhập framework");
       String framework=scanner1.nextLine();
       ProgrammingBook programmingBook=new ProgrammingBook(bookCode,name,price,author,language,framework);
       listBook.add(programmingBook);
       writeFile(listBook);
   }
   public static void addFictionBook(){
       Scanner scanner1=new Scanner(System.in);
       System.out.println("Nhập mã sách");
       String bookCode=scanner1.nextLine();
       System.out.println("Nhập tên sách");
       String name=scanner1.nextLine();
       System.out.println("Nhập giá");
       int price=scanner1.nextInt();
       Scanner scanner2=new Scanner(System.in);
       System.out.println("Nhập tên tác giả");
       String author=scanner2.nextLine();
       System.out.println("Nhập thể loại");
       String category=scanner2.nextLine();
       FictionBook fictionBook=new FictionBook(bookCode,name,price,author,category);
       listBook.add(fictionBook);
       writeFile(listBook);
   }


    public static int getSumCost(){
       int sum=0;
       for (Book b: listBook
       ) {
           sum+=b.getPrice();
       }
       return sum;
   }
   public static int getCountOfJava(){
        int count=0;
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i) instanceof ProgrammingBook){
                ProgrammingBook p = (ProgrammingBook)listBook.get(i);
                String language = p.getLanguage();
                if (language.equals("Java")){
                    count++;
                }
            }
        }
        return count;
    }
    public static void displayBook(){
        for (Book book: listBook) {
            System.out.println(book);
        }
    }
    public static int getCountOfFiction1(){
           // dem so sach Fiction có thể loại là vien tuong 1
           int count=0;
           for (Book b:listBook
           ) {
               if(b instanceof FictionBook){
                   FictionBook p =(FictionBook)b;
                   String category =p.getCategory();
                   if(category.equals("vien tuong 1")){
                       count++;
                   }
               }

           } return count;
       }
        public static int getCountOfFictionBookBelow100(){
           int count =0;
            for (Book b:listBook
            ) {
                if(b instanceof FictionBook){
                    FictionBook p =(FictionBook)b;
                    int price =p.getPrice();
                    if( price<100){
                        count++;
                    }
                }

            }return count;

        }



}