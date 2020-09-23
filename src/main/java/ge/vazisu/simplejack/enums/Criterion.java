package ge.vazisu.simplejack.enums;

import ge.vazisu.simplejack.dto.CriterionDto;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
public enum Criterion {

  TOURNAMENT_HOME_0(0, "Победы - 0"),
  TOURNAMENT_HOME_1(0, "Победы - 1"),
  TOURNAMENT_HOME_2(0, "Победы - 2"),
  TOURNAMENT_HOME_3(0, "Победы - 3"),
  TOURNAMENT_HOME_4(0, "Победы - 4"),
  TOURNAMENT_HOME_5(0, "Поражения - 0"),
  TOURNAMENT_HOME_6(0, "Поражения - 1"),
  TOURNAMENT_HOME_7(0, "Поражения - 2"),
  TOURNAMENT_HOME_8(0, "Поражения - 3"),
  TOURNAMENT_HOME_9(0, "Поражения - 4"),
  TOURNAMENT_HOME_10(0, "Ничьи - 0"),
  TOURNAMENT_HOME_11(0, "Ничьи - 1"),
  TOURNAMENT_HOME_12(0, "Ничьи - 2"),
  TOURNAMENT_HOME_13(0, "Ничьи - 3"),
  TOURNAMENT_HOME_14(0, "Ничьи - 4"),
  TOURNAMENT_HOME_15(0, "Победы подряд - 2"),
  TOURNAMENT_HOME_16(0, "Победы подряд - 3"),
  TOURNAMENT_HOME_17(0, "Победы подряд - 4"),
  TOURNAMENT_HOME_18(0, "Победы подряд - 5"),
  TOURNAMENT_HOME_19(0, "Поражения подряд - 2"),
  TOURNAMENT_HOME_20(0, "Поражения подряд - 3"),
  TOURNAMENT_HOME_21(0, "Поражения подряд - 4"),
  TOURNAMENT_HOME_22(0, "Поражения подряд - 5"),
  TOURNAMENT_HOME_23(0, "Ничьи подряд - 2"),
  TOURNAMENT_HOME_24(0, "Ничьи подряд - 3"),
  TOURNAMENT_HOME_25(0, "Ничьи подряд - 4"),
  TOURNAMENT_HOME_26(0, "Ничьи подряд - 5"),


  TOURNAMENT_HOME_HOME_0(1, "Победы - 0"),
  TOURNAMENT_HOME_HOME_1(1, "Победы - 1"),
  TOURNAMENT_HOME_HOME_2(1, "Победы - 2"),
  TOURNAMENT_HOME_HOME_3(1, "Победы - 3"),
  TOURNAMENT_HOME_HOME_4(1, "Победы - 4"),
  TOURNAMENT_HOME_HOME_5(1, "Поражения - 0"),
  TOURNAMENT_HOME_HOME_6(1, "Поражения - 1"),
  TOURNAMENT_HOME_HOME_7(1, "Поражения - 2"),
  TOURNAMENT_HOME_HOME_8(1, "Поражения - 3"),
  TOURNAMENT_HOME_HOME_9(1, "Поражения - 4"),
  TOURNAMENT_HOME_HOME_10(1, "Ничьи - 0"),
  TOURNAMENT_HOME_HOME_11(1, "Ничьи - 1"),
  TOURNAMENT_HOME_HOME_12(1, "Ничьи - 2"),
  TOURNAMENT_HOME_HOME_13(1, "Ничьи - 3"),
  TOURNAMENT_HOME_HOME_14(1, "Ничьи - 4"),
  TOURNAMENT_HOME_HOME_15(1, "Победы подряд - 2"),
  TOURNAMENT_HOME_HOME_16(1, "Победы подряд - 3"),
  TOURNAMENT_HOME_HOME_17(1, "Победы подряд - 4"),
  TOURNAMENT_HOME_HOME_18(1, "Победы подряд - 5"),
  TOURNAMENT_HOME_HOME_19(1, "Поражения подряд - 2"),
  TOURNAMENT_HOME_HOME_20(1, "Поражения подряд - 3"),
  TOURNAMENT_HOME_HOME_21(1, "Поражения подряд - 4"),
  TOURNAMENT_HOME_HOME_22(1, "Поражения подряд - 5"),
  TOURNAMENT_HOME_HOME_23(1, "Ничьи подряд - 2"),
  TOURNAMENT_HOME_HOME_24(1, "Ничьи подряд - 3"),
  TOURNAMENT_HOME_HOME_25(1, "Ничьи подряд - 4"),
  TOURNAMENT_HOME_HOME_26(1, "Ничьи подряд - 5"),



  TOURNAMENT_AWAY_0(2, "Победы - 0"),
  TOURNAMENT_AWAY_1(2, "Победы - 1"),
  TOURNAMENT_AWAY_2(2, "Победы - 2"),
  TOURNAMENT_AWAY_3(2, "Победы - 3"),
  TOURNAMENT_AWAY_4(2, "Победы - 4"),
  TOURNAMENT_AWAY_5(2, "Поражения - 0"),
  TOURNAMENT_AWAY_6(2, "Поражения - 1"),
  TOURNAMENT_AWAY_7(2, "Поражения - 2"),
  TOURNAMENT_AWAY_8(2, "Поражения - 3"),
  TOURNAMENT_AWAY_9(2, "Поражения - 4"),
  TOURNAMENT_AWAY_10(2, "Ничьи - 0"),
  TOURNAMENT_AWAY_11(2, "Ничьи - 1"),
  TOURNAMENT_AWAY_12(2, "Ничьи - 2"),
  TOURNAMENT_AWAY_13(2, "Ничьи - 3"),
  TOURNAMENT_AWAY_14(2, "Ничьи - 4"),
  TOURNAMENT_AWAY_15(2, "Победы подряд - 2"),
  TOURNAMENT_AWAY_16(2, "Победы подряд - 3"),
  TOURNAMENT_AWAY_17(2, "Победы подряд - 4"),
  TOURNAMENT_AWAY_18(2, "Победы подряд - 5"),
  TOURNAMENT_AWAY_19(2, "Поражения подряд - 2"),
  TOURNAMENT_AWAY_20(2, "Поражения подряд - 3"),
  TOURNAMENT_AWAY_21(2, "Поражения подряд - 4"),
  TOURNAMENT_AWAY_22(2, "Поражения подряд - 5"),
  TOURNAMENT_AWAY_23(2, "Ничьи подряд - 2"),
  TOURNAMENT_AWAY_24(2, "Ничьи подряд - 3"),
  TOURNAMENT_AWAY_25(2, "Ничьи подряд - 4"),
  TOURNAMENT_AWAY_26(2, "Ничьи подряд - 5"),



  TOURNAMENT_AWAY_AWAY_0(3, "Победы - 0"),
  TOURNAMENT_AWAY_AWAY_1(3, "Победы - 1"),
  TOURNAMENT_AWAY_AWAY_2(3, "Победы - 2"),
  TOURNAMENT_AWAY_AWAY_3(3, "Победы - 3"),
  TOURNAMENT_AWAY_AWAY_4(3, "Победы - 4"),
  TOURNAMENT_AWAY_AWAY_5(3, "Поражения - 0"),
  TOURNAMENT_AWAY_AWAY_6(3, "Поражения - 1"),
  TOURNAMENT_AWAY_AWAY_7(3, "Поражения - 2"),
  TOURNAMENT_AWAY_AWAY_8(3, "Поражения - 3"),
  TOURNAMENT_AWAY_AWAY_9(3, "Поражения - 4"),
  TOURNAMENT_AWAY_AWAY_10(3, "Ничьи - 0"),
  TOURNAMENT_AWAY_AWAY_11(3, "Ничьи - 1"),
  TOURNAMENT_AWAY_AWAY_12(3, "Ничьи - 2"),
  TOURNAMENT_AWAY_AWAY_13(3, "Ничьи - 3"),
  TOURNAMENT_AWAY_AWAY_14(3, "Ничьи - 4"),
  TOURNAMENT_AWAY_AWAY_15(3, "Победы подряд - 2"),
  TOURNAMENT_AWAY_AWAY_16(3, "Победы подряд - 3"),
  TOURNAMENT_AWAY_AWAY_17(3, "Победы подряд - 4"),
  TOURNAMENT_AWAY_AWAY_18(3, "Победы подряд - 5"),
  TOURNAMENT_AWAY_AWAY_19(3, "Поражения подряд - 2"),
  TOURNAMENT_AWAY_AWAY_20(3, "Поражения подряд - 3"),
  TOURNAMENT_AWAY_AWAY_21(3, "Поражения подряд - 4"),
  TOURNAMENT_AWAY_AWAY_22(3, "Поражения подряд - 5"),
  TOURNAMENT_AWAY_AWAY_23(3, "Ничьи подряд - 2"),
  TOURNAMENT_AWAY_AWAY_24(3, "Ничьи подряд - 3"),
  TOURNAMENT_AWAY_AWAY_25(3, "Ничьи подряд - 4"),
  TOURNAMENT_AWAY_AWAY_26(3, "Ничьи подряд - 5"),



  TOURNAMENT_H2H_0(4, "Приемущество 1"),
  TOURNAMENT_H2H_1(4, "Приемущество Х"),
  TOURNAMENT_H2H_2(4, "Приемущество 2"),
  TOURNAMENT_H2H_3(4, "Приемущество 1Х"),
  TOURNAMENT_H2H_4(4, "Приемущество 12"),
  TOURNAMENT_H2H_5(4, "Приемущество Х2"),
  TOURNAMENT_H2H_6(4, "Серия 1"),
  TOURNAMENT_H2H_7(4, "Серия Х"),
  TOURNAMENT_H2H_8(4, "Серия 2"),
  TOURNAMENT_H2H_9(4, "Серия без 1"),
  TOURNAMENT_H2H_10(4, "Серия без Х"),
  TOURNAMENT_H2H_11(4, "Серия без 2"),


  FEATURE_0(16, "Явный фаворит 1"),
  FEATURE_1(16, "Явный фаворит X"),
  FEATURE_2(16, "Явный фаворит 2"),
  FEATURE_3(16, "Ничья - пул FON"),
  FEATURE_4(16, "Ничья - пул MAN");









  private final Integer groupId;
  private final String description;

  Criterion(Integer groupId, String description) {
    this.groupId = groupId;
    this.description = description;
  }

  public static Map<Integer, List<CriterionDto>> getCriteria() {
    return Arrays.stream(Criterion.values())
            .collect(
                    Collectors.groupingBy(
                            (Criterion::getGroupId),
                            Collectors.mapping(criterion ->
                                    new CriterionDto(criterion.name(), criterion.getDescription()), Collectors.toList())
                    ));
  }
}
