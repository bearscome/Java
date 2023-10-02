public class CharString {
    public static void main(String[] args) {
//        System.out.println('안녕');
        // 문자는 작은 따음표를 사용해야 한다..
//        System.out.println("안녕");
        // 문자열은 큰 따음표를 사용해야 한다
//        System.out.println("안");
        // 한 글자는 문자('') 또는 문자열("")로 가능하다
//        System.out.println("안녕" + "하세요");

//      이스케이프
        System.out.println("안"+'"'+"하세요");
        System.out.println("하이 \"안녕하세요\"");

//      줄바꿈
        System.out.println("안녕 \n 하세요");

        // [!]작은 따음표로 문자열을 생성하면 오류가 난다.
    }
}
