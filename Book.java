public class Book{
    private static int count = 0;
    public Book(String title){
         System.out.println("售出图书"+title);
         count++;
    }
    public static int getCount(){
         return count;
    }
  }
 public class Test{
        public static void main(String[] args){
        String[] titles = {"Java","数据库"，"操作系统"};
        for(int i = 0;i < 5;i++){
            new Book(titles[new Random().nextInt3]);
        }
        System.out.println("总计销售了"+Book.getCount()+"本图书");
      }
   }
    
  
