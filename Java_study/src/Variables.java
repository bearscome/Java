public class Variables {
    public static void main(String[] args){
        int a; // 정수
        a = 1;

        System.out.println(a);

        a = 2;
        System.out.println(a);

        double b; // 실수
        b = 1.1;

        System.out.println(b);


        String c;
        String d = "efgh";
        c = "abcd";

        System.out.println(c + d);
//       ----------------------------------------------------------------------------
//      [데이터 크기]
//       8 bit (비트)	1 byte
//       1024 byte (바이트)	1 kilobyte
//       1024 kilobyte (킬로바이트)	1 megabyte
//       1024 megabyte (메가바이트)	1 gigabyte
//       1024 gigabyte  (기가바이트)	1 terabyte
//       1024 terabyte (테라바이트)	1 petabyte
//       1024 petabyte (페타바이트)	1 exabyte
//       1024 exabyte (엑사바이트)	1 zettabyte
//       ----------------------------------------------------------------------------

//       데이터 타입	메모리의 크기	표현 가능 범위
//       byte	1 byte	-128 ~ 127
//       short	2 byte	-32,768 ~ 32,767
//       int	4 byte	-2,147,483,648~2,147,483,647
//       long	8 byte	-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
//       ----------------------------------------------------------------------------

//       실수형
//       float	4byte	±(1.40129846432481707e-45 ~ 3.40282346638528860e+38)
//       double	8byte	±(4.94065645841246544e-324d ~ 1.79769313486231570e+308d)
//       실수형은 float과 double이 있다. 실수를 사용할 때는 double을 사용하도록 하자.

//       문자
//       char	2byte	모든 유니코드 문자
//       문자는 char 형이고, char는 2byte의 메모리를 사용한다.
//       따라서 6글자를 담고 있는 String 타입의 변수는 12바이트의 공간을 차지하게 된다.


        long f = 128;
    }
}
