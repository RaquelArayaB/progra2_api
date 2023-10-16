package com.progra.api.user.businesslogic;

import com.progra.api.user.dataaccess.UserRepository;
import java.util.List;
import com.progra.api.user.dto.userDto;

public class userBl {
    private UserRepository userRep;

    public userBl(UserRepository userRep) {
        this.userRep = userRep;
    }

    public List<userDto> list(){
        return userRep.findAll();
    }

    public userDto get(long user_id){
        return userRep.findById(user_id).orElse(null);
    }

    public userDto add(userDto user){
        return userRep.save(user);
    }

    public userDto login(String user, String password){
        return userRep.findByEmailAndPassword(user, password).orElse(null);
    }

    public void delete(Long user_id){
        userRep.deleteById(user_id);
    }
}
