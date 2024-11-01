<h1>Cofrinho de Moedas em Java</h1>

<p>Simulação de um cofrinho virtual para armazenar e gerenciar moedas de diferentes tipos, como euro, dólar e real. Desenvolvido para praticar manipulação de coleções e herança em Java, o cofrinho permite operações de adição, remoção e consulta de moedas armazenadas.</p>

<h2>Funcionalidades</h2>
<ul>
  <li><strong>Adicionar Moedas</strong>: Insere uma moeda (euro, dólar ou real) no cofrinho.</li>
  <li><strong>Remover Moedas</strong>: Remove uma moeda específica do cofrinho.</li>
  <li><strong>Exibir Total</strong>: Calcula o valor total armazenado em cada tipo de moeda.</li>
  <li><strong>Conversão de Valores</strong> (se aplicável): Converte o valor total para uma moeda base para visualização unificada.</li>
</ul>

<h2>Estrutura de Classes</h2>
<ul>
  <li><strong>Moeda</strong>: Classe abstrata que define métodos gerais para manipulação de moedas.</li>
  <li><strong>Dolar, Euro, Real</strong>: Classes específicas para cada moeda, estendem <code>Moeda</code>.</li>
  <li><strong>Cofrinho</strong>: Armazena e gerencia uma coleção de objetos do tipo <code>Moeda</code>.</li>
  <li><strong>Main</strong>: Classe principal que executa o programa.</li>
</ul>

<h2>Requisitos</h2>
<ul>
  <li>Java 8 ou superior</li>
</ul>

<h2>Como Executar</h2>
<ol>
  <li>Compile os arquivos:
    <pre><code>javac Cofrinho/src/*.java</code></pre>
  </li>
  <li>Execute a aplicação:
    <pre><code>java Cofrinho/src/Main</code></pre>
  </li>
</ol>

<h2>Exemplo de Uso</h2>
<pre><code>public class ExemploUso {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        cofrinho.adicionar(new Real(2.0));
        cofrinho.adicionar(new Dolar(1.0));
        cofrinho.adicionar(new Euro(0.5));

        // Remover uma moeda
        cofrinho.remover(new Dolar(1.0));

        // Exibir total por tipo
        cofrinho.exibirTotal();
    }
}</code></pre>

<h2>Contribuição</h2>
<p>Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para aprimorar o projeto.</p>
