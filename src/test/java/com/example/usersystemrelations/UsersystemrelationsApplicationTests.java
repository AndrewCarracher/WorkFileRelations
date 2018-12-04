package com.example.usersystemrelations;

import com.example.usersystemrelations.models.File;
import com.example.usersystemrelations.models.Folder;
import com.example.usersystemrelations.models.User;
import com.example.usersystemrelations.repositories.FileRepository;
import com.example.usersystemrelations.repositories.FolderRepository;
import com.example.usersystemrelations.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersystemrelationsApplicationTests {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;


    @Test
	public void contextLoads() {
	}

	@Test
	public void canAddUserFileAndFolder(){
		User user = new User("Frank Wood");
		userRepository.save(user);

		Folder folder = new Folder("work", user);
		folderRepository.save(folder);

		File file = new File("work notes", "txt", 30, folder);
		fileRepository.save(file);
	}

}
