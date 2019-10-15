#include<stdio.h>
#include <locale.h>
 
int main() {
 setlocale(LC_ALL, "");
 int num, i, result= 0;
 
 printf("Enter a number: ");
 scanf("%d", &num);
 
 for (i = 2; i <= num / 2; i++) {
    if (num % i == 0) {
       result++;
       break;
    }
 }
 
 if (result== 0)
    printf("%d It's a Prime number!\n", num);
 else
    printf("%d Not a Prime number!\n", num);
 
 return 0;
}
