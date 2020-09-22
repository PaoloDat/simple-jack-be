package ge.vazisu.simplejack.mapper;

import ge.vazisu.simplejack.dto.CountryDto;
import ge.vazisu.simplejack.dto.GameDto;
import ge.vazisu.simplejack.dto.LeagueDto;
import ge.vazisu.simplejack.dto.TeamDto;
import ge.vazisu.simplejack.entity.Country;
import ge.vazisu.simplejack.entity.Game;
import ge.vazisu.simplejack.entity.League;
import ge.vazisu.simplejack.entity.Team;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MainMapper {

  CountryDto countryToDto(Country country);

  LeagueDto leagueToDto(League league);

  TeamDto teamToDto(Team team);

  GameDto gameToDto(Game game);


  Game gameDtoToEntity(GameDto gameDto);
}
