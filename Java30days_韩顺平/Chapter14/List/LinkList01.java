package Java30days_韩顺平.Chapter14.List;

public class LinkList01 {
    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node Insert = new Node("Insert");
        //A->B->C
        A.next = B;
        B.next = C;
        C.pre = B;
        B.pre = A;
        Insert.next = C;
        Insert.pre = B;
        C.pre = Insert;
        B.next = Insert;

        Node first = A;
        Node last = C;
        //从头到尾遍历
        while(true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        System.out.println("==================");
        //从尾到头
        while(true){
            if(last ==null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
        //插入新元素
        //从头到尾
        while(true){
            if (first==null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        System.out.println("==================");
    }

}

class Node {
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}

