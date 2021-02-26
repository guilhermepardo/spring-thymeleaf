package web.postgressecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import web.postgressecurity.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
