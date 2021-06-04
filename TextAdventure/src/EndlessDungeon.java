import java.util.Random;

public class EndlessDungeon {
    public static void main(String[] args) {
        System.out.println("Welcome to the Endless Dungeon.");
        Random generator = new Random();
        int playerHealth = 100, enemyHealth = generator.nextInt(10)+ 1;

        while (playerHealth > 0) {
            System.out.println("You have "+ playerHealth +" health.");
            int playerDamage = generator.nextInt(5)+1, enemyDamage = generator.nextInt(3)+1;
            enemyHealth -= playerDamage;
            playerHealth -= enemyDamage;
            System.out.println("You attack the enemy for "+ playerDamage +" damage.");
            System.out.println("The enemy attacks you for "+ enemyDamage +" damage.");
            int playerKills = 0;
            if (enemyHealth <= 0 ) {
                System.out.println("You defeated the enemy! You break open the door to the next room and find another enemy.");

                while (playerHealth > 0) {
                    playerKills++;
                    enemyHealth = generator.nextInt(10)+1;
                    System.out.println("You have "+ playerHealth +" health.");
                    playerDamage = generator.nextInt(5)+1;
                    enemyDamage = generator.nextInt(3)+1;
                    enemyHealth -= playerDamage;
                    playerHealth -= enemyDamage;
                    System.out.println("You attack the enemy for "+ playerDamage +" damage.");
                    System.out.println("The enemy attacks you for "+ enemyDamage +" damage.");
                    System.out.println("Comrade! You are dead! You killed "+ playerKills +" ememies.");
                }
            }
        }
    }
}
