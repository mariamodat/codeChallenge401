/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package testChallenge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  LinkedList link1 = new LinkedList();
    @Test void kthGreaterThanLn() {
      link1.insert(2);
      link1.append(2);
      link1.append(3);
      link1.append(5);
    int x=  link1.kth(6);
      int expected = -1 ;
      assertEquals(expected ,x);


    }
    @Test void kthEqualsLen(){
      link1.insert(2);
      link1.append(2);
      link1.append(3);
      link1.append(5);
      int exp = 2;
      int x=  link1.kth(3);
      assertEquals(exp,x);
    }
//
    @Test void negativeKth(){
      link1.insert(2);
      link1.append(2);
      link1.append(3);
      link1.append(5);
      int exp = 0;
      int x=  link1.kth(-1);
      assertEquals(exp,x);
    }

  @Test void sizeOne(){
    link1.insert(2);

    int exp = 2;
    int x=  link1.kth(1);
    assertEquals(exp,x);
  }

  @Test void happyPath(){
    link1.insert(2);
    link1.append(2);
    link1.append(3);
    link1.append(5);
    link1.append(9);
    int exp = 3;
    int x=  link1.kth(3);
    assertEquals(exp,x);
  }



}
