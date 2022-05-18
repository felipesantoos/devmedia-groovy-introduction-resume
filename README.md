# Resumo do artigo "Linguagem de Programação Groovy: Introdução" da DevMedia

> 💡 Este resumo foi feito a partir do material disponibilizado pela DevMedia neste [link](https://www.devmedia.com.br/linguagem-de-programacao-groovy-introducao/34099).

# O que é Groovy?

O Groovy é uma linguagem de programação **orientada a objetos** e foi projetada para rodar na **Java Virtual Machine (JVM)**, o que faz com que ela seja **multiplataforma**. Isso quer dizer que o mesmo código Groovy pode ser executado no Windows, Linux, Mac ou outro, bastando apenas que a máquina possua uma JVM para interpretá-lo, podendo assim rodar o código feito com Java. Além disso ele também tem semelhanças com a linguagem Ruby, pois também permite modificar o código da aplicação em tempo de execução. Esse recurso chama-se **metaprogramação** e com isso podemos, por exemplo, adicionar um método em uma determinada classe enquanto a aplicação está sendo executada.

# Instalação

Você pode baixar o Groovy neste [link](https://groovy.apache.org/download.html).

> 💡 Para rodar as aplicações escritas em Groovy é necessário ter o Java instalado. Baixe-o neste [link](https://www.java.com/pt-BR/download/manual.jsp).

# Variáveis de ambiente

Para conseguir utilizar o executável do Groovy, exporte as seguintes variáveis de ambiente no seu Sistema Operacional para que você possa utilizá-lo em qualquer diretório usando um terminal (no Linux você pode adicionar essas linhas no final do arquivo `/etc/bash.bashrc` (talvez seja necessário executar o comando `source /etc/bash.bashrc`)):

```bash
JAVA_HOME={DIRETORIO_DE_INSTALAÇÃO_DO_JAVA}
GROOVY_HOME={DIRETORIO_DE_INSTALAÇÃO_DO_GROVY}

export JAVA_HOME
export GROOVY_HOME

export PATH=$PATH:$JAVA_HOME/bin:$GROOVY_HOME/bin
```

> 💡 Para verificar se o groovy foi instalado corretamente, execute o comando `groovy --version` na linha de comando.

# Groovy Console

No terminal, digite `groovyConsole` para abrir o REPL do Groovy. Você pode executar comandos Groovy ou Java utilizando o console do Groovy.

> 💡 REPL significa Read Evel Print Loop (Leia Interprete Imprima Repita).

# Hello World

```groovy
println("Hello, World!")
```

# Tipagem estática e dinâmica

```groovy
int i = 1
println(i.class) // class java.lang.Integer

long l = 1_000_000_000_000_000_000_000
println(l.class) // class java.lang.Long

d = 3.1415926535
println(d.class) // class java.math.BigDecimal

s = "I am Groovy!"
println(s.class) // class java.lang.String
```

> 💡 Não há tipos primitivos em Groovy.

# Métodos

Para os métodos do Groovy não é necessário explicitar o tipo de retorno, nem mesmo usar a instrução `return` para retornar um valor para o chamador (nesse caso, quando essa instrução não é usada o último valor avaliado será retornado).

```groovy
def int toSquare(int number) {
    return number * number
}

println("2² = " + toSquare(2)) // 2² = 4

def sum(x, y) {
    x + y
}

println("1 + 2 = " + sum(1, 2)) // 1 + 2 = 3
```

# Strings

```groovy
singleQuotes = 'This is a single-quoted string.'

name = "double-quoted string"
doubleQuotes = "This is a ${name}."

anotherName = 'triple double-quoted string'
tripleDoubleQuotes = """
    This is a ${anotherName},
    used for multiline
    strings.
"""

println(singleQuotes)
println(doubleQuotes)
println(tripleDoubleQuotes)
```

- Aspas simples:
    - Utiliza menos memória;
    - Melhor desempenho;
    - Não aceita interpolação.
    - Single-line.
- Aspas duplas:
    - Aceita interpolação com `${}`;
    - Single-line.
- Aspas duplas triplas:
    - Aceita interpolação com `${}`;
    - Multiline.

# Métodos Java

Podemos utilizar no Groovy todos os métodos das classes contidas no Java.

```groovy
myString = 'This is my string'

println(myString.indexOf('my')) // 8
println(myString.length()) // 17
println(myString.substring(11)) // string
```

# Estruturas de controle

```groovy
age = 20

if (age < 2) {
    println("You're a baby!")
} else if (age < 13) {
    println("You're a child!")
} else if (age < 18) {
    println("You're a teenager!")
} else if (age < 60) {
    println("You're an adult!")
} else {
    println("You're an elderly!")
}
```

### `null` é `false`

```groovy
myVar = null

if (myVar) {
    println("I consider this true! Real value: ${myVar}.")
} else {
    println("I consider this false! Real value: ${myVar}.")
}
```

# Operador ternário

```groovy
age = 20
age >= 18 ? println("You're an adult!") : println("You're not an adult!")
```

# Switch

```groovy
month = 1

switch (month) {
    case 1:
        println('January')
        break
    case 2:
        println('February')
        break
    case 3:
        println('March')
        break
    case 4:
        println('April')
        break
    case 5:
        println('May')
        break
    case 6:
        println('June')
        break
    case 7:
        println('July')
        break
    case 8:
        println('August')
        break
    case 9:
        println('September')
        break
    case 10:
        println("October")
        break
    case 11:
        println('November')
        break
    case 12:
        println('December')
        break
    default:
        println('Invalid month!')
}
```

# Estruturas de repetição

## While

```groovy
i = 0
while (i < 10) {
    println(i++)
}
```

## For

```groovy
for (int i = 0; i < 10; i++) {
    println(i)
}
```

### Ranges

```groovy
// Intervalo semi-exclusivo.
myRange = 0..<10
for (int i = 0; i < myRange.size(); i++) {
    post = i == myRange.size()-1 ? '\n' : ', '
    print("${myRange[i]}${post}")
}
```

```groovy
// Intervalo inclusivo.
myRange = 1..10
for (int i = 0; i < myRange.size(); i++) {
    post = i == myRange.size()-1 ? '\n' : ', '
    print("${myRange[i]}${post}")
}
```

```groovy
// for simplificado
range = 1..5
for (element in range) {
    println(element)
}
```
