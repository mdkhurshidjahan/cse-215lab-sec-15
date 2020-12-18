package Labassignment02;

public class User {

    private String name;
    private int id;
    private String email;

    public User(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean verifyEmail(String email) {

        int count1 = 0, count = 0;
        int pos = 0;

        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                count1++;
                pos = i;
            }
            if (email.charAt(i) == '.' && i > pos) {
                count++;
            }

        }
        if (count1 == 1 && count != 0) {
            return true;

        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Name : " + name + "\n ID : " + id + "\nEmail : " + email;
    }

}
