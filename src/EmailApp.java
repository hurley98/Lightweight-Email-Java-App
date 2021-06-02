public class EmailApp {

    public static void main(String[] args){
        Email em1 = new Email("John", "Cena");

        em1.setAlternateEmail("js@gmail.com");
        em1.changePassword("newPass");

        System.out.println(em1.showInfo());


    }
}
