'''
Isaac Van Meter
Homework F-1
2/21/23
This is my own original work.
'''
from Counter import Counter

def main():
    c1 = Counter()
    c1.setCount(0)
    c1.setStep(1)
    print(c1.__str__())

    c1.inc()
    c1.inc()
    c1.dec()
    print(c1.__str__())

    c1.reset()
    c2 = Counter()
    c1.setStep(10)
    c2.setStep(10)
    c1.inc()
    print(c1.__str__())
    c2.inc()
    print(c2.__str__())
    print(c1.__eq__(c2))


main()