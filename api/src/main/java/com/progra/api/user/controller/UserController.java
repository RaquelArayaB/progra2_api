package com.progra.api.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progra.api.user.businesslogic.userBl;
import com.progra.api.user.dataaccess.UserRepository;
import com.progra.api.user.dto.userDto;

@RestController
@RequestMapping("api/user")
public class UserController {
    
    @Autowired
    private UserRepository userRep;

    @GetMapping
    public List<userDto> userList(){
        userBl _UserBl= new userBl(userRep);
        return _UserBl.list();
    }

    @GetMapping("/{id}")
    public userDto getUserDto(@PathVariable long id){
        userBl _UserBl= new userBl(userRep);
        return _UserBl.get(id);
    }

    @PostMapping("/add")
    public userDto userAdd(@RequestBody userDto user){
        userBl _UserBl= new userBl(userRep);
        return _UserBl.add(user);
    }

    @PostMapping("/login")
    public ResponseEntity<userDto> login(@RequestBody userDto user){
        userBl _UserBl = new userBl(userRep);
        var resultado = _UserBl.login(user.getEmail(), user.getPassword());

        if(resultado != null){
            return ResponseEntity.ok(resultado);
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarUsuario(@PathVariable Long id){
        userBl _UserBl = new userBl(userRep);
        _UserBl.delete(id);
        return ResponseEntity.ok("Usuario eliminado con éxito");
    }
}
