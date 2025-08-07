# Projeto simulação de "criação de conta" no banco fictício "DioBank".

> [!IMPORTANT]
> O objetivo pricipal é exercitar o uso da biblioteca "Scanner" e o uso correto dos tipos primitivos.

## Noções importantes:
- Embora a inclusão de variáveis "var" permita atribuir seus tipos no momento de atribuição de valores, não caracteriza tipagem dinâmica,
visto que uma vez que `var nome = "Pedro"`, a variável `nome` somente pode receber novos valores do tipo `String`. Isso fica implicito.
- O uso de `println`, `print` ou `printf` deve ser avaliado em cada caso. No código em "ContaTerminal.java", são usados para imprimir
texto com uma quebra de linha no final, imprimir texto permitindo que o "cliente" digite **na mesma linha** e imprimir texto concatenando
Strings de forma prática, respectivamente. Cabe aqui menção ao símbolo de formatação `\n`, usado para incluir uma quebra de linha "manualmente".

## Nota relevante
A criação de uma conta em um banco geralmente segue outro padrão de dados, como documento de identidade e senha. Dessa forma, fica claro que
o exercício proposto não tem foco em simular uma real criação de conta, e, se o fizesse, poderia ter diversas camadas de complexidade.
