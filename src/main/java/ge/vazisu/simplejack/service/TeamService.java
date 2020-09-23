package ge.vazisu.simplejack.service;

import ge.vazisu.simplejack.dto.TeamDto;
import ge.vazisu.simplejack.mapper.MainMapper;
import ge.vazisu.simplejack.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeamService {

  private final TeamRepository repository;
  private final MainMapper mapper;

  public List<TeamDto> getTeamsByCountry(Long countryId) {
    return repository.findAllByCountry_Id(countryId).stream()
            .map(mapper::teamToDto)
            .sorted(Comparator.comparing(TeamDto::getName))
            .collect(Collectors.toList());
  }

  public List<TeamDto> getTeamsByCountryAndLeague(Long countryId, Long leagueId) {
    return repository.findAllByCountry_IdAndLeague_Id(countryId,leagueId).stream()
            .map(mapper::teamToDto)
            .sorted(Comparator.comparing(TeamDto::getName))
            .collect(Collectors.toList());
  }


}
