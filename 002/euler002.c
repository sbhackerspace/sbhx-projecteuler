/* Steve Phillips
   2009.07.22 (Really started and finished 2009.07.24)

   Find the sum of all the even-valued terms in the sequence which do
   not exceed four million.
*/

#include <stdio.h>
#define BIGNUM 4000000

int a, b, c;
int evensum = 2;

int main(int argc, char **argv)
{
  printf("The sum of even fibonacci numbers less than %d is %d\n",
	 BIGNUM, sumOfEvenFib(BIGNUM));

  return 0;
}

// Returns the sum of all even fibonacci numbers <= BIGNUM
int sumOfEvenFib(int num) {
  num = BIGNUM;
  a = 1;
  b = 2;
  c = b + a;

  while (c <= BIGNUM) {
    //    printf("c: %d\n", c);
    if (c % 2 == 0)
      evensum += c;
    a = b;
    b = c;
    c = b + a;
  }
  return evensum;
}
