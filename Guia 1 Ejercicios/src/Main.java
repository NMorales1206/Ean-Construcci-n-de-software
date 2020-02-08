import java.util.Scanner;
public class Main {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		
		int opc;
		
		do {
			System.out.println("Bienvenido");
			System.out.println("En este programa se desarrollaran los ejercicios propuestos para la Guia n°1");
			System.out.println("1 - Aritmética.");
			System.out.println("2 - Eficiencia de combustible.");
			System.out.println("3 - Distancia entre dos puntos en la tierra");
			System.out.println("4 - Área y Volumen");
			System.out.println("5 - Capacidad calórica");
			System.out.println("6 - Área de un polígono regular");
			System.out.println("7 - Viaje a Sasaima");
			System.out.println("8 - El Colectivo");
			System.out.println("9 - El Paseo");
			System.out.println("10 - Tronco de Cono");
			System.out.println("Ingrese Ejercicio a desarrollar");
			opc = teclado.nextInt();
			
		}while (opc>10);
		
		switch(opc) {
		    
		  case 1:

			  int a, b, suma,resta,prod,cociente,residuo;
			  double loga,elevado;
				
				System.out.println("Bienvenido");
				System.out.println("Ingrese el valor de A");
				a = teclado.nextInt();
				
				System.out.println("Ingrese el valor de B");
				b = teclado.nextInt();
				
				suma = a + b;
				resta = a - b;
				prod = a * b; 
				cociente = a/b;
				residuo = a%b;
				loga = Math.log(a);
				elevado = Math.pow(a,b);
				
				
				System.out.println("Resultado suma: "+ suma);
				System.out.println("Resultado diferencia: " + resta);
				System.out.println("resultado producto: "+ prod);
				System.out.println("Resultado cociente: "+ cociente);
				System.out.println("Resultado residuo: " + residuo);
				System.out.println("Resultado logaritmo: " + loga);
				System.out.println("Resultado elevado: " + elevado);
				
				break;
				
		   case 2:
			   	
			   float mpg,lpk;
			   
				// 1 Galon = 3785 L
				// 1 Milla = 1609 Km
				
				System.out.println("Bienvenido");
				System.out.println("Ingrese el Valor de la eficiencia del combustible (MPG)");
				mpg = teclado.nextInt();
				
				lpk = mpg*3785/1*1/1609;
				
				System.out.println("El valor de la enficiencia del combustible en LPK es de =" + lpk);
			   
				break;
				
		   case 3: 

			   double t1,t2,g1,g2,distancia;
			   
				System.out.println("Se calculará la distancia entre dos ciudades");
				System.out.println("Deberá ingresar la longitud y latitud de las dos");
				
				System.out.println("ingrese latitud de la primera ciudad");
				t1 = teclado.nextInt();
				System.out.println("Ingrese longitud de la primera ciudad");
				g1 = teclado.nextInt();
				
				System.out.println("ingrese latitud de la primera ciudad");
				t2 = teclado.nextInt();
				System.out.println("ingrese longitud de la segunda ciudad");
				g2 = teclado.nextInt();
				
				distancia = 6371.07*Math.acos(Math.sin(t1))*Math.sin(t2)+Math.cos(t1)*Math.cos(t2)*Math.cos(g1-g2);
				System.out.println("La distancia entre las dos ciudades es de:"+ distancia);
				
				break;
				
		   case 4: 
			   
			   double r,vol,area;
			   
				System.out.println("Se calculará el área y volumen de un circulo");
				
				System.out.println("Ingrese el valor del radio de dicho circulo");
				r = teclado.nextInt();
				
				area = Math.PI*(r*r);
				vol = (4*Math.PI*(r*r*r))/3;
				
				System.out.println("Radio del circulo = "+ r);
				System.out.println("Área del circulo = "+ area);
				System.out.println("Volumen del circulo = "+ vol);
				
				break;
				
		   case 5: 
			   
			   double m,c,ti,tf,q;
		    	
		        System.out.println("Se calculará la cantidad total de energia necesaria para alcanzar la temperatura deseada para esa cantidad de agua");
				
				System.out.println("ingrese la masa");
				m = teclado.nextDouble();
				
				System.out.println("ingrese la temperatura inicial");
				ti = teclado.nextDouble();
				
				System.out.println("ingrese la temperatura a alcanzar");
				tf = teclado.nextDouble();
				
				c = 4186;
				q = m*c*(tf-ti);
				
				System.out.println("Energia necesaria = " + q + " J");
				
				break;
				
		   case 6:
			   
			    int n;
				double s,area6;
				
				System.out.println("Calculo área de un polígono");
				
				System.out.println("Ingrese el número de lados");
				n = teclado.nextInt();
				
				System.out.println("Ingrese la longitud de un lado del polígono");
				s = teclado.nextDouble();
				
				area6 = (n*Math.pow(s,2))/(4*Math.tan(Math.PI/n));
				
				System.out.println("Área del poligono = "+ area6);
				
				break;
				
		   case 7: 
			   
			   double cap,cant,BaS,viajes,viajest,consumo,consunviaje,consumot,costo,costot,valorgasolina;		
			   
				System.out.println("Ingrese kilos soportados por el camión");
		        cap = teclado.nextDouble();
		   
				System.out.println("Ingrese la cantidad de kilos a transportar");
				cant = teclado.nextDouble();
				
				System.out.println("Cuanto galones consume el camion por kilometro?");
				consumo = teclado.nextDouble();
				
				BaS = 78.5;
				valorgasolina = 10000;
				
				if (cap >= cant){
					viajest = 1;
				}else{
					
					viajes = cant/cap;
					// Realizo la aproximación al número siguiente dado a que si el resultado cuenta con decimales eso ya seria peso de mas 
					viajest = Math.ceil(viajes);	
				}
				
			
				consunviaje = consumo * BaS;
				consumot = consunviaje * viajest*2; //multiplicado por 2 teniendo en cuenta ida y vuelta
				costo = consunviaje * valorgasolina;
				costot = valorgasolina * consumot;
				
				System.out.println("Viajes necesarios = " + viajest);
				System.out.println("galones gastados en uno de los viajes = "+ consunviaje);
				System.out.println("Galones gastados en todo el proceso de entrega = "+ consumot);
				System.out.println("Costo de gasolina en un viaje = "+costo);
				System.out.println("Costo total de la gasolina ="+costot);
				
				break;
				
		   case 8:
			   
			   int n8,p;
				double viajes8,viajest8,pasaje,pasajet,propietario,propietariot;
				
				pasaje = 10000;
				propietario = 2000;
				
				System.out.println("ingrese la capacidad maxima de pasajeros");
				n8 = teclado.nextInt();
				
				System.out.println("Ingrese número de personas a transportar");
				p = teclado.nextInt();
				
				if(n8>=p) {
					viajest8 = 1;
				}else {
					viajes8 = p/n8;
					viajest8 = Math.ceil(viajes8);
				}
		         
				    pasajet=pasaje*p;
				    propietariot= propietario * viajest8;
				    
				System.out.println("Total de viajes a realizar ="+viajest8);
				System.out.println("Total pago de pasajeros = "+ pasajet);
				System.out.println("Total a pagar al propietario ="+ propietariot);
				
				break;
				
		   case 9:
			   int ng,nf,asientosng,totalpuestos,dias,comida,platos,comidat,platost,habitaciones,totalest,cmax;
				double busest,buses,habt,habdia,habtodo;
		        
				System.out.println("Ingrese cuantos estudiantes gordos son:");
				ng = teclado.nextInt();
				
				System.out.println("Ingrese cuantos estudiantes flacos son");
				nf = teclado.nextInt();
				
				System.out.println("Ingrese el número de días que durará el paseo");
				dias = teclado.nextInt();
				
				cmax = 60;
				totalest =ng+nf;
				
				asientosng = ng*2;
				totalpuestos = asientosng + nf;
				
				if(cmax>=totalpuestos) {
					busest = 1;
				}else {
					buses = totalpuestos/cmax;
					busest = Math.ceil(buses);
				}
		         
			   
				platos = (ng*5)+(nf*3);
				comida = platos * 10000;
				
				platost = platos*dias;
		        comidat = comida*dias; 
		        
		        habitaciones = totalest/4;
		        habt = Math.ceil(habitaciones);
		        habdia = 25000*habt;
		        habtodo = habdia*dias;
		        
		        System.out.println("Total de puestos necesarios = "+ totalpuestos);
		        System.out.println("Buses necesarios = " + busest);
		        System.out.println("Platos a servir diarios = "+ platos);
		        System.out.println("Platos a servir durante todo el viaje = "+ platost);
		        System.out.println("Costo de comida al dia = "+ comida);
		        System.out.println("Costo de comidad en todo el viaje = " +comidat);
		        System.out.println("Número de habitanciones necesarias = " +habt);
		        System.out.println("Costo de estadia al dia = " +habdia);
		        System.out.println("costo de estadia total = "+habtodo);
		        
		        break;
		        
		   case 10: 
			   
			   double r1,r2,h1,h2,volcono,volconodef,volumentronco;
				
				System.out.println("ingrese R1");
				r1 = teclado.nextDouble();
				System.out.println("Ingrese H1");
				h1 = teclado.nextDouble();
				
				System.out.println("Ingrese R2");
				r2 = teclado.nextDouble();
				System.out.println("Ingrese H2");
				h2 = teclado.nextDouble();
				
				volcono = Math.PI*Math.pow(r1,2)*h1;
				
				volconodef = Math.PI*Math.pow(r2,2)*h2;
				
				volumentronco = volcono - volconodef;
				
				System.out.println(" El volumen del tronco de cono es = "+ volumentronco + "cm^3");
				
				break;
				
				default:
					System.out.println("Solo número de 1 al 10");
		}

	}

}
