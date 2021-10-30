package bookauthorclassesexample;

public class Author {
    private String name;
    private String lastName;
    private String nickName;
    public Author(String name, String lastName, String nickName) {
        this.name = name;
        this.lastName = lastName;
        this.nickName = nickName;
    }
    
    @Override
    public String toString() {
        return "Author: " + " name = " + name + ", lastName = " + lastName + ", nickName = " + nickName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
