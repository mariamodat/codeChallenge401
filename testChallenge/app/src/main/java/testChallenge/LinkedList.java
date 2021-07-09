package testChallenge;

import data.Node;

import java.util.Stack;

public class LinkedList {
  static Node head; // head of the list

  public void append(int value){
    Node node=new Node (value);
    if(this.head == null){
      this.head=node;
    }else{
      Node curr=this.head;
      while (curr.getNext() != null){
        curr=curr.getNext();
      }
      curr.setNext(node);
    }
  }
  public void insertBefore(int ref, int value){
    Node curr = this.head;
    while (curr.getNext() != null){
      if (curr.getNext().getData() == ref){
        Node node = new Node(value);
        node.setNext(curr.getNext());
        curr.setNext(node);
      }
      curr=curr.getNext();
    }
  }
  public void insertAfter(int ref , int value){
    Node curr = this.head;
    while (curr != null){
      if (curr.getNext().getData() == ref){
        Node node = new Node(value);
        curr.setNext(node.getNext());
        curr.setNext(node);
      }
      curr=curr.getNext();
    }
  }
  public void insert(int value){
    Node node = new Node(value);
    if(this.head==null) {
      this.head=node;
    }else{
      Node current = this.head;
      node.setNext(current);
      this.head=node;
    }
  }
  public boolean include(int value){
    Node current = this.head;
    while (current.getNext() != null){
      if(current.getData() == value){
        return true;
      }
      current=current.getNext();
    }
    return false;
  }
  @Override
  public String toString(){
    String result = "";
    Node current = this.head;
    while (current != null) {
      result += "{" + current.getData() + "} ->";
      current = current.getNext();
    }
    result +="Null";
    return result;
  }





  public  int kth (int k){
    int len = 0;
    Node temp = head;

    // we will move q to the Kth from the beginning :

    while (temp != null) {
      temp = temp.getNext();
      len++;
    }
    if (len <k  )
      return -1 ;
    if (k<0 )
    {return 0;}

    temp = head;
    for (int i = 1; i < len - k+1; i++)
      temp = temp.getNext();

   return temp.getData();

  }



  public LinkedList mergeNodes (LinkedList a , LinkedList b ){

    Node next1 = a.head.getNext();

   Node next2 =b.head.getNext();
   LinkedList list3 =new LinkedList();

 list3.append(next1.getData());



    while (next1 != null && next2 != null) {

    // set the pointers
     Node curr = next1.getNext();
      next1.setNext(next2);
     next1 = curr;
     next2 = next2.getNext();
   }
     if (next1== null){ next1.setNext(next2);}
      if (next2== null){ next2.setNext(next1);}

return  list3;


  }



  public LinkedList reverse (LinkedList list){
    Node curr = list.head ;
    Node next = null ;
    Node next2 = null ;
    while (curr !=null){
      next=curr.getNext();
      curr.setNext(next2);
      next2=curr;
      curr =next;


    }
list.head = next2;
    return list;

  }


}






}

