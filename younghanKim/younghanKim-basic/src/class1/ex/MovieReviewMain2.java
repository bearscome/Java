package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "Inception";
        inception.review = "asdasdsads";

        movieReviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃";
        aboutTime.review = "어바웃리뷰";

        movieReviews[1] = inception;

        for(MovieReview movies: movieReviews) {
            System.out.println("영화 제목: " + movies.title + ", 리뷰: " + movies.review);
        }


    }
}
