casos = int(input())

for i in range(casos):
	lista = []
	for j in input().split(" "):
		lista.append(int(j))

	if lista[0] <= 2:
		print(1)
	else:
		planta = 1
		lista[0] -= 2
		planta += (lista[0]/lista[1])
		if lista[0]%lista[1]!=0:
			planta += 1
		print(int(planta))

