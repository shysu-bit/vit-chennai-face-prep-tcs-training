def corrected_number(N):
    sign = -1 if N < 0 else 1
    N = abs(N)

    corrected = 0
    while N > 0:
        digit = N % 10
        corrected = corrected * 10 + digit
        N //= 10

    corrected *= sign

    if corrected < -32768 or corrected > 32767:
        return "Wrong value"

    return corrected


number = int(input())
corrected_value = corrected_number(number)
print(corrected_value)
