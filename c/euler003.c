/* Steve Phillips
   2009.07.24

   What is the largest prime factor of the number 600851475143?
*/

#include <stdio.h>
//#include <inttypes.h>
//#define BIGNUM 600851475143
long long huge = 600851475143LL;

// Returns largest prime factor of num
long long primeFactorsOf(long long num)
{
  num = huge;
  //  long long int temp = num;
  long long largestPrimeFactor = 600851475143LL;
  long long i;
  for(i=2; i <= num; ++i) {
    if (num % i == 0) {
      //      printf("%lld is a factor of %lld\n", i, huge);
      num /= i;
      if (prime(i))
	largestPrimeFactor = i;
    }
  }
  return largestPrimeFactor;
}

// Returns 1 if num is prime, 0 otherwise
int prime(int num) {
  int i, j;
  for(i=2; i <= num/2; ++i) {
    for(j=2; j <= i; ++j) {
      //      printf("%d*%d = %d\n", i, j, i*j);
      if (num == i*j)
	return 0;
    }
  }
  return 1;
}

int main(int argc, char **argv)
{
  printf("The largest prime factor of %lld is %lld\n",
	 huge, primeFactorsOf(huge));

  return 0;
}
