package com.fmc.oasisinfobytetask4.service.implementation;

import com.fmc.oasisinfobytetask4.domain.User;
import com.fmc.oasisinfobytetask4.repository.UserRepository;
import com.fmc.oasisinfobytetask4.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public Long save(User user) {
        return repository.save(user).getId();
    }

    @Override
    public Long update(User user) {
        return repository.save(user).getId();
    }

    @Override
    public Optional<User> read(Long ID) {
        return Optional.ofNullable(this.repository.findById(ID).orElseThrow(
                () -> new RuntimeException("No such id")
        ));
    }
    public  boolean login(User user){
        boolean isValid=repository.existsUserByPassword(user.getPassword())
                        && repository.existsUserByEmailContainingIgnoreCase(user.getEmail());
        if(!isValid){
            throw new IllegalArgumentException("Incorrect credentials ");
        }
        System.out.println("login successfull");
        return isValid;
    }
    @Override
    public void delete(Long id) {
         repository.deleteById(id);
    }
}
