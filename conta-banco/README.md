## Desafio Conta Bancária

Neste desafio, foi proposta a criação de um programa que receba, via terminal, dados sobre uma determinada conta bancária e exiba para o usuário as informações inseridas.

### Processo
Para isso foi importada a classe Scanner, em que criei um objeto Scanner e utilizei os métodos nextLine(), nextInt() e nextDouble() para receber os dados inseridos pelo usuário.
Para a mensagem que exibe as informações, usei o método concat() para as Strings e concatenei os valores numéricos com "+".

### Dificuldades
No primeiro teste que fiz, considerei que valores Double possuem o símbolo ".", mas ao imprimir a mensagem apareceu o erro InputMismatchException. Pesquisando descobri que a configuração local (para mim) faz com que a máquina aceite o valor apenas com vírgula, e na hora de aparecer a mensagem para o usuário com todas as informações é que o valor Double aparece com ponto.
Uma das soluções oferecidas seria "setar" o locale para US, assim o terminal iria aceitar colocar um valor com ponto. Mas eu gostaria que o terminal aceitasse o valor tanto com vírgula como com ponto, logo imagino que poderia fazer um tratamento de exceção.
