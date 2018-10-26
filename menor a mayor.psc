Proceso   ordenar "mayor a menor";
	definir num1,num2,num3 como entero;
	escribir "introduce 3 numero"
	leer num1;leer num2;leer num3;
	si num1<num2 y num1<num3 entonces
		escribir num1;
		si num2<num3
			escribir num2;
			escribir num3;
		Sino
			escribir num3;
			escribir num2;
		fin si
	sino
		si num2<num1 y num2<num3 Entonces
			escribir num2;
			si num1<num3 Entonces
				escribir num1
				escribir num3
			Sino
				escribir num3
				escribir num1
			fin si 
		Sino
			escribir num3;
			si num1<num2 Entonces
				escribir num1;
				escribir num2;
			Sino
				escribir num2;
				escribir num1;
			FinSi
			
			
		FinSi
	FinSi
	
	
	
FinProceso
