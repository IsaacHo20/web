#Type "TextAdventure()" into the Thonny shell to begin your adventure.
from random import randint

def TextAdventure():
    playerName = input("""What is your character's name?
    Enter your name: """)
    playerHealth = 100
    playerChoice = 0
    print(playerName + " has " + str(playerHealth) + " health.")

    print("Before you is the mouth of a large, dark cave.")
    print("1. Enter the cave.")
    print("2. Run away.")
    playerChoice = input("""What will you do?
Enter an option: """)
    
    if playerChoice == '1':
        #Player enters the cave.
        print("You don't get far before you stuble upon a guard.")
        print("1. Sneak past the guard.")
        print("2. Fight the guard.")
        print("3. Talk to the guard.")
        playerChoice = input("""What will you do?
Enter an option: """)
        
        if playerChoice == '1':
            print("You successfully sneak past the guard.")
            print("You come into a cavern with a chest at its center.")
            print("1. Open the chest.")
            print("2. Ignore the chest, it must be a trap.")
            playerChoice = input("""What will you do?
Enter an option: """)
                
            if playerChoice == '1':
                print("You open the chest and find a sword inside. It is quite worn, but still seems to be sharp.")
                hasSword = True
                    
            elif playerChoice == '2':
                hasSword = False
                
            print("""You move down the passage at the other enterance. It leads into tunnel and another chamber,
this one home to a pack of wolves. A few of them turns, snarl at you, and begin to creep forward.""")
            print("1. Take on the wolves.")
            print("2. Run for your life.")
            enemies = randint(5, 15)
            enemyHealth = 10
            playerChoice = input("""What will you do?
Enter an option: """)
                
            if playerChoice == '1':
                if hasSword == True:
                    while True:
                        playerHealth -= randint(3, 9)
                        enemyHealth -= randint(4, 10)
                        if enemyHealth < 1:
                            enemies -= 1
                            
                        print("You have " + str(playerHealth) + " health.")
                        print("The wolf has " + str(enemyHealth) + " health. There are " + str(enemies) + " other wolves left.")
                        if enemyHealth < 1:
                            enemyHealth = 10
                        
                        if enemies == 0 or playerHealth < 1:
                            break
                        
                    if playerHealth < 1:
                        print("The wolves tear you to pieces. " + playerName + " is dead.")
                        
                    if enemies == 0:
                        print("You have defeated all of the wolves. " + playerName + """ decides that that is enough adventures for one
day and goes home to sleep.""")
                            
                if hasSword == False:
                    print("The wolves tear you to pieces. " + playerName + " is dead.")
                    
            elif playerChoice == '2':
                print("You escape from the cave, go home, and rest.")
                
        elif playerChoice == '2':
            print("You fight the guard, but he is too strong and well-armed to be overpowered. " +
playerName + " is dead.")
            
        elif playerChoice == '3':
            print("The guard warns you to turn back or be killed.")
            print("1. Fight the guard.")
            print("2. Leave the cave.")
            playerChoice = input("""What will you do?
Enter an option: """)
                
            if playerChoice == '1':
                print("The guard defeats you. " + playerName + " is dead.")
                    
            elif playerChoice == '2':
                print(playerName + " returns home and goes to sleep.")
                    
    elif playerChoice == '2':
        print(playerName + " runs home and goes to sleep.")