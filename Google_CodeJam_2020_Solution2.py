cases = int(input())
n = 0
res = ""
while n < cases:
	res += "Case #" + str((n+1)) + ": "

	linea = input()
	line = ""
	for i in linea:
		if i == "0":
			line += "0"
		if i == "1":
			line += "(1)"
		if i == "2":
			line += "((2))"
		if i == "3":
			line += "(((3)))"
		if i == "4":
			line += "((((4))))"
		if i == "5":
			line += "(((((5)))))"
		if i == "6":
			line += "((((((6))))))"
		if i == "7":
			line += "(((((((7)))))))"
		if i == "8":
			line += "((((((((8))))))))"
		if i == "9":
			line += "(((((((((9)))))))))"

	while ")(" in line:
		line = line.replace(")(", "")

	res += line


	res += "\n"
	n += 1
print(res)
