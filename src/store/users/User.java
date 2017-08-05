package store.users;

public class User {
    private String id;
    private String name;
    private String email;
    private String dateRegistration;
    private boolean sendEmail;

    public User(String id, String name, String email, String dateRegistration, boolean sendEmail) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateRegistration = dateRegistration;
        this.sendEmail = sendEmail;
    }

    public void show(){
        System.out.println("id:                             " + id);
        System.out.println("имя:                            " + name);
        System.out.println("почта:                          " + email);
        System.out.println("дата регистрации:               " + dateRegistration);
        System.out.println("статус одобрения отправки:      " + sendEmail);
        System.out.println("--------------------------------------------------------");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(String dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public boolean isSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }
}
