package ge.vazisu.simplejack.controller;

import ge.vazisu.simplejack.dto.GameDto;
import ge.vazisu.simplejack.dto.UpdateGameDto;
import ge.vazisu.simplejack.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/game")
public class GameController {

  private final GameService gameService;

  @PostMapping
  public GameDto saveGame(@RequestBody GameDto gameDto) {
    return gameService.saveGame(gameDto);
  }

  @GetMapping("/draw/{drawNumber}")
  public List<GameDto> getGamesByNumber(@PathVariable("drawNumber") Integer drawNumber) {
    return gameService.findAllByDrawNumber(drawNumber);
  }

  @PostMapping("/draw")
  public long updateDraw(@RequestBody List<UpdateGameDto> gameDtos) {
    return gameService.updateDraw(gameDtos);
  }
}
