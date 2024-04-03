package bab5;

public class UjiUser {
    public static void main(String[] args) {
        User ahmad = new User();
        User eljava = new User("Ejava", "elj1234");
        User hisyam = new User("Hisyam", "hym1234", 1);
        ahmad.infoUser();
        eljava.infoUser();
        hisyam.infoUser();
    }

}
