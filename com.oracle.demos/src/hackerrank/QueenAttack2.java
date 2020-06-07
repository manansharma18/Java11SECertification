package hackerrank;

public class QueenAttack2 {
    public static void main(String[] args) {
   }

    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int squaresMovedLeft =0,squaresMovedRight =0,squaresMovedUp=0,squaresMovedDown=0,
                squaresMovedLeftDiagonalUp=0,squaresMovedLeftDiagonalDown=0,
                squaresMovedRightDiagonalUp=0,squaresMovedRightDiagonalDown=0,totalSquaresMoved =0;
        int currentColumn = c_q;
        OUTER: for (int row = r_q;row<=n;row++){
            INNER:  for (int [] x : obstacles){
                int xx=0;
                INNERMOST: for(int y :x){
                    if(y==row){
                        xx++;
                    }
                    if(xx==1 && y==currentColumn){
                        break OUTER;
                    }
                }
            }

            squaresMovedUp++;
        }

        OUTER: for (int row = r_q;row>=1;row--){
            INNER:  for (int [] x : obstacles){
                int xx=0;
                INNERMOST: for(int y :x){
                    if(y==row){
                        xx++;
                    }
                    if(xx==1 && y==currentColumn){
                        break OUTER;
                    }
                }
            }

            squaresMovedDown++;
        }

        int currentRow = r_q;

        OUTER: for (int column = c_q;column<=k;column++){
            INNER:  for (int [] x : obstacles){
                int yy=0;
                INNERMOST: for(int y :x){
                    if(y==currentRow){
                        yy++;
                    }
                    if(yy==1 && y==column){
                        break OUTER;
                    }
                }
            }
            squaresMovedRight++;
        }

        OUTER: for (int column = c_q;column>=1;column--){
            INNER:  for (int [] x : obstacles){
                int yy=0;
                INNERMOST: for(int y :x){
                    if(y==currentRow){
                        yy++;
                    }
                    if(yy==1 && y==column){
                        break OUTER;
                    }
                }
            }
            squaresMovedLeft++;
        }

        OUTER: for (int row = r_q;row<=n;row++){
            int xx=0;
            for (int column = c_q;column<=k;column++){
                xx++;
                if (xx==1){
                    INNER:  for (int [] x : obstacles){
                        int yy=0;
                        INNERMOST: for(int y :x){
                            if(y==currentRow){
                                yy++;
                            }
                            if(yy==1 && y==column){
                                break OUTER;
                            }
                        }
                    }

                    break;
                }

            }squaresMovedRightDiagonalUp++;
        }

        OUTER: for (int row = r_q;row>=1;row--){
            int xx=0;
            for (int column = c_q;column>=1;column--){
                xx++;
                if (xx==1){
                    INNER:  for (int [] x : obstacles){
                        int yy=0;
                        INNERMOST: for(int y :x){
                            if(y==currentRow){
                                yy++;
                            }
                            if(yy==1 && y==column){
                                break OUTER;
                            }
                        }
                    }

                    break;
                }

            }squaresMovedLeftDiagonalDown++;
        }

        OUTER: for (int row = r_q;row<=n;row++){
            int xx=0;
            for (int column = c_q;column>=1;column--){
                xx++;
                if (xx==1){
                    INNER:  for (int [] x : obstacles){
                        int yy=0;
                        INNERMOST: for(int y :x){
                            if(y==currentRow){
                                yy++;
                            }
                            if(yy==1 && y==column){
                                break OUTER;
                            }
                        }
                    }

                    break;
                }

            }squaresMovedLeftDiagonalUp++;
        }

        OUTER: for (int row = r_q;row>=1;row--){
            int xx=0;
            for (int column = c_q;column<=k;column++){
                xx++;
                if (xx==1){
                    INNER:  for (int [] x : obstacles){
                        int yy=0;
                        INNERMOST: for(int y :x){
                            if(y==currentRow){
                                yy++;
                            }
                            if(yy==1 && y==column){
                                break OUTER;
                            }
                        }
                    }

                    break;
                }

            }squaresMovedRightDiagonalDown++;
        }

        totalSquaresMoved = squaresMovedLeft+squaresMovedRight+squaresMovedUp   +squaresMovedDown+
                squaresMovedLeftDiagonalUp+squaresMovedLeftDiagonalDown+
                squaresMovedRightDiagonalUp+squaresMovedRightDiagonalDown;

        return totalSquaresMoved;
    }
}
