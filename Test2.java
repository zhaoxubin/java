public class Book{
    private String title;
    private String auther;
    private String price;
    public Book(String title,String auther,String price){
        this.title = title;
        this.auther = auther;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuther(){
        return auther;
    }
    public String getPrice(){
        return price;
    }
}


public class Test2{
    public static void main(String[] args){
        Book book = new Book("java�����ŵ���ͨ","���տƼ�","28.5");
        System.out.println("������  "+book.getTitle());
        System.out.println("���ߣ�  "+book.getAuther());
        System.out.println("�۸�  "+book.getPrice());
    }
}