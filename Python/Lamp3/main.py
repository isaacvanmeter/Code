'''
Isaac Van Meter
Homework D-1
2/7/23
This is my own original work.
'''
from Lamp import Lamp
import random

def main():
    lamp1 = Lamp()
    print("Lamp1 is "+str(lamp1))

    lamp = [Lamp() for i in range(30)]

    for ll in lamp:
        v = random.randint(0,1)
        ll.setLamp(v)

    count = 1
    for i in range(30):
        print(lamp[i], end=" ")
        if count % 5 == 0:
            print()
        count += 1

    print()
    for i in range(30):
        if i < 11:
            lamp[i].flip()
        if 10 < i < 21:
            lamp[i].turnOff()
        if 20 < i:
            lamp[i].turnOn()
        print(lamp[i], end=" ")
        if count % 5 == 0:
            print()
        count += 1
    
main()