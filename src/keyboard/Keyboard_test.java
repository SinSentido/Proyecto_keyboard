package keyboard;
import static keyboard.Keyboard.*;

public class Keyboard_test {
	public static void main(String[] args) {
		//Variables menús
		boolean mainMenu = true, testMenu, rangeTestMenu, mayorMenorMenu, answerBoolean;
		int mainMenuOption, typeValue, limitValue, mayorMenorValue;
		//Variables para las pruebas
		byte compareByte, minByte, maxByte, numByte;
		short compareShort, minShort, maxShort, numShort;
		int compareInt, minInt, maxInt, numInt;
		long compareLong, minLong, maxLong, numLong;
		float compareFloat, minFloat, maxFloat, numFloat;
		double compareDouble, minDouble, maxDouble, numDouble;
		char c;
		String s, mssg, option1, option2;
		
		System.out.printf("%n-----PROGRAMA DE PRUEBAS DE LA CLASE TECLADO-----%n%n");
		
		while(mainMenu) {
			testMenu = true;
			//Se elige tipo de prueba a realizar
			mainMenuOption = printMainMenu();
			
			switch(mainMenuOption) {
			
			/*|||||||||||||||||||||||||||||||||||||
			 * PRUEBA PARA FUNCIÓN DE LEER CARÁCTER
			 * 
			 *||||||||||||||||||||||||||||||||||||*/
			case 1:
				while(testMenu) {
					System.out.println("Escribe un carácter");
					c = readChar();
					System.out.printf("El carácter es: %c%n%n", c);
					testMenu = readBoolean("¿Quieres seguir probando la lectura de carácteres?");
				}
				break;
				
			/*|||||||||||||||||||||||||||||||
			 * PRUEBA FUNCION DE LEER CADENA
			 * 
			 *||||||||||||||||||||||||||||||*/
			case 2:
				while(testMenu) {
					System.out.println("Escribe una cadena");
					cleanBuffer();
					s = readString();
					System.out.printf("La cadena es: %s%n%n", s);
					testMenu = readBoolean("¿Quieres seguir probando la lectura de cadenas?");
				}
				break;
			
			/*|||||||||||||||||||||||||||||||||||||||||||||||||||||||||
			 * PRUEBAS PARA FUNCIONES DE LEER UN NÚMERO CUALQUIERA
			 * 
			 * 1.BYTE
			 * 2.SHORT
			 * 3.INT
			 * 4.LONG
			 * 5.FLOAT
			 * 7.DOUBLE
			 * 
			 *|||||||||||||||||||||||||||||||||||||||||||||||||||||||*/				
			case 3:
				typeValue = printTypeMenu();
				switch(typeValue) {
				case 1:
					while(testMenu) {
						System.out.println("Escribe un número de tipo byte (-128 a 127): ");
						numByte = readByte();
						System.out.printf("El número byte que has elegido es: %d%n%n", numByte);
						testMenu = readBoolean("¿Quires seguir probando la lectura de números byte?");
					}
					break;
				case 2:
					while(testMenu) {
						System.out.println("Escribe un número de tipo short (-32768 a 32767): ");
						numShort = readShort();
						System.out.printf("El número short que has elegido es: %d%n%n", numShort);
						testMenu = readBoolean("¿Quires seguir probando la lectura de números short?");
					}
					break;
				case 3:
					while(testMenu) {
						System.out.println("Escribe un número de tipo int: ");
						numInt = readInt();
						System.out.printf("El número short que has elegido es: %d%n%n", numInt);
						testMenu = readBoolean("¿Quires seguir probando la lectura de números int?");
					}
					break;
				case 4:
					while(testMenu) {
						System.out.println("Escribe un número de tipo long: ");
						numLong = readLong();
						System.out.printf("El número short que has elegido es: %d%n%n", numLong);
						testMenu = readBoolean("¿Quires seguir probando la lectura de números long?");
					}
					break;
				case 5:
					while(testMenu) {
						System.out.println("Escribe un número de tipo float: ");
						numFloat = readFloat();
						System.out.printf("El número short que has elegido es: %.2f%n%n", numFloat);
						testMenu = readBoolean("¿Quires seguir probando la lectura de números float?");
					}
					break;
				case 6:
					while(testMenu) {
						System.out.println("Escribe un número de tipo short Double: ");
						numDouble = readDouble();
						System.out.printf("El número short que has elegido es: %.2f%n%n", numDouble);
						testMenu = readBoolean("¿Quires seguir probando la lectura de números double?");
					}
					break;
				}
				break;
				
			/*||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
			 * PRUEBAS PARA FUNCIONES DE LEER NÚMERO MAYOR/MENOR/IGUAL
			 * 
			 * 1.BYTE
			 * 2.SHORT
			 * 3.INT
			 * 4.LONG
			 * 5.FLOAT
			 * 6.DOUBLE
			 * 
			 *||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/
			case 4:
				typeValue = printTypeMenu();
				switch(typeValue) {
				
				//1.PRUEBA FUNCIÓN LEER NÚMERO MAYOR/MENOR/IGUAL BYTE
				case 1:
					while(testMenu) {
						mayorMenorMenu = true;
						//Introducir número con el que comparar
						System.out.println("Introduce un número byte para comparar:");
						compareByte = readByte();
						mayorMenorValue = menuMayorMenor();
						switch(mayorMenorValue) {
						//Mayor o igual
						case 1: 
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número mayor o igual que %d:%n", compareByte);
								numByte = readMayorMenor(compareByte, MayorMenor.MAYOR_IGUAL);
								System.out.printf("Has introducido el número %d%n", numByte);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números mayores o iguales a " + compareByte + " ?" );
							}
							break;
						//Menor o igual
						case 2:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número menor o igual que %d:%n", compareByte);
								numByte = readMayorMenor(compareByte, MayorMenor.MENOR_IGUAL);
								System.out.printf("Has introducido el número %d%n", numByte);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números menores o iguales a " + compareByte + " ?" );
							}
							break;
						//Mayor
						case 3:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número mayor que %d:%n", compareByte);
								numByte = readMayorMenor(compareByte, MayorMenor.MAYOR);
								System.out.printf("Has introducido el número %d%n", numByte);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números mayores a " + compareByte + " ?" );
							}
							break;
						//Menor
						case 4:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número menor que %d:%n", compareByte);
								numByte = readMayorMenor(compareByte, MayorMenor.MENOR);
								System.out.printf("Has introducido el número %d%n", numByte);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números menores a " + compareByte + " ?" );
							}
							break;
						}
						testMenu = readBoolean("¿Quires seguir probando la lectura de números mayor/menor/igual byte?");
					}
					break;
					
				//2.PRUEBA FUNCIÓN LEER NÚMERO MAYOR/MENOR/IGUAL SHORT
				case 2:
					while(testMenu) {
						mayorMenorMenu = true;
						//Introducir número con el que comparar
						System.out.println("Introduce un número byte para comparar:");
						compareShort = readShort();
						mayorMenorValue = menuMayorMenor();
						switch(mayorMenorValue) {
						//Mayor o igual
						case 1: 
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número mayor o igual que %d:%n", compareShort);
								numShort = readMayorMenor(compareShort, MayorMenor.MAYOR_IGUAL);
								System.out.printf("Has introducido el número %d%n", numShort);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números mayores o iguales a " + compareShort + " ?" );
							}
							break;
						//Menor o igual
						case 2:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número menor o igual que %d:%n", compareShort);
								numShort = readMayorMenor(compareShort, MayorMenor.MENOR_IGUAL);
								System.out.printf("Has introducido el número %d%n", numShort);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números menores o iguales a " + compareShort + " ?" );
							}
							break;
						//Mayor
						case 3:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número mayor que %d:%n", compareShort);
								numShort = readMayorMenor(compareShort, MayorMenor.MAYOR);
								System.out.printf("Has introducido el número %d%n", numShort);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo número mayores a " + compareShort + " ?" );
							}
							break;
						//Menor
						case 4:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número menor que %d:%n", compareShort);
								numShort = readMayorMenor(compareShort, MayorMenor.MENOR);
								System.out.printf("Has introducido el número %d%n", numShort);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números menores a " + compareShort + " ?" );
							}
							break;
						}
						testMenu = readBoolean("¿Quires seguir probando la lectura de números mayor/menor/igual short?");
					}
					break;
					
				//3.PRUEBA FUNCIÓN LEER NÚMERO MAYOR/MENOR/IGUAL INT
				case 3:
					while(testMenu) {
						mayorMenorMenu = true;
						//Introducir número con el que comparar
						System.out.println("Introduce un número byte para comparar:");
						compareInt = readInt();
						mayorMenorValue = menuMayorMenor();
						switch(mayorMenorValue) {
						//Mayor o igual
						case 1: 
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número mayor o igual que %d:%n", compareInt);
								numInt = readMayorMenor(compareInt, MayorMenor.MAYOR_IGUAL);
								System.out.printf("Has introducido el número %d%n", numInt);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números mayores o iguales a " + compareInt + " ?" );
							}
							break;
						//Menor o igual
						case 2:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número menor o igual que %d:%n", compareInt);
								numInt = readMayorMenor(compareInt, MayorMenor.MENOR_IGUAL);
								System.out.printf("Has introducido el número %d%n", numInt);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números menores o iguales a " + compareInt + " ?" );
							}
							break;
						//Mayor
						case 3:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número mayor que %d:%n", compareInt);
								numInt = readMayorMenor(compareInt, MayorMenor.MAYOR);
								System.out.printf("Has introducido el número %d%n", numInt);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números mayores a " + compareInt + " ?" );
							}
							break;
						//Menor
						case 4:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número menor que %d:%n", compareInt);
								numInt = readMayorMenor(compareInt, MayorMenor.MENOR);
								System.out.printf("Has introducido el número %d%n", numInt);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números menores a " + compareInt + " ?" );
							}
							break;
						}
						testMenu = readBoolean("¿Quires seguir probando la lectura de números mayor/menor/igual int?");
					}
					break;
					
				//4.PRUEBA FUNCIÓN LEER NÚMERO MAYOR/MENOR/IGUAL LONG
				case 4:
					while(testMenu) {
						mayorMenorMenu = true;
						//Introducir número con el que comparar
						System.out.println("Introduce un número byte para comparar:");
						compareLong = readLong();
						mayorMenorValue = menuMayorMenor();
						switch(mayorMenorValue) {
						//Mayor o igual
						case 1: 
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número mayor o igual que %d:%n", compareLong);
								numLong = readMayorMenor(compareLong, MayorMenor.MAYOR_IGUAL);
								System.out.printf("Has introducido el número %d%n", numLong);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números mayores o iguales a " + compareLong + " ?" );
							}
							break;
						//Menor o igual
						case 2:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número menor o igual que %d:%n", compareLong);
								numLong = readMayorMenor(compareLong, MayorMenor.MENOR_IGUAL);
								System.out.printf("Has introducido el número %d%n", numLong);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números menores o iguales a " + compareLong + " ?" );
							}
							break;
						//Mayor
						case 3:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número mayor que %d:%n", compareLong);
								numLong = readMayorMenor(compareLong, MayorMenor.MAYOR);
								System.out.printf("Has introducido el número %d%n", numLong);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números mayores a " + compareLong + " ?" );
							}
							break;
						//Menor
						case 4:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número menor que %d:%n", compareLong);
								numLong = readMayorMenor(compareLong, MayorMenor.MENOR);
								System.out.printf("Has introducido el número %d%n", numLong);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números menores a " + compareLong + " ?" );
							}
							break;
						}
						testMenu = readBoolean("¿Quires seguir probando la lectura de números mayor/menor/igual long?");
					}
					break;
					
				//5.PRUEBA FUNCIÓN LEER NÚMERO MAYOR/MENOR/IGUAL FLOAT
				case 5:
					while(testMenu) {
						mayorMenorMenu = true;
						//Introducir número con el que comparar
						System.out.println("Introduce un número byte para comparar:");
						compareFloat = readFloat();
						mayorMenorValue = menuMayorMenor();
						switch(mayorMenorValue) {
						//Mayor o igual
						case 1: 
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número mayor o igual que %.2f:%n", compareFloat);
								numFloat = readMayorMenor(compareFloat, MayorMenor.MAYOR_IGUAL);
								System.out.printf("Has introducido el número %.2f%n", numFloat);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números mayores o iguales a " + compareFloat + " ?" );
							}
							break;
						//Menor o igual
						case 2:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número menor o igual que %.2f:%n", compareFloat);
								numFloat = readMayorMenor(compareFloat, MayorMenor.MENOR_IGUAL);
								System.out.printf("Has introducido el número %.2f%n", numFloat);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números menores o iguales a " + compareFloat + " ?" );
							}
							break;
						//Mayor
						case 3:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número mayor que %.2f:%n", compareFloat);
								numFloat = readMayorMenor(compareFloat, MayorMenor.MAYOR);
								System.out.printf("Has introducido el número %.2f%n", numFloat);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números mayores a " + compareFloat + " ?" );
							}
							break;
						//Menor
						case 4:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número menor que %.2f:%n", compareFloat);
								numFloat = readMayorMenor(compareFloat, MayorMenor.MENOR);
								System.out.printf("Has introducido el número %.2f%n", numFloat);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números menores a " + compareFloat + " ?" );
							}
							break;
						}
						testMenu = readBoolean("¿Quires seguir probando la lectura de números mayor/menor/igual float?");
					}
					break;
				
				//6.PRUEBA FUNCIÓN LEER NÚMERO MAYOR/MENOR/IGUAL DOUBLE
				case 6:
					while(testMenu) {
						mayorMenorMenu = true;
						//Introducir número con el que comparar
						System.out.println("Introduce un número byte para comparar:");
						compareDouble = readDouble();
						mayorMenorValue = menuMayorMenor();
						switch(mayorMenorValue) {
						//Mayor o igual
						case 1: 
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número mayor o igual que %.2f:%n", compareDouble);
								numDouble = readMayorMenor(compareDouble, MayorMenor.MAYOR_IGUAL);
								System.out.printf("Has introducido el número %.2f%n", numDouble);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números mayores o iguales a " + compareDouble + " ?" );
							}
							break;
						//Menor o igual
						case 2:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número menor o igual que %.2f:%n", compareDouble);
								numDouble = readMayorMenor(compareDouble, MayorMenor.MENOR_IGUAL);
								System.out.printf("Has introducido el número %.2f%n", numDouble);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números menores o iguales a " + compareDouble + " ?" );
							}
							break;
						//Mayor
						case 3:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número mayor que %.2f:%n", compareDouble);
								numDouble = readMayorMenor(compareDouble, MayorMenor.MAYOR);
								System.out.printf("Has introducido el número %.2f%n", numDouble);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números mayores a " + compareDouble + " ?" );
							}
							break;
						//Menor
						case 4:
							while(mayorMenorMenu) {
								System.out.printf("Introduce un número menor que %.2f:%n", compareDouble);
								numDouble = readMayorMenor(compareDouble, MayorMenor.MENOR);
								System.out.printf("Has introducido el número %.2f%n", numDouble);
								mayorMenorMenu = readBoolean("¿Quieres seguir leyendo números menores a " + compareDouble + " ?" );
							}
							break;
						}
						testMenu = readBoolean("¿Quires seguir probando la lectura de números mayor/menor/igual double?");
					}
					break;
				}
				break;
				
			/*||||||||||||||||||||||||||||||||||||||||||
			 * PRUEBAS FUNCIONES LEER NÚMERO EN UN RANGO
			 * 
			 * 1.BYTE
			 * 2.SHORT
			 * 3.INT
			 * 4.LONG
			 * 5.FLOAT
			 * 6.DOUBLE
			 * 
			 *|||||||||||||||||||||||||||||||||||||||||*/				
			case 5:
				//Se elige el tipo de dato para usar.
				typeValue = printTypeMenu();
				switch(typeValue) {
				
				//1.PRUBA FUNCION LEER NÚMERO EN UN RANGO (BYTE)
				case 1:
					while(testMenu) {
						rangeTestMenu = true;
						//Introducir el rango
						System.out.printf("Elige un rango de números:%nEscribe el valor mínimo del rango: ");
						minByte = readByte();
						System.out.printf("%nEscribe un valor máximo del rango: ");
						maxByte = readByte();
						
						//Selecciona el tipo de límite
						limitValue = menuLimit();
						switch(limitValue) {
						//Valores mínimo y máximo incluidos
						case 1:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numByte = readNumberInRange(minByte, maxByte, Limit.MAX_MIN_INCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numByte);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valores mínimo y máximo excluidos
						case 2:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numByte = readNumberInRange(minByte, maxByte, Limit.MAX_MIN_EXCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numByte);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valor mínimo incluido y máximo excluido
						case 3:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numByte = readNumberInRange(minByte, maxByte, Limit.MIN_INCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numByte);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valor máximo incluido y mínimo excluido
						case 4:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numByte = readNumberInRange(minByte, maxByte, Limit.MAX_INCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numByte);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						}
						testMenu = readBoolean("¿Quires seguir probando la lectura de números byte?");
					}
					break;
					
				//2.PRUEBA FUNCION LEER NÚMERO EN UN RANGO (SHORT)||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
				case 2:
					while(testMenu) {
						rangeTestMenu = true;
						//Introducir el rango
						System.out.printf("Elige un rango de números:%nEscribe el valor mínimo del rango: ");
						minShort = readShort();
						System.out.printf("%nEscribe un valor máximo del rango: ");
						maxShort = readShort();
						
						//Selecciona el tipo de límite
						limitValue = menuLimit();
						switch(limitValue) {
						//Valores mínimo y máximo incluidos
						case 1:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numShort = readNumberInRange(minShort, maxShort, Limit.MAX_MIN_INCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numShort);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valores mínimo y máximo excluidos
						case 2:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numShort = readNumberInRange(minShort, maxShort, Limit.MAX_MIN_EXCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numShort);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valor mínimo incluido y máximo excluido
						case 3:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numShort = readNumberInRange(minShort, maxShort, Limit.MIN_INCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numShort);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valor máximo incluido y mínimo excluido
						case 4:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numShort = readNumberInRange(minShort, maxShort, Limit.MAX_INCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numShort);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						}
						
						testMenu = readBoolean("¿Quires seguir probando la lectura de números short?");
					}
					break;
					
				//3.PRUEBA FUNCIÓN LEER NÚMERO EN UN RANGO (INT)||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
				case 3:
					while(testMenu) {
						rangeTestMenu = true;
						//Introducir el rango
						System.out.printf("Elige un rango de números:%nEscribe el valor mínimo del rango: ");
						minInt = readInt();
						System.out.printf("%nEscribe un valor máximo del rango: ");
						maxInt = readInt();
						
						//Selecciona el tipo de límite
						limitValue = menuLimit();
						switch(limitValue) {
						//Valores mínimo y máximo incluidos
						case 1:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numInt = readNumberInRange(minInt, maxInt, Limit.MAX_MIN_INCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numInt);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valores mínimo y máximo excluidos
						case 2:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numInt = readNumberInRange(minInt, maxInt, Limit.MAX_MIN_EXCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numInt);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valor mínimo incluido y máximo excluido
						case 3:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numInt = readNumberInRange(minInt, maxInt, Limit.MIN_INCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numInt);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valor máximo incluido y mínimo excluido
						case 4:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numInt = readNumberInRange(minInt, maxInt, Limit.MAX_INCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numInt);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						}
						
						testMenu = readBoolean("¿Quires seguir probando la lectura de números int?");
					}
					break;
				
				//4.PRUEBA FUNCIÓN LEER NÚMERO EN UN RANGO (LONG)|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
				case 4:
					while(testMenu) {
						rangeTestMenu = true;
						//Introducir el rango
						System.out.printf("Elige un rango de números:%nEscribe el valor mínimo del rango: ");
						minLong = readLong();
						System.out.printf("%nEscribe un valor máximo del rango: ");
						maxLong = readLong();
						
						//Selecciona el tipo de límite
						limitValue = menuLimit();
						switch(limitValue) {
						//Valores mínimo y máximo incluidos
						case 1:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numLong = readNumberInRange(minLong, maxLong, Limit.MAX_MIN_INCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numLong);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valores mínimo y máximo excluidos
						case 2:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numLong = readNumberInRange(minLong, maxLong, Limit.MAX_MIN_EXCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numLong);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valor mínimo incluido y máximo excluido
						case 3:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numLong = readNumberInRange(minLong, maxLong, Limit.MIN_INCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numLong);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valor máximo incluido y mínimo excluido
						case 4:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numLong = readNumberInRange(minLong, maxLong, Limit.MAX_INCLUDED);
								System.out.printf("Has escrito el número: %d%n%n", numLong);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						}
						
						testMenu = readBoolean("¿Quires seguir probando la lectura de números long?");
					}
					break;
				
				//5.PRUEBA FUNCIÓN LEER NÚMERO EN UN RANGO (FLOAT)||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
				case 5:
					while(testMenu) {
						rangeTestMenu = true;
						//Introducir el rango
						System.out.printf("Elige un rango de números:%nEscribe el valor mínimo del rango: ");
						minFloat = readFloat();
						System.out.printf("%nEscribe un valor máximo del rango: ");
						maxFloat = readFloat();
						
						//Selecciona el tipo de límite
						limitValue = menuLimit();
						switch(limitValue) {
						//Valores mínimo y máximo incluidos
						case 1:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numFloat = readNumberInRange(minFloat, maxFloat, Limit.MAX_MIN_INCLUDED);
								System.out.printf("Has escrito el número: %.2f%n%n", numFloat);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valores mínimo y máximo excluidos
						case 2:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numFloat = readNumberInRange(minFloat, maxFloat, Limit.MAX_MIN_EXCLUDED);
								System.out.printf("Has escrito el número: %.2f%n%n", numFloat);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valor mínimo incluido y máximo excluido
						case 3:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numFloat = readNumberInRange(minFloat, maxFloat, Limit.MIN_INCLUDED);
								System.out.printf("Has escrito el número: %.2f%n%n", numFloat);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valor máximo incluido y mínimo excluido
						case 4:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numFloat = readNumberInRange(minFloat, maxFloat, Limit.MAX_INCLUDED);
								System.out.printf("Has escrito el número: %.2f%n%n", numFloat);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						}
						
						testMenu = readBoolean("¿Quires seguir probando la lectura de números float?");
					}
					break;
					
				//6.PRUEBA FUNCIÓN LEER NÚMERO EN UN RANGO (DOUBLE)|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
				case 6:
					while(testMenu) {
						rangeTestMenu = true;
						//Introducir rango
						System.out.printf("Elige un rango de números:%nEscribe el valor mínimo del rango: ");
						minDouble = readDouble();
						System.out.printf("%nEscribe un valor máximo del rango: ");
						maxDouble = readDouble();
						
						//Selecciona el tipo de límite
						limitValue = menuLimit();
						switch(limitValue) {
						//Valores mínimo y máximo incluidos
						case 1:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numDouble = readNumberInRange(minDouble, maxDouble, Limit.MAX_MIN_INCLUDED);
								System.out.printf("Has escrito el número: %.2f%n%n", numDouble);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valores mínimo y máximo excluidos
						case 2:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numDouble = readNumberInRange(minDouble, maxDouble, Limit.MAX_MIN_EXCLUDED);
								System.out.printf("Has escrito el número: %.2f%n%n", numDouble);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valor mínimo incluido y máximo excluido
						case 3:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numDouble = readNumberInRange(minDouble, maxDouble, Limit.MIN_INCLUDED);
								System.out.printf("Has escrito el número: %.2f%n%n", numDouble);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						//Valor máximo incluido y mínimo excluido
						case 4:
							while(rangeTestMenu) {
								System.out.println("Escribe un número dentro del rango: ");
								numDouble = readNumberInRange(minDouble, maxDouble, Limit.MAX_INCLUDED);
								System.out.printf("Has escrito el número: %.2f%n%n", numDouble);
								rangeTestMenu = readBoolean("¿Quires seguir probando la lectura de números byte en este rango?");
								break;
							}
							break;
						}
						
						testMenu = readBoolean("¿Quires seguir probando la lectura de números double?");
					}
					break;
				}
				break;
			case 6:
				while(testMenu) {
					//Se escribe el menu
					System.out.println("Introduce el mensaje del menu");
					cleanBuffer();
					mssg = readString();
					System.out.println("Introduce la primera opción del menu");
					option1 = readString();
					System.out.println("Introduce la segunda opción del menú");
					option2 = readString();
					//Se prueba el menu
					System.out.printf("---MENU LEER BOOLEANO---%n");
					answerBoolean = readBoolean(mssg, option1, option2);
					System.out.println(answerBoolean);
					testMenu = readBoolean("¿Quieres seguir probando la lectura de booleanos por menú?");
				}
				
				break;
			case 7:
				mainMenu = !readBoolean("¿Seguro que quieres salir?");
				if(mainMenu == false) {
					System.out.println("----- HAS SALIDO DEL PROGRAMA -----");
				}
				break;
			}		
			
		}
		
		closeKeyboard();
	}
	
	//FUNCIÓN PARA IMPRIMIR EL MENÚ PRINCIPAL 
	public static int printMainMenu() {
		int x;
		
		System.out.printf("||||||||||||||||||||||||||||||||%n"
						 +"||-------MENU PRINCIPAL-------||%n"
						 +"||----------------------------||%n"
						 +"||1.Leer carácter             ||%n"
				 		 +"||2.Leer cadena               ||%n"
				 		 +"||3.Leer número               ||%n"
				 		 +"||4.Leer número mayor o menor ||%n"
				 		 +"||5.Leer número en un rango   ||%n"
				 		 +"||6.Leer booleano en menu     ||%n"
				 		 +"||7.Salir del programa        ||%n"
				 		 +"||||||||||||||||||||||||||||||||%n%n");
		
		System.out.println("Introduce una opción del menu: ");
		x = readNumberInRange(1, 7, Limit.MAX_MIN_INCLUDED);
		
		return x;
	}
	
	//FUNCIÓN PARA IMPRIMIR EL MENÚ PARA ELEGIR TIPO DE DATO
	public static int printTypeMenu() {
		int x;
		
		System.out.printf("||||||||||||||||||||||||||||||||%n"
						 +"||--------TIPO DE DATO--------||%n"
						 +"||----------------------------||%n"
						 +"||1.Byte                      ||%n"	
						 +"||2.Short                     ||%n"
						 +"||3.Int                       ||%n"
						 +"||4.Long                      ||%n"
						 +"||5.Float                     ||%n"
						 +"||6.Double                    ||%n"
						 +"||||||||||||||||||||||||||||||||%n%n");
		
		System.out.println("Elige el tipo de dato con el que quieres hacer la prueba: ");
		x = readNumberInRange(1, 6, Limit.MAX_MIN_INCLUDED);
		
		return x;
	}
	
	//FUNCIÓN PARA ELEGIR VALOR DEL ENUM MAYORMENOR
	public static int menuMayorMenor() {
		int x;
		
		System.out.printf("||||||||||||||||||||||||||||||||%n"
				 	 	 +"||--------MAYOR  MENOR--------||%n"
				 	 	 +"||----------------------------||%n"
				 	 	 +"||1.Mayor o igual             ||%n"	
				 	 	 +"||2.Menor o igual             ||%n"
				 	 	 +"||3.Mayor                     ||%n"
				 	 	 +"||4.Menor                     ||%n"
				 	 	 +"||||||||||||||||||||||||||||||||%n%n");
		
		x = readNumberInRange(1, 4, Limit.MAX_MIN_INCLUDED);
		
		return x;
	}
	
	//FUNCIÓN PARA ELEGIR EL VALOR DEL ENUM LIMIT
	public static int menuLimit() {
		int x;
		
		System.out.printf("||||||||||||||||||||||||||||||||%n"
				 		 +"||--------LIMITE RANGO--------||%n"
				 		 +"||----------------------------||%n"
				 		 +"||1.Mínimo y máximo incluidos ||%n"	
				 		 +"||2.Mínimo y máximo excluidos ||%n"
				 		 +"||3.Mínimo incluido           ||%n"
				 		 +"||4.Máximo inlcuido           ||%n"
				 		 +"||||||||||||||||||||||||||||||||%n%n");
		
		x = readNumberInRange(1, 4, Limit.MAX_MIN_INCLUDED);
		
		return x;
	}
}
