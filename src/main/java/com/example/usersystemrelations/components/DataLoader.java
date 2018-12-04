package com.example.usersystemrelations.components;

import com.example.usersystemrelations.models.File;
import com.example.usersystemrelations.models.Folder;
import com.example.usersystemrelations.models.User;
import com.example.usersystemrelations.repositories.FileRepository;
import com.example.usersystemrelations.repositories.FolderRepository;
import com.example.usersystemrelations.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User user = new User("Frank Wood");
        userRepository.save(user);

        Folder folder = new Folder("work", user);
        folderRepository.save(folder);

        File file = new File("work notes", "txt", 30, folder);
        fileRepository.save(file);
    }
}
