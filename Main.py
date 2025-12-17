def main():
    # Read size
    n = int(input().strip())

    # Read array (space-separated integers)
    arr = list(map(int, input().split()))

    # If more numbers than n are given, trim
    arr = arr[:n]

    # Compute sum
    total = sum(arr)

    # Print result
    print("Sum =", total)


if __name__ == "__main__":
    main()
