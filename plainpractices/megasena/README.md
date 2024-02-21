# Mega Sena VNW

### Especificação técnica
- O usuário precisa escolher 7 números de 1 a 100.
- Precisa ser obrigatoriamente um numero inteiro, do contrário o erro/exceção precisa ser tratado, impedindo que o programa pare.
- Os números escolhidos terão de ser guardados em um vetor;
- Após o final, percorrer o vetor com as respostas e comparar com os 7 números sorteados;
- Se o usuário acertar 5 números → Premio de 10 mil reais;
- Se o usuário acertar 6 números → Premio de 50 mil reais;
- Se o usuário acertar 7 números → Premio de 200 mil reais;

### Algoritmo "Mega Sena" em Portugol
```plaintext
Var
  numerosDoUsuario, numerosSorteados : vetor[1..7] de inteiros
	entradaValida : boleano; //flag para controlar o loop de validação de input
	quantidadeDeAcertos, i : inteiro;
Inicio
  Para i de 1 ate 7 passo 1 faca {
  
		//Enquanto entradaDoUsuario não for do tipo inteiro (entre 1 e 100 inclusive), o loop continuará.
		faca{ 

			try{

        Escreva("Insira um inteiro: ")
  			Leia(entradaDoUsuario)
  
  			validarEntrada(entradaDoUsuario) //funcao para validar a entrada do usuário

			}catch(Exception e){
				Escreva("Erro: ", e)
				entradaValida <- false
			}

		}enquanto(!entradaValida)
	}

	numerosSorteados <- gerarNumeros(7)

	Escreva(numerosSorteados)
	Escreva(numerosDoUsuario)
	
	quantidadeDeAcertos <- verificarAcertos(numerosSorteados, numerosDoUsuario)
	mensagemDoResultado(quantidadeDeAcertos)
 Fim


  


