#include <stdio.h>
#include <stdlib.h>
int main()
{ // início
    //Declarar o formato das variaveis
    float n1, n2, n3, M;
    //Pedir as variaveis
    printf("Digite a primeira nota: \n");
    scanf("%f", &n1);
    printf("\n");
    printf("Digite a segunda nota: \n");
    scanf("%f", &n2);
    printf("\n");
    printf("Digite a terceira nota: \n");
    scanf("%f", &n3);
    printf("as notas foram n1=%.2f,n2=%.2f,n3=%.2f,\n", n1, n2, n3);
    //Calcular a Media
    M = (n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5);
    printf("A sua media foi de : %.2f\n", M);
    if (M >= 6){
    printf("Voce Foi Aprovado !");
    }
    else{
        printf("Voce Foi Reprovado!");
    }

} // fim