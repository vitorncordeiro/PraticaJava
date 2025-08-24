import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();

    }
    public static class SongList{
        private ArrayList<Song> songs;

        private SongList(){
            songs = new ArrayList<Song>();
        }
        private boolean add(Song song){
            if(findSong(song.getTitle()) != null ){
                return false;
            }
            songs.add(song);
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
        private Song findSong(int trackNum){
            if((trackNum - 1) < songs.size()){
                return songs.get(trackNum - 1);
            }else{
                return null;
            }


        }

    }


    public boolean addToPlayList(int trackNum, LinkedList<Song> playList){
        int index = trackNum - 1;

        if ((index >= 0) && (index <= songs.songs.size())) {
            playList.add(songs.songs.get(index));
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist){

        for(int i =0; i< songs.songs.size(); i++){
            if(songs.songs.get(i).getTitle() == title){
                playlist.add(songs.songs.get(i));
                return true;
            }
        }
        return false;
    }
    public boolean addSong(String title, double duration){

        if(songs.findSong(title) != null ){
            return false;
        }
        songs.songs.add(new Song(title, duration));
        return true;

    }
}
