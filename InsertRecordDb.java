package com.company;

import java.sql.*;

public class InsertRecordIntoDb {
    public static void main(String[] args) {
        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement(); // Create Statement

            String query0 = "INSERT INTO MyMovies values ('Happy Days ','Varun sandesh ','Tammana', 2007,'Sekhar kammula');";
            stmt.executeUpdate(query0); // Create Query-1

            String query1 = "INSERT INTO MyMovies values ('Darling','prabhas','kajal',2007,'A. Karunakaran');";
            stmt.executeUpdate(query1); // Create Query-1

            String query2 = "INSERT INTO MyMovies values ('Rangasthalam','Ram Charan','Samantha',2018,'Sukumar');";
            stmt.executeUpdate(query2); // Create Query-2

            String query3 = "INSERT INTO MyMovies values ('Maharshi','Mahesh babu','Pooja hegde',2019,'Vamshi paidipally');";
            stmt.executeUpdate(query3); // Create Query-3

            String query4 = "INSERT INTO MyMovies values('Pushpa','Allu Arjun','Rashmika', 2021,'Sukumar');";
            stmt.executeUpdate(query4); // Create Query-4

            String query5 = "INSERT INTO MyMovies values  ('F3','Varun Teja','Mehreen ',2022,'Anil Ravipudi');";
            stmt.executeUpdate(query5);
            stmt.close();

            con.close();                //Close Connection
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Record  Insertion successful");
    }
}