class Game{
              static String gameName="FreeFire";
              String playerName;
           static void startGame(){
               System.out.println(Game.gameName);
           }
              void play(){
            System.out.println(this.playerName);
               }
          public static void main(String args[]){
              Game.startGame();
               
              Game player1=new Game();
              player1.playerName="Raja";
              player1.play();

              Game player2=new Game();
              player2.playerName="Gaja";
              player2.play();


          }
     }