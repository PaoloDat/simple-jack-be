package ge.vazisu.simplejack.service;

import ge.vazisu.simplejack.dto.PredictionCommonDto;
import ge.vazisu.simplejack.dto.PredictionDto;
import ge.vazisu.simplejack.entity.Game;
import ge.vazisu.simplejack.enums.Criterion;
import ge.vazisu.simplejack.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PredictionService {

  private final GameRepository gameRepository;

  public PredictionDto getPrediction(Long leagueId, Criterion criterion) {
    List<Game> total = gameRepository.findAllByCriteria(criterion);
    List<Game> league = gameRepository.findAllByLeagueIdAndCriteria(leagueId, criterion);

    PredictionCommonDto totalPrediction = resolveGames(total);
    PredictionCommonDto leaguePrediction = resolveGames(league);


    return PredictionDto.builder()
            .total(totalPrediction)
            .league(leaguePrediction)
            .build();
  }

  public PredictionCommonDto resolveGames(List<Game> games) {
    PredictionCommonDto resolvedGames = new PredictionCommonDto();
    for (Game game : games) {
      if (game.getHomeScore() > game.getAwayScore()) {
        resolvedGames.addHome();

        if ((game.getFonHome() > game.getFonAway()) && (game.getFonHome() > game.getFonDraw())) {
          resolvedGames.addFonPool();
        } else if ((game.getFonHome() < game.getFonAway()) && (game.getFonHome() < game.getFonDraw())) {
          resolvedGames.addFonUnpool();
        } else {
          resolvedGames.addFonMiddle();
        }

        if ((game.getManHome() > game.getManAway()) && (game.getManHome() > game.getManDraw())) {
          resolvedGames.addManPool();
        } else if ((game.getManHome() < game.getManAway()) && (game.getManHome() < game.getManDraw())) {
          resolvedGames.addManUnpool();
        } else {
          resolvedGames.addManMiddle();
        }


      } else if (game.getHomeScore() < game.getAwayScore()) {
        resolvedGames.addAway();

        if ((game.getFonAway() > game.getFonHome() && (game.getFonAway() > game.getFonDraw()))) {
          resolvedGames.addFonPool();
        } else if ((game.getFonAway() < game.getFonHome() && (game.getFonAway() < game.getFonDraw()))) {
          resolvedGames.addFonUnpool();
        } else {
          resolvedGames.addFonMiddle();
        }


        if ((game.getManAway() > game.getManHome() && (game.getManAway() > game.getManDraw()))) {
          resolvedGames.addManPool();
        } else if ((game.getManAway() < game.getManHome() && (game.getManAway() < game.getManDraw()))) {
          resolvedGames.addManUnpool();
        } else {
          resolvedGames.addManMiddle();
        }


      } else {
        resolvedGames.addDraw();

        if ((game.getFonDraw() > game.getFonHome()) && (game.getFonDraw() > game.getFonAway())) {
          resolvedGames.addFonPool();
        } else if ((game.getFonDraw() < game.getFonHome()) && (game.getFonDraw() < game.getFonAway())) {
          resolvedGames.addFonUnpool();
        } else {
          resolvedGames.addFonMiddle();
        }


        if ((game.getManDraw() > game.getManHome()) && (game.getManDraw() > game.getManAway())) {
          resolvedGames.addManPool();
        } else if ((game.getManDraw() < game.getManHome()) && (game.getManDraw() < game.getManAway())) {
          resolvedGames.addManUnpool();
        } else {
          resolvedGames.addManMiddle();
        }
      }
    }
    return resolvedGames;
  }
}
