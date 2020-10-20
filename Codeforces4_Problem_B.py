days, suma_total = map(int, input().split())
minimos, maximos = [], []
for _ in range(days):
    a, b = map(int, input().split())
    minimos.append(a)
    maximos.append(b)
a = sum(minimos)
if a <= suma_total <= sum(maximos):
    print('YES')
    suma_total -= a
    res = []
    for a, b in zip(minimos, maximos):
        if b > suma_total + a:
            b = suma_total + a
        suma_total -= b - a
        res.append(str(b))
    print(' '.join(res))
else:
    print('NO')