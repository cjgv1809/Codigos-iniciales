import random

print("Welcome, please enter your name")
userName = input().capitalize()
minNumber = 1
maxNumber = 20
guessesTaken = 5

randomNumber = random.randint(minNumber, maxNumber)
print("Well, " + userName + " I am thinking of a number between " + str(minNumber) + " and " + str(maxNumber))
print("Can you try to guess it? Let's see")

while (guessesTaken > 0):
    print("Take a guess")
    guess = int(input())
    guessesTaken = guessesTaken - 1

    if guess < randomNumber:
        print("Your guess is too Low. Try again")
    elif guess > randomNumber:
        print("Your guess is too High. Try again")
    else:
        print("Great Job " + userName + ", you guessed my number!")
        break
    print("You have " + str(guessesTaken) + " guesses left")
    if guessesTaken == 0:
        print("Sorry " + userName + " you have no guesses left")
