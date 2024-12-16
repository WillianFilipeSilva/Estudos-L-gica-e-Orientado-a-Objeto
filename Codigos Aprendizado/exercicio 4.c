#include <stdio.h>

int main() {
    // Declarar o formato e valor das variáveis
    int E;
    float P, A = 3.5, G = 5.0, Q;

    // Perguntar qual o combustível
    printf("Qual o combustivel !\n 1 - Alcool\n 2 - Gasolina\n");
    scanf("%d", &E);

    if (E == 1) {
        // Álcool:
        printf("\nO preço do Alcool e R$ %.2f. Quantos Litros você deseja abastecer?\n", A);
        scanf("%f", &Q);

        if (Q < 20) {
            P = (Q * A);
            printf("O valor será de R$ %.2f\n", P - (P * 0.03));
        } else {
            P = (Q * A);
            printf("O valor será de R$ %.2f\n", P - (P *0.05));
        }
    } else if (E == 2) {
        // Gasolina:
        printf("\nO preço da Gasolina é R$ %.2f. Quantos Litros voce deseja abastecer?\n", G);
        scanf("%f", &Q);

        if (Q < 20) {
            P = (Q * G);
            printf("O valor sera de R$ %.2f\n", P - (P * 0.04));
        } else {
            P = (Q * G);
            printf("O valor sera de R$ %.2f\n", P - (P * 0.06));
        }
    } else {
        printf("Opção invalida. Por favor, escolha 1 para Álcool ou 2 para Gasolina.\n");
    }

    return 0;
}
