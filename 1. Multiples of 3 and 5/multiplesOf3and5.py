# -*- coding: utf-8 -*-
"""
Created on Sun Jan  5 19:07:11 2020

@author: user
"""
"""
    The method finds multiples of 3 and 5 within a given range, 
    i.e the list of all natural numbers less than x(e.g. 10, 1000)
    The method returns the sum of the multiples of 3 and 5
"""

def sum_multiple_3_and_5(x):
    sum  = 0
    for i in range(x):
        if (i % 3 == 0) or (i % 5 ==0):
            sum += i
            
    return sum

print( sum_multiple_3_and_5(1000))
    
    