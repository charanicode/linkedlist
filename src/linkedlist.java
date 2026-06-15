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
        static Node Deletefirst(Node head){
            if(head == null){
                return null;
            }
            return head.next;
        }
        static Node DeleteLast(Node head){
            if(head == null){
                return null;
            }
            if(head.next == null){
                return null;
            }
            Node tail =head;
            Node temp =head;
            while(tail.next!=null){
                temp=tail;
                tail = tail.next;
            }
            temp.next=null;
            return head;
        }
        static Node findMiddle(Node head)
        {
            if(head == null){
                return null;
            }
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        static Node reverse(Node head){
            Node prev = null;
            Node curr = head;
            while(curr!=null){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
        }
        static int findPosition(Node head,int element){
            int element_position=-1;
            Node temp=head;
            int position=0;
            while(temp!=null){
                if(temp.data==element){
                    element_position=position;
                    return element_position;
                }
                position+=1;
                temp=temp.next;
            }
            return element_position;
        }
        static Node insertPosition(Node head,int position,int element){
            int pos=-1;
            Node temp=head;
            if(position==0){
                Node node=new Node(element);
                head=node;
                head.next=temp;
                return head;
            }
            while(temp!=null){
                pos+=1;
                if(pos==(position-1)){
                    Node node=new Node(element);
                    Node res=temp.next;
                    temp.next=node;
                    node.next=res;
                    return head;
                }
                temp=temp.next;
            }
            if(position>(pos+1)){
                System.out.println("Invalid position");
            }
            return head;
        }
        static Node deletePosition(Node head,int Position){
            Node temp=head;
            int pos=-1;
            if(Position==0){
                if(head == null){
                    return null;
                }
                return head.next;
            }
            while(temp!=null){
                pos+=1;
                if(Position>0){
                    if(pos==(Position-1)){
                        Node res=temp.next.next;
                        temp.next=res;
                        return head;
                    }
                    temp=temp.next;
                }
            }
            return head;
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
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            head=Deletefirst(head);
            int count=countNodes(head);
            System.out.println(count);
            int totalsum =sum(head);
            System.out.println(totalsum);
            boolean search= search(head,50);
            System.out.println(search);
            boolean search1 = search(head,20);
            System.out.println(search1);
            System.out.println("Position of element is" +findPosition(head,30));
            Node temp1 = head;
            while(temp1 != null){
                System.out.print(temp1.data + " ");
                temp1 = temp1.next;
            }
            System.out.println();
            Node temp2 = head;
            head=DeleteLast(head);
            while(temp2 != null){
                System.out.print(temp2.data + " ");
                temp2 = temp2.next;
            }
            System.out.println();
            head=insertPosition(head,2,15);
            while(head!= null){
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
            head=deletePosition(head,2);
            while(head!= null){
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
//            Node result=findMiddle(head);
//            System.out.println(result.data);
//            head =reverse(head);
//            while(head != null){
//                System.out.print(head.data + " ");
//                head=head.next;
//            }
//            System.out.println();

        }
}
