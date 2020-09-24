package ge.vazisu.simplejack.entity;

import ge.vazisu.simplejack.enums.Criterion;
import ge.vazisu.simplejack.enums.Result;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "game")
public class Game {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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

  @ElementCollection
  @Enumerated(value = EnumType.STRING)
  private List<Criterion> criteria;

  @CreationTimestamp
  private Date createDate;



}
