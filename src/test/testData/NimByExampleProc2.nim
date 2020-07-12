# module1:
proc foo*(): int = 2
proc bar(): int = 3

# module2:
echo foo()  # Valid
echo bar()  # will not compile