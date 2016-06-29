public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
     }
     
     class ChatsData{
ArrayList<Users> users;
 }

class Users{
ArrayList<Messages> messages;
int getCount(){
return messages.size;
 }
}

class Messages{
String msg;
String timestamp;
 }
}
