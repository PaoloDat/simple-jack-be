package ge.vazisu.simplejack.repository;

import ge.vazisu.simplejack.entity.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeagueRepository extends JpaRepository<League, Long> {

  List<League> findAllByCountry_Id(Long countryId);
}
