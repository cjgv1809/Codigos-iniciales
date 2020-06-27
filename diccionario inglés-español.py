def cargar():
    diccionario={}
    respuesta="s"
    while respuesta=="s" or respuesta=="S":
        caste=input("Ingrese palabra en castellano: ")
        ing=input("Ingrese palabra en inglés: ")
        diccionario[ing]=caste
        respuesta=input("Quiere cargar otra palabra? [s/n]")
    return diccionario

def imprimir(diccionario):
    for ing in diccionario:
        print(ing,diccionario[ing])

def consulta_palabra(diccionario):
    pal=input("Ingrese la palabra en inglés: ")
    if pal in diccionario:
        print("En castellano significa ",diccionario[pal])
    else:
        print("La palabra ingresada no está en el diccionario")

#Bloque Principal
dic=cargar()
imprimir(dic)
consulta_palabra(dic)