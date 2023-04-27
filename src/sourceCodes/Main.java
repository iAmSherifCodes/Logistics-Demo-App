package sourceCodes;

import sourceCodes.controller.userController;
import sourceCodes.dto.requests.RegisterUserRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class Main {
    private static final userController userController = new userController();
    public static void main(String... args) {
        SpringApplication.run(Main.class, args);
//        String mainMenu = """
//                Hi,
//                What do you want to do?
//                1 -> Register new User
//                2 -> Find Registered User
//                """;
//        int userInput = collectUserInput(mainMenu);
//        switch (userInput){
//            case 1 -> registerUser();
//            case 2 -> findRegisteredUser();
//        }
    }

    private static void registerUser(){
        String firstName = collectStringInput("Enter first name");
        String lastName = collectStringInput("Enter last name");
        String address = collectStringInput("Enter Address");
        String email = collectStringInput("Enter Email");
        String phoneNumber = collectStringInput("Enter Phone Number");
        RegisterUserRequest request = new RegisterUserRequest();

        request.setAddress(address);
        request.setEmail(email);
        request.setFirstName(firstName);
        request.setLastName(lastName);
        request.setPhoneNumber(phoneNumber);
       display(userController.registerNewUser(request).toString());


        main();
    }
    private static void display(String prompt){
        JOptionPane.showInputDialog(null,prompt);
    }

    private static void findRegisteredUser(){
        int userId = collectUserInput("Enter ID");
        display(userController.findUserById(userId).toString());
        main();
    }

    private static String collectStringInput(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    private static int collectUserInput(String mainMenu){
        return Integer.parseInt(JOptionPane.showInputDialog(mainMenu));
    }
}
