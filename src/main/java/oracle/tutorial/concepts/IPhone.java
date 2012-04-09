package oracle.tutorial.concepts;

/**
 * Created by Vladimir Bichev
 * Date: 22.12.11
 * Time: 22:40
 */
public class IPhone extends Phone {
    public boolean touchScreen;
    public int simCardQuantity;
    public int applicationsQuantity;
    public String ownerName;
    public String songForPlay;
    public String movieForPlay;
    public boolean internetAvailable;


    public void changeSong (String nextSong) {
        setSongForPlay(nextSong);
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public int getSimCardQuantity() {
        return simCardQuantity;
    }

    public void setSimCardQuantity(int simCardQuantity) {
        this.simCardQuantity = simCardQuantity;
    }

    public int getApplicationsQuantity() {
        return applicationsQuantity;
    }

    public void setApplicationsQuantity(int applicationsQuantity) {
        this.applicationsQuantity = applicationsQuantity;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getSongForPlay() {
        return songForPlay;
    }

    public void setSongForPlay(String songForPlay) {
        this.songForPlay = songForPlay;
    }

    public String getMovieForPlay() {
        return movieForPlay;
    }

    public void setMovieForPlay(String movieForPlay) {
        this.movieForPlay = movieForPlay;
    }

    public boolean isInternetAvailable() {
        return internetAvailable;
    }

    public void setInternetAvailable(boolean internetAvailable) {
        this.internetAvailable = internetAvailable;
    }
}
