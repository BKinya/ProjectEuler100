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
#this solves for small numbers
def sum_multiple_3_and_5_0(x):
    sum  = 0
    for i in range(x):
        if (i % 3 == 0) or (i % 5 ==0):
            sum += i
            
    return sum

##Solution for large numbers
def sum (n, k):
    d = n // k
    return k * ( d*(d+1 ))//2

def sum_multiple_3_and_5_1(n):
    return sum(n, 3) + sum(n, 5) - sum (n, 15)


print( sum_multiple_3_and_5_1(10-1))
    
    