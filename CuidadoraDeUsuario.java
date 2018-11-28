import java.io.*;

public class CuidadoraDeUsuario extends Thread  // só vai cuidar de receber
{
	private Usuario usuario;
	private Socket conexao;
    private Salas salas;

	public CuidadoraDeUsuario (Socket conexao, Salas salas) throws Exception
	{
		if (conexao == null || salas == null)
			throw new Exception("Informacoes ausentes!");

		this.conexao = conexao;
        this.salas = salas;

		//   *declarar e instanciar OOS e OIS com o socket recebido
		//  *(LOOP) interagir com o usuario via OOS e OIS ate descobrir o nome da sala em que ele deseja entrar, informando sala cheia, e o nome que ele deseja usar informando nome invalido ou usado
		// (LOOP) procurar em salas (parametro) a sala com o nome desejado (FAZER ISSO ANTES DE DESCOBRIR O NOME)
		// instanciar 1 usuario fornecendo conexao, OOS, OIS, nome e sala
		// incluir o usuario na sala
		// NÃO ir pro próximo comentário antes de concluir o atual
		// fazer varias vezes this.usuario.envia (new AvisoDeEntradaNaSala(i)), onde i é o nome de algum usuario que já estava na sala
		// enviar para todos os usuarios da sala new AvisoDeEntradaNaSala(usuario.getNome())
		// incluir o usuario na sala
	}

	public void run()
	{
		ObjectOutputStream transmissor = new ObjectOutputStream(conexao.getOutputStream());
		ObjectInputStream receptor = new ObjectInputStream(conexao.getInputStream());
		String sala = "", nome = "";

		nome = receptor.readObject();
		sala = receptor.readObject();


		usuario = new Usuario(conexao, transmissor, receptor, nome, );
		// interagir com o usr via OOS e OIS ate descobrir o nome da sala em que ele deseja entrar, eventualmente, informando sala cheia
		// procurar em salas a sala com o nome desejado
		// interagir com o usr via OOS e OIS ate descobrir o nome que ele deseja usar, eventualmente, informando nome invalido ou ja usado
		// instanciar o Usuario, fornecendo, conexao, OOS, OIS, nome e sala
		// fazer varias vezes this.usuario.envia(new AvisoDeEntradaDaSala(i)), onde i é o nome de algum usuario que ja estava na sala
		// fazer varias vezes i.envia(new AvisoDeEntradaDaSala(usuario.getNome()), onde i é o nome de algum usuario que ja estava na sala
        // incluir o usuario na sala
		// RECEBE PEDIDOS DE SAIR DA SALA OU MENSAGEM
		Enviavel recebido = null;
		do
		{
			// recebe o enviavel
			// enquanto não for pedido vai ser mensagem
			// recebe aviso de entrada e saida e mensagens
		}
		while (!(recebido instanceof PedidoParaSairDaSala));

		// remover this.usuario da sala
		// mandar new AvisoDeSaidaDaSala(this.usuario.getNome()) para todos da sala
		this.usuario.fechaTudo();
	}
}