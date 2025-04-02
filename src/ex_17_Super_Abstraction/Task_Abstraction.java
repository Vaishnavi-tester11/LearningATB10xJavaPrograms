package ex_17_Super_Abstraction;

public class Task_Abstraction {
    public static void main(String[] args) {
        Book myBook=new PrintMyBook("Harry Potter", " J.k. Rowling",120);
        myBook.getDetails();
    }
}
class PrintMyBook extends Book{
    String name;
    String author;
    int price;


    PrintMyBook(String name,String author, int price){
        this.name=name;
        this.author=author;
        this.price=price;
    }

    @Override
    void getDetails() {
        System.out.println(this.name+","+this.author+","+this.price);
    }
}

abstract class Book{
    abstract void getDetails();
}
