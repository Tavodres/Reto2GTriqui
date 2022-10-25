import java.util.Scanner;

public class RetoTriki
{

	public static void main(String args [])
	{
	
	
	Scanner In = new Scanner(System.in);/*Variable de Captura */
	String Jugador1 = "", Jugador2 = "";/* Variables almacenar nombres de Jugadores */
	char Tablero [] [] = new char [3] [3], Casillas = '1', Aux = '0',SimboloJ1 = '0', SimboloJ2 ='0', Salida = '0' ; /*Matriz donde se van a almacenar los valores*/
	int C = 0, Opcion=0, Turno=0, Cambio = 0, W1=0, W2=0,We=0 ; /*Variable para el bucle de captura del simbolo correcto*/ 

	/*Despliega los datos en la pantalla Marco y titulos*/
	System.out.println("************************************************************************************************************");
	System.out.println("*                                   Bienvenidos al Juego Triki                                             *"); 
	System.out.println("************************************************************************************************************");
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");/*Salto de linea*/
	System.out.println("Presione Enter para Continuar");
	In.nextLine(); /*captura de datos desde el teclado*/
		
	System.out.println("Por favor ingrese el nombre de los Jugadores");
	System.out.println("Nombre Jugador 1:");
        Jugador1 = In.nextLine();/*Captura del nombre de jugador 1*/
        System.out.println("\n\n\n\n");/*Salto de linea*/


	do{/*Captura del Simbolo*/
	
	/*Asignacion del simbolo del Jugador 2 se realiza de manera automatica Solo el Jugador 1 puede seleccionar el simbolo*/	

	System.out.println("Seleccione el Simbolo a Utilizar O o X:");
        SimboloJ1 = In.next().charAt(0);/*Captura el simbolo del Jugador*/
		if (SimboloJ1 == 'O')
		{
			SimboloJ2 = 'X';
			C=1;	
		}
  		else
		{
			if (SimboloJ1 =='X')
			{
				SimboloJ2 = 'O';
				C=1;
			}		
			else
			{
				System.out.println("Valor no permitido Simbolo a Utilizar O o X :");
			}		
		}

	}while(C==0); /*La variable C se usa paa controlar el bucle la comparacion con el operador || no funciono*/
	
	System.out.println("\n\n");/*Salto de linea*/
	System.out.println("Nombre Jugador 2:");
        Jugador2 = In.nextLine();/*Para controlar el enter*/
	Jugador2 = In.nextLine();
        System.out.println("\n\n");/*Salto de linea*/

	/* Inicializar tablero Se uan los numeros del 1 al 9 para realiazr la seleccion con un solo boton ya que si se hace por coordenadas X y Y se aumenta el numero de variables a ingresar*/

	
	for(int i=0; i<3; i++)
	{	
		for(int j=0; j<3; j++)
		{
		   Tablero[i][j] = Casillas++;
		}/*Fin If*/
	}/*Fin For Inicializar Tablero*/


	/* Mostrar en Pantalla el tablero con sus respectivas opciones -- Se ajusta para que no muestre marcos adicionales*/

	

	for(int i=0; i<3; i++)
	{	
		for(int j=0; j<3; j++)
		{
		   	if(j<2)
			{
				System.out.print(" "+Tablero[i][j]+" |");/*Se pone la condicion para evitar la linea adicional*/
			} /*Fin de if */
			else
			{
				System.out.println(" "+Tablero[i][j]+" ");/*para este caso si se salta linea*/
			}/*Fin de else*/
		} /*Fin for desplazamiento J*/
          
		if(i<2)
		{
	 		System.out.println("__________ ");
		}/*Fin if*/
		else
		{
			System.out.println(" ");
		}/*Fin Else*/
	}/*Fin for mostrar en pantalla*/



/*********************************************************************************************************************/

C=0;
Cambio=0;
int Restante=0;
do{/*Captura de la opcion*/


	/*Determinar de quien es el turno*/
	if(Cambio == 0 )
	{
		System.out.println("Es el turno del jugador:"+Jugador1);
                if(Cambio==0)
		{
		 	Aux=SimboloJ1;		
		}
		else
		{
			if(Cambio==1)
			{
				Aux=SimboloJ2;		
			}
		}
		
	}
	else
	{
		if(Cambio == 1 )
		{
			System.out.println("Es el turno del jugador:"+Jugador2);
		        if(Cambio==0)
			{
		 		Aux=SimboloJ1;		
			}
			else
			{
				if(Cambio==1)
				{
				Aux=SimboloJ2;		
				}
			}
		}
		
	}
	
	

	/*Final determinar turno*/

	/*Capturar la casilla donde se tiene que poner el valor*/	

	System.out.println("Seleccione una opcion entre 1 y 9:");
        Opcion= In.nextInt();/*Captura el simbolo del Jugador*/

	if(Opcion == 1)
	{
		if(Tablero[0][0] == 'X' || Tablero[0][0] == 'O')
		{
			System.out.println("Esta opcion no esta disponible. Por favor seleccione otra.");
		}	
		else
		{
			Tablero[0][0] = Aux;

			if(Cambio==0)
			{
				Cambio = 1;
				Restante++;
			}
			else
			{
			 	Cambio=0;
				Restante++;
			}
		
		}
	}
	else
	{
	
		if(Opcion == 2)
		{
			if(Tablero[0][1] == 'X' || Tablero[0][1] == 'O')
			{
			
				System.out.println("Esta opcion no esta disponible. Por favor seleccione otra.");
			}	
			else
			{

				Tablero[0][1] = Aux;
				if(Cambio==0)
				{
					Cambio = 1;
					Restante++;
				}
				else
				{
			 		Cambio=0;
					Restante++;
				}
	
			}
		}
		else
		{
		
				if(Opcion == 3)
				{
					if(Tablero[0][2] == 'X' || Tablero[0][2] == 'O')
					{
						
						System.out.println("Esta opcion no esta disponible. Por favor seleccione otra.");
					}	
					else
					{

						Tablero[0][2] = Aux;
						if(Cambio==0)
						{
							Cambio = 1;
							Restante++;
						}
						else
						{
			 				Cambio=0;
							Restante++;
						}
					}
				}
				else
				{
		
						if(Opcion == 4)
						{
							if(Tablero[1][0] == 'X' || Tablero[1][0] == 'O')
							{
								
								System.out.println("Esta opcion no esta disponible. Por favor seleccione otra.");
							}	
							else
							{

								Tablero[1][0] = Aux;
								if(Cambio==0)
								{
									Cambio = 1;
									Restante++;	
								}
								else
								{
			 						Cambio=0;
									Restante++;
								}
									
							}
						}
						else
						{
								if(Opcion == 5)
								{
									if(Tablero[1][1] == 'X' || Tablero[1][1] == 'O')
									{
										
										System.out.println("Esta opcion no esta disponible. Por favor seleccione otra.");
									}	
									else
									{

										Tablero[1][1] = Aux;
										if(Cambio==0)
										{
											Cambio = 1;
											Restante++;	
										}
										else
										{
			 								Cambio=0;
											Restante++;
										}
									}
										
								}
								else
								{
										if(Opcion == 6)
										{
											if(Tablero[1][2] == 'X' || Tablero[1][2] == 'O')
											{
												
												System.out.println("Esta opcion no esta disponible. Por favor seleccione otra.");
											}	
											else
											{

												Tablero[1][2] = Aux;
												if(Cambio==0)
												{
													Cambio = 1;
													Restante++;	
												}
												else
												{
			 										Cambio=0;
													Restante++;
												}
												
											}
										}
										else
										{
		
												if(Opcion == 7)
												{
													if(Tablero[2][0] == 'X' || Tablero[2][0] == 'O')
													{
															
														System.out.println("Esta opcion no esta disponible. Por favor seleccione otra.");
													}	
													else
													{
														
														Tablero[2][0] = Aux;
														if(Cambio==0)
														{
															Cambio = 1;
															Restante++;
														}
														else
														{
			 												Cambio=0;
															Restante++;
														}	
													}
														
												}
												else
												{
		
														if(Opcion == 8)
														{
															if(Tablero[2][1] == 'X' || Tablero[2][1] == 'O')
															{
																
																System.out.println("Esta opcion no esta disponible. Por favor seleccione otra.");
															}	
															else
															{

																Tablero[2][1] = Aux;
																if(Cambio==0)
																{
																	Cambio = 1;
																	Restante++;	
																}	
																else
																{
			 														Cambio=0;
																	Restante++;
																}
																
															}
														}
														else
														{

																if(Opcion == 9)
																{
																	if(Tablero[2][2] == 'X' || Tablero[2][2] == 'O')
																	{
																		
																		System.out.println("Esta opcion no esta disponible. Por favor seleccione otra.");
																	}	
																	else
																	{
																	
																		Tablero[2][2] = Aux;
																		if(Cambio==0)
																		{
																			Cambio = 1;
																			Restante++;
																		}
																		else
																		{
																		 	Cambio=0;
																			Restante++;
																		}
																		
																	}		
																		
																}
																else
																{
																	System.out.println("La opcion no es valida, por favor ingrese un numero del 1 al 9.");
																													

																}/*else opcion 9*/

														}/*else opcion 8*/

				
												}/*else opcion 7*/

				
										}/*else opcion 6*/
		
				
								}/*else opcion 5*/
				
						}/*else opcion 4*/
					
				}/*else opcion 3*/
			
		}/*else opcion 2*/

	} /*else opcion 1*/


/*Determinar Quien es el Ganador*/
int R=0;


	if(Tablero [0][0]==Tablero [0][1] && Tablero [0][1] == Tablero [0][2])
	{
		R=1;
	}
	else
	{
		if(Tablero [1][0]==Tablero [1][1] && Tablero [1][1] == Tablero [1][2])
		{
			R=1;
		}
		else
		{
			if(Tablero [2][0]==Tablero [2][1] && Tablero [2][1] == Tablero [2][2])
			{
				R=1;
			}
			else
			{
				if(Tablero [0][0]==Tablero [1][0] && Tablero [1][0] == Tablero [2][0])
				{
					R=1;
				}
				else
				{
					if(Tablero [0][1]==Tablero [1][1] && Tablero [1][1] == Tablero [2][1])
					{
						R=1;
					}
					else
					{
						if(Tablero [0][2]==Tablero [1][2] && Tablero [1][2] == Tablero [2][2])
						{
							R=1;
						}
						else
						{
							if(Tablero [0][0]==Tablero [1][1] && Tablero [1][1] == Tablero [2][2])
							{
								R=1;
							}
							else
							{	
								if(Tablero [0][2]==Tablero [1][1] && Tablero [1][1] == Tablero [2][0])
								{
									R=1;
								}
								else
								{
									if(Restante==9)
									{
											R=2;
											
									}
									
								}
							}
						}
					}
				}
			}
		}
	}



if(R==1)
{
		if(Aux==SimboloJ1)
		{
		        System.out.println("\n\n\n\n");/*Salto de linea*/
			System.out.println("El ganador es :"+ Jugador1);
                        W1++;
			
		}
		else
		{
		        System.out.println("\n\n\n\n");/*Salto de linea*/				 
			System.out.println("El ganador es :"+ Jugador2);
			 W2++;
		
		}
}



if(R==2)
{
	        System.out.println("\n\n\n\n");/*Salto de linea*/
		System.out.println("Se ha presentado un Empate");
		We++;
}




/* Mostrar en Pantalla el tablero con sus respectivas opciones -- Se ajusta para que no muestre marcos adicionales*/

	
        System.out.println("\n\n");/*Salto de linea*/
	for(int i=0; i<3; i++)
	{	
		for(int j=0; j<3; j++)
		{
		   	if(j<2)
			{
				System.out.print(" "+Tablero[i][j]+" |");/*Se pone la condicion para evitar la linea adicional*/
			} /*Fin de if */
			else
			{
				System.out.println(" "+Tablero[i][j]+" ");/*para este caso si se salta linea*/
			}/*Fin de else*/
		} /*Fin for desplazamiento J*/
          
		if(i<2)
		{
	 		System.out.println("__________ ");
		}/*Fin if*/
		else
		{
			System.out.println(" ");
		}/*Fin Else*/
	}/*Fin for mostrar en pantalla*/



/*Continuar Jugando*/

if(R==1 || Restante==9)
{
			System.out.println("El Juego ha terminado. \n Si desea Continuar ingrese el valor S de lo contrario ingrese el valor N");
			In.nextLine();
			Salida = In.next().charAt(0);/*Captura el simbolo del Jugador*/
			
		

		if(Salida=='N'||Salida=='n')
 		{
		
			 System.out.println("\n\n\n");/*Salto de linea*/
			C=1;
			System.out.println("Muchas Gracias por usar nuestro Juego ");
			System.out.println("Los resultados de la sesion son los siguientes ");
			System.out.println("Jugador  "+Jugador1+":"+W1+"   Jugador "+Jugador2+":"+W2+"    Empate"+We);
		}
		else
		{
		     /* Inicializar tablero Se uan los numeros del 1 al 9 para realiazr la seleccion con un solo boton ya que si se hace por coordenadas X y Y se aumenta el numero de variables a ingresar*/

			Casillas='1';	
			for(int i=0; i<3; i++)
			{	
				for(int j=0; j<3; j++)
				{
		   			Tablero[i][j] = Casillas++;
				}/*Fin If*/
			}/*Fin For Inicializar Tablero*/

			R=0;
			Restante=0;
		}
}



}while(C==0 ); /*La variable C se usa paa controlar el bucle la comparacion con el operador || no funciono*/



/*CAptura del valor */



	System.out.println("\n\n");/*Salto de linea*/
	System.out.println("Presione Enter para Continuar");


	System.out.println("Es el turno del jugador:"+SimboloJ1);



	
	}/*Cierre del main*/

}/* Cierre de la Clase */