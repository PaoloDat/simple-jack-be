package ge.vazisu.simplejack.dto;

import ge.vazisu.simplejack.enums.Criterion;
import ge.vazisu.simplejack.enums.Result;
import lombok.Data;

import java.util.Set;

@Data
public class GameDto {

  private Long id;

  private Integer drawNumber;

  private Long countryId;
  private Long leagueId;
  private Long homeTeamId;
  private Long awayTeamId;

  private Integer homeScore;
  private Integer awayScore;

  private double fonHome;
  private double fonDraw;
  private double fonAway;

  private double manHome;
  private double manDraw;
  private double manAway;

  private double oddHome;
  private double oddDraw;
  private double oddAway;

  private Result result;
  private Result prediction;

  private Set<Criterion> criteria;
}
