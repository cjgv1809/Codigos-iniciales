def carga_sueldos():
    sueldos=[]
    for x in range (10):
        su=int(input("Introduzca sueldo: "))
        sueldos.append(su)
    return sueldos

def impresion_sueldos(sueldos):
    print("Los sueldos ingresados son:")
    print(sueldos)

def sueldo_mayor4000(sueldos):
    cantidad=0
    print("La cantidad de personas con un sueldo superior a $4000 es:")
    for y in range (len(sueldos)):
        if sueldos[y]>4000:
            cantidad=cantidad+1
    print(cantidad)

def retornar_promedio_sueldos(sueldos):
    prom = sum(sueldos)/10
    return (prom)   

def sueldos_menores_promedio(sueldos):
    print("Los sueldos que están por debajo del promedio son:")
    for z in range (len(sueldos)):
        if sueldos[z]<retornar_promedio_sueldos(sueldos):
            print(sueldos[z])
    
#Bloque principal
lista=carga_sueldos()
impresion_sueldos(lista)
sueldo_mayor4000(lista)
sueldos_menores_promedio(lista)