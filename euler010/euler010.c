/* Steve Phillips
   2009.07.15

   "The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
   Find the sum of all the primes below two million."

   The reasoning and the logic here is correct and precise, but I'm
   running into memory issues.  composite_array needs to be much
   larger than size INPUT (INPUT^2?).

   Run time: 8 secs for INPUT = 1000

   Original answer checked whether each number (2 through 2M) was
   prime; if so, added it to the sum, and went on to the next number.
   I thought the following method would be more efficient.  I was
   wrong.
*/

#include <stdio.h>

#define TRUE    1
#define FALSE   0
#define INPUT   1000  // Should be 2000000

long user_input = INPUT;
long composite_array[INPUT*100];
long array_index = 0;
long sum = 0;

int in_array(long prod) {
  int i;
  for(i = 0; i < array_index; i++) {
    if (composite_array[i] == prod) {
      return 1;
    }
  }
  return 0;
}

long create_composite_array(long num)
{
  int i, j, product;
  for(i = 2; i <= num/2; i++) {
    for(j = num/2; j >= i; j--) {
      product = i*j;
      //      printf("product: %d\n", product);
      //if (product > num) {break;}
      if (!in_array(product)) {
	composite_array[array_index] = product;
	++array_index;
      }
    }
  }
  return array_index; // so we know the used length of composite_array
}

// Returns 1 if num is prime ; Returns 0 otherwise
int is_prime(long num)
{
  long i;                 // vvvvv  array length  vvvvv
  //  for(i = 0; i < (sizeof(composite_array)/sizeof(int))-1; i++) {
  for(i = 0; i < array_index; i++) {
    if (num == composite_array[i]) {
      return 0;
    }
  }

  return 1;
}

// Sum of all primes between 2 and num
long prime_lister(long num)
{
  long i, j;
  for(i = 2; i <= num; i++) {
    if (is_prime(i)) {
      sum += i;
      //      printf("prime: %d\n", i);
    }
  }
/*   printf("Complete array:"); */
/*   for(j = 0; j < array_index; j++) */
/*     printf(" %d", composite_array[j]); */
  printf("\nNumber of elements in composite_array: %d", array_index);
  printf("\nSum of primes <= %d: %d\n", user_input, sum);
  return sum;
}

int main(int argc, char **argv)
{
  array_index = create_composite_array(user_input);
  //  printf("array_index = %d\n", array_index);
  prime_lister(user_input); // prints sum of primes <= user_input
  return 0;
}
