package vn.edu.fpt.quickhire.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.fpt.quickhire.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

}
