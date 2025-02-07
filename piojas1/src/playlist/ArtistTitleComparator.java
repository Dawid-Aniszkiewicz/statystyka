package playlist;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song s1,Song s2){
        int art=s1.getArtist().compareToIgnoreCase(s2.getArtist());
        if(art!=0){
            return art;
        }
        return s1.getArtist().compareToIgnoreCase(s2.getTitle());
    }

}
