package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.Driver;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	@Autowired
	private BCryptPasswordEncoder  bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");
//		User user=new User();
//		user.setFirstname("Shivam786");
//		user.setLastname("Datta786");
//		user.setUsername("shivam786");
//		user.setPassword(this.bCryptPasswordEncoder.encode("root"));
//		user.setEmail("shivam786@gmail.com");
//		user.setProfile("default.png");
//		Role role1=new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//
//
//		User user=new User();
//		user.setFirstname("Shivam787");
//		user.setLastname("Datta787");
//		user.setUsername("shivam787");
//		user.setPassword(this.bCryptPasswordEncoder.encode("root"));
//		user.setEmail("shivam787@gmail.com");
//		user.setProfile("default.png");
//		Role role1=new Role();
//		role1.setRoleId(45L);
//		role1.setRoleName("NORMAL");
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		User user1=this.userService.createUser(user,userRoleSet);
//		System.out.println(user1.getUsername());



	}
}
