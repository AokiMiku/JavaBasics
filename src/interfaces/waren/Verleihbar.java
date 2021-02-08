package interfaces.waren;

public interface Verleihbar 
{
	int VERLEIHDAUER = 7;
	
	double getVerleihpreis();
	
	void setVerleihpreis(int preis);
}