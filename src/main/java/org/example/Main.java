package org.example;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



        // DATOS JUGADOR
        String nickName;
        String nickNameBD="paraquito";
        String contrasena;
        String contrasenaBD="Uribito123";
        Integer nivelVida =70;
        Integer cotadorSkills=0;
        Integer contadorDisparos=0;
        Integer costoSkills = 100000;
        Integer danoDisparo = -5;
        boolean estaMuerto=false;

        String juego1="Free Fire";
        String juego2="Fifa 24";
        String juegoSelecionado;


        Scanner leerDato= new Scanner(System.in);

        //PROCESO
        System.out.println("******INGRESANDO*********");
        System.out.println("******BIENVEDO********");
        System.out.println("----------------------");


        System.out.println("Digita tu nickName: ");
        nickName=leerDato.nextLine();

        System.out.println("Digita tu contraseña: ");
        contrasena=leerDato.nextLine();

        //RUTINA PARA VERIFICAR EL PERFIL:

        if (nickName.equals(nickNameBD) && contrasena.equals(contrasenaBD)){
            System.out.println("Bienvenido a PSPLUS5" +nickName);
            //RUTINA PARA INICIAR JUEGO
            System.out.println("Seleccione un videojuego");
            juegoSelecionado=leerDato.nextLine();
            if (juegoSelecionado.equals(juego1)){
                //ENTRAMOS A FREE FIRE

                do{
                    //RANDOM (DISPARAR O NO)
                    Random random=new Random();
                    int disparo=random.nextInt(2);

                    if (disparo==1) {
                        //le dieron
                        contadorDisparos=contadorDisparos+1;
                        nivelVida=nivelVida+danoDisparo;
                        System.out.println("Te pegaron un pepazo, y tu miserable vida queda en: " +nivelVida);
                        if (nivelVida == 0) {
                            estaMuerto=true;
                            break;
                        }
                    }else {
                        //no le dieron
                        System.out.println("Esquivo la bala!");
                        contadorDisparos=0;
                    }

                }while(estaMuerto ==false);

                System.out.println("Te liquidaron cabron!!");




            }else {
                System.out.println("Servidores no disponibles! PAILAS PAPI");
            }


        }else{
            System.out.println("Despierte pues aguevado que esa no es su contraseña!!!");
        }


    }
}