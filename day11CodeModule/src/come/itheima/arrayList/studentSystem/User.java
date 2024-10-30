package come.itheima.arrayList.studentSystem;

public class User {
    private String userName;
    private String key;
    private String idNumber;
    private String phoneNumber;

    public User() {
    }

    public User(String userName, String key, String idNumber, String phoneNumber) {
        this.userName = userName;
        this.key = key;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
