# Atividade de Engenharia de Software

## 1. Análise sobre Boas Práticas (Trecho 1)

> Eu concordo com a ideia proposta no texto 1, pois regularizar boas praticas na produção de programas, não só ajuda outros a entenderem melhor o propósito do programa, como também facilita manutenções e atualizações futuras. Além disso, tal processo reduz consideravelmente o tempo de execução dos programas, assim como pode similarmente, reduzir o esforço da máquina ao executar o programa, já que seguir as boas maneiras, significa evitar laços de repetições desnecessárias, o uso indevido de tipos de variáveis, e utilizar técnicas eficientes de busca de valores.

---

## 2. Manutenibilidade e Escalabilidade (Trecho 2)

> Como introduzido no excerto do trecho número 2, a procura das respostas para manter um programa utilizável a longo termo, envolve não só boas práticas em produção de código, como também as mudanças que um programa terá de sofrer, e respectivamente sua escala e custos de produção. Um exemplar de tal pensamento seria um software para cadastro de itens comprados por usuários em uma pequena farmácia, que conforme cresce, recebe volumes de dados cada vez maiores, exigindo um banco de dados que consiga suportar o volume de pedidos, tal como o espaço virtual necessário para armazená-los, gerando assim um custo diretamente proporcional ao tamanho da farmácia. A solução do problema exposto, não envolve somente o desembolso em um banco qualquer, visto que a seleção do tipo de banco, (nuvem para maior segurança, ou local para melhor controle) influencia diretamente no propósito do projeto.

---

## 3. Requisitos não funcionais

1. **Tempo de resposta**: Um aplicativo por vezes pode conversar com outro para obter recursos que não possui, o primeiro envia um *Request* para o segundo, que então processa o pedido, agrupa as informações requisitadas, e retorna-as para o anterior. O tempo necessário para cobrir todo o trajeto, chama-se tempo de resposta, e o aumento dele influência diretamente na satisfação do usuário com o programa.
2. **Segurança**: Alguns programas exigem do usuário a inserção de caracteres especiais em cadastros de senhas ou informações sensíveis, de modo a garantir uma melhor proteção dos dados.
3.  **Usabilidade**: Uma interface mais bem detalhada (*User Experience*), com botões interativos e textos em uma qualidade melhor, atraem a atenção dos usuários, que por sua vez podem se tornar clientes.
4.  **Interoperabilidade**: Um _software_ capaz de interagir com aplicações externas de forma eficiente, como usar protocolos com um tempo de resposta menor.
5.  **Manutenabilidade**: Softwares que possuem comentários em seus códigos, funções eficientes e nomenclaturas bem definidas de variáveis, acabam por ser mais fáceis de manter ao longo do tempo, aumentando assim a vida útil do software.

---

## 4 Exemplos de *Trade-offs*

1. **Segurança vs. Usabilidade** Entregar um sistema extremamente protegido, em troca de perder UX (*User Experience*).
2. **Controle vs. Conveniência** Um banco de dados local (*on premises*) e um em nuvem (*Database as a Service*). Por um lado, o gerente tem controle físico total, velocidades de resposta muito altas e previsão de custo; por outro, perde potência em grandes volumes de data e disponibilidade de acesso em diferentes regiões.
3. **Clean Code vs. Performance** Usar abstrações e padrões de projeto torna o código mais fácil de ler e manter, e em troca, cada camada de abstração consome memória e CPU. Em sistemas críticos (como drivers), o código é "sujo" e manual para recuperar milisegundos de processamento.
