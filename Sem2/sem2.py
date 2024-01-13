def multiplication_table(number):
    for i in range(9):
        print(number, "*", i+1, "=", number*(i+1))
number = int(input("Введите число: "))
multiplication_table(number)    

