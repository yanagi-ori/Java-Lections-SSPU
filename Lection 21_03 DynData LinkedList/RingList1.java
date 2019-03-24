class RingList1 {
    private Item1 head;

    private RingList1(){
        head = new Item1("");
        head.next = head;
    }

    void print(){
        Item1 p = head.next;
        while (p != head){
            System.out.println("" + p.data);
        }
    }

    void addToTop(String s){
        Item1 p = new Item1(s);
        p.next = head.next;
        head.next = p;
    }

    void addToEnd(String s){
        Item1 p = new Item1(s);
        if(head.next == head){
            p.next = head.next;
            head.next = p;
        }
        Item1 tmp = head.next;
        while (tmp.next != head){
            tmp= tmp.next;
        }
        tmp.next = p;
        p.next = head;

    }
}
