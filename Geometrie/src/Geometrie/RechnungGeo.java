package Geometrie;
/**
 * @author Aykut Acarer
 * 
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class RechnungGeo {

	public static void main(String[] args) {
		// Erstellen Sie ein Programm zur Berechnung von Kreisen, Rechtecken und Dreiecken!
		
		byte auswahl;
		double durchmesser=0, flächeninhalt=0, umfang=0;
		double a=0, b=0;
		double x=0, y=0, z=0, h=0;
		DecimalFormat df = new DecimalFormat(",##0.00");
		
		do {
			String auswahl1 = javax.swing.JOptionPane.showInputDialog(null, "Wählen Sie bitte: \n1-Kreisberechnung\n2-Rechteckberechnung\n3-Dreieckberechnung\n0-Programm beendet", "Rechnung", 3);
			auswahl=Byte.parseByte(auswahl1);
			
			switch (auswahl) {
				case 1:
					String rad=javax.swing.JOptionPane.showInputDialog(null, "Geben Sie bitte Radius (cm) ein");				
					double radius = Double.parseDouble(rad);
					durchmesser = radius*2;
					flächeninhalt = Math.PI*radius*radius;
					umfang=2*Math.PI*radius;
					javax.swing.JOptionPane.showMessageDialog(null, "Flächeninhalt ist "+ df.format(flächeninhalt) + " cm^2"+"\n"+"Umfang ist "+ df.format(umfang)+" cm");
					break;
				
				case 2: 
					String zahl1=javax.swing.JOptionPane.showInputDialog(null, "Geben Sie bitte ein Zahl (a) (cm) ein:");
					String zahl2=javax.swing.JOptionPane.showInputDialog(null, "Geben Sie bitte ein Zahl (b) (cm) ein:");
					a = Double.parseDouble(zahl1);
					b = Double.parseDouble(zahl2);
					flächeninhalt = a*b;
					umfang = 2*(a+b);
					javax.swing.JOptionPane.showMessageDialog(null, "Flächeninhalt ist "+ df.format(flächeninhalt) + " cm^2"+"\n"+"Umfang ist "+ df.format(umfang)+" cm");
					break;
				
				case 3: 
					String zahl3=javax.swing.JOptionPane.showInputDialog(null, "Geben Sie bitte ein Zahl (ecke x) (cm) ein:");
					String zahl4=javax.swing.JOptionPane.showInputDialog(null, "Geben Sie bitte ein Zahl (ecke y) (cm) ein:");
					String zahl5=javax.swing.JOptionPane.showInputDialog(null, "Geben Sie bitte ein Zahl (ecke z) (cm) ein:");
					String zahl6=javax.swing.JOptionPane.showInputDialog(null, "Geben Sie bitte ein Zahl (Höhe z) (cm) ein:");
					
					x = Double.parseDouble(zahl3);
					y = Double.parseDouble(zahl4);
					z = Double.parseDouble(zahl5);
					h = Double.parseDouble(zahl6);
					
					flächeninhalt = y*h/2;
					umfang = x+y+z;
					javax.swing.JOptionPane.showMessageDialog(null, "Flächeninhalt ist "+ df.format(flächeninhalt) + " cm^2"+"\n"+"Umfang ist "+ df.format(umfang)+" cm");
					break;
				case 0:break;
				
				default:
					javax.swing.JOptionPane.showMessageDialog(null, "Falsch Eingabe!!!");
					break;
			}
			System.out.println("\n");
		}
		while(auswahl!=0);								
		javax.swing.JOptionPane.showMessageDialog(null, "Programm beendet!!!");	
	}
	
}


