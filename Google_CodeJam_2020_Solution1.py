cases = int(input())
i = 0
res = ""
while i < cases:
	N = int(input())
	res += "Case #" + str((i+1)) + ": "
	matrix = []
	for j in range(N):
		fila = input()
		filaLs = []
		for k in fila.split(" "):
			filaLs.append(int(k))

		matrix.append(filaLs)

	diag = 0
	ca = 0
	filas_repes = 0
	new_matrix = []
	for num in range(N):
		lsNew = []
		new_matrix.append(lsNew)

	for val in matrix:
		diag += val[ca]
		ca += 1
		setS = set(val)
		if len(setS) < N:
			filas_repes += 1
		for num in range(len(val)):
			new_matrix[num].append(val[num])


	columnas_repes = 0
	for val in new_matrix:
		setS = set(val)
		if len(setS) < N:
			columnas_repes += 1
		


	res += str(diag) + " " + str(filas_repes) + " " + str(columnas_repes) + "\n"
	i += 1
print(res)