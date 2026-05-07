package Proxy;

public class ImageGallery {
    public static void main(String[] args) {
        System.out.println("Init proxy image");
        DisplayObject proxy = new ImageProxy("https://hoanghamobile.com/tin-tuc/proxy-la-gi/?srsltid=AfmBOooz7cOVZ1bs7-58keR-q9E2qAjiFKeOHMuc8iakB8VlcM7t1-5F");

        System.out.println("Load 1st");
        proxy.display();

        System.out.println("Load 2st");
        proxy.display();
    }
}
