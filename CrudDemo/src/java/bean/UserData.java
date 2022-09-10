package bean;

import java.util.ArrayList;

public class UserData
{

    public static ArrayList<UserData> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<UserData> aUsers) {
        users = aUsers;
    }
    private int userid;
    private String username;
    private static UserData currentuser;
    private static ArrayList<UserData> users=new ArrayList<>();
    private static boolean  edit=false;

    public static UserData getCurrentuser() {
        return currentuser;
    }

    public static void setCurrentuser(UserData aCurrentuser) {
        currentuser = aCurrentuser;
    }

    public static boolean isEdit() {
        return edit;
    }

    public static void setEdit(boolean aEdit) {
        edit = aEdit;
    }
   
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
