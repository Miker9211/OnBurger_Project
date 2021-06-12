public class UsersData {
    int id_user;
    String user_name;
    String contact_firstname;
    String contact_lastname;
    String contact_phone;
    String contact_email;

    public UsersData(){

    }

    public UsersData(String user_name, String contact_firstname, String contact_lastname, String contact_phone, String contact_email) {
        this.user_name = user_name;
        this.contact_firstname = contact_firstname;
        this.contact_lastname = contact_lastname;
        this.contact_phone = contact_phone;
        this.contact_email = contact_email;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getContact_firstname() {
        return contact_firstname;
    }

    public void setContact_firstname(String contact_firstname) {
        this.contact_firstname = contact_firstname;
    }

    public String getContact_lastname() {
        return contact_lastname;
    }

    public void setContact_lastname(String contact_lastname) {
        this.contact_lastname = contact_lastname;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }


}
