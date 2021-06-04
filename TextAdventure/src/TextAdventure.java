import java.util.Scanner;
import java.util.Random;

public class TextAdventure {
    public static void main(String[] args) {
        int playerLevel = 1;
        Scanner playerInput = new Scanner(System.in);
        System.out.println("What is your character's name?");
        String playerName = playerInput.nextLine();
        Random generator = new Random();
        int playerHealth = generator.nextInt(100);

        System.out.println(playerName + " is level " + playerLevel + " and has " + playerHealth + " health.");
        System.out.println("Before you is a large cave mouth. Darkness is before you. Dare you enter the Cave of Wonders?");

        System.out.println("1. Enter the cave");
        System.out.println("2. Run away");

        int playerChoice = playerInput.nextInt();
        if (playerChoice == 1) {
            //Player enters cave
            playerLevel++;
            System.out.println(playerName + " entered the cave. Congrats! You leveled up to level " + playerLevel + "!");

            System.out.println("You don't get far before you stumble across a guard.");

            System.out.println("1. Sneak past the guard");
            System.out.println("2. Fight the guard");
            System.out.println("3. Talk to the guard");
            boolean
            playerChoice = playerInput.nextInt();
            if (playerChoice == 1) {
                System.out.println("You successfully sneak past the guard.");
                System.out.println("");
            } else if (playerChoice == 2){
                System.out.println("You fight the guard, but he is too strong and well armed to be overpowered.\nComrade! You are dead!");
                System.exit(0);
            }

            System.out.println("You leave the cavern with the chest and continue your journey");
            System.out.println("Up ahead the air grows warm and wet. You hear snoring.");
            System.out.println("Peeking around a corner you see dragon sleeping in the room ahead.");
            System.out.println("You move to leave, but the dragon awakes before you can!");

            System.out.println("1. Fight the Dragon.");
            System.out.println("2. Run for your life.");
                playerChoice = playerInput.nextInt();
                    if (playerChoice == 1) {
                        //Player fights dragon
                        System.out.println("Adrenaline courses through your body and you fight the dragon.");
                        System.out.println("You slay the mighty beast!");
                        System.out.println("Perhaps the leviathan was guarding something.");

                        System.out.println("1. Investigate the lair.");
                        System.out.println("2. Leave the lair.");
                        boolean GoldKey = false;
                        if (playerChoice == 1) {
                            //Player investigates lair
                            GoldKey = true;
                            System.out.println("Beneath the creature's carcass you find a golden key.");

                            System.out.println("You stumble upon a chest.");
                            System.out.println("1. Attempt to open the chest with your key.");
                            System.out.println("2. Move on.");
                            System.out.println("3. Leave the cave and go to sleep.");
                                if (playerChoice == 1) {
                                    System.out.println("Your key gets stuck in the chest and won't come out.");
                                    System.out.println("You move onto the next room and are confronted by a goblin.\nHe asks if you have the key.\nWhen you say no, he stabs you to death.\nComrade! You are dead!");
                                    System.exit(0);
                                } else if (playerChoice == 2) {
                                    System.out.println("You move onto the next room and are confronted by a goblin.\nHe asks if you have the key.\nHe lets you pass when you show it to him.");
                                } else {
                                    System.out.println("You decide that you have had enough adventures for one day and return home to sleep");
                                    System.exit(0);
                                }
                        } else {
                            //Player does not investigate lair
                            System.out.println("You decide that you have had enough adventures for one day and return home to sleep");
                            System.exit(0);
                        }
                    } else {
                        //Player runs
                        System.out.println("As you flee and go to sleep, the dragon returns to its slumber.");
                        System.exit(0);
                    }
                } else {
                    //Player doesn't get Magic Sword
                    System.out.println("Wary of a trap, you ignore the chest.");

                    System.out.println("You leave the cavern with the chest and continue your journey");
                    System.out.println("Up ahead the air grows warm and wet. You hear snoring.");
                    System.out.println("Peeking around a corner you see dragon sleeping in the room ahead.");
                    System.out.println("You move to leave, but the dragon awakes before you can!");

                    System.out.println("1. Fight the Dragon.");
                    System.out.println("2. Run for your life.");
                    playerChoice = playerInput.nextInt();
                if (playerChoice == 1) {
                    //Player fights dragon
                        System.out.println("Adrenaline courses through your body and you fight the dragon.");
                        System.out.println("Blows rain down on the beast's body but you cannot kill the dragon and it eats you!");
                        System.out.println("Comrade! You are dead!");
                        System.exit(0);
                    } else {
                        //Player runs
                        System.out.println("As you flee and go to sleep, the dragon returns to its slumber.");
                        System.exit(0);
                    }
                }

            } else {
                //Player runs from cave
                System.out.println(playerName + " runs home and sleeps.");
                System.exit(0);
            }

        }
    }
    //MSword code
    System.out.println("You come into a natural cavern and find a treasure chest.");
                    boolean hasMSword = false;
                    System.out.println("1. Open the chest.");
                    System.out.println("2. Ignore the chest, it must be a trap.");
                    playerChoice = playerInput.nextInt();