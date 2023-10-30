package com.learningProject.forlearning;

import com.learningProject.forlearning.Dao.UserRepository;
import com.learningProject.forlearning.Entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ForlearningApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ForlearningApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

//		User user1 = new User();
//		user1.setName("Abhiu Garg");
//		user1.setCity("jaipur");
//		user1.setStatus("active");
//		User result = userRepository.save(user1);
//		System.out.println(result);

//		Optional<User> byId = userRepository.findById(1);
//		User user = byId.get();
//		System.out.println(user);
//
//		user.setStatus("done");
//		user.setCity("bharatpur");
//		User updateResult= userRepository.save(user);
//		System.out.println(updateResult);

//		User user2 = new User();
//		user2.setName("Akash Singh");
//		user2.setCity("delhi");
//		user2.setStatus("active");
//		User result = userRepository.save(user2);
//		System.out.println(result);

		//List<User> all= userRepository.findAll();
		//System.out.println(all);

//		for (User item:all) {
//			System.out.println(item);
//		}

//		all.forEach(item -> {
//			System.out.println(item);
//		});

//		List<User> userList= userRepository.findByName("Abhiu Garg");
//		userList.forEach(user -> {
//			System.out.println(user);
//		});

		List<User> byNameAndCity= userRepository.getByNameAndCity("Abhiu Garg", "bharatpur");
		System.out.println(byNameAndCity);


	}

}
