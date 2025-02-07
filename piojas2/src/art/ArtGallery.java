package art;

public class ArtGallery {
private String name;

    private ArtGallery(String name) {
        this.name = name;
    }
    private static ArtGallery instance;
    public static ArtGallery getInstance(String name){
        if(instance ==null){
            instance = new ArtGallery(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
