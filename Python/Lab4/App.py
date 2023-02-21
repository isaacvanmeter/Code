from Person import Person
from Client import Client
from Contract import Contract


class App:
    def run(self):
        person1 = Person('Isaac','123 Easy St','07/26/02')
        client1 = Client(person1, 'Engineer')
        contract1 = Contract(client1, "$100k")

        print(client1.get_name())
        print(contract1.get_details())

        person2 = Person('Regan','101 Downtown Ave','05/08/03')
        client2 = Client(person2, 'Doctor')
        contract2 = Contract(client2, "$100k")

        print(client2.get_name())
        print(contract2.get_details())

if __name__ == '__main__':
    app = App()
    app.run()
