package vn.edu.fpt.quickhire.model.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.fpt.quickhire.entity.User;
import vn.edu.fpt.quickhire.model.UserService;
import vn.edu.fpt.quickhire.model.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findUserById(long id) {
        return userRepository.findById(id);
    }
}
