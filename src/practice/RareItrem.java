package practice;

public class RareItrem {

    public static void wear(int hp, int mp) {
        if (hp >= 2000 && mp >= 2000) {
            System.out.println("장비가 장착되었습니다.");
        } else {
            System.out.println("착용조건이 맞지 않습니다.");

        }

    }

    public static void main(String[] args) {
        wear(2400, 2000);
        wear(3800, 1200);
    }

}
