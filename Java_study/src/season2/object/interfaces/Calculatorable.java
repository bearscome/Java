package season2.object.interfaces;

/**
 * 협업자 상호간에 구체적인 약속을 하면 된다.
 * 특히 그 약속을 코드 안에서 할 수 있다면 참 좋을 것이다.
 * 클래스 Calculator를 사용할 개발자가 이 클래스가 가지고 있어야 할 메소드를 인터페이스로 만들어서 제공하는 것이다.
 */

public interface Calculatorable {
    public void setOprands(int first, int second, int third);
    public int sum();
    public int avg();
}

/**
 * 하나의 클래스에 여러개의 인터페이스를 구현할 수 있다.
 */

interface I1 {

}

interface I2 {

}

class A implements I1, I2 {

}

/**
 * 인터페이스도 상속이 된다.
 */
interface  I3 {
    public void x();
}

interface I4 extends  I3 {
    public void z();
}

class B implements I4 {
    public void x(){};
    public void z(){};
}


/**
 * 인터페이스의 맴버는 반드시 public이여야 한다.
 * 인터페이스는 구현한 클래스를 어떻게 조작할 것인가를 규정한다.
 * 그렇기 때문에 외부에서 제어할 수 있는 가장 개방적인 접근 제어자인 public만을 허용하낟.
 * public을 생략하면 default가 아닌 public으로 정의된다.
 */
//interface I5 {
//    private void I ()
//}
