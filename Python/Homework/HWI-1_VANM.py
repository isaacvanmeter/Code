'''
Isaac Van Meter
This is my own original work.
3/3/23
'''
import random

deck = [(suit, value) for suit in ['Clubs', 'Diamonds', 'Hearts', 'Spades'] for value in range(2, 15)]
random.shuffle(deck)

def compare_cards(card1, card2):
    if card1[0] == 'Spades' and card2[0] != 'Spades':
        return 1
    elif card1[0] != 'Spades' and card2[0] == 'Spades':
        return -1
    elif card1[0] == 'Spades' and card2[0] == 'Spades':
        if card1[1] > card2[1]:
            return 1
        elif card1[1] < card2[1]:
            return -1
        else:
            return 0
    else:
        if card1[1] > card2[1]:
            return 1
        elif card1[1] < card2[1]:
            return -1
        else:
            return 0

def play_game():
    player1_cards = []
    player2_cards = []
    num_ties = 0

    for i in range(len(deck)):
        if i % 2 == 0:
            player1_cards.append(deck[i])
        else:
            player2_cards.append(deck[i])

    for i in range(len(player1_cards)):
        card1 = player1_cards[i]
        card2 = player2_cards[i]
        result = compare_cards(card1, card2)
        if result == 1:
            player1_cards.append(card2)
        elif result == -1:
            player2_cards.append(card1)
        else:
            num_ties += 1

    if len(player1_cards) > len(player2_cards):
        print("Player 1 wins!")
    elif len(player2_cards) > len(player1_cards):
        print("Player 2 wins!")
    else:
        print("It's a tie!")
    
    print(f"There were {num_ties} ties.")

def main():
    play_game()

main()
