Classe relato
=============

Descrição de como deve ser os dados para a classe relato

Caracteres de Ano
-----------------

* O ano deve conter "4" digitos

Regime
------

* O docente pode ter regime de "20" horas
* O docente pode ter regime de "40" horas 
* O docente classificado como "DE" tem regime de "40" horas

Nome do docente
---------------

* nome pode ter espaços ""
* nome nao pode ter numeros "0123456789"
* nome nao pode ter caratcteres especiais "*/-&%$#@!)({}"

Data de Inicio
--------------

* data deve conter o formato "DD/MM/AAAA"
* data no formato "DD/MM/AA" e invalida

Data de fim
-----------

* data deve conter o formato "DD/MM/AAAA"
* data no formato "DD/MM/AA" e invalida

Nota Chefia
-----------

* A nota varia de "0,0" a "10,0"
* Os atributos das notas sao somente numeros que são "0123456789"

Nota da  Avaliacao do Docente
-----------------------------

* A nota varia de "0,0" a "10,0"
* Os atributos das notas sao somente numeros que sao "0123456789"

Estágio Pos Doutoral ou Senior
------------------------------

* A situação do Docente que realizou estagio pos doutoral ou senir sera classificado como "Verdadeiro"

Cargo de Direcao
----------------

* Classificado como "verdadeiro" caso o docente exerca cargo de direcao

Pos Graduacao
-------------

* Classificado como "Verdadeiro" se o docente realizar curso de pos graduacao

Afastamento
-----------

* periodo de afastamento expresso em anos ou meses no formato "00"

Avaliacao Parcial
=================

Soma Pontuacao Total
--------------------

* A soma da pontuação total possui "5" variaveis
* A soma das variaveis possui o formato "A+B+C+D+E"

Numero de Meses
---------------

* Expressao "dias/30"
* dias são obtidos por "dataInicio - dataFim"

Divisor
-------

* expressao "(regime/10)*4"

Pontuacao de Meses
------------------

* Expressao "(12*pontuacaoTotal)/numeroMeses"

Nota da CAD
-----------

* o divisor varia de "0" a "10"
* Expressao "pontuacao/divisor"

Atividades de Ensino expressoes
===============================

expressoes
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

Consolidacao
============

Expressoes
----------

* a soma de toda a pontuacao e descrita pela expressao "producaoIntelectual = producaoCientifica+producaoArtistica+producaoTecnica+producaoOutra"

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

