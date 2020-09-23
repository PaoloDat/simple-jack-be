package ge.vazisu.simplejack.controller;

import ge.vazisu.simplejack.dto.CountryDto;
import ge.vazisu.simplejack.dto.CriterionDto;
import ge.vazisu.simplejack.dto.LeagueDto;
import ge.vazisu.simplejack.dto.TeamDto;
import ge.vazisu.simplejack.enums.Criterion;
import ge.vazisu.simplejack.service.CountryService;
import ge.vazisu.simplejack.service.LeagueService;
import ge.vazisu.simplejack.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/info")
public class InfoController {

  private final CountryService countryService;
  private final LeagueService leagueService;
  private final TeamService teamService;

  @GetMapping("/countries")
  public List<CountryDto> getCountries() {
    return countryService.getAllCountries();
  }

  @GetMapping("/countries/{countryId}/league")
  public List<LeagueDto> getLeaguesByCountry(@PathVariable("countryId") Long countryId) {
    return leagueService.getLeaguesByCountry(countryId);
  }

  @GetMapping("/countries/{countryId}/team")
  public List<TeamDto> getTeamsByCountry(@PathVariable("countryId") Long countryId) {
    return teamService.getTeamsByCountry(countryId);
  }

  @GetMapping("/countries/{countryId}/league/{leagueId}/team")
  public List<TeamDto> getTeamsByCountryAndLeague(@PathVariable("countryId") Long countryId,
                                                  @PathVariable("leagueId") Long leagueId) {
    return teamService.getTeamsByCountryAndLeague(countryId, leagueId);
  }

  @GetMapping("/criteria")
  public Map<Integer, List<CriterionDto>> getCriteria() {
    return Criterion.getCriteria();
  }
}
