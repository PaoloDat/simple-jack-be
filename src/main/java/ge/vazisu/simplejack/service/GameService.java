package ge.vazisu.simplejack.service;

import ge.vazisu.simplejack.dto.GameDto;
import ge.vazisu.simplejack.entity.Game;
import ge.vazisu.simplejack.mapper.MainMapper;
import ge.vazisu.simplejack.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameService {

  private final GameRepository repository;
  private final MainMapper mapper;

  public GameDto saveGame(GameDto dto) {
    Game game = mapper.gameDtoToEntity(dto);
    return mapper.gameToDto(repository.save(game));
  }
}
