package vacation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vacation.beans.Vacation;

@Repository
public interface VacationRepository extends JpaRepository<Vacation, Long>{

}
