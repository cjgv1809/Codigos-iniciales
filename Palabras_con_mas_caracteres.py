def mas_caracteres(palabras):
    pos=0
    for x in range (1,len(palabras)):
        if len(palabras[x])>len(palabras[pos]):
            pos = x
        return palabras[pos]

#Bloque Principal
palabras=["enero","febrero","marzo","abril","mayo","junio"]
print(palabras)
print("La palabra con más caracteres es:",mas_caracteres(palabras))