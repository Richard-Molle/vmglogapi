package fr.ipme.vmglogapi.repository;

import fr.ipme.vmglogapi.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Integer> {

}
