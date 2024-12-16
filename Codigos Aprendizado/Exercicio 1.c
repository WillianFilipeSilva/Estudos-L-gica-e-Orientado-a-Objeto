#include <stdio.h>
#include <stdlib.h>
int main()
{ // início
  int A, B, C, R, S;
  float D;
  // Pedir os valores ao usuario e armazenar as variaveis

  printf("Qual o valor de A ?\n");
  scanf("%d", &A);

  printf("Qual o valor de B ?\n");
  scanf("%d", &B);

  printf("Qual o valor de C ?\n");
  scanf("%d", &C);

  printf("Os valores informados foram: A=%d,B=%d,C=%d,\n", A, B, C);
  // Calcular R e S
  R = A * A + 2 * A * B + B * B;
  S = B * B + 2 * B * C + C * C;
  // Calcular D
  D = (R + S) / 2;
  printf("O resultado foi %f\n", D);

} // fim