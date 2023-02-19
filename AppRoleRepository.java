package sn.esmt.tp.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.tp.admin.entities.AppRoleEntity;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRoleEntity,Integer> {
    AppRoleEntity findById(int id);
    AppRoleEntity findByName(String name);
}
