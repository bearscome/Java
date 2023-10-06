package season2.object.Scope;

class instanceScope {
    int left, right;

    public void setOption(int _left, int _right) {
        this.left = _left;
        this.right = _right;
        // 전역 변수 접근 시 this 사용
        // this 란 해당 class

        int left = 10;
        int right = 20;

        System.out.println(
                "this.left: " + this.left + " left: " + left + " this.right: " + this.right + " right: " + right
        );

        // 변수 명이 겹치지 않을 경우 this를 사용하지 않아도 된다
        // 결국 로컬 변수가 없기 떄문에 전역 변수에 할당한다.
    }
}

public class ScopeDemo {
    public static void main(String[] args) {
        instanceScope s1 = new instanceScope();
        s1.setOption(1, 2);
    }
}
