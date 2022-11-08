import java.util.*;

class Guesser{
	int guessNum;	
	int guessNum() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Guesser Please Guess a number between 10 to 20");
	guessNum=sc.nextInt();
	if(guessNum<10||guessNum>20) {
		System.out.println("Number out of range");
		System.exit(0);
	}
	return guessNum;
	}
}
class Player{
	int guessNum;
	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player Please Guess a number between 10 to 20");
		guessNum=sc.nextInt();
		if(guessNum<10||guessNum>20) {
			System.out.println("Number out of range");
			System.exit(0);
		}
		return guessNum;
	}
}
class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();	
	}
void compare() {
	if(numFromGuesser==numFromPlayer1) {
		if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
			System.out.println("All Players Won the Game!");
		}
		else if(numFromGuesser==numFromPlayer2) {
			System.out.println("Player 1 and Player 2 Won the game");
		}
		else if(numFromGuesser==numFromPlayer3) {
			System.out.println("Player 1 and Player 3 Won the game");
		}
		else {
			System.out.println("Player 1 won the game");
		}
	}
	else if(numFromGuesser==numFromPlayer2) {
		if(numFromGuesser==numFromPlayer3) {
			System.out.println("Player 2 and Player 3 won the game");
		}
		else {
			System.out.println("Player 2 won the game");
		}
	}
	else if(numFromGuesser==numFromPlayer3) {
		System.out.println("Player 3 won the game");
	}
	else{
		System.out.println("Game lost, please try again");
	}
 }


}


public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
	}

}
