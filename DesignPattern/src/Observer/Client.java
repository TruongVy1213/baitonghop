package Observer;

public class Client {
    public static void main(String[] args) {
        Connection userA = new Connection();
        SocialNewFeed feed = new SocialNewFeed();

        //Chua dang ky nhan thong bao
        System.out.println("Ban đầu:");
        feed.showFeed();

        //dang ky theo doi userA
        userA.addObserver(feed);

        userA.setStatus("Thông báo 1");
        userA.setStatus("Thông báo 2");

        System.out.println("\nSau khi cập nhật:");
        feed.showFeed();
    }
}
