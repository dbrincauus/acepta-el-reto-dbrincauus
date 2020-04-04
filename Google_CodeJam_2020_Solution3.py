cases = int(input())
i = 0
res = ""
while i < cases:
	res += "Case #" + str((i+1)) + ": "
	guard = res
	numActivi = int(input())
	act = {'C': [], 'J': [], 'IMPOSSIBLE': []}
	lista_tareas = []
	lista_tareas2 = []
	for j in range(numActivi):
		fila = input()
		filaLs = []
		for k in fila.split(" "):
			filaLs.append(int(k))
		filaLs.append(j)
		lista_tareas.append(filaLs)
		lista_tareas2.append(filaLs)
	lista_tareas.sort()

	C = []
	J = []
	for tarea in lista_tareas:
		if len(C) == 0:
			tarea.append("C")
			C.append(tarea)
		else:
			if C[len(C)-1][1] <= tarea[0]:
				tarea.append("C")
				C.append(tarea)

			else:
				if len(J) == 0:
					tarea.append("J")
					J.append(tarea)
				else:
					if J[len(J)-1][1] <= tarea[0]:
						tarea.append("J")
						J.append(tarea)
					else:
						break

	resultado = ""
	for val in lista_tareas2:
		for value in lista_tareas:
			if val[2] == value[2]:
				try:
					resultado += value[3]
				except:
					pass

	if len(resultado) < len(lista_tareas):
		res += "IMPOSSIBLE"
	else:
		res += resultado

	res += "\n"
	i += 1
print(res)