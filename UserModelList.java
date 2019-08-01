package Task;

import Task.UserModel;
import Task.UserModel;

import java.util.List;

public class UserModelList {
    @Override
    public String toString() {
        return "UserModelList{" +
                "album =" + album +
                '}';
    }

    private List<UserModel> album ;

    public List<UserModel> getUserss() {
        return album ;

    }
    public void setAlbum (List<UserModel> album ) {
        this.album  = album ;


    }
}
