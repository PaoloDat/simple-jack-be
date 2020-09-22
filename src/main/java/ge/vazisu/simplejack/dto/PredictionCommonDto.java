package ge.vazisu.simplejack.dto;

import lombok.Data;

@Data
public class PredictionCommonDto {
  private int home = 0;
  private int draw = 0;
  private int away = 0;
  private int fonPool = 0;
  private int fonMiddle = 0;
  private int fonUnpool = 0;
  private int manPool = 0;
  private int manMiddle = 0;
  private int manUnpool = 0;

  public void addHome() {
    this.home++;
  }

  public void addDraw() {
    this.draw++;
  }

  public void addAway() {
    this.away++;
  }

  public void addFonPool() {
    this.fonPool++;
  }

  public void addFonMiddle() {
    this.fonMiddle++;
  }

  public void addFonUnpool() {
    this.fonUnpool++;
  }

  public void addManPool() {
    this.manPool++;
  }

  public void addManMiddle() {
    this.manMiddle++;
  }

  public void addManUnpool() {
    this.manUnpool++;
  }
}
