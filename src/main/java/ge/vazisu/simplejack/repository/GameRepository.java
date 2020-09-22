package ge.vazisu.simplejack.repository;

import ge.vazisu.simplejack.entity.Game;
import ge.vazisu.simplejack.enums.Criterion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

  List<Game> findAllByCriteria(Criterion criterion);

  List<Game> findAllByLeagueIdAndCriteria(Long leagueId, Criterion criterion);
}
