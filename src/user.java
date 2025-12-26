public class user {
    String username;
    String email;
    int age;
  //overloaded constructor = jv_29
    user(String username){
        this.username = username;
        this.email = "not provided";
        this.age =0;
    }
    user(String username,String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    user(String username,String email,int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
    user() {  //no arguments provided
        this.username = "guest";
        this.email = "Not provided";
        this.age = 0;
    }

}
