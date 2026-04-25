import java.util.ArrayList;

public class JavaSongPlaylist{
    private String playlistName;
    private ArrayList<JavaSong> songs; //helohelo 

    public JavaSongPlaylist(String playlistName){ //initialize playlist
        this.playlistName = playlistName;
        songs = new ArrayList<>(); 
    }
}