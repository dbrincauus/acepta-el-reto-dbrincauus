casos = int(input())

for i in range(casos):
	numBooks = int(input())
	books_stack = input().split(" ")

	num_zeros_iad = 0
	num_zeros_dai = 0
	found_first_one = False
	reversed_list = False
	one_count = 0

	books_stack3 = []
	for j in range(len(books_stack)):
		if books_stack[j] == "1":
			books_stack3 = books_stack[j:len(books_stack)]
			j = len(books_stack)
			break

	books_stack3 = books_stack3[::-1]
	books_stack2 = []
	for j in range(len(books_stack3)):
		if books_stack3[j] == "1":
			books_stack2 = books_stack3[j:len(books_stack)]
			j = len(books_stack3)
			break
	x = 0
	while x < len(books_stack2):
		if books_stack2[x] == "1":
			one_count += 1

		if (x == len(books_stack2) - 1) and (reversed_list == False):
			if one_count <= 1:
				num_zeros_iad = 0
				num_zeros_dai = 0
				break
			books_stack2 = books_stack2[::-1]
			reversed_list = True
			x = 0

		if found_first_one == False:
			if books_stack2[x] == "1":
				found_first_one = True
		else:
			if books_stack2[x] == "0":
				if reversed_list == False:
					num_zeros_iad += 1
				else: 
					num_zeros_dai += 1
		x += 1

	if num_zeros_iad < num_zeros_dai:
		print(num_zeros_iad)
	else:
		print(num_zeros_dai)