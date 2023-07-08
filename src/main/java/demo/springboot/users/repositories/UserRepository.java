package demo.springboot.users.repositories;

import demo.springboot.users.models.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {

}
