def cargar():
    diccionario={}
    for x in range (4):
        nDNI=int(input("Ingrese su número de documento: "))
        nom=input("Ingrese su nombre: ")
        diccionario[nDNI]=nom
    return diccionario

def imprimir(diccionario):
    for nDNI in diccionario:
        print(nDNI,diccionario[nDNI])

def consulta_nombre(diccionario):
    cons=int(input("Ingrese su número de documento para chequear si se encuentra registrado: "))
    if cons in diccionario:
        print("Su nombre es: ",diccionario[cons])
    else:
        print("Su nombre no existe en el listado")

#Bloque Principal
dic=cargar()
imprimir(dic)
consulta_nombre(dic)