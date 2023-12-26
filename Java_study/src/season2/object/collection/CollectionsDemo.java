package season2.object.collection;

import java.util.*;

class Computer implements Comparable {
    int serial;
    String owner;

    Computer(int _serial, String _owner) {
        this.serial = _serial;
        this.owner = _owner;
    };
    public int compareTo(Object o) {
        // compareTo 메소드 생성을 강제한다.
        // a(this.serial) > b(o.serial) : 양수
        // a == b : 0
        // a < b : 음수
        // javascript Array.sort랑 똑같은거 같다.
      return this.serial - ((Computer) o).serial;
    };
    public String toString() {
        return serial + " " + owner;
    };
}
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500, "egoing"));
        computers.add(new Computer(200, "leezche"));
        computers.add(new Computer(3233, "graphittie"));

        Iterator i = computers.iterator();
        System.out.println("before");
        while (i.hasNext()) {
            System.out.println(i.next());
        };
        Collections.sort(computers);
        System.out.println("\nafter");
        i = computers.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        };
    }
}
