def multipleOf3And5(int value) {
    def result = []
    
    (1..<value).each {
        if (it % 3 == 0 || it % 5 == 0) {
          result << it
        }
    }
   result  
}


def result = multipleOf3And5 10

assert result == [3, 5, 6, 9]