def meses_faltantes(numeromes):
    meses=("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre")
    return meses[numeromes:]
    
#Bloque Principal
numeromes=int(input("Ingrese número de mes: "))
mesesfalta=meses_faltantes(numeromes)
print(mesesfalta)
