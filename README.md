# rabbitmq
Estabelecendo uma conexão simples com rabbitmq.

Foi utilizado Java 21 e uma imagem docker rabbitmq:3.12-management. 

O produtor foi configurado para enviar uma mensagem automaticamente a cada 1 segundo. Já o consumir foi configurado com um Thread.sleep e um número mínimo de 3 consumidores e máximo de 7, para simular algum processamento usando uma pausa aleatória, com o balanceamento de carga do rabbitmq. 


