package art;

public class TestArtGallery {
    public static void main(String[] args) {
        ArtGallery g1=ArtGallery.getInstance("gal1");

        System.out.println(g1.getName());
        ArtGallery g2=ArtGallery.getInstance("gal2");
        System.out.println(g2.getName());
        System.out.println("czy takie same= "+(g1==g2));

    }
}

