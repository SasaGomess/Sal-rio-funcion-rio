# Salario-funcionario
Um exercício feito em Java para exercitar o meu conhecimento em Composição e Enumeração.


<h2>Objetivo do exercício: </h2>
<h4>Mostrar qual foi o salário de um determinado funcionário em um mês e ano de acordo com os contratos dele em uma data específica.</h4>

🔧 Foi criada uma enumeração no arquivo WorkerLevel, que irá representar o level de um funcionário "JUNIOR, MID_LEVEL e SENIOR".

🔧 Criei uma classe para o departamento, muito importante para manter a delegação e coesão do programa.

🔧 O conceito de composição foi na classe HourContract e Departamento onde o conceito de um objeto contido no outro e "tem-um" "tem vários" foi apresentado:

•"tem-vários: * " Na classe Worker foi instanciada uma lista ArrayList assim a função/método addContract, removeContract consegue adcionar ou remover um contrato da lista de acordo com o que o usuário digitar qual mês e ano escolhidos do contrato.

•"tem-um: 1 " Na classe Worker foi instanciado o Objeto departamento, no qual só existe um departamento por funcionário.

<h1>Funcionamento do exercício: </h1>

1°O programa irá perguntar os dados de um funcionário: departamento, nome, level e a base salarial. 

2°Logo após o programa irá pedir a quantidade de contratatos

3°Com isso o usuário deverá inserir os valores de cada contrato: "Data do contrato, valor por hora, duração em horas

4°Por fim o programa deverá mostrar os dados do funcionário e o salário de acordo com o mês e ano digitados para serem calculados.
