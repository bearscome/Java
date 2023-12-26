package season2.object.collection;

import java.util.ArrayList;
// ArratList를 사용하기 위해서는 선언되야 한다.

public class ArrayListDemo {

    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        // 2개까지 저장이 가능하다.
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three"; 오류가 발생한다.
        for(int i=0; i<arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }

        ArrayList al = new ArrayList();
        // ArrayList는 개수를 지정할 필요가 없다.

        ArrayList<String> al2 = new ArrayList<String>();
        // 제네릭을 통해서 형변환을 했기 때문에 메소드 단에서 따로 형변환을 하지 않아도 된다.

        al.add("one");
        al.add("two");
        al.add("three");
        for(int i=0; i<al.size(); i++){
            // size()의 메소드를 사용해야 한다.
            System.out.println(al.get(i));
            // get(index)의 값으로 호출해야한다.

            String value1 = al.get(i);
            String value2 = (String) al.get(i);
            Object value3 = al.get(i);
            // ArrayList의 add라는 methode는 어떤 타입이라도 수용이 가능하기 때문에 Object타입이 선언된다.

            String value4 = al2.get(i);
            // ArrayList단에서 제네릭으로 형변환을 했기 때문에 메소드에서 형변환을하지 않아도 된다.
        }
    }

}
