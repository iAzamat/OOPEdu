from Homeworks.Python06.Calculator.Model.sumModel import SumModel
from Homeworks.Python06.Calculator.Model.subModel import SubModel
from Homeworks.Python06.Calculator.Model.multModel import MultModel
from Homeworks.Python06.Calculator.Model.divModel import DivModel
from Homeworks.Python06.Calculator.View.view import View, printres


# Класс собирает все модули
class Controller:
    view = View()
    sum_model = SumModel()
    sub_model = SubModel()
    div_model = DivModel()
    mult_model = MultModel()

    def __init__(self, v):
        self.view = v

    def start(self):
        num = self.view.menu_calc()
        self.sum_model = SumModel()
        self.sub_model = SubModel()
        self.div_model = DivModel()
        self.mult_model = MultModel()
        self.button_click(num)

    def button_click(self, num):

        if num == 1:
            a = self.view.get_value("Введите первое число: ")
            b = self.view.get_value("Введите второе число: ")
            self.sum_model.set_x(a)
            self.sum_model.set_y(b)
            result = self.sum_model.result()
            printres(result, f"{a} + {b} =")
        elif num == 2:
            a = self.view.get_value("Введите первое число: ")
            b = self.view.get_value("Введите второе число: ")
            self.sub_model.set_x(a)
            self.sub_model.set_y(b)
            result = self.sub_model.result()
            printres(result, f"{a} - {b} =")
        elif num == 3:
            a = self.view.get_value("Введите первое число: ")
            b = self.view.get_value("Введите второе число: ")
            self.mult_model.set_x(a)
            self.mult_model.set_y(b)
            result = self.mult_model.result()
            printres(result, f"{a} * {b} =")
        elif num == 4:
            a = self.view.get_value("Введите первое число: ")
            b = self.view.get_value("Введите второе число: ")
            self.div_model.set_x(a)
            self.div_model.set_y(b)
            result = self.div_model.result()
            printres(result, f"{a} / {b} =")
