from Person import Person

class Client(Person):

    __contract = None

    def __init__(self, name, contract):
        super().__init__(name, None, None)
        self.__contract = contract

    def __str__(self):
        return "{:>20}\n{:>20}\n".format(\
            self.get_name(), self.__contract)
