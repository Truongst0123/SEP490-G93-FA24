package vn.edu.fpt.quickhire.model;

import vn.edu.fpt.quickhire.entity.Account;

public interface UserService {
    Account findUserById(long id) ;

    Account login(String username, String password);
}
