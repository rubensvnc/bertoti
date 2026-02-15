## Trecho 1:

    Eu concordo com a ideia proposta no texto 1, pois regularizar boas praticas na produção de programas, não só ajuda outros a entenderem melhor o propósito do programa, como também facilita manutenções e atualizações futuras. Além disso, tal processo reduz consideravelmente o tempo de execução dos programas, assim como pode similarmente, reduzir o esforço da máquina ao executar o programa, já que seguir as boas maneiras, significa evitar laços de repetições desnecessárias, o uso indevido de tipos de variáveis, e utilizar técnicas eficientes de busca de valores.

## Trecho 2:

     Como introduzido no excerto do trecho número 2, a procura das respostas para manter um programa utilizável a longo termo, envolve não só boas práticas em produção de código, como também as mudanças que um programa terá de sofrer, e respectivamente sua escala e custos de produção. Um exemplar de tal pensamento seria um software para cadastro de itens comprados por usuários em uma pequena farmácia, que conforme cresce, recebe volumes de dados cada vez maiores, exigindo um banco de dados que consiga suportar o volume de pedidos, tal como o espaço virtual necessário para armazená-los, gerando assim um custo diretamente proporcional ao tamanho da farmácia. A solução do problema exposto, não envolve somente o desembolso em um banco qualquer, visto que a seleção do tipo de banco, (nuvem para maior segurança, ou local para melhor controle) influencia diretamente no propósito do projeto.

## 3 exemplos de _tradeoffs_:

    1. Segurança vs Usabilidade: Entregar um sistema extremamente protegido, em troca de perder UX (_User Experience_).
    2. Controle vs Conveniência: Um banco de dados local (_on premises_) e um em nuvem (_Database as a Service_), por um lado, o gerente tem controle físico total; velocidades de resposta muito altas; e previsão de custo, por outro, perde potência em grandes volumes de data, e disponibilidade de acesso em diferentes regiões.

    3. _Clean Code_ vs Performance: Usar abstrações e padrões de projeto torna o código mais fácil de ler e manter, e em troca, cada camada de abstração consome memória e CPU. Em sistemas críticos (como drivers), o código é "sujo" e manual para recuperar milisegundos de processamento.


