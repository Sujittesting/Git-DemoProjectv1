import java.util.LinkedList;

public class Test1 {

	    private LinkedList<String> songs;
	    private int capacity;

		public Test1(int capacity) {
	        this.songs = new LinkedList<String>();
	        this.capacity = capacity;
	    }

	    public void addSong(String song) {
	        if (songs.size() == capacity) {
	            songs.removeFirst();
	        }
	        songs.addLast(song);
	    }

	    public LinkedList<String> getSongs() {
	        return songs;
	    }

	    public static void main(String[] args) {
	       
		 Test1 playlist = new Test1(3);

	        playlist.addSong("S1");
	        playlist.addSong("S2");
	        playlist.addSong("S3");
	        System.out.println("Current playlist: " + playlist.getSongs());

	        playlist.addSong("S4");
	        System.out.println("Current playlist: " + playlist.getSongs());

	        playlist.addSong("S2");
	        System.out.println("Current playlist: " + playlist.getSongs());

	        playlist.addSong("S1");
	        System.out.println("Current playlist: " + playlist.getSongs());

	}

}
