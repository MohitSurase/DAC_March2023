import java.util.Scanner;

class Book{
    //fields
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;

    //parameterless contructor
    public Book(){

    }
    
    //Getter and Setter methods
    public void setTitle( String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    }

    
    public void setAuthor( String author){
        this.author=author;
    }
    public String getAuthor(){
        return this.author;
    }
    
    public void setPublisher( String publisher){
        this.publisher=publisher;
    }
    public String getPublisher(){
        return this.publisher;
    }
    
    public void setISBN(String isbn){
        this.isbn=isbn;
    }
    public String getISBN(){
        return this.isbn;
    }
    
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return this.year;
    }
    
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
    
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }

}


class bookInfo{
    private Book b=new Book();
    Scanner sc=new Scanner(System.in);
    public void acceptDetails(){
        
        System.out.println("Enter Title of the book :   ");
        b.setTitle(sc.nextLine());

        System.out.println("Enter Author of the book :   ");
        b.setAuthor(sc.nextLine());

        System.out.println("Enter Publisher of the book :   ");
        b.setPublisher(sc.nextLine());

        System.out.println("Enter ISBN of the book :   ");
        b.setISBN(sc.nextLine());

        System.out.println("Enter Year of the book :   ");
        b.setYear(sc.nextInt());

        System.out.println("Enter Price of the book :   ");
        b.setPrice(sc.nextDouble());

        System.out.println("Enter Quantity of the book :   ");
        b.setQuantity(sc.nextInt());

    }

    public void printDetails(){
        System.out.println("Title : "+b.getTitle()+"\nAuthor : "+b.getAuthor()+"\nPublisher : "+b.getPublisher()+
        "\nISBN : "+b.getISBN()+"\nYear : "+b.getYear()+"\nPrice : "+b.getYear()+"\nPrice : "+b.getPrice()+"\nQuantity : "+b.getQuantity());
    }

    public void increaseQuantity(){
        
        System.out.println("Enter Quantity to increase :   ");
        int qi=sc.nextInt();
        b.setQuantity(b.getQuantity()+qi);   
    }    

    public void decreaseQuantity(){
        
        System.out.println("Enter Quantity to decrease :   ");
        int qd=sc.nextInt();
        b.setQuantity(b.getQuantity()-qd);
    }


    public static int menuList(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Accept Details");
        System.out.println("2.Print Details");
        System.out.println("3.Increase Quantity");
        System.out.println("4.Decrease Quantity");
        System.out.println("5.Exit");
        return sc.nextInt();
    }


}

class Program{
    public static void main(String[] args){
    bookInfo bi=new bookInfo();
    int choice;
    
    while((choice=bookInfo.menuList())!=5){
        switch(choice){
            case 1: bi.acceptDetails();
                    break;
            
            case 2: bi.printDetails();
                    break;
            
            case 3: bi.increaseQuantity();
                    break;
            
            case 4: bi.decreaseQuantity();
                    break;
                
        }


    }
    


}

}