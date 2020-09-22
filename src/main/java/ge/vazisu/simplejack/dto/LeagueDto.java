package ge.vazisu.simplejack.dto;

import lombok.Data;

@Data
public class LeagueDto {
  private Long id;
  private CountryDto country;
  private String name;
}
