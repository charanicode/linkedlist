public class middle {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node MiddleNode(Node head){
        int start=0;
        int end=0;
        Node temp=head;
        while(temp!=null){
            end+=1;
            temp=temp.next;
        }
        int mid=(start+end)/2;
        int count=0;
        Node temp1=head;
        while(temp1!=null){
            if(count==mid){
                return temp1;
            }
            count+=1;
            temp1=temp1.next;
        }
        return null;
    }
    public static void main(String[] args) {
       Node head = new Node(10);
       Node second=new Node(20);
       Node third=new Node(30);
       Node fourth=new Node(40);
       head.next=second;
       second.next=third;
       third.next=fourth;
       fourth.next=new Node(50);
       Node res=MiddleNode(head);
        System.out.println(res.data);
    }
}
