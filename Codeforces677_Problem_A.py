casos = int(input())

for i in range(casos):
	numAct = "1"
	firtsVal = 1
	counter = 0
	boring = input()

	found = False
	while found != True:
		if boring == numAct:
			found = True
			counter += len(numAct)
		else:
			found = False
			counter += len(numAct)
			if len(numAct) == 4:
				firtsVal += 1
				numAct = str(firtsVal)
			else:
				numAct += str(firtsVal) 
	print(counter)

