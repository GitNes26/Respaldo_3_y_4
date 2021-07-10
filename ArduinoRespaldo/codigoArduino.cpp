// PRACTICA 1 → SEMAFORO -------------------------------------------------------------

// int counter;

// void setup()
// {
//   pinMode(10, OUTPUT); // Led Verde
//   pinMode(11, OUTPUT); // Led Amarillo
//   pinMode(12, OUTPUT); // Led Rojo
// }

// void loop()
// {
//   // Semáforo en Verde  
//   digitalWrite(10, HIGH);
//   delay(4000); // Wait for 4000 millisecond(s)
//   for (counter = 0; counter < 4; ++counter) {
//     digitalWrite(10, LOW);
//     delay(300); // Wait for 300 millisecond(s)
//     digitalWrite(10, HIGH);
//     delay(300); // Wait for 300 millisecond(s)
//   }
//   digitalWrite(10, HIGH);
//   delay(500); // Wait for 500 millisecond(s)
//   digitalWrite(10, LOW);

//   // Semáforo en Amarillo
//   delay(0); // Wait for 0 millisecond(s)
//   digitalWrite(11, HIGH);
//   delay(3000); // Wait for 3000 millisecond(s)
//   digitalWrite(11, LOW);
//   delay(0); // Wait for 0 millisecond(s)

//   // Semáforo en Rojo
//   digitalWrite(12, HIGH);
//   delay(6000); // Wait for 6000 millisecond(s)
//   digitalWrite(12, LOW);
//   delay(0); // Wait for 0 millisecond(s)
// }


// PRACTICA 2 → PALABRA EN CLAVE MORSE ------------------------------------------------

// void setup()
// {
//   pinMode(2, OUTPUT);  
// }

// void loop()
// { 
//   int p=40;
  
//   // N
//   digitalWrite(2, HIGH);
//   delay(p*3); // Wait for 120 millisecond(s) LINEA
//   digitalWrite(2, LOW);
//   delay(p); // Wait for 40 millisecond(s) EspacioSigno
//   digitalWrite(2, HIGH);
//   delay(p); // Wait for 40 millisecond(s) PUNTO
  
//   digitalWrite(2, LOW);
//   delay(p*3); // Wait for 120 millisecond(s) EspacioLetra
  
//   // E
//   digitalWrite(2, HIGH);
//   delay(p); // Wait for 40 millisecond(s) PUNTO
  
//   digitalWrite(2, LOW);
//   delay(p*3); // Wait for 120 millisecond(s) EspacioLetra
  
//   // S
//   digitalWrite(2, HIGH);
//   delay(p); // Wait for 40 millisecond(s) PUNTO
//   digitalWrite(2, LOW);
//   delay(p); // Wait for 40 millisecond(s) EspacioSigno
//   digitalWrite(2, HIGH);
//   delay(p); // Wait for 40 millisecond(s) PUNTO
//   digitalWrite(2, LOW);
//   delay(p); // Wait for 40 millisecond(s) EspacioSigno
//   digitalWrite(2, HIGH);
//   delay(p); // Wait for 40 millisecond(s) PUNTO
  
//   digitalWrite(2, LOW);
//   delay(p*3); // Wait for 120 millisecond(s) EspacioLetra
  
//   // T
//   digitalWrite(2, HIGH);
//   delay(p*3); // Wait for 120 millisecond(s) LINEA
  
//   digitalWrite(2, LOW);
//   delay(p); // Wait for 40 millisecond(s) EspacioLetra
  
//   // O
//   digitalWrite(2, HIGH);
//   delay(p*3); // Wait for 120 millisecond(s) LINEA
//   digitalWrite(2, LOW);
//   delay(p); // Wait for 40 millisecond(s) EspacioSigno
//   digitalWrite(2, HIGH);
//   delay(p*3); // Wait for 120 millisecond(s) LINEA
//   digitalWrite(2, LOW);
//   delay(p); // Wait for 40 millisecond(s) EspacioSigno
//   digitalWrite(2, HIGH);
//   delay(p*3); // Wait for 120 millisecond(s) LINEA
  
//   digitalWrite(2, LOW);
//   delay(p); // Wait for 40 millisecond(s) EspacioSigno
  
//   // R
//   digitalWrite(2, HIGH);
//   delay(p); // Wait for 40 millisecond(s) PUNTO
//   digitalWrite(2, LOW);
//   delay(p); // Wait for 40 millisecond(s) EspacioSigno
//   digitalWrite(2, HIGH);
//   delay(p*3); // Wait for 120 millisecond(s) LINEA
//   digitalWrite(2, LOW);
//   delay(p); // Wait for 40 millisecond(s) EspacioSigno
//   digitalWrite(2, HIGH);
//   delay(p); // Wait for 40 millisecond(s) PUNTO
  
//   // TERMINO DE PALABRA
//   digitalWrite(2, LOW);
//   delay(p*5); // Wait for 40 millisecond(s) FIN DE LA PALABRA
// }


// PRACTICA 3 → PALABRA EN CLAVE MORSE DESDE EL MONITOR SERIAL -----------------------------------------

