package com.cvs.cdc.repo;

import com.cvs.cdc.model.CdcResponseToDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CdcRespRepo extends JpaRepository<CdcResponseToDb, String> {
   /* @Modifying
    @Query("update User u set u.active = false where u.lastLoginDate < :date")
    void deactivateUsersNotLoggedInSince(@Param("date") String date);*/
}