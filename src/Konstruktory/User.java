package Konstruktory;

public class User {
   public String username;
   public String password;
   public User(){

}
    public User(String username, String password){
       System.out.println("Hello z konstruktora");
       this.username = username;
       this.password = password;
       // BEFORE:
//         public User(String user, String pass){
//            System.out.println("Hello z konstruktora");
//       username = user;                     // przypisujemy wartości za pomocą konstruktora
//       password = pass;                     // parametry konstruktora to "user" i "pass"

   }


   public void sayHello() {
       System.out.println("Hello my name is "+username);
   }
    }

