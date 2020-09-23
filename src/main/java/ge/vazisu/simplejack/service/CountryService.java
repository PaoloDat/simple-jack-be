package ge.vazisu.simplejack.service;

import ge.vazisu.simplejack.dto.CountryDto;
import ge.vazisu.simplejack.mapper.MainMapper;
import ge.vazisu.simplejack.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CountryService {

  private final CountryRepository repository;
  private final MainMapper mapper;

  public List<CountryDto> getAllCountries() {
    return repository.findAll().stream()
            .map(mapper::countryToDto)
            .sorted(Comparator.comparing(CountryDto::getName))
            .collect(Collectors.toList());
  }
}
