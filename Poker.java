import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card{
    private String rank; //点数
    private String suit; //花色

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
//        return "card{" +
//                "rank='" + rank + '\'' +
//                ", suit='" + suit + '\'' +
//                '}';
        return  "[" + this.suit + this.rank +"]";
    }
}
public class Poker {
    public static void main(String[] args) {
       //创建一副扑克牌
       List<Card> poker = buyPoker();
       //洗牌，最简单的是使用Collections.shuffle方法，把list中的元素打乱顺序
        Collections.shuffle(poker);
       // System.out.println(poker);
        //发牌，有三个人，没人法五张
        //每个玩家是个List,把每个玩家的手牌放入List
        //再把多个玩家的List放入一个List中
        //players表示所有玩家的手牌
        //每个元素就是一个玩家的所有手牌（也是一个List)
        List<List<Card>>  players = new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int i = 0; i < 5; i++) {
            //i表示五张牌  j表示三个人
            for (int j = 0; j < 3; j++) {
               List<Card> player =  players.get(j);
               player.add(poker.remove(0));
            }
        }
        //到这一步发牌结束，可以查看玩家手牌了
        for (int i = 0; i < 3 ; i++) {
            System.out.println("玩家" + i + players.get(i));
        }
    }
    private static List<Card> buyPoker(){
        List<Card> poker =  new ArrayList<>();
        String[] suits = {"♥","♣","♠","♦"};
        for(int i = 0; i < 4; i++){
            //这个循环用来处理四种花色
            //每种花色又有13张牌
            for (int j = 2; j <= 10 ; j++) {
                poker.add(new Card(String.valueOf(j),suits[i]));
            }
            poker.add(new Card("J",suits[i]));
            poker.add(new Card("Q",suits[i]));
            poker.add(new Card("K",suits[i]));
            poker.add(new Card("A",suits[i]));
        }
        return poker;
    }
}
