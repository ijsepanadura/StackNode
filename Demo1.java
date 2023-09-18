import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        Stack10 stack = new Stack10();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.print();
        
    }
}
class Stack10{
    Node head;
    Node tail;


    void push(int number){
        if(head==null){
            head= new Node(number);
            tail = head;         
        }else{   
            tail = new Node(number, tail);
        }

    }
    int peek(){
        return head == null ? -1: tail.value;
    }
    int pop(){
        if(head == null){
            return -1;
        }else{
            
            int pass= tail.value;
            tail = tail.next;
            if(tail==null)head=null;
            return pass;
            
        }
    }

    void print(){
        if(tail==null){
            System.out.println("[]");
        }else{
            // System.out.print("[");
            // Node temp = tail;
            // while(temp != null){
            //     System.out.print(temp.value+",");
            //     temp = temp.next;
            // }
            // System.out.println("\b]");
            ArrayList<Integer> listValue = new ArrayList<>();
            Node temp = tail;
            while(temp != null){
                listValue.add(temp.value);
                temp = temp.next;
            }
            Collections.reverse(listValue);
            System.out.println(listValue);
            

        }

    }

}

class Node{
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
    public Node(int number){
        this.value = number;
    }

    
}
