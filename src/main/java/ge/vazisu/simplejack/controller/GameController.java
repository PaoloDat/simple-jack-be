package ge.vazisu.simplejack.controller;

import ge.vazisu.simplejack.dto.GameDto;
import ge.vazisu.simplejack.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/game")
public class GameController {

  private final GameService gameService;

  @PostMapping
  public GameDto saveGame(@RequestBody GameDto gameDto) {
    return gameService.saveGame(gameDto);
  }
}
