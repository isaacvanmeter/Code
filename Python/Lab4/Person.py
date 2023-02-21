class Person:

    __name = None
    __address = None
    __birthday = None

    def __init__(self,name,address,birthday):
        self.__name = name
        self.__address = address
        self.__birthday = birthday

    def get_name(self):
        return self.__name

    def __str__(self):
        return "{:>20}\n{:>20}\n{:>20}\n".format(\
            self.__name,self.__address,self.__birthday)