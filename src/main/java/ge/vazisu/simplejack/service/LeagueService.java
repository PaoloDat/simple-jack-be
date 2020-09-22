package ge.vazisu.simplejack.service;

import ge.vazisu.simplejack.dto.LeagueDto;
import ge.vazisu.simplejack.mapper.MainMapper;
import ge.vazisu.simplejack.repository.LeagueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LeagueService {

  private final LeagueRepository repository;
  private final MainMapper mapper;

  public List<LeagueDto> getLeaguesByCountry(Long countryId) {
    return repository.findAllByCountry_Id(countryId).stream()
            .map(mapper::leagueToDto)
            .collect(Collectors.toList());
  }
}
