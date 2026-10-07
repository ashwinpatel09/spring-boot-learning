package com.ashwin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ashwin.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Integer>{
    //custom query
	@Transactional
	@Modifying
	@Query("delete from UserInfo where id=:userId")
	public void deleteUser(Integer userId);
}
