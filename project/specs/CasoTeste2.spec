Producao Tecnica e Tecnologica
==============================

Desenvolvimento de software para uso institucional, recebe o método PontosPorRelato = "5.0" a "10.0" pontos

PontosPorRelato válidos
-----------------------

* PontosPorRelato = "5.0"

PontosPorRelato inválidos
-------------------------

* PontosPorRelato = "4.0" 

Participação em comitê editorial de periódicos especializados indexados e de editoras universitárias recebe
ExpressaoPorRelato = 10 * (dias / 30)  / 12. 
Função: dias
dias: diferencaDatas { inicio, fim }

ExpressaoPorRelato válida
-------------------------

* dias = "15"

ExpressaoPorRelato inválida
---------------------------

* dias = "-2"

producaoTecnica recebe a Soma de todas as linhas dessa tabela.

producaoTecnica válida
----------------------

* ?

producaoTecnica inválida
------------------------

* ?

Consolidação
============

atividadesPesquisaExtensao =  atividadesCoordenacao + atividadesExtensao

atividadesPesquisaExtensao válida
---------------------------------

* atividadesCoordenacao + atividadesExtensao >= "0"

atividadesPesquisaExtensao inválida
-----------------------------------

* atividadesCoordenacao + atividadesExtensao < "0"

Direção e função gratificada
============================

chefeGabinete recebe ExpressaoPorRelato = 10 * (dias / 30)
Classe: IV-1-2
Função: dias
dias: diferencaDatas { inicio, fim }

direcao recebe a soma de todas as parcelas de direção

Atividades administrativas
==========================

portariaMaior150 recebe ExpressaoPorRelato = 10 * ch / 150
Classe: IV-2-5
ValorMaximo: 10

portariaMaior150 válida
-----------------------

* ch >= "15"

portariaMaior150 inválida
-------------------------

* ch <= "0"

atividadesAdministrativas recebe a  soma de todas as parcelas de "Atividades administrativas"

Atividades administrativas
==========================

totalMeses = Somatorio numeroMeses

meses24 = totalMeses

somaPonderada = notaCad * numeroMeses

notaFinal = somaPonderada / totalMeses

Inciso I especifica que a mediaEnsinoGraduacao >= 40

mediaEnsinoGraduacao válida
---------------------------

* mediaEnsinoGraduacao = "45"

mediaEnsinoGraduacao inválida
-----------------------------

* mediaEnsinoGraduacao = "39"

Inciso II especifica que a mediaEnsino >= 80

mediaEnsino válida
------------------

* mediaEnsino = "81"

mediaEnsino inválida
--------------------

* mediaEnsino = "79"

Inciso III especifica que a mediaProducaoIntelectual >= 20

mediaProducaoIntelectual válida
-------------------------------

* mediaProducaoIntelectual = "20"

mediaProducaoIntelectual inválida
---------------------------------

* mediaProducaoIntelectual = "15"

Inciso IV especifica que a mediaDisciente >= 5

mediaDisciente válida
---------------------

mediaDisciente = "8"

mediaDisciente inválida
-----------------------

mediaDisciente = "1"

Inciso V especifica que para acontecer a aprovação da chefia, a notaChefia >= 5

notaChefia válida
-----------------

notaChefia = "6.5"

notaChefia inválida
-------------------

notaChefia = "4.9" 

Inciso VI especifica que a notaFinal >= 7.5

notaFinal válida
----------------

notaFinal = "7.5"

notaFinal inválida
----------------

notaFinal = "7.4"

habilitacaoParcial recebe a soma dos Incisos I + II + III + IV + V + VI

habilitacaoEstagio recebe a Expressão: estagioPosdoutoralOuSenior 
? III & V & VI : false

habilitacaoCargoOuPos recebe a expressão cargoDeDirecao || posGraduando ? VI : false

Para estar habilitado para promoção, o habilitado recebe a expressão habilitacaoParcial ||
habilitacaoEstagio || habilitacaoCargoOuPos

somaEnsino = Inciso I

somaPesquisa = Inciso III

somaAdministracao = Inciso IV

somaOutras = Inciso V

S = somaEnsino + somaPesquisa + somaAdministracao + somaOutras



 





