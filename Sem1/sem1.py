import random

# Императивный стиль
def sort_list_imperative(numbers):
 
    n = 1
    while n < len(numbers):
        for i in range(len(numbers) - n):
            if numbers[i] < numbers[i + 1]:
                numbers[i], numbers[i + 1] = numbers[i + 1], numbers[i]
        n += 1
    return numbers

# Декларативный стиль
def sort_list_declarative(numbers):
    numbers.sort(reverse=True)
    return numbers
