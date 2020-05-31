/******************************************************************************
Create a class called Author is designed as follows:
It contains:
• Three private instance variables: name (String), email (String), and gender (char of either ‘m’ or
‘f’).
• One constructor to initialize the name, email and gender with the given values.
And, a class called Book is designed as follows:
It contains:
• Four private instance variables: name (String), author (of the class Author you have just created),
price (double), and qtyInStock (int). Assuming that each book is written by one author.
• One constructor which constructs an instance with the values given.
• Getters and setters: getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(),
setQtyInStock(). Again there is no setter for name and author.
Write the class Book (which uses the Author class written earlier).
Try:
1. Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName())
2. After obtaining the “Author” object, print the Author (name, email & gender) of the book.

*******************************************************************************/
class Author
{
    private String name;
    private String email;
    private char gender;
    Author(String n,String e,char g)
    { 
        this.name=n;
        this.email=e;
        this.gender=g;
    }
    public String print()
    {
        return name+" ("+gender+") at "+email;
    }
    public String getName()
    {
        return name;
    }
}
class Book 
{
    private String name;
    private Author author;
    private double price;
    private int qty;
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName()
    {
        return name;
    }
    public String getAuthor()
    {
        return author.print();
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public int getQty()
    {
        return qty;
    }
    public void setQty(int qty)
    {
        this.qty=qty;
    }
    public String toString() {
        return name + " by " + author.getName();
    }
}
public class Books
{
    public static void main (String[] args)
    {
    Author a= new Author("Krish", "abc@mail.com", 'm');
    Book b=new Book("Java", a, 10.22, 22);
    String d=a.print();
    System.out.println(d);
    System.out.println(b);
    b.setPrice(10.78);
    b.setQty(78);
    System.out.println("The name of the book is :"+b.getName());
    System.out.println("The price of the book is :"+b.getPrice());
    System.out.println("The stock is :"+b.getQty());
}
}
