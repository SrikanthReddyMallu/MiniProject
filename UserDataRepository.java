package com.example.MiniProject.Repository;

import com.example.MiniProject.Entity.UserData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends CrudRepository<UserData,Long>
{

}
