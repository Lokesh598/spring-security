package com.lvg.ojdemo.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lvg.ojdemo.entity.Role;
import com.lvg.ojdemo.support.ERole;

public interface RoleRepository extends  JpaRepository<Role,Long>
{
	Optional<Role> findByName(ERole roleName);
}
