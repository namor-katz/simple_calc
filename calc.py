#!/usr/bin/env python
# -*- coding: utf-8 -*-
# это простой калькулятор, который умеет производить действия над 
# арабскими и латинскими числами. он умеет складывать-делить-умножать-вычитать
# любые цифры от 1 до 10 либо от I до X. Смешение стилей он отвергает.

import sys

# define basic variables
list_operators = ['+', '-', '/', '*']
latin_digit = ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX', 'X']  # TODOS! IF little chars!
arab_digit = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


def lat_to_arabic():
    '''
    создаём словари соответствия: арабско-латинский и латинско-арабский
    возвращаем тупль, состоящий из двух словарей
    '''
    lat_to_ar = {}  # каждой латинской цифре соотв. арабская.
    ar_to_lat = {}  # каждой арабской цифре соотв. латинская
    i2 = 0
    for i in latin_digit:
        lat_to_ar[i] = arab_digit[i2]
        i2 = i2 + 1

    i3 = 0
    for i in arab_digit:
        ar_to_lat[i] = latin_digit[i3]
        i3 = i3 + 1
    return lat_to_ar,  ar_to_lat


def check_operans_one_group(operand1,  operand2):
    ''' если оба оператора НЕ в одной группе - вернуть False'''
    if operand1 in latin_digit and operand2 in latin_digit:
        return True
    elif operand1 in arab_digit and operand2 in arab_digit:
        return True
    else:
        return False


def check_operand_arabic_digit(operand):
    ''' это арабская цифра?'''
    if operand.isdigit() and  0 < int(operand) < 10:
        return True
    else:
        return False


def check_operand_latin_digit(operand):
    ''' это латинская цифра?'''
    if operand in latin_digit:
        return True
    else:
        return False


def checker_operator(operator):
    ''' второй аргумент входит в лист операторов? +-*/'''
    if operator in list_operators:
        return True
    else:
        return False


def check_arguments_count():
    ''' если аргументов не 3 выход '''
    if len(sys.argv) != 3:
        return False
    else:
        return True


def calc(operand1, operator, operand2):
    ''' и вот наконец считаем '''
    a = '{} {} {}'.format(operand1, operator, operand2)
    b = eval(a)
    return b


if __name__ == "__main__":
    check_arguments_count() # элементов три!
    a = sys.argv[1]
    b = sys.argv[3]
    # второй аргумент - /*-+
    if checker_operator(sys.argv[2]) is True:  # я +-*/
        pass
    else:
        print('operator error')
    #первая цифра десятичная или римская
    if check_operand_latin_digit(a) is True or check_operand_arabic_digit(a) is True:
        pass
    else:
        print('не буду нихачу! первый не цифирь!')
        exit()
    #вторая цифра десятичная или римская
    if check_operand_latin_digit(b) is True or check_operand_arabic_digit(b) is True:
        pass
    else:
        print('не буду нихачу! второй не цифирь!')
        exit()
    new_dicts = lat_to_arabic() # создаем словари для перевода из лат в ар и обратно
    lat_ar,  ar_lat = new_dicts[0],  new_dicts[1]
    if a in latin_digit:
        a = lat_ar[a]
        revert = True
    else:
        revert = False
    if b in latin_digit:
        b = lat_ar[b]

    res = calc(a,  sys.argv[2],  b)
    if revert is True:
        if res <= 10:
            res = ar_lat[res]
        else:
            print("больше десяти,  выведу арабскими ")
    #TODOS: обработать выход за пределы Х
    print(res)
