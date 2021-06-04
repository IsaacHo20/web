public class MonsterGenerator {
    public static void main(String[] args) {
        String[] monsters = {"Goblin", "Ghoul", "Ghost", "Golem"};
        System.out.println(monsters[0]);
        System.out.println(monsters[1]);
        System.out.println(monsters[2]);
        System.out.println(monsters[3]);

        System.out.println("There are "+ monsters.length +" possible monsters.");
        System.out.println("The last monster is"+ monsters[monsters.length- 1]);
    }
}
