Descricao de Ano
================

Descrição da variavel ano

Caracteres de Ano valido
------------------------

* O ano deve conter "4" digitos

Caracteres de A invalido
------------------------

* O ano com "2" digitos e invalido

Descricao de Regime
===================

Regime valido
-------------

* O docente pode ter regime de "20" horas
* O docente pode ter regime de "40" horas 
* O docente classificado como "DE" tem regime de "40" horas

Regime Invalido
---------------

* Regime "<=10 ou >=50" e "invalido"

Nome do docente
===============

Nome Valido
-----------

* nome pode ter espaços ""

Nome Invalido
-------------

* nome nao pode ter numeros "0123456789"
* nome nao pode ter caratcteres especiais "*/-&%$#@!)({}"

Data de Inicio
==============

Data de Inicio Valida
---------------------

* data deve conter o formato "DD/MM/AAAA"

Data de Inicio Invalida
-----------------------

* data no formato "DD/MM/AA" e invalida

Data de fim
===========

Data de Fim Valida
------------------

* data deve conter o formato "DD/MM/AAAA"

Data de Fim Invalida
--------------------

* data no formato "DD/MM/AA" e invalida

Nota Chefia
===========

Nota Valida
-----------

* A nota varia de "0,0" a "10,0"
* Os atributos das notas sao somente numeros que são "0123456789"

Nota Invalida
-------------

* Nota "<0,0 ou >=10,0" nao e valida

Nota da  Avaliacao do Docente
=============================

Nota Valida
-----------

* A nota varia de "0,0" a "10,0"
* Os atributos das notas sao somente numeros que sao "0123456789"

Nota Invalida
-------------

* Nota "<0,0 ou >=10,0" nao e valida

Estágio Pos Doutoral ou Senior
==============================

Estagio Valido
--------------

* A situação do Docente que realizou estagio pos doutoral ou senir sera classificado como "Verdadeiro"

Estagio Invalido

* A situação do Docente que não realizou estagio pos doutoral ou senir sera classificado como "Invalido"

Cargo de Direcao
================

Cargo de Direcao Valido
-----------------------

* Classificado como "verdadeiro" caso o docente exerca cargo de direcao

Nao exerceu cargo de direcao
----------------------------

* Classificado como "nao habilitado" caso o docente nao exerca cargo de direcao

Pos Graduacao
=============

Realizar curso de Pos Graduacao
-------------------------------

* Classificado como "Verdadeiro" se o docente realizar curso de pos graduacao

Nao Realizou curso de Pos Graduacao
-----------------------------------

* Classificado como "não habilitado" se o docente não realizar curso de pos graduacao

Afastamento
===========

Periodo de afastamento valido
-----------------------------

* periodo de afastamento expresso em anos ou meses no formato "00"

Periodo de afastamento invalido
-------------------------------

* periodo "invalido" se estiver no formato "0"
* periodo "invalido" se estiver no formato "000"
* periodo "invalido" se estiver no formato "0000"

Avaliacao Parcial
=================

Soma Pontuacao Total
--------------------

* A soma da pontuação total possui "5" variaveis
* A soma das variaveis possui o formato "A+B+C+D+E"

Soma Pontuacao Invalida
-----------------------

* Soma da pontuacao e "invalida" com "<5" variaveis

Numero de Meses
===============

Expressoes
----------

* Expressao "dias/30"
* dias sao obtidos por "dataInicio - dataFim"

Expressoes Invalidas
--------------------

* expressao e "invalida" se valor do mes for "<30 ou >30"
* dias estarao incorretos se for obtidos "por dataFim - dataInicio"

Divisor
=======

Divisor valido
--------------

* expressao "(regime/10)*4"

Pontuacao de Meses
------------------

* Expressao "(12*pontuacaoTotal)/numeroMeses"

Nota da CAD
===========

Notas
-----

* o divisor varia de "0" a "10"
* Expressao "pontuacao/divisor"

Notas Invalida
--------------

* notas "<0 ou >10" sao "invalidas"

Atividades de Ensino expressoes
===============================

Expressoes
----------

* a expressao "cha" armazena a carga horaria
* o valor aulas presenciais recebem "(10*chag)/32"
* o valor da carga horaria recebe "cha"
* aulas a distancia recebem "(10*chaeadg)/30"
* aulas da graduacao recebem a expressao "cha"
* a carga horaria anual de ensino a distancia recebe "cha"
* aulas prexenciais de pos graduacao recebem a expressao "(10*chapg)/10"
* aulas de ensino a distancia recebem a expressao "(10*chaeadpg)/10"
* pos graduacao stricto e lato sensu recebem a expressao " pgg+eadpg"
* atividades de ensino recebem expressao "graduacao+posgraduacao"

Expressoes Invalidas
--------------------

* O divisor do valor de aulas presenciais se for "<32 ou >32" e "invalido"
* O divisor do valor de aulas a distancia se for "<30 ou >30" e "invalido"
* O divisor do valor de aulas presenciais de pos graduacao se for "<10 ou >10" e "invalido"
* O divisor do valor de aulas de ensino a distancia se for "<10 ou >10" e "invalido"

Consolidacao
============

Expressoes
----------

* a soma de toda a pontuacao e descrita pela expressao "producaoIntelectual = producaoCientifica+producaoArtistica+producaoTecnica+producaoOutra"

Expressoes Invalidas
--------------------

* se a soma conter  valores "<4 ou >4" a  expressao e "invalida"

Producao Intelectual
====================

Producao Cientifica
-------------------

* Producao de artigos Classificados recebem "20" pontos
* Producao de artigos Classificados e representado por "artigoComQualis = 20"
* Producao de artigos sujeitos a nao classificacao recebem "10" pontos
* Producao de artigos sujeitos a nao classificacao e represenatdo por "artigoSemQualis=10"
* Artigos ou textos publicados em periodicos e completos e representado por "artigoCompleto = artigoQualis+artigoSemQualis"
* A soma de todos os componentes recebe a expressao "porducaoCientifica = soma das parcelas"

Producao Cientifica Invalida
----------------------------

* Producao de artigos Classificados que recebem  pontuacao "<20 ou  >20" e "invalida"
* Producao de artigos sujeitos a nao classificacao que recebem pontuacao "<10 ou >10" e "invalida"