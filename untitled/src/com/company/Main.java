package com.company;

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

        /* Sign in */
        if (UsrName.equals(usr) & Password.equals(pwd)){
            gui();// This calls the gui method


        } else {
            System.out.println("Wrong Username or Password");
        }
    }

    /* These are the actual gui elements of the software_______________________________ */
    public static void gui() {
        System.out.println("Hello World");
        guiFrame(); //this calls the guiFrame method

    }

    //This is the frame for the software__________________________________________
    public static void guiFrame() {
        JFrame frame = new JFrame(); //creats the window
        frame.setPreferredSize(new Dimension(1000,800)); //preferred window size
        frame.setSize(1000,800); //window size
        frame.setLocationRelativeTo(null); //makes window open in the center of the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sets a default close action
        frame.setTitle("Solar Soft"); //changes title
        frame.setResizable(false); //changes it's ability to be resized


        frame.setVisible(true); //makes the window visible

    }
}
