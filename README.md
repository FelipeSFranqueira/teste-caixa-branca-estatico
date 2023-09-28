# Teste Caixa Branca (Estático)
## Descrição
Este projeto se trata de um teste de Caixa Branca Estático realizado a partir do código da Classe `User` localizado no 
package `login`.

## Erros Encontrados

* __Documentação descrita no código__
  * O único tipo de documentação no código são dois pequenos comentários, e possuem pouca utilidade;
  * Os poucos comentários presentes no código não seguem um padrão, sendo um escrito todo em letra maiúscula e outro 
todo em letra minúscula;
* __Nomenclatura de variáveis e constantes__
  * A nomenclatura das variáveis não segue um padrão, possuindo algumas em português e outras em inglês;
  * A nomenclatura de algumas variáveis não descrevem bem a sua função, por exemplo, as variáveis `e` que são Exceptions;
* __Legibilidade e organização no código__
  * Os atributos e métodos da classe não possuem uma ordem para declaração;
  * O código não possui uma identação consistente;
  * O fehcamento das chaves não segue um padrão, em alguns casos esse fechamento acontece em uma linha exclusiva já em 
outros casos isso não acontece;
  * A falta de espaçamento entre as linhas em alguns pontos do código atrapalha a legibilidade;
  * Os espaçamentos não seguem um padrão, por exemplo, não há espaçamento entre a variável `nome` e a sua atribuição
(linha 17), ja entre a variavel `result` e a sua atribuição existe espaçamento (linha18);
* __Tratamento de nullpointers__
  * Não existe tratamento de null pointers no código. Por exemplo, se a obtenção da conexão com o banco de dados falhar,
a função `conectarBD()` retornará null, e isso é tratado de forma inadequada;
* __Respeito a arquitetura utilizada__
  * A arquitetura utilizada não foi respeitada, isso dado a falta de tratamento adequado de exceções, por exemplo;
* __Fechamento das conexões utilizadas__
  * O código não fecha a conexão com o banco de dados;

## Ultima atualização 28/09/2023