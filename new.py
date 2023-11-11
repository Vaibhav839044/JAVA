def print_pattern(n):
    for i in range(1, 2 * n):
        if i <= n:
            stars = '*' * i
        else:
            stars = '*' * (2 * n - i)
        spaces = ' ' * (n - i)
        line = spaces + stars
        print(line)

# Test the function with an example:
n = 5
print_pattern(n)
