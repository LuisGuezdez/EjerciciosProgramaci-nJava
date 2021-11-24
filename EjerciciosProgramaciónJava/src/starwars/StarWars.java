/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwarscodigos;

import java.util.Scanner;

/**
 *
 * @author rodfe
 */
public class StarWars 
{
    public static void main(String[] args) 
    {
     Scanner leer = new Scanner(System.in);
        //INTRO//
        System.out.println("=== STAR WARS: CÓDIGOS SECRETOS ===\n");
        System.out.println("Hace mucho tiempo, en una galaxia muy muy lejana..."
                + " La Princesa\nLeia, Luke Skywalker, Han Solo, Chewbacca,"
                + " C3PO y R2D2 viajan\nen una nave imperial robada en una "
                + "misión secreta para infiltrarse\nen otra estrella de la "
                + "muerte que el Imperio está construyendo\npara destruirla."
                + " (Presiona Intro para continuar)");

        String intro = leer.nextLine();
        System.out.println(intro);
        
        //BOOLEAN QUE SE USARÁ PARA INCREMENTAR EL SWITCH (NIVEL), EN CASO FALSO SALDRÁ DEL FOR Y DEL SWITCH//
        boolean respCor = true; 
        
        //FOR PARA INCREMENTAR CADA NIVEL EN EL SWITCH SI LA RESPUESTA ES CORRECTA//
        for (int lvl = 1; lvl <= 5; lvl++) {
            
            //EN CADA NIVEL SE CREARÁN VARIABLES QUE SE USARÁN EN ESE NIVEL//
            switch (lvl) {
                //NIVEL1//
                case 1:
                    int s1 = (int) (1 + Math.random() * 10);
                    int s2 = (int) (20 + Math.random() * (30 - 20 + 1));
                    int suma = 0;

                    System.out.println("===NIVEL 1===");
                    System.out.println("Los problemas empiezan cuando deben realizar un "
                        + "salto\nhiperespacial hasta el sistema estelar " + s1 + " en "
                        + "el sector " + s2 + ", pero el\ncontrol de navegación está "
                        + "estropeado y el computador tiene\nproblemas para calcular"
                        + " parte de las coordenadas de salto.\nChewbacca, piloto "
                        + "experto, se da cuenta de que falta el cuarto\nnúmero de "
                        + "la serie. Recuerda de sus tiempos en la academia de\npilotos"
                        + " que para calcularlo hay que hacer el sumatorio entre el"
                        + "\nnº de sistema y el nº del sector (ambos inclusive). ¿Qué "
                        + "debe introducir?");

                    
                    //OPERACIÓN//
                    for (int i = s1; i <= s2; i++) {
                        suma += i;
                    }
                    
                    //VARIABLE PARA GUARDAR LAS RESPUESTAS//
                    int resp = leer.nextInt();
                    
                    //SABER SI ES COORECTO O NO//
                    if (resp != suma) {
                        respCor = false; 
                        System.out.println("INCORRECTO");
                    } else {
                        System.out.println("¡ACERTASTE!");
                    }
                    break;
                    
                //NIVEL 2//
                case 2:
                    int p1 = (int) (1 + Math.random() * 7);
                    int p2 = (int) (8 + Math.random() * (12 - 8 + 1));
                    int mult = 1;

                    System.out.println("===NIVEL 2===");
                    System.out.println("Gracias a Chewbacca consiguen llegar al sistema "
                        + "correcto y ven a\nlo lejos la estrella de la muerte. Como van"
                        + " en una nave imperial\nrobada se aproximan lentamente con la"
                        + " intención de pasar\ndesapercibidos. De repente suena el"
                        + " comunicador. ''Aquí agente\nde espaciopuerto " + p1 + " con"
                        + "tactando con nave imperial " + p2 + ". No están\ndestinados"
                        + " a este sector. ¿Qué hacen aquí?''. Han Solo coge el\ncomunicador"
                        + " e improvisa: ''eh... tenemos un fallo en el... eh...\ncondensador de fluzo... Solicitamos permiso para"
                        + " atracar y\nreparar la nave''. El agente, que no se anda con"
                        + " tonterías,\nresponde: ''Proporcione código de acceso o "
                        + "abriremos fuego''. Han\nSolo hojea rápidamente el manual del"
                        + " piolo que estaba en la\nguantera y da con la página correcta."
                        + " El código es el productorio\nentre el nº del agente y el nº "
                        + "de la nave (ambos inclusive). \n ¿Cuál es el código?");
                    
                    //OPERACIÓN//
                    for (int i = p1; i <= p2; i++) {
                        mult *= i;
                    }

                    resp = leer.nextInt();
                    
                    //SABER SI ES COORECTO O NO//
                    if (resp != mult) {
                        respCor = false;
                        System.out.println("oh oh...");
                    } else {
                        System.out.println("¡MUY BIEN!");
                    }
                    break;
                    
                //NIVEL 3//
                case 3:
                    System.out.println("===NIVEL 3===");
                    int N, fact = 1, resp3;
                    N = (int) (50 + Math.random() * (100 - 50 + 1));
                    System.out.println("Han Solo proporciona el código correcto. Atracan"
                            + " en la estrella de\nla muerte, se equipan con trajes de soldados imperiales que\n"
                            + "encuentran en la nave para pasar desapercibidos y bajan. Ahora\n"
                            + "deben averiguar en qué nivel de los " + N + " existentes se encuentra el\n"
                            + "reactor principal. Se dirigen al primer panel computarizado que\n"
                            + "encuentran y la Princesa Leia intenta acceder a los planos de"
                            + " la \nnave, pero necesita introducir una clave de acceso. Entonces\n"
                            + "recuerda la información que le proporcionó Lando Calrissian: ''La\n"
                            + "clave de acceso a los planos de la nave es el factorial de N/10\n"
                            + " (redondeando N hacia abajo), donde N es el nº de niveles''.\n"
                            + "¿Cuál es el nivel correcto?");
                    
                    //OPERACIÓN//
                    N = N / 10;
                    for (int i = 1; i <= N; i++) {
                        fact = fact * i;
                    }
                    respCor = true;
                    resp = leer.nextInt();
                    
                    //SABER SI ES COORECTO O NO//
                    if (resp != fact) {
                        respCor = false;
                        System.out.println("oh oh...");
                    } else {
                        System.out.println("¡ACERTASTE!");
                    }
                    break;
                    
                //NIVEL 4//
                case 4:
                    System.out.println("===NIVEL 4===");
                    int rest, v1, siono = 0;
                    boolean primo = true;
                    v1 = (int) (Math.random() * (100 - 10 + 1) + 10);
                    System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y\n"
                            + "encuentran la puerta acorazada que da al reactor principal. R2D2\n"
                            + "se conecta al panel de acceso para intentar hackear el sistema y\n"
                            + "abrir la puerta. Para desencriptar la clave necesita verificar si el\n"
                            + "número " + v1 + " es primo o no. Si es primo introduce un 1, si no lo es\n"
                            + "introduce un 0.");
                    
                    //OPERACIÓN//
                    for (int j = 2; j < v1; j++) {
                        rest = v1 % j;
                        if (rest == 0) {
                            primo = false;
                        }
                    }
                    //SI ES PRIMO VALDRÁ 1, SINO SE QUEDARÁ EN 0//
                    if (primo == true) {
                        siono = 1;
                   }
                    resp = leer.nextInt();
                    
                    //SABER SI ES COORECTO O NO//
                    if (resp != siono) {
                        respCor = false;
                        System.out.println("oh oh...");
                    } else {
                        System.out.println("¡MUY BIEN!");
                    }
                    break;
                    
                //NIVEL 5//
                case 5:
                    System.out.println("===NIVEL 5===");
                    
                    int M, S, fact1 = 1, fact2 = 1, total;
       
                    M = (int)(Math.random() * (10 - 5 + 1) + 5);
                    S = (int)(Math.random() * (10 - 5 + 1) + 5);
                    
                    System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker\n"
                    + "coloque la bomba, programe el temporizador y salir de allí\n"
                    + "corriendo. Necesita programarlo para que explote en exactamente\n"
                    + M + " minutos y " + S + " segundos, el tiempo suficiente para escapar antes\n"
                    + "de que explote pero sin que el sistema de seguridad anti\n"
                    + "explosivos detecte y desactive la bomba. Pero el temporizador\n"
                    + "utiliza un reloj Zordgiano un tanto peculiar. Para convertir los\n"
                    + "minutos y segundos al sistema Zordgiano hay que sumar el\n"
                    + "factorial de M y el factorial de S. ¿Qué valor debe introducir?\n");
                    
                    //OPERACIÓN//
                    for (int i = 1; i <= M; i++){
                        fact1 = fact1 * i;
                    }
                    for (int i = 1; i <= S; i++){
                        fact2 = fact2 * i;
                    }
                    total = fact1 + fact2;
       
                    resp = leer.nextInt();
       
                    //SABER SI ES COORECTO O NO//
                    if (resp != total){
                    respCor = false;
                    System.out.println("MAL");
                    }
                    else{
                     System.out.println("¡ACERTASTE!");
                    }

                    break;
                    }
            
            //ETAPA DERROTA//
            if (respCor == false) {
            System.out.println("Ese no era el código correcto... La misión ha sido "
            + "un fracaso... :( \n"
            + "Todavía no eres un maestro Jedi de las Matemáticas."
            + " ¡Vuelve a intentarlo!");
            
            //INCREMENTAMOS A LVL 6 PARA QUE NO PUEDA ENTRAR AL FOR//
            lvl = 6;
            
            //ETAPA VICTORIA//
            } else 
            if (lvl == 5 && respCor == true){
            System.out.println("Luke Skywalker introduce el tiempo correcto, activa el\n"
                + "temporizador y empiezan a sonar las alarmas. Salen de allí\n"
                + "corriendo, no hay tiempo que perder. La nave se convierte en un\n"
                + "hervidero de soldados de arriba a abajo y entre el caos "
                + "que les\nrodea consiguen llegar a la nave y salir de "
                + "allí a toda prisa. A\nmedida que se alejan observan"
                + " por la ventana la imagen de la\ncolosal estrella de la "
                + "muerte explotando en el silencio del espacio,\ndesa"
                + "pareciendo para siempre junto a los restos del "
                + "malvado\nimperio.\n\n¡Has salvado la galaxia gracias a"
                + " la Fuerza Jedi de las matemáticas! \n ===ENHORABUENA!===");
            }
        
       }
        System.out.println("Gracias por jugar :D");
    }   
}
