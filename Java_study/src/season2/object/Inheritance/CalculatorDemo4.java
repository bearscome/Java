package season2.object.Inheritance;
class Calculator2 {
    int left, right;

//    public Calculator2() {}
//    개발자가 명시한 생성자가 있다면 기본 생성자는 없다.
    public Calculator2(int left, int right){
        /*
        * 개발자가 생성자를 정의했기 때문에, 기본 생성자는 생성되지 않는다.
        * public Calculator2(){}
        * */
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator2 {
    public SubstractionableCalculator(int left, int right) {
//        this.left = left;
//        this.right = right;
//        SubstractionableCalculator는 부모 클래스의 기본 생성자를 호출한다.
//        부모 클래스의 생성자가 명시가 되어 있다면, 기본 생성자는 생성되지 않는다.

//        부모 클래스의 기본 생성자를 명시하거나, super함수를 사용하여 부모 생성자에 명시된 생성자를 호출하는 법이 있다.
        super(left, right);

//        하위 class의 초기화 코드를 super보다 먼저 실행시키면 안된다
//        하위 클래스가 만들어 진다는 것은 상위 클래스가 이미 인스턴스화가 완료된 이후 이다.

    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo4 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);

        /** 디스크립션 본
         * SubstractionableCalculator를 인스턴스화 시키면,
         * SubstractionableCalculator의 생성자를 호출하기 전에
         * SubstractionableCalculator의 부모 클래스인 Calculator2 생성자를
         * 자동으로 호출하도록 약속되어 있다.
         *
         * Calculator2의 생성자는 기본 생성자가 아닌 명시적으로 생성자를 정의 했으면,
         * 기본 생성자를 만들지 않았다.
         * SubstractionableCalculator는 Calculator2의 기본 생성자를 호출했는데,
         * 기본 생성자가 없어서 에러가 난다.
         *
         * 해결법
         * 1. Calculator2에 기본 생성자를 명시한다. public Calculator2() {}
         * */

        /** 정리 본
         * 1. SubstractionableCalculator의 생성자를 호출 하기전에
         * 2. 부모 클래스인 Calculator2의 생성자를 호출
         * 3. Calculator2의 생성자는 개발자 명시를 했으므로,
         * 4. 자바는 기본 생성자를 생성하지 않는다
         *      -> 명시된 생성자가 없을 경우 자바는 기본 생성자를 명시한다.
         * 5. 하위 생성자는 기본 생성자를 호출할 수 없기 때문에 오류가 난다.
         * 6. 기본 생성자를 명시해야 오류가 안난다.
         *
         * 하위 클래스 -> 부모 클래스 -> 부모 생성자 -> 하위 생성자 순인거 같다.
         * */

        /** 다른 방법
         * 현재 부모 클래스와 하위 클래스가 동일한 일을 하기 때문에 중복 코드이다.
         *     public Calculator2(int left, int right){
         *         this.left = left;
         *         this.right = right;
         *     }
         *     public SubstractionableCalculator(int left, int right) {
         *         this.left = left;
         *         this.right = right;
         *     }
         *
         * 하위 클래스의 생성자가 부모 클래스의 생성자를 호출할 수 있다.
         * super();
         * super는 부모클래스를 가르키는 거다. super Class
         * super의 "()" 함수는 부모 클래스의 생성자이다.
         * */


        c1.sum();
        c1.avg();
        c1.substract();
    }
}
