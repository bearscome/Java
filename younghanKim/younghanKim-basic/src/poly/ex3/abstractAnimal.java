package poly.ex3;

public abstract class abstractAnimal {
    // 추상 메소드가 하나라도 있으면 추상 클래스가 되어야 한다(abstract)
    // 추가 메서드는 무조건 자식 클래스에서 오버라이딩이 되어야 한다.
    public abstract void sound();

    // 아래 메소드는 추상 메소드가 아니기 때문에 자식 클래스는 상속을 받는다.
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
