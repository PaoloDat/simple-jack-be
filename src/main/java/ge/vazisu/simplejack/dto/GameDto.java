package ge.vazisu.simplejack.dto;

import ge.vazisu.simplejack.enums.Criterion;
import ge.vazisu.simplejack.enums.Result;
import lombok.Data;

import java.util.List;

@Data
public class GameDto {

  private Long id;

  private Long countryId;
  private Long leagueId;
  private Long teamId;

  private int homeScore;
  private int awayScore;

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

  private List<Criterion> criteria;
}
