package com.pluralsight.conferencedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class ConferenceDemoApplication {

	public static void main(String[] args) throws SQLException {
//		String url = "jdbc:postgresql://localhost:5432/conference_app";
//		String username = "postgres";
//		String password = "Welcome";
//		Connection db = DriverManager.getConnection(url, username, password);
//		System.out.println(db);
		SpringApplication.run(ConferenceDemoApplication.class, args);
	}

}
