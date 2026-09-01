/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp.prog5121_poe_part1;

import java.util.Scanner;

/**
 *
 * @author masha
 */
public class PROG5121_PoE_Part1 {

    // Main method handles user registration and login.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.print("Enter your cell phone number: ");
        String cellPhoneNumber = scanner.nextLine();

        Login login = new Login(
                firstName,
                lastName,
                username,
                password,
                cellPhoneNumber
        );

        System.out.println(login.registerUser());

        System.out.print("Enter your username to login: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter your password to login: ");
        String enteredPassword = scanner.nextLine();

        boolean loginSuccessful = login.loginUser(
                enteredUsername,
                enteredPassword
        );

        System.out.println(login.returnLoginStatus(loginSuccessful));
    }
}