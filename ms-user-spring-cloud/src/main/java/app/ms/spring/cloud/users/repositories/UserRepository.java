package app.ms.spring.cloud.users.repositories;

import app.ms.spring.cloud.users.models.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
