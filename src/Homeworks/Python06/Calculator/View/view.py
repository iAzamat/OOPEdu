def printres(data, title):
    print(title, " ", data)

class View:
    # работа с вводом-выводом
    def get_value(self, n) -> int:
        return int(input(n))

    def menu_calc(self):
        return int(input("""
--------------------------------------
Выберите действие:
--------------------------------------
1. сложение
2. вычитание
3. умножение
4. деление
--------------------------------------
0. Выход
"""))
