num = int(input("Enter a number: "))

# Check divisibility by 2
div2 = num % 2 == 0

# Sum of digits
digit_sum = sum(int(d) for d in str(num))

# Check divisibility by 9
div9 = digit_sum % 9 == 0

if div2 and div9:
    print(num, "is divisible by 18")
else:
    print(num, "is not divisible by 18")
