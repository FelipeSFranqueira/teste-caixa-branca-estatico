# Critérios de Caixa Branca - (Grafo de Fluxo; Complexidade Ciclomática; Base de Caminhos)
## Descrição
Esta etapa do projeto se trata do estudo dos critérios de Caixa Branca, visando a construção de um Grafo de Fluxo, a realização 
do cálculo da Complexidade Ciclomática e da definição da Base de Caminhos, tudo isso realizado a partir do código da 
Classe `User` localizado no package `login`.

## Numeração dos pontos do código

Apesar da numeração dos pontos terem cido feitas dentro do código atravez de comentários, abaixo segue uma imagem com a 
numeração mais nítida.

<img src="src/img/Extração dos dados.png"/>

## Grafo de Fluxo
Abaixo está o Grafo de Fluxo feito com base na numeração dos pontos do código.

<img src="src/img/Grafo de Fluxo.png"/>

## Complexidade Ciclomática

O cálculo da Complexidade Ciclomática deste Grafo pode ser feita da seguinte forma:

V(G) = (Arestas - Nós) + 2 <br/>
V()G = (20 - 16) + 2 <br/>
__V(G) = 6__

## Base de Caminhos

Com o cálculo da Complexidade Climática sabemos que este Grafo possui 6 caminhos, são eles:

* Caminho 1 = 1; 2; 3; 4; 5; 8; 9; 10; 11; 12; 16.
* Caminho 2 = 1; 2; 3; 4; 5; 6; 7; 8; 9; 10; 11; 12; 16.
* Caminho 3 = 1; 2; 3; 4; 5; 6; 7; 8; 9; 19; 11; 14; 15; 16.
* Caminho 4 = 1; 2; 3; 4; 5; 8; 9; 10; 11; 12; 13; 16.
* Caminho 5 = 1; 2; 3; 4; 5; 8; 9; 10; 11; 12; 14; 15; 16.
* Caminho 6 = 1; 2; 3; 4; 5; 8; 9; 10; 11; 12; 13; 14; 15; 16.

## Ultima atualização 05/10/2023