

def reverse(word):
    if len(word) == 1:
        return word

    elif len(word) == 0:
        return
    return reverse(word[1:])+word[0]

print(reverse("purple socks"))
# word[1:] copies a new list each time without the previous word[0]
# hello
# ello + h
# llo + e
# lo + l
# o + l
# o
# o+ l
# ol + l
# oll + e
# olle + h
# olleh
#hello
#olleh
