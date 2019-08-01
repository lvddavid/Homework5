package Task;

public class UserModel {

    private String songname;
    private String lastname;
    private String minutes;

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "songname='" + songname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", minutes='" + minutes + '\'' +
                '}';
    }
}

