/* Steve Phillips
   2009.07.18 (Really started (and finished) 2009.07.22)
   
   If we list all the natural numbers below 10 that are multiples of 3
   or 5, we get 3, 5, 6 and 9.  The sum of these multiples is 23.

   Find the sum of all the multiples of 3 or 5 below 1000.
*/

#include <stdio.h>
#define INPUT 1000

int main(int argc, char **argv)
{
  int i;
  int sum = 0;

  for (i=0; i < INPUT; ++i) {
    if (multOf3(i) || multOf5(i))
	sum += i;
  }
  printf("The sum of all multiples of 3 or 5 less than %d is %d\n", INPUT, sum);

  return 0;
}

int multOf3(int n) {
  if (n % 3 == 0)
    return 1;
  else
    return 0;
}

int multOf5(int n) {
  if (n % 5 == 0)
    return 1;
  else
    return 0;
}
