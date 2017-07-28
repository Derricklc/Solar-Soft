/*
Solar Soft 1.0

This is the first version of solar
soft which is a software that will
control the solar cars of the future

originally designed and thought of
by: Derrick Livingston Cushshon
*/
package com.company;

/*

import java.awt.FlowLayout;
*/
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;


public class Main {






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
            gui();// This calls the gui method


        } else System.out.println("Wrong Username or Password");
    }


    //____________________________GUI______________________________________________________________________________



    public static JFrame f; //creates a variable "f" for the frame
    public static JPanel p; //creates a variable "p" for the panel
    public static JButton SignIn; //creates a variable "SignIn" for the button
    public static JLabel lab0; //creates a variable "lab0" for the label
    public static JTextField Username1;
    public static JPasswordField Password0;


    public Main(){
        gui();
    }


    /* These are the actual gui elements of the software_______________________________ */
    public static void gui() {

        f = new JFrame("Solar Soft");//creates the frame and adds the title
        f.setVisible(true);//makes the frame visible
        f.setSize(1000,800); //window size
        f.setLocationRelativeTo(null); //makes window open in the center of the screen
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sets a default close action
        f.setTitle("Solar Soft"); //changes title
        f.setResizable(false); //changes it's ability to be resized

        p = new JPanel(); //Creates a new panel
        p.setBackground(Color.lightGray); //Sets the background of that panel

        SignIn = new JButton("Sign in"); //creates a new button
        lab0 = new JLabel("Please sign in to get started."); //creates a new label
        Username1 = new JTextField("Username");
        Password0 = new JPasswordField("Password");

        p.add(Username1);
        p.add(Password0);
        p.add(SignIn);
        p.add(lab0);
        f.add(p,BorderLayout.SOUTH);



    }
}
