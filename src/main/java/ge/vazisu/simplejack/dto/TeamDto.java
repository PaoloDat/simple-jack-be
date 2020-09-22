package ge.vazisu.simplejack.dto;

import lombok.Data;

@Data
public class TeamDto {

  private Long id;
  private CountryDto country;
  private LeagueDto league;
  private String name;
}
