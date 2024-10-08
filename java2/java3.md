# 컬렉션 프레임워크 - LinkedList

## 1. 노드와 노드 간 연결 구조 이해

---

- 배열 리스트의 경우 선언 시 크기를 함께 지정하기에 사용되지 않고 남는 공간이 있다면 메모리 낭비로 직결된다.
- 하지만 연결 리스트의 경우 낭비되는 메모리 없이 필요한 만큼만 확보해서 사용할 수 있다.
- 또한 배열 리스트의 경우 데이터 추가 시 앞이나 중간에 데이터를 넣으려면 이후 데이터를 모두 옮겨야 한다는 문제가 있지만 연결 리스트의 경우 노드를 만들고 연결만 해주면 되기에 효율성이 더욱 좋다.

```java
// 노드 구조(데이터, 다음 노드 참조값)

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }
}
```

## 2. 연결 리스트 연산

---

- 인덱스를 통한 조회 측면에서 보았을 때, 배열 리스트는 O(1), 연결 리스트는 O(N)이다.
- 배열 리스트의 경우 맨 뒤에 데이터를 추가하는 경우를 제외한 나머지에 대해선 모두 데이터의 이동을 필요로 하나 연결 리스트의 경우 맨 앞에 데이터를 추가하는 경우를 제외하면 배열을 검색하여 찾아가는 작업이 포함되므로 O(N)이다.