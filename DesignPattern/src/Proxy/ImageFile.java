package Proxy;

public class ImageFile implements DisplayObject{
    private String url;

    ImageFile(String url){
        this.url = url;
        loadImage();
    }

    public void loadImage(){
        System.out.println("Image load " + url);
    }

    @Override
    public void display() {
        System.out.println("Show image: " + url);
    }
}
