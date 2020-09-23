package ge.vazisu.simplejack;

import ge.vazisu.simplejack.dto.CriterionDto;
import ge.vazisu.simplejack.enums.Criterion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class CriteriaTest {

  @Test
  void shouldReturnMap() {
    Map<Integer, List<CriterionDto>> map = Criterion.getCriteria();
    Assertions.assertNotNull(map);
  }
}
