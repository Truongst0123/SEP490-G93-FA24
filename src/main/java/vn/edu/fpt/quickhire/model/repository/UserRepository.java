package vn.edu.fpt.quickhire.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.fpt.quickhire.entity.Account;


public interface UserRepository extends JpaRepository<Account, Long> {

    Account findById(long id);
    Account findByUsernameAndPassword(String username, String password);

}
