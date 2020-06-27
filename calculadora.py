menu=""
op=""
saludo="¡Bienvenido!"

print(saludo)

while menu == "Si" or "si":
    op=input("¿Cual operación matemática deseas relizar? (S) para suma,(R) para resta,(M) para multiplicacion,(D) para division: ")
    numA= int(input("Ingrese el primer número: "))
    numB = int(input("Ingrese el segundo número: "))
    
    if op=="S" or op=="s":
        
        print("Eligio suma")
        print("El resultado de la suma entre los dos numeros ingresados es:")
        print(numA+numB)

    elif op=="R" or op=="r":

        print("Eligio resta")
        print("El resultado de la resta entre los dos numeros ingresados es:")
        print(numA-numB)

    elif op=="M" or op=="m":

        print("Eligio multiplicacion")
        print("El resultado de la multiplicación entre los dos numeros ingresados es:")
        print(numA*numB)

    elif op=="D" or op=="d":

        print("Eligio division")
        print("El resultado de la división entre los dos numeros ingresados es:")
        try:
            print(numA/numB)
        except ZeroDivisionError:
            print("No se puede dividir por 0")
            print("Ingrese un numero distinto de 0 para realizar la operacion")
        
    print("¿Desea efectuar más operaciones?")
    print("Ingrese Si o No para terminar")
    menu=input()
    if menu=="No" or menu=="no":
        print("Muchas gracias. Hasta pronto")
        break