public class linkedList {
    public static class Node {
    
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

        //methods 
        // add First
        public void addFirst(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }

            newNode.next = head;

            head = newNode;
        } 

        // add Last
        public void addLast(int data){
            Node newNode = new Node(data);
            size ++;
            if (head == null) {
                head = tail = newNode;
            }

            tail.next = newNode;

            tail = newNode;
        }

        // add in the middle

        public void addMiddle(int idx, int data){
            if (idx == 0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i =0;
            while (i < idx-1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next= newNode;
        }

        // print the linkedList
        public void print() {
            if (head == null) {
                System.out.print("Linked List is empty");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // remove first
        public int removeFirst() {
            if (size == 0) {
                System.out.println("LinkedList is empty");
                return Integer.MIN_VALUE;
            }
            else if (size == 1) {
                int val = head.data;
                head = tail= null;
                size =0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size --;
            return val;
        }

        //remove last
        public int removeLast() {
            if (size == 0) {
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }

            // tracking previous node
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }

            int val = prev.next.data;
            prev.next = null;
            tail=prev;
            size--;
            return val;
        }

        // search a key in LL (Iterative approach)
        public int itrSearch(int key){
            Node temp = head;
        int i =0;

        while (temp != null) {
            if (temp.data == key) {
                return i; // key found 
            }
            temp= temp.next;
            i++;
        }
        return -1;
        }

        // search a key (recursive approach)

        // reverse a Linked List

        public void reverse(){
            Node prev = null;
            Node curr = head;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        // remove nth node 
        public void deleteNthNode(int n ) {
            int sz = 0;
            Node temp = head;
            while (temp!= null) {
                temp = temp.next;
                sz++;
            }

            if (n == sz) {
                head = head.next;
                return; 
            }

            int i = 1;
            int iToFind = sz - n;
            Node prev = head;
            while (i < iToFind) {
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
        }


    //check if LL is Palindrome
        // slow-fast approach
            // finding mid of LL

        public Node findMid(Node head){
            Node slow = head;
            Node fast =  head;

            while (fast!= null && fast.next != null) {
                slow = slow.next; //+1
                fast = fast.next.next; //+2
            }
            return slow; // slow is my midNode
        }

        public boolean checkPalindrome(){
            if (head == null || head.next == null) {
                return true;
            }
            //step 1 : find mid
            Node midNode = findMid(head);

            //step 2 : Reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;
            while(curr!= null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;
            Node left = head;

            // step 3 : check left half and right half
            while (right != null) {
                if (left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }

        

    public static void main(String[] args) {
        linkedList ll = new linkedList();
    
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPalindrome());
        System.out.println();

        ll.addFirst(2);       
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2, 3);
        ll.print();
        System.out.println();
        ll.deleteNthNode(3);
        ll.print();
        System.out.println();
        ll.reverse();
        ll.print();

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));

        System.out.print("Size of LinkedList ="+ ll.size);
        System.out.println();

        ll.removeFirst();
        ll.print();
        System.out.println("Size of ll after removing first node  = " + ll.size);

        ll.removeLast();
        ll.print();
        System.out.println("Size of LL after removing last element = " + ll.size);

        
    }
}
