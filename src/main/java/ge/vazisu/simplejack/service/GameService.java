package ge.vazisu.simplejack.service;

import ge.vazisu.simplejack.dto.GameDto;
import ge.vazisu.simplejack.dto.UpdateGameDto;
import ge.vazisu.simplejack.entity.Game;
import ge.vazisu.simplejack.mapper.MainMapper;
import ge.vazisu.simplejack.repository.GameRepository;
import ge.vazisu.simplejack.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GameService {

  private final TeamRepository teamRepository;
  private final GameRepository repository;
  private final MainMapper mapper;

  public GameDto saveGame(GameDto dto) {
    Game game = mapper.gameDtoToEntity(dto);
    return mapper.gameToDto(repository.save(game));
  }

  public List<GameDto> findAllByDrawNumber(Integer drawNumber) {
    return repository.findAllByDrawNumber(drawNumber).stream()
            .map(mapper::gameToDto)
            .map(this::enrichByTeamNames)
            .collect(Collectors.toList());
  }

  public long updateDraw(List<UpdateGameDto> gameDtos) {

    List<Long> count = new ArrayList<>();

    for (UpdateGameDto dto : gameDtos) {
      repository.findById(dto.getId()).ifPresent(game -> {
        game.setHomeScore(dto.getHomeScore());
        game.setAwayScore(dto.getAwayScore());
        repository.save(game);
        count.add(dto.getId());
      });
    }
    return count.size();
  }

  private GameDto enrichByTeamNames(GameDto dto) {
    teamRepository.findById(dto.getHomeTeamId()).ifPresent(team -> dto.setHomeTeam(team.getName()));
    teamRepository.findById(dto.getAwayTeamId()).ifPresent(team -> dto.setAwayTeam(team.getName()));
    return dto;
  }
}
