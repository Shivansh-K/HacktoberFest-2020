import random
from random import randint

def BeastEasy(counter=0, counter1=1, luckvar=3, countup=2, level=1):
    print("You are on LVL " + str(level) + "! To win EASY pick a number between 1 to " + str(luckvar) + " in " + str(countup) + " guesses")
    luck = random.randint(1, luckvar)
    print("The answer will be " + str(luck))
    loto = (int(input("Pick a number from 1 to " + str(luckvar) + ": ")))
    while luck != loto:

        if loto <= (luck + 3) and loto >= (luck - 3):
            counter += 1
            if counter > counter1:
                print("too many guesses")
                break
            else:
                print("closey")
                print(counter)
                loto = (int(input("Try again hotshot! Pick a number from 1 to " + str(luckvar) + ": ")))

        else:
            counter += 1
            if counter > counter1:
                print("too many guesses")
                break
            else:
                print("Not closey")
                loto = (int(input("NOOOOO Pick a number from 1 to " + str(luckvar) + ": ")))

    else:
        print("WINWINWINWIN")
        BeastEasy(counter=0, counter1=counter1 + 1, luckvar=luckvar + 2, countup=countup + 1, level=level + 1)


def BeastMedium(counter=0, counter1=1, luckvar=3, countup=2, level=1):
    print("You are on LVL " + str(level) + "! To win MEDIUM pick a number between 1 to " + str(luckvar) + " in " + str(countup) + " guesses")
    luck = random.randint(1, luckvar)
    print("The answer will be " + str(luck))
    loto = (int(input("Pick a number from 1 to " + str(luckvar) + ": ")))
    while luck != loto:

        if loto <= (luck + 3) and loto >= (luck - 3):
            counter += 1
            if counter > counter1:
                print("too many guesses")
                break
            else:
                print("closey")
                print(counter)
                loto = (int(input("Try again hotshot! Pick a number from 1 to " + str(luckvar) + ": ")))

        else:
            counter += 1
            if counter > counter1:
                print("too many guesses")
                break
            else:
                print("Not closey")
                loto = (int(input("NOOOOO Pick a number from 1 to " + str(luckvar) + ": ")))

    else:
        print("WINWINWINWIN")
        BeastMedium(counter=0, counter1=counter1 + 1, luckvar=luckvar + 4, countup=countup + 1, level=level + 1)


def BeastHard(counter=0, counter1=1, luckvar=3, countup=2, level=1):
    print("You are on LVL " + str(level) + "! To win HARD pick a number between 1 to " + str(luckvar) + " in " + str(countup) + " guesses")
    luck = random.randint(1, luckvar)
    print("The answer will be " + str(luck))
    loto = (int(input("Pick a number from 1 to " + str(luckvar) + ": ")))
    while luck != loto:

        if loto <= (luck + 3) and loto >= (luck - 3):
            counter += 1
            if counter > counter1:
                print("too many guesses")
                break
            else:
                print("closey")
                print(counter)
                loto = (int(input("Try again hotshot! Pick a number from 1 to " + str(luckvar) + ": ")))

        else:
            counter += 1
            if counter > counter1:
                print("too many guesses")
                break
            else:
                print("Not closey")
                loto = (int(input("NOOOOO Pick a number from 1 to " + str(luckvar) + ": ")))

    else:
        print("WINWINWINWIN")
        BeastHard(counter=0, counter1=counter1 + 1, luckvar=luckvar + 6, countup=countup + 1, level=level + 1)



Difficulty = input("Type a difficulty, either easy, medium or hard: ")
if Difficulty == "easy":
    BeastEasy()
elif Difficulty == "medium":
    BeastMedium()
else:
    BeastHard()

