"""
Isaac Van Meter
1/23/23
Homework 1
This is my own original work
"""

import math

def display(lst):
    print("{6.2f}".format(lst))
    '''
    for i in range(0, len(lst)):
        if (i == 7) or (i == 14):
            print("\n")
        print(round(lst[i],2), end = " ")
    '''

def computeVals(listx):
    ans = []
    for x in listx:
        a = math.sin(x) + math.sin(x**2)
        ans.append(a)
    return ans

def main():
    listx = [.5*x for x in range(0,21)]
    listy = computeVals(listx)
    display(listy)

main()