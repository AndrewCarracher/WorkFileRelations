package com.example.usersystemrelations.repositories;

import com.example.usersystemrelations.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
