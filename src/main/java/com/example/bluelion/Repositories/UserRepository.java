package com.example.bluelion.Repositories;

import com.example.bluelion.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
