package playlist;

import java.util.Comparator;

public class DurationComparator implements Comparator<Song> {
    @Override
    public int compare(Song s1,Song s2){
        return Integer.compare(s2.getDuration(),s1.getDuration());
    }

}
