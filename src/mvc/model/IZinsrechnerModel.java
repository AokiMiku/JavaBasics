package mvc.model;

public interface IZinsrechnerModel 
{
	double berechneEndkapital(double startkapital, int laufzeit, float zinsPA);
	double berechneLaufzeit(double startkapital, float zinsPA, double endkapital);//
}