# -*- coding: utf-8 -*-
"""
Created on Thu Jan  9 19:02:55 2020

@author: user
"""

def sum_of_even_fibonacci(n):
    """
        The method finds numbers of a fibonacci sequence within
        a given range, n,and calculate the sum of even 
        numbers in the sequence
    """
    sum, first_num, second_num = 0, 0, 1
    
    #check if the any first two numbers is even
    # and add it to the sum
    if(first_num%2 == 0):
         sum += first_num

    if(second_num%2 == 0):
         sum += second_num
    
    ##iterate to generate numbers of the  fibonacci sequence
    #checking if they are even to add them to the sum
    while(second_num < n):
        
        first_num, second_num = second_num, first_num + second_num
        if(second_num%2 ==0):
            sum += second_num
            
    return sum

print(sum_of_even_fibonacci(10))