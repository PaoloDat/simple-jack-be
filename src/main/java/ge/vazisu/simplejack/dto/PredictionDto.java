package ge.vazisu.simplejack.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class PredictionDto {
  private PredictionCommonDto total;
  private PredictionCommonDto league;
}
