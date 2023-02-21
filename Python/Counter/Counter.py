'''
Isaac Van Meter
Homework F-1
2/21/23
This is my own original work.
'''
class Counter:

    __count = 0
    __step = 1
    __origCount = __count
    __origStep = __step

    def setCount(self, count):
            self.__count = count

    def getCount(self):
          return self.__count
    
    def setStep(self, step):
          self.__step = step

    def getStep(self):
          return self.__step
    
    def reset(self):
          self.__count = self.__origCount
          self.__step = self.__origStep

    def inc(self):
          self.__count += self.__step

    def dec(self):
          self.__count -= self.__step
    
    def __str__(self):
          return f"Counter(count={self.__count}, step={self.__step})"
    
    def __eq__(self, other):
          if self.__count == other.__count:
                return True
          else:
                return False
