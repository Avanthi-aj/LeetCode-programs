import java.util.*;
class HelloWorld {
    static class node{
        int val;
        node next;
        node(int val){
            this.val = val;
            next = null;
        }
    }
    static node head = null;
    static node temp = head;
    public static void insert(int val){
        node x = new node(val);
        if(head == null){
            head = x;
            temp = head;
        }
        else{
            temp.next = x;
            temp = temp.next;
        }
    }
    public static void display(){
        temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void delete(int index){
        temp = head;
        node prev = null;
        if(index==0 && temp != null){
            head = head.next;
            return;
        }
        int i = 0;
        while(temp != null && i != index){
            prev = temp;
           temp = temp.next;
           i++;
        }
        if(temp == null)    return;
        prev.next = temp.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n ; i++){
            insert(sc.nextInt());
        }
        display();
        delete(3);
        display();
    }
}
