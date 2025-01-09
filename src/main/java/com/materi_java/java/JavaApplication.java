package com.materi_java.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);
		System.out.print("Nama:");
		System.out.println("Daris Tsaqibuddin Tsany");
		System.out.print("Kelas:");
		System.out.println("X TKJ 1");
	}

}