/*
Solar Soft 1.0

This is the first version of solar
soft which is a software that will
control the solar cars of the future

originally designed and thought of
by: Derrick Livingston Cushshon
*/
package com.company;

//JavaFX import links___________________________
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Scanner;
//_______________________________________________

public class Main extends Application {


    public static void main(String[] args) {
        /* Username and Password : */
        String pwd = "99717cld";
        String usr = "DriveTeam";
        System.out.println(pwd + usr);

        /* Creates an input for the Username */
        Scanner input = new Scanner(System.in); //Creates a new scanner
        System.out.println("Sign In");
        System.out.print("Username---> ");
        String UsrName = input.nextLine();

        /* Creates an input for the Username */
        Scanner pw = new Scanner(System.in);
        System.out.print("Password---> ");
        String Password = pw.nextLine();

        // Sign in
         /*
         this make is so that the
         program does not start unless the
         username and password is valid
         */
        if (UsrName.equals(usr) & Password.equals(pwd)) {
            System.out.print("You're in!");
            launch(args); //This calls the JavaFX application

        } else {
            System.out.println("Wrong Username or Password");
        }
    }



    //Start Page_________________________________________________________________
    @Override
    public void start(Stage primaryStage) {

//      sets the title for the window
        primaryStage.setTitle("Solar Soft");
        Button LogIn1 = new Button("Log In");//Creates a new button
        Button SignUp1 = new Button("Sign Up");//Creates a new button

        Button btn = new Button();//Creates a new button

        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();//layout manager

        root.getChildren().add(btn);//adds button to the screen
        root.getChildren().add(LogIn1);//adds button to the screen
        root.getChildren().add(SignUp1);//adds button to the screen

        primaryStage.setScene(new Scene(root, 1000, 800));//sets window dimensions


        primaryStage.show();//This creates the window
    }












}