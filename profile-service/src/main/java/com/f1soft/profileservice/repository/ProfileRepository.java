package com.f1soft.profileservice.repository;

import com.f1soft.profileservice.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author smriti on 7/2/19
 */
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}