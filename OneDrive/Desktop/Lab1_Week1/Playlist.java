/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Playlist {
    private String playlistName;
    private String playlistAuthor;
    private ArrayList<Track> playlistTracks;
   
    
    public Playlist() {
    this.playlistName = playlistName;
    this.playlistAuthor = playlistAuthor;
    this.playlistTracks = new ArrayList<Track>();
}
public Playlist(String playlistName, String playlistAuthor) {
    this.playlistName = "New Playlist";
    this.playlistAuthor = "Unknown";
        this.playlistAuthor = playlistAuthor;
    
}
public Playlist(String playlistName, String playlistAuthor, Arraylist<Track> playlistTracks) {
    this.playlistName = "New Playlist";
    this.playlistAuthor = "Unknown";
    this.playlistTracks = playlistTracks;
}
public String getPlaylistName(){
    return this.playlistName;
}
public String getPlaylistAuthor(){
    return this.playlistAuthor;
}
public String[] getPlaylistTracks(){
    return this.playlistTracks;
}
public void setPlaylistName(String playlistName){
    this.playlistName = playlistName;
}
public void setPlaylistAuthor(String playlistAuthor){
    this.playlistAuthor = playlistAuthor;
}
public void setPlaylistTracks(String[] playlistTracks){
    this.playlistTracks = playlistTracks;
}
private String getNumberedTracks() {
    String numberedTracks = "\n";
    int number = 1;
    for (Track track : this.playlistTracks) {
        numberedTracks += Integer.toString(number++) + ": " +
                          track.toString() + "\n";
    }
    return numberedTracks;
}
public void addTrackToPlaylist(Track track) {
    this.playlistTracks.add(track);
}
public void removeTrackFromPlaylist(int trackId) {
    Predicate<Track> trackPredicate =
                       t-> t.getTrackId() == trackId;       
    this.playlistTracks.removeIf(trackPredicate);
}

}
