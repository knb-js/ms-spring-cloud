package app.ms.spring.cloud.users.services;

import app.ms.spring.cloud.users.models.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserEntity> list();
    Optional<UserEntity> findById(Long id);
    UserEntity save(UserEntity user);
    void delete(Long id);
}
