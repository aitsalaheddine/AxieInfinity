package com.axie.community.repositories;

import com.axie.community.models.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {
}
