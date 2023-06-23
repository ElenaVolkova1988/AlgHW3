
public static void reverse(){
    Node current = head;
    tail = head;
    Node temp = null;

    while(current != null){
    temp = current.prev;
    current.prev = current.next;
    current.next = temp;
    current = current.prev;
    }

    if(temp != null){
    head = temp.prev;
    }
}

public static void main(String[] args) {

    DList list = new DList();
    for (int i = 1; i <= 5; i++) {
        list.pushFront(i);
    }
    list.print(); // 5 4 3 2 1

    list.reverse(); // разворот списка

    list.print(); // 1 2 3 4 5 
    
    list.pushBack(6);

    list.pushFront(7);

    list.sort();

    list.popFront();
    list.popBack();

    list.print(); // 2 3 4 5 6
}