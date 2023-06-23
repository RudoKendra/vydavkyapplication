package sk.rudokendra.vydavkyapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.rudokendra.vydavkyapplication.model.Vydavok;

public interface VydavokRepository extends JpaRepository<Vydavok, Long> {

}
