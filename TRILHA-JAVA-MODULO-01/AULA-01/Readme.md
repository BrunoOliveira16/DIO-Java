# 📌 **Introdução a Plataforma Java**

## ✅ **Java e sua história**
Interessada em dispositivos eletrônicos inteligentes, a Sun Microsystems financiou uma pesquisa interna com o codinome Green em 1991. O projeto resultou no desenvolvimento de uma linguagem baseada em C e C++ que seu criador, James Gosling, chamou de Oak (carvalho) em homenagem a uma árvore que dava para a janela do seu escritório na Sun.

Descobriu-se mais tarde, que já havia uma linguagem de computador chamada Oak. Quando uma equipe da Sun visitou uma cafeteria local, o nome Java (cidade de origem de um tipo de café importado) foi sugerido e pegou.

Mas o projeto Green atravessava algumas dificuldades. O mercado para dispositivos eletrônicos inteligentes destinados ao consumidor final, não estava se desenvolvendo tão rapidamente como a Sun tinha previsto. Pior ainda, um contrato importante pelo qual a Sun competia fora concedido a outra empresa. Então, o projeto estava em risco de cancelamento. Por pura sorte, a World Wide Web explodiu em popularidade em 1993 e as pessoas da Sun viram o imediato potencial de utilizar Java para criar páginas da Web com o chamado conteúdo dinâmico. Isso deu nova vida ao projeto.

Em maio de 1995, a Sun anunciou Java formalmente em uma conferência importante. Normalmente, um evento como esse não teria gerado muita atenção. Entretanto, Java gerou interesse imediato na comunidade comercial, por causa do fenomenal interesse pela World Wide Web.

<br>

> Um pouco mais da história sobre Java no canal do <a href="https://www.youtube.com/watch?v=sTX0UEplF54&list=PLHz_AreHm4dkI2ZdjTwZA4mPMxWTfNSpR"><b>Guanabara Curso em Video</b></a>

<br>

### **Java é agora utilizada praticamente em todo lugar:**

<br>

- Páginas da Web com conteúdo interativo e dinâmico;
- Aplicações corporativas de grande porte;
- Softwares destinados ao consumidor final.
- Aplicativos para Smartphones.

<br>

## ✅ **Plataformas**
Com a linguagem Java, conseguimos desenvolver softwares para várias finalidades de negócio. Seja uma aplicação desktop, uma distribuição web, eletrônicos e dispositivos móveis.

Isso graças a distribuição dos recursos da linguagem, através de plataformas bem estruturadas.

<br>

### 📄 **Plataformas da linguagem Java**
A linguagem Java conta com quatro ambientes de desenvolvimento:

<br>

![screenshot](./assets/imagem-01.jpg)

<br>

- **JSE (Java Standard Edition):** É a base da plataforma. Inclui o ambiente de execução e as bibliotecas comuns, sendo direcionado a aplicações para PCs e servidores. O toolkit Swing, por exemplo, é usado para desenvolver softwares com interface gráfica para desktop.

- **JEE (Java Enterprise Edition):** A edição voltada para o desenvolvimento de aplicações corporativas e para a Web. Possui diversos frameworks, como JPA (Java Persistence API), JSP (Java Server Pages), etc.

- **JME (Java Micro Edition):** É a edição para o desenvolvimento de aplicações para dispositivos móveis e embarcados.

- **JFX (Java FX):** JavaFX é uma tecnologia de software que, ao ser combinada com Java, permite a criação e implantação de aplicações de aparência moderna e conteúdo rico de áudio e vídeo.

<br>

### 📄 **Componentes da plataforma**
Agora que já sabemos que podemos desenvolver para vários cenários de negócio, é hora de conhecer as ferramentas de desenvolvimento da linguagem:

O Java se subdivide em componentes de desenvolvimento (JDK) e de execução (JRE). Isso significa que, para desenvolver aplicações, é necessário ter instalado o JDK. Mas para apenas iniciar o executável (.jar), simplesmente a instalação da JRE será o suficiente.

### **JDK (Java Development Kit) - Kit de Desenvolvimento Java**
- Composto pelo compilador (javac + JVM);

- Visualizador de applets, bibliotecas de desenvolvimento;

- Programa para composição de documentação (javadoc);

- Depurador básico de programas e versão da JRE.

### **JRE (Java Runtime Environment) - Ambiente de Execução Java**
- É composta de uma JVM e por um conjunto de bibliotecas, que permite a execução de softwares em Java;

- Apenas permite a execução de programas, ou seja, é necessário o programa Java compilado pela JDK gerando os arquivos .class.

<br>

### 📄 **Processo de desenvolvimento**
- Todo código-fonte escrito em arquivo texto possui extensão .java;

- Este arquivo é compilado com o javac gerando o arquivo .class;

- O arquivo .class não contém código de máquina nativo, e sim o bytecodes.

<br>

![screenshot](./assets/imagem-02.jpg)

<br>


Características de cada versão

| <h3 align="center"><b>Versão</b></h3> | <h3 align="center"><b>Data</b></h3> | <h3 align="center"><b>Recurso</b></h3> |
| --- | --- | --- |
| JDK 1.0 | 23 de janeiro de 1996 | É a 1ª versão sendo hoje usada para compatibilidade de browsers mais antigos. |
| JDK 1.1 | 19 de fevereiro de 1997 | Muitas bibliotecas adicionadas, das quais se destacaram o Java RMI, JavaBeans, novo modelo de eventos e JDBC driver, para conexão com banco de dados. |
| J2SE 1.2 | 8 de dezembro de 1998 | Obteve um grande aumento das classes, na biblioteca Java (API). |
| J2SE 1.3 | 8 de maio de 2000 | Foram incluidas as bibliotecas JNDI, JavaSound, entre outros. |
| J2SE 1.4 | 6 de fevereiro de 2002 | Foi criada a palavra reservada “assert”, biblioteca NIO, entre outros. |
| J2SE 5.0 | 30 de setembro de 2004 | Introdução dos Generics, Enumeração, Auto-boxing, for-each entre outros. |
| JAVA SE 6 | 11 de dezembro de 2006 | Obteve uma melhora significativa na performance e na estabilidade, tendo o surgimento do JIT. |
| JAVA SE 7 | 28 de julho de 2011 | Suporte ao uso de strings em condições do switch, inferência na criação de objetos com tipos genéricos, simplificação na invocação de métodos com parâmetros VarArgs e tipos genéricos, entre outros. |
| JAVA SE 8 | 18 de março de 2014 | Expressões Lambdas, forEach, Consumer e interfaces no java.util.functions, Default methods, Method references e etc. |
| JAVA SE 9 | 21 de setembro de 2017 | Uma das novidades dessa versão, são os factory methods para coleções. |
| JAVA SE 10 | 20 de março de 2018 | Dentre as novidades do java 10 podemos apontar a nova API para criação de coleções imutáveis e a nova forma de se declarar variáveis locais. |
| JAVA SE 11 | 25 de setembro de 2018 | Métodos readString() writeString(). Alguns métodos foram adicionados no tocante a manipulação de cordas como o repeat, strip, stripLeading, stripTrailing, lines e isBlank. Também vale ressaltar a utilização de variáveis por inferência. |
| JAVA SE 12 | 19 de março de 2019 | Expressão Switch melhorada e métodos String indent e transform. |
| JAVA SE 13 | 17 de setembro de 2019 | O Java 13 trouxe dois novos recursos de linguagem, embora no modo de visualização. Usando yield, agora podemos efetivamente retornar valores de uma expressão switch. O segundo recurso de visualização são blocos de texto para Strings de várias linhas, como JSON, XML, HTML, etc. |
| JAVA SE 14 | 17 de março de 2020 | Helpful NullPointerExceptions, nos permite saber quem causou e a consequência, Records (Preview) criado pela oracle para reduzir a verbosidade, Switch Expressions tornando a sintaxe do switch mais fácil e simples, deixando o código mais limpo e agradável. |
| JAVA SE 15 | Setembro de 2020 | O Java 15, oferece aos desenvolvedores 14 aprimoramentos/alterações, incluindo um módulo de incubadora, três recursos de visualizações, dois recursos obsoletos e duas remoções. Algumas mudanças servem para reduzir o tamanho e o escopo do JDK através da depreciação, que é uma técnica para transmitir informações, sobre o ciclo de vida de uma API. |
| JAVA SE 16 | Março de 2021 | Foram acrescentados muitos recursos para melhorar a perfomance, consumo de memória e uso da linguagem. Alguns dos novos recursos incluem mudanças no ZGC, suporte à versão 14 do C++ para evolução da JDK e JVM, capacidade elástica do metaspace, novas APIs e ferramentas. |
| JAVA SE 17 LTS | Setembro de 2021 | Entre os novos recursos da nova versão do Java padrão, estão o suporte a filtros de desserialização específicos do contexto, que é um aprimoramento de segurança e uma visualização de correspondência de padrões para instruções switch. |