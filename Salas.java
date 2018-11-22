import java.io.*;
import javax.swing.*;
import java.net.*;

public class Salas
{
	private ArrayList<Sala> salas;
	private int quantidade = 0;

	public Salas(){
		salas = new ArrayList<Sala>();
	}

	public Sala[] getSalas() {
		return this.salas.toArray();
	}

	public boolean existe(String sala)
	{
		return this.salas.contains(sala);
	}

	/*public Sala getSalaByNome(String nome) throws Exception
	{
		for (int i = 0; i < this.salas.size(); i++)
		{
			if (this.salas[i].getNome() == nome )
				return this.salas[i];
	    }
	   	throw new Exception("Sala inexistente!");
	   	return null;
	}*/

	public Sala getSalaByName (String nome)
	{
		return this.salas
	}


}