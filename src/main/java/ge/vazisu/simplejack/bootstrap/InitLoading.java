package ge.vazisu.simplejack.bootstrap;

import ge.vazisu.simplejack.entity.Country;
import ge.vazisu.simplejack.entity.League;
import ge.vazisu.simplejack.entity.Team;
import ge.vazisu.simplejack.repository.CountryRepository;
import ge.vazisu.simplejack.repository.LeagueRepository;
import ge.vazisu.simplejack.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InitLoading implements CommandLineRunner {

  private final CountryRepository countryRepository;
  private final LeagueRepository leagueRepository;
  private final TeamRepository teamRepository;

  @Override
  public void run(String... args){
    initLoading();
  }

  private void initLoading() {
//    loadEngland();
//    loadGermany();
  }

  private void loadGermany() {
    Country germany = new Country().setName("Deutschland");
    countryRepository.save(germany);

    League bundesliga = new League().setName("Bundesliga").setCountry(germany);
    League bundesliga2 = new League().setName("2. Bundesliga").setCountry(germany);


    List<League> leagues = List.of(
            bundesliga,
            bundesliga2

    );
    leagueRepository.saveAll(leagues);

    List<Team> teams = List.of(
        new Team().setCountry(germany).setLeague(bundesliga).setName("Bayern Munich"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Hertha Berlin"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Dortmund"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Augsburg"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("RB Leipzig"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Hoffenheim"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Freiburg"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Eintracht Frankfurt"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Arminia Bielefeld"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Bayer Leverkusen"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Wolfsburg"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("FC Koln"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Stuttgart"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Union Berlin"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Mainz"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Werder Bremen"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("B. Monchengladbach"),
        new Team().setCountry(germany).setLeague(bundesliga).setName("Schalke"),


            new Team().setCountry(germany).setLeague(bundesliga2).setName("Aue"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Hannover"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Heidenheim"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Sandhausen"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Hamburger"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Holstein Kiel"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Bochum"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("St. Pauli"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Regensburg"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Nurnberg"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Greuther Furth"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("VfL Osnabruck"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Darmstadt"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Dusseldorf"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Paderborn"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Braunschweig"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Karlsruher"),
            new Team().setCountry(germany).setLeague(bundesliga2).setName("Wurzburger Kickers")
    );
    teamRepository.saveAll(teams);

  }

  private void loadEngland() {
    Country england = new Country().setName("England");
    countryRepository.save(england);

    League englandPremiereLeague = new League().setName("Premier League").setCountry(england);
    League championship = new League().setName("Championship").setCountry(england);
    League leagueOne = new League().setName("League One").setCountry(england);
    League leagueTwo = new League().setName("League Two").setCountry(england);

    List<League> leagues = List.of(
            englandPremiereLeague,
            championship,
            leagueOne,
            leagueTwo
    );
    leagueRepository.saveAll(leagues);

    List<Team> teams = List.of(
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Leicester"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Everton"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Arsenal"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Liverpool"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Crystal Palace"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Tottenham"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Manchester City"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Brighton"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Aston Villa"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Leeds"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Chelsea"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Wolves"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Newcastle"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Burnley"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Manchester Utd"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("West Ham"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Sheffield Utd"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Fulham"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("Southampton"),
            new Team().setCountry(england).setLeague(englandPremiereLeague).setName("West Brom"),

            new Team().setCountry(england).setLeague(championship).setName("Reading"),
            new Team().setCountry(england).setLeague(championship).setName("Bristol City"),
            new Team().setCountry(england).setLeague(championship).setName("Luton"),
            new Team().setCountry(england).setLeague(championship).setName("Bournemouth"),
            new Team().setCountry(england).setLeague(championship).setName("Norwich"),
            new Team().setCountry(england).setLeague(championship).setName("Birmingham"),
            new Team().setCountry(england).setLeague(championship).setName("Watford"),
            new Team().setCountry(england).setLeague(championship).setName("Millwall"),
            new Team().setCountry(england).setLeague(championship).setName("Swansea"),
            new Team().setCountry(england).setLeague(championship).setName("Blackburn"),
            new Team().setCountry(england).setLeague(championship).setName("Brentford"),
            new Team().setCountry(england).setLeague(championship).setName("QPR"),
            new Team().setCountry(england).setLeague(championship).setName("Coventry"),
            new Team().setCountry(england).setLeague(championship).setName("Cardiff"),
            new Team().setCountry(england).setLeague(championship).setName("Rotherham"),
            new Team().setCountry(england).setLeague(championship).setName("Preston"),
            new Team().setCountry(england).setLeague(championship).setName("Middlesbrough"),
            new Team().setCountry(england).setLeague(championship).setName("Stoke"),
            new Team().setCountry(england).setLeague(championship).setName("Derby"),
            new Team().setCountry(england).setLeague(championship).setName("Barnsley"),
            new Team().setCountry(england).setLeague(championship).setName("Huddersfield"),
            new Team().setCountry(england).setLeague(championship).setName("Nottingham"),
            new Team().setCountry(england).setLeague(championship).setName("Wycombe"),
            new Team().setCountry(england).setLeague(championship).setName("Sheffield Wed"),

            new Team().setCountry(england).setLeague(leagueOne).setName("Ipswich"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Lincoln"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Hull"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Doncaster"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Sunderland"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Plymouth"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Northampton"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Accrington"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Blackpool"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Charlton"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Swindon"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Burton"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Fleetwood"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Gillingham"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Peterborough"),
            new Team().setCountry(england).setLeague(leagueOne).setName("AFC Wimbledon"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Portsmouth"),
            new Team().setCountry(england).setLeague(leagueOne).setName("MK Dons"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Shrewsbury"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Rochdale"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Bristol Rovers"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Wigan"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Crewe"),
            new Team().setCountry(england).setLeague(leagueOne).setName("Oxford Utd"),

            new Team().setCountry(england).setLeague(leagueTwo).setName("Cambridge Utd"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Port Vale"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Harrogate"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Salford"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Stevenage"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Colchester"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Leyton Orient"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Walsall"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Forest Green"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Newport"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Cheltenham"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Carlisle"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Crawley"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Morecambe"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Bradford City"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Mansfield"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Barrow"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Scunthorpe"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Exeter"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Tranmere"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Bolton"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Oldham"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Grimsby"),
            new Team().setCountry(england).setLeague(leagueTwo).setName("Southend")
            );

    teamRepository.saveAll(teams);
  }



}
