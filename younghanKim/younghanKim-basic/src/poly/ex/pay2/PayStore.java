package poly.ex.pay2;

public abstract class PayStore {
    public static Pay findPay(String str) {
        if (str.equals("kakao")) {
            return new KakaoPay();
        } else if (str.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
