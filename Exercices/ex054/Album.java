import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;
    
    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public boolean addSong(String title, double duration){
        
        if(findSong(title) != null ){
            return false;
        }
        songs.add(new Song(title, duration));
        return true;
        
    }
    private Song findSong(String title){
        for(Song s : songs){
            if(s.getTitle() == title){
                return s;
            }
            
        }
        return null;
    }
    public boolean addToPlayList(int trackNum, LinkedList<Song> playList){
        int index = trackNum - 1;
        if ((index >= 0) && (index <= songs.size())) {
            playList.add(songs.get(index));
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        
        for(int i =0; i< songs.size(); i++){
            if(songs.get(i).getTitle() == title){
                playlist.add(songs.get(i));
                return true;
            }
        }
        return false;
    }
}
