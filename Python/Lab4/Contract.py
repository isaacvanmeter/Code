from Person import Person
from Client import Client
class Contract:

    __client = None
    __details = None

    def __init__(self, client, details):
        self.__client = client
        self.__details = details

    def get_client(self):
        return self.__client
    
    def get_details(self):
        return f"Contract details: ${self.__details}"
    