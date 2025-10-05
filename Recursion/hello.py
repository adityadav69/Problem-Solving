a = "aman singh"
size = len(a)
t = []

for i in range(size):
    if i == 0:
        t.append(a[i].upper())   
    elif a[i] == " ":
        t.append(" ")     
        if i + 1 < size: 
            t.append(a[i+1].upper())
    elif i > 0 and a[i-1] == " ":
        continue
    else:
        t.append(a[i])

print(a)
print("".join(t))
print("".join(t))

