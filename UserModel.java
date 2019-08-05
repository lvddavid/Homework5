package Task;

public class UserModel {

    private String songName;
    private String lastName;
    private String minutes;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
                "songName='" + songName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", minutes='" + minutes + '\'' +
                '}';
    }
}