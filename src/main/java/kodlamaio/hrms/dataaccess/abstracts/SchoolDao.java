package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.concretes.SchoolInfo;

public interface SchoolDao extends JpaRepository {
    List<Scoolİnfo> getByJobSeekerId(Sort sort, int jobSeekerId)
}