class LinkedList1 {
    private Item1 top;

    void print() {
        Item1 newItem = top;
        while (newItem != null) {
            // Обход списка
            System.out.println("" + newItem.data);
            newItem = newItem.next;
        }
    }

    void addToTop(String s) {
        Item1 newItem = new Item1(s);
        newItem.next = top;
        top = newItem;

    }

    void addToTop(Item1 newItem) {
        if (newItem == null) return;
        newItem.next = top;
        top = newItem;
    }

    void addToEnd(String s) {
        Item1 newItem = new Item1(s);
        if (top == null) {
            top = newItem;
            return;
        }
        Item1 tmp = top;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newItem;
    }

    String delFromTop() {
        if (top == null) return null;
        String res = top.data;
        top = top.next;
        return res;
    }

    String delFromEnd() {
        if (top == null) return null;
        String res;
        if (top.next == null) { // 1 item
            res = top.data;
            top = null;
            return res;
        }
        Item1 tmp = top;
        while (tmp.next.next != null) {  // several items
            tmp = tmp.next;
        }
        res = tmp.next.data;
        tmp.next = null;
        return res;
    }

}

class Item1 {
    String data;  // Данные
    Item1 next = null;  // Ссылка

    Item1(String s) {
        data = s;
    }
}

