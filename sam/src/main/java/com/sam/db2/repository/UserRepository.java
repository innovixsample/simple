package com.sam.db2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.db2.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//	@Query(value = "CALL user_delete_procedure(:id)", nativeQuery = true)
//	public int deleteValueBy(@Param("id") int id);
//
//	@Query(value = "call user_insert_procedure(:id, :address, :email_id, :phone, :user_name)",nativeQuery = true)
//	public int user_insert_procedure(
//			@Param("id") int id,
//			@Param("address") String address,
//			@Param("email_id") String email_id,
//			@Param ("phone") long phone,
//			@Param ("user_name") String user_name
//			);
//	
//			@Query(value = "CALL user_update_procedure(:idvalue ,  :email )", nativeQuery = true)
//			public int user_update_procedure(@Param("idValue") int idValue, @Param("email") String email);
//
		}
