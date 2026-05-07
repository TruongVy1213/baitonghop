package Proxy;

public class ImageProxy implements DisplayObject{
    private String url;
    private ImageFile imageFile;

    ImageProxy(String url){
        this.url = url;
        System.out.println("Image unload : " + this.url);
    }

    @Override
    public void display() {
        if(imageFile == null){
            imageFile = new ImageFile(url);
        }
        else {
            System.out.println("Image already existed : " + url);
        }
        imageFile.display();
    }
}
