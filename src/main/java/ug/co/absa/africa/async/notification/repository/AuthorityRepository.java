package ug.co.absa.africa.async.notification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ug.co.absa.africa.async.notification.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
