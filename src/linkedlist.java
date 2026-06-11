public class linkedlist {
        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data=data;
            }
        }
        static int countNodes(Node head){
            int count=0;
            Node temp=head;
            while (temp!=null){
                count+=1;
                temp=temp.next;
            }
            return count;
        }
        static Node insertAtBeginning(Node head,int data){
            Node newNode=new Node(data);
            newNode.next=head;
            return newNode;
        }
        static Node insertAtEnd(Node head,int data){
            Node newNode=new Node(data);
            if(head == null){
                return newNode;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            return head;
        }
        static int sum(Node head){
            int sum=0;
            Node temp=head;
            while (temp!=null){
                sum+=temp.data;
                temp=temp.next;
            }
            return sum;
        }
        static boolean search(Node head, int key){
            Node temp=head;
            while(temp!=null){
                if(temp.data==key){
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }
        public static void main(String[] args) {
            Node head = new Node(10);
            Node second=new Node(20);
            Node third=new Node(30);
            head.next=second;
            second.next=third;
            third.next=new Node(40);
            head=insertAtEnd(head, 50);
            head=insertAtBeginning(head,9);
            int count=countNodes(head);
            System.out.println(count);
            int totalsum =sum(head);
            System.out.println(totalsum);
            boolean search= search(head,50);
            System.out.println(search);
            boolean search1 = search(head,20);
            System.out.println(search1);
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
}
