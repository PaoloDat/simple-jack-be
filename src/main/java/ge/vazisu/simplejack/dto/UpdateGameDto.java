package ge.vazisu.simplejack.dto;

import lombok.Data;

@Data
public class UpdateGameDto {

  private Long id;
  private Integer homeScore;
  private Integer awayScore;
}
