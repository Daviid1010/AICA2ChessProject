class Move{
  Square start;
  Square landing;

  public Move(Square x, Square y){
    start = x;
    landing = y;
  }

  public Move(){

  }

  public Square getStart(){
    return start;
  }

  public Square getLanding(){
    return landing;
  }

  /*
Create evaluation function here for checking value of the move, gives each piece a score
  */
public int getMoveValue() {
  int moveValue=0;

String landingPiece = getLanding.getName();

if (landingPiece.contains("Pawn")) {
    moveValue = 1;
}
else if (landingPiece.contains("Knight") || landingPiece.contains("Bishop")) {
  moveValue = 3;
}
else if (landingPiece.contains("Rook")) {
  moveValue  = 5;
}
else if(landingPiece.contains("Queen")) {
  moveValue = 9;
}
else if (landingPiece.contains("King")) {
  moveValue = Integer.POSITIVE_INFINITY;
}
else {
  moveValue=0;
}



  return moveValue;
}

}
