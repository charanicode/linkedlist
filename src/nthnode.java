public class nthnode {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
        }
    }
    static Node Nthnode(Node head,int position){
        Node temp=head;
        int total =0;
        while(temp!=null){
            total +=1;
            temp=temp.next;
        }
        int required=total-position+1;
        Node temp1=head;
        int current=1;
        while(temp1!=null){
            if(current==required){
                return temp1;
            }
            current+=1;
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
        third.next= fourth;
        fourth.next=new Node(50);
        Node res=Nthnode(head,6);
        System.out.println(res);
    }
}
