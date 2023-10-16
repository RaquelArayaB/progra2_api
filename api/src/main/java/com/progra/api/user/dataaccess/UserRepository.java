package com.progra.api.user.dataaccess;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.progra.api.user.dto.userDto;

public interface UserRepository extends JpaRepository<userDto, Long>{

    Optional<userDto> findByEmail(String email);
    Optional<userDto> findByEmailAndPassword(String email, String password);
    
}
