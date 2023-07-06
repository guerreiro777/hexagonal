#language: pt
  @hexagonal
  Funcionalidade: UsuarioHexagonal
    Teste de integracao simples utilizando cucumber

    @EnviarDadosStatus200
      Cenario: a mensagem pode ser recuperada
      Dado que possua as informacoes a serem cadastradas
      Quando o cliente chama /usuario
      Entao o cliente recebe o status 200
