import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class test {

	public static void main(String[] args) {
		String line = "";
		try
		{
			BufferedReader fluxEntree=
					new BufferedReader(new FileReader("src/test.txt"));
			line = fluxEntree.readLine( );

			while(line != null)
			{
				System.out.println(line);
				line = fluxEntree.readLine();
				PrintWriter fluxSortie = null;
				try
				{
					fluxSortie =
							new PrintWriter(new FileOutputStream("C://Users/User/Desktop/page1.html", true));
				}
				catch(FileNotFoundException e)
				{ System.out.println("Erreur d’ouverture fichier.txt.");
				System.exit(0);
				}
				System.out.println("Ecriture sur fichier");
				fluxSortie.println(line);
				fluxSortie.close( );
			}
			fluxEntree.close();
		}
		catch(FileNotFoundException e)
		{ System.out.println(" Fichier donnee nexiste pas");
		System.out.println("ou erreur ouverture");
		}
		catch(IOException e)
		{ 
			System.out.println("Erreur lecture.");
		}
		//############################################################################

		System.out.println("Fin du programme.");

	}
}

