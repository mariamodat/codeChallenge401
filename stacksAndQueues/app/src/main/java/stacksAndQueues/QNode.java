package stacksAndQueues;

public class QNode {
int data;
QNode next ;

  public QNode(int data) {
    this.data = data;
    this.next=null ;
  }

  public int getData() {
    return data;
  }


  public QNode getNext() {
    return next;
  }

  public void setNext(QNode next) {
    this.next = next;
  }
}
