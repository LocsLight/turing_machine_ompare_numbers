package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] ruban= {0,0,1,0,-1,1,0,1,0,-1,-1};
        String etat_courant;
        String etat_suivant;
        int pos_tete;


	etat_courant = "e1";
	etat_suivant = etat_courant;
    pos_tete = 0;
    System.out.println("position : " + pos_tete);
    System.out.println(Arrays.toString(ruban));

    while(etat_courant != "fin"){

        if (etat_courant == "e1"){
            if (ruban[pos_tete] == 0){
                ruban [pos_tete ] = -1;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e7";
            }else if(ruban[pos_tete] == 1){
                ruban[pos_tete] = -1;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e2";
            }
        }

        if (etat_courant == "e2"){
            if (ruban[pos_tete] == 0){
                ruban [pos_tete ] = 0;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e7";
            }else if(ruban[pos_tete] == 1){
                ruban[pos_tete] = -1;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e2";
            }else if(ruban [pos_tete ] == -1){
                etat_suivant = "e3";
            }
        }

        if (etat_courant == "e3"){
            if (ruban[pos_tete] == -1){
                ruban [pos_tete ] = +1;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
            }else if(ruban[pos_tete] == 0){
                ruban[pos_tete] = -1;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e9";
            }
            }else if(ruban[pos_tete] == 1){
                ruban[pos_tete] = -1;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e4";
            }
        }

        if (etat_courant == "e4"){
            if (ruban[pos_tete] == 0){
                ruban [pos_tete ] = -1;
                pos_tete = pos_tete - 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
            }else if(ruban[pos_tete] == 1){
                ruban[pos_tete] = -1;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e5";
            }
        }

        if (etat_courant == "e5"){
            if (ruban[pos_tete] == 0){
                ruban [pos_tete ] = 0;
                pos_tete = pos_tete - 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e6";
            }else if(ruban[pos_tete] == 1){
                ruban[pos_tete] = -1;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
            }
        }

        if (etat_courant == "e6"){
            if (ruban[pos_tete] == 0){
                ruban [pos_tete ] = -1;
                pos_tete = pos_tete - 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e7";
            }else {
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e1";
            }
        }

        if (etat_courant == "e7"){
            if (ruban[pos_tete] == 0){
                ruban [pos_tete ] = 0;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
            }else {

                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e8";
            }
        }

        if (etat_courant == "e8"){
            if (ruban[pos_tete] == 0){
                ruban [pos_tete ] = -1;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e4";
            }else {
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e11";
            }
        }

        if (etat_courant == "e9"){
            if (ruban[pos_tete] == 0){
                ruban [pos_tete ] = -1;
                pos_tete = pos_tete - 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e7";
            }else if(ruban[pos_tete] == 1){
                ruban[pos_tete] = -1;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
            }
        }

        if (etat_courant == "e10"){
            if (ruban[pos_tete] == 0){
                ruban [pos_tete ] = -1;
                pos_tete = pos_tete - 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "fin";

        }

        if (etat_courant == "e11"){
            if (ruban[pos_tete] == -1){
                ruban [pos_tete ] = -1;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "e12";
            }else if(ruban[pos_tete] == 0){
                ruban[pos_tete] = 0;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
            }else if(ruban[pos_tete] == 1){
                ruban[pos_tete] = 1;
                pos_tete = pos_tete + 1;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
            }
        }

        if (etat_courant == "e12"){
            if (ruban[pos_tete] == -1){
                ruban [pos_tete ] = 0;
                System.out.println("position : " + pos_tete);
                System.out.println(Arrays.toString(ruban));
                etat_suivant = "fin";
                System.out.println("état courant : " + etat_courant);
        }

    }
}
}
}
