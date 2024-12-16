#include <stdio.h>
#include <stdlib.h>
void main()
{
/*
    int n, r, a1;
    N = 3, R = 5, AI = 2,PG =(2, 10, 50);
    printf("Informe o numero de termos da Progressao Geometrica; \n");
    scanf("%d", &n);
    printf("Informe a razao da Progressao Geometrica: \n");
    scanf("%d", &r);
    printf("Informe o valor do primeiro termo: \n");
    scanf("%d", &a1);

    int i, soma = 0, aq;
    aq = a1;
    for (i = 1; i <=n; i++){
        soma = soma + aq;
        printf("a%d = %d \n", i, aq);
        aq = aq * r;
    

    }
    printf ("Soma dos termos = %d", soma);
*/
    int tabuada, n, terminador;
    do{
        printf("Informe a tabuada desejada: \n");
        scanf("%d", &tabuada);
        printf(" Informe o valor final da impressao da tabuada: \n");
        scanf("%d", &n);
        int i;
        for (i=0, i<=n, i++){
        printf("%d x %d = %d\n", tabuada, i, tabuada*i);
        }
        printf("Informe outro valor para continuar(,= 0 para sair!)\n");
        scanf("%d", &tabuada);
        
        }
    while(terminador > 0);

} 