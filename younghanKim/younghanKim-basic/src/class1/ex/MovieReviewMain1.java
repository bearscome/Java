package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "Inception";
        inception.review = "asdasdsads";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃";
        aboutTime.review = "어바웃리뷰";

        System.out.println("영화 제목: " + inception.title + ", 리뷰: " + inception.review);
        System.out.println("영화 제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);
    }
}
