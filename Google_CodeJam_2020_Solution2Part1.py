cases = int(input())
n = 0
res = ""
while n < cases:
	res += "Case #" + str((n+1)) + ": "

	linea = input()
	for i in linea:
		if res[len(res) - 1] == "0":
			if i == "0":
				res += "0"
			elif i == "1":
				res += "(1"
		elif res[len(res) - 1] == "1":
			if i == "0":
				res += ")0"
			elif i == "1":
				res += "1"
		else:
			if i == "0":
				res += "0"
			elif i == "1":
				res += "(1"

	if res[len(res) - 1] == "1":
		res += ")"

	res += "\n"
	n += 1
print(res)
