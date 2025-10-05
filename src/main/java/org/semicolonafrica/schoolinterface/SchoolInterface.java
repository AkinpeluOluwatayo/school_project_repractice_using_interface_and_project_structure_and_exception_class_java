package main.java.org.semicolonafrica.schoolinterface;

public interface SchoolInterface {
    String register(String name ,String age ,String gender, String email, String password);
    String login(String email, String password);
}
