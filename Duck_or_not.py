def check_duck(num) : 
    n = len(num)        
    i = 0
    while (i < n and num[i] == '0') : 
        i = i + 1 
    while (i < n) :  
        if (num[i] == "0") : 
            return True 
        i = i + 1
      return False 
      
num1 = "1023" 
if(check_duck(num1)) : 
    print "It is a duck number"
else : 
    print "It is not a duck number"
