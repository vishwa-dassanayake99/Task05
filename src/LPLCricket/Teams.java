package LPLCricket;

public class Teams implements Comparable<Teams> {
  private int position;
  private String club;
  private int played;
  private int won;
  private int lost;
  private int points;
  private double nrr;
  
  
  public Teams(int position, String club, int played, int won,int lost, int points, double nrr) {
    this.position = position;
    this.club = club;
    this.played = played;
    this.won = won;
    this.lost = lost;
    this.points = points;
    this.nrr = nrr;
  }

  public String toString() {
    return String.format("%-3d%-20s%10d%10d%10d%10d%15f", position, club, played, won, lost, points,nrr);
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public String getClub() {
    return club;
  }

  public void setClub(String club) {
    this.club = club;
  }

  public int getPlayed() {
    return played;
  }

  public void setPlayed(int played) {
    this.played = played;
  }

  public int getWon() {
    return won;
  }

  public void setWon(int won) {
    this.won = won;
  }

  public int getLost() {
    return lost;
  }

  public void setLost(int lost) {
    this.lost = lost;
  }
  
  public int getPoints() {
	  return points;
  }
  
  public void setPoints(int points) {
	  this.points = points;
  }
  
  public double getNrr() {
	  return nrr;
  }
  
  public void setNrr(double nrr) {
	  this.nrr = nrr;
  }
  
@Override
public int compareTo(Teams c) {
    return ((Integer) points).compareTo(c.points);
  }
}
