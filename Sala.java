import java.io.*;

public class Sala
{
	protected ArrayList<Usuario> usu;
	protected String nome;
	protected int qtdMax;
	protected int qtd;

	public Sala (ArrayList a)
	{

	}

	public boolean isCheia()
	{
		return this.qtd==this.qtdMax;
	}

    public String getNome()
    {
		return this.nome;
	}
	// getUsuarios
}