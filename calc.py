#!/usr/bin/env python
# -*- coding: utf-8 -*-
#

import sys

list_operators = ['+', '-', '/', '*']
latin_digit = ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX', 'X'] # если не большие!
correllation_table = {'I': 1, 'II': 2, 'III': 3, 'IV': 4, 'V': 5, 
'VI': 6,}


def check_operand_arabic_digit(operand):
    '''check - operand is arabic digit?'''
    if operand.isdigit():
        return int(operand)
    else:
        return False


def check_operand_latin_digit(operand):
    if operand in latin_digit:
        return True
    else:
        return False


def checker_operator(operator):
    ''' arg 2 in list operators?'''
    if operator in list_operators:
        return True
    else:
        return False


def check_arguments_count():
    if len(sys.argv) != 3:
        return False
    else:
        return True


def calc(operand1, operator, operand2):
    ''' input 3 arg, return result'''
    a = '{} {} {}'.format(operand1, operator, operand2)
    b = eval(a)
    return b


if __name__ == "__main__":
    print(sys.argv[1])
    tmp = calc(3, '+', 2)
    print(tmp)
