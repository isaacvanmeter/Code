'''
Isaac Van Meter
Homework D-1
2/7/23
This is my own original work.
'''
class Lamp:

    __isOn = None

    def __init__(self, *args):
        if len(args) == 0:
            self.__isOn = False
        elif len(args) == 1:
            self.__isOn = args[0]
        else:
            raise Exception("Invalid Constuctor")
    

    def __str__(self):
        if self.__isOn:
            out = "{:3s} ".format("On")
        else:
            out = "{:3s} ".format("Off")
        return out

    def turnOn(self):
        self.__isOn = True

    def turnOff(self):
        self.__isOn = False

    def flip(self):
        self.__isOn = not self.__isOn

    def setLamp(self, isOn):
        self.__isOn = isOn

    def __eq__(self, other):
        return self.__isOn == other.__isOn