package ge.vazisu.simplejack.controller;

import ge.vazisu.simplejack.dto.PredictionDto;
import ge.vazisu.simplejack.enums.Criterion;
import ge.vazisu.simplejack.service.PredictionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/prediction")
public class PredictionController {

  private final PredictionService service;

  @GetMapping("/{criterion}/league/{leagueId}")
  public PredictionDto getPrediction(@PathVariable("criterion") Criterion criterion,
                                     @PathVariable("leagueId") Long leagueId) {
    return service.getPrediction(leagueId, criterion);
  }
}
