#dictionaries and caching
queue = {}
def cachedfactorial(number):
    if number in queue:
        return queue[number]
    elif number != 0:
        fact = number *cachedfactorial(number-1)
        queue[number] = fact
        return fact
    else:
        return 1



print(cachedfactorial(5))


