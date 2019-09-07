#!/usr/bin/env python
# -*- coding: utf-8 -*-
#

import sys
import logging

# define basic variables
list_operators = ['+', '-', '/', '*']
latin_digit = ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX', 'X']  # TODOS! IF little chars!
arab_digit = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


def lat_to_arabic():
    lat_to_ar = {}
    ar_to_lat = {}
    i2 = 0
    for i in latin_digit:
        lat_to_ar[i] = arab_digit[i2]
        i2 = i2 + 1

    for i in arab_digit:
        pass
    return lat_to_ar


def check_operans_one_group(operand1,  operand2):
    ''' if any operand is misc type - return False'''
    if operand1 in latin_digit and operand2 in latin_digit:
        return True
    elif operand1 in arab_digit and operand2 in arab_digit:
        return True
    else:
        return False


def check_operand_arabic_digit(operand):
    '''check - operand is arabic digit?'''
    if operand.isdigit():
        return True
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
        #print('ok, 3')
        return False
    else:
        #print('error')
        return True


def calc(operand1, operator, operand2):
    ''' input 3 arg, return result'''
    a = '{} {} {}'.format(operand1, operator, operand2)
    b = eval(a)
    return b


if __name__ == "__main__":
    a = sys.argv[1]
    b = sys.argv[3]
    check_arguments_count() # элементов три!
    if checker_operator(sys.argv[2]) is True:  # я +-*/
        pass
    else:
        print('operator error')
    #первая цифра десятичная или римская
    if check_operand_latin_digit(a) is True or check_operand_arabic_digit(a) is True:
        pass
    else:
        print('не буду нихачу!')
        exit()
    #вторая цифра десятичная или римская
    if check_operand_latin_digit(b) is True or check_operand_arabic_digit(b) is True:
        pass
    else:
        print('не буду нихачу! второй не цифирь!')
        exit()
    #print(a, b)
    lat_ar = lat_to_arabic()
    equal = check_operans_one_group(int(a), int(b))
    if equal is True:
        pass
    else:
        print('бля, еррор!')
        exit()
    res = calc(a,  sys.argv[2],  b)
    print(res)
    
