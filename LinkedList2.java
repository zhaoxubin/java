public class Node{
    public int data;
    public Node next = null;
    public Node(int data){
        this.data = data;
    }
}


public class LinkedList6{
  private Node head = null;
  public void addFirst(int data){
      Node node = new Node(data);
      if(head == null){
          head = node;
          return;
      }
      node.next = head;
      head = node; 
  }
  public void addLast(int data){
      Node node = new Node(data);
      if(head == null){
          head = node;
          return;
      }
      Node tail = head;
      while(tail.next != null){
          tail = tail.next;
      }
      tail.next = node; 
  }
  public int getSize(){
      int size = 0;
      for(Node cur = head; cur != null;cur = cur.next){
          size++;
      }
      return size;
  }
  public void display(){
      for(Node cur = head; cur != null; cur = cur.next){
          System.out.print(cur.data+" ");
      }
      System.out.println();
  }
  public boolean  addIndex(int index, int data){
      int size = getSize();
      if(index < 0 || index >size){
          return false;
      }
      if(index == 0){
          addFirst(data);
          return true;
      }
      if(index == size){
          addLast(data);
          return true;
      }
      Node node = new Node(data);
      Node pre = getPos(index-1);
      node.next = pre.next;
      pre.next = node; 
      return true;
  }
  public Node  getPos(int index){
      Node cur = head;
      for(int i = 0; i < index; i++){
          cur = cur.next;
      }
      return cur;
  }
  public boolean contains(int toFind){
      for(Node cur = head; cur !=  null;cur = cur.next){
          if(cur.data == toFind){
              return true;
          }
      }
      return false;
  }
  public void remove(int toRemove){
      if(toRemove == head.data){
          head = head.next;
      }
      Node pre = searchPre(toRemove);
      Node toDelete = pre.next;
      pre.next = toDelete.next;
  }
  public Node searchPre(int toRemove){
      for(Node cur = head; cur != null && cur.next != null; cur = cur.next){
          if(cur.next.data == toRemove){
              return cur;
          }
      }
      return null;
  }
  public void removeAll(int toRemove){
      Node pre = head;
      Node cur = head.next;
      while(cur != null ){
          if(cur.data == toRemove){
              pre.next = cur.next;
              cur = pre.next;
          }  else {
              pre = cur;
              cur = cur.next;
          }
      }
      if(head.data == toRemove){
          head = head.next;
      }
  }
  public void clear(){
      head = null;
  }
}


public class Test{
 private static void testAddFirst(){
    LinkedList6 List = new LinkedList6(); 
    List.addFirst(1);
    List.addFirst(1);
    List.addFirst(1);
    List.addFirst(1);
    List.display();
   int size =  List.getSize();
   System.out.println(size);
 }  
 private static void testAddLast(){
       LinkedList6 List1 = new LinkedList6(); 
       List1.addLast(1);
       List1.addLast(2);
       List1.addLast(3);
       List1.addLast(4);
       List1.addLast(5);
       List1.display();
       List1.addIndex(2,8);
       List1.display();
       boolean result = List1.contains(10);
       System.out.println(result);
       List1.remove(8);
       List1.display();
       List1.addLast(1);
       List1.addLast(1);
       List1.addLast(1);
        List1.display();
        List1.removeAll(1);
        List1.display();
        List1.clear();
        List1.display();

 }
 public static void main(String[] args){
     //testAddFirst();
     testAddLast();
 }
}




