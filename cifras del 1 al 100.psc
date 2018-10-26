Proceso valor "cifras"
	definir num1 Como Entero
	escribir "tu valor numerico del 1 al 1000";
	leer num1;
	si num1<10 Entonces
		escribir "su valor tiene solo  una cifra";
	Sino
		si num1>=10 y num1<99 Entonces
			escribir "su valor tiene dos cifras";
		sino
			si num1>=100 y num1<999 Entonces
				escribir "su valor tiene tres cifras";
				sino
				si num1>=1000 y num1<9999 Entonces
					escribir "su valor tiene cuatro cifras";
					sino
					
				FinSi
	
			FinSi
		FinSi
		
	FinSi
	
FinProceso
