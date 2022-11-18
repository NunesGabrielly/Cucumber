# Cucumber

# Cenário proposto
  Cliente faz saque de dinheiro Como um cliente, eu gostaria de sacar dinheiro em caixa eletrônico, 
para que eu não tenha que esperar numa fila de banco.
* Scenario: Cliente especial com saldo negativo
* Given: um cliente especial com saldo atual de -200 reais
* When: for solicitado um saque no valor de 100 reais
* Then: deve efetuar o saque e atualizar o saldo da conta para -300 reais
-------------------------------------------------------------------------------------------------------------------------------------------------
* Scenario: Cliente comum com saldo negativo
* Given: um cliente comum com saldo atual de -300 reais
* When: solicitar um saque de 200 reais
* Then: não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente
-------------------------------------------------------------------------------------------------------------------------------------------------
# Desenvolvimento
* Cenários descritos:

![image](https://user-images.githubusercontent.com/103539881/202805583-109ea68b-e089-4c77-b260-08ef868ce2c1.png)

* Comentários e documentação do projeto:

![image](https://user-images.githubusercontent.com/103539881/202806266-4e4c7363-f90f-4d08-8d69-8b5e953b897f.png)
![image](https://user-images.githubusercontent.com/103539881/202806675-676221b3-d2dd-43ca-8c89-5fdb96086432.png)
![image](https://user-images.githubusercontent.com/103539881/202806737-bf2b02ef-be61-4c00-aad5-ad90e80c9e7e.png)

* Resultados dos teste:

![image](https://user-images.githubusercontent.com/103539881/202807107-e8641ba6-4274-4013-af3e-ac9946cd9ff3.png)

![image](https://user-images.githubusercontent.com/103539881/202807271-25c62e6f-2dd7-4826-ae18-5466219519dd.png)

![image](https://user-images.githubusercontent.com/103539881/202807394-44c2da6d-049e-4fd9-af07-00130532b621.png)

![image](https://user-images.githubusercontent.com/103539881/202807499-6119a313-81eb-4762-9bcb-77075d110165.png)

