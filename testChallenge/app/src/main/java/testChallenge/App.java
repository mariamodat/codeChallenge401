/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package testChallenge;

import data.Node;

class Main {
  public static void main(String[] args)
  {
    LinkedList list = new LinkedList();
    list.append(2);
    list.append(4);
    list.append(6);

    LinkedList list2= new LinkedList();

    list2.append(9);
    list2.append(11);
    list2.append(8);
    list2.append(7);
    list2.append(30);

    System.out.println("here is data from the end "+list.kth(2));
    System.out.println("this is list2 :  "+list2);
    System.out.println(list2.reverse(list2));

//    System.out.println(list);
//    LinkedList listNewMerged= new LinkedList();

    System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");
//    System.out.println(listNewMerged);
//    System.out.println("the new linked list is :  "+listNewMerged.mergeNodes(list,list2));
//    System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");
  }
}
