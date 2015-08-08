import groovy.transform.TailRecursive

def sumEvens(list) {
   def even = { it % 2 == 0 } 
    list.sum { even(it) ? it : 0 } 
}


assert sumEvens([2,3,5,4]) == 6

//@TailRecursive
def fib( n ) {
    if (n == 1) {
      return 1
    }
   if (n == 2) {
      return 2
   }
   
    fib(n-2) + fib(n-1)
}

assert fib(10) == 89

def  fibList = { limit ->  (1..limit).collect { fib(it) } } 

assert fibList(10) == [1, 2, 3, 5, 8, 13, 21, 34, 55, 89]

sumEvens(fibList(32))

//Find the first number over 4million (1..100).find { fib(it) > 4000000 }