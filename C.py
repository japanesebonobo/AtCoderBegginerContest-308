from collections import defaultdict
from decimal import Decimal, getcontext

# 計算精度を指定（例：10桁）
getcontext().prec = 28

N = int(input())
color = defaultdict(list)

for i in range(N):
    A, B = map(Decimal, input().split())
    S = A / (A + B)
    color[S].append(i + 1)

descending_keys = sorted(color.keys(), reverse=True)

for key in descending_keys:
    for value in color[key]:
        print(value)