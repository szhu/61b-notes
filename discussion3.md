## Discussion 

code for insert:

```java
public void insert(int item, int position) {
    if (position == 0) {
        insertFront(item);
    }
    else {    
        SNode current = front;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        SNode toInsert = new SNode(item, current.next);
        current.next = toInsert;
    }

}
```

code for reverse:

```java
public void reverse() {
    SNode prev = null;
    SNode curr = front;
    SNode next = front.next;

    while (curr != null) {
        curr.next = prev;

        prev = curr;
        curr = next;
        if (next == null) break;
        next = next.next;
    }

    front = curr;
}
```

