package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {




    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        //Scanner è una classe che scannerizza le informazioni che vi sono passate. in è la variabile di tipo Scanner, quest'ultima è una classe built-in che fa parte della libreria java.util che è proprio di JDK. In pratica la riga soprastante dice: crea una nuova istanza, un nuovo elemento di uno Scanner che utilizzi come meccanismo di lettura ciò che scrivo tramite terminale
        System.out.println("Inserisci il tuo nome");
        String nome = in.nextLine();
        System.out.println("Inserisci il tuo cognome");
        String cognome = in.nextLine();
        System.out.println("Inserisci il tuo colore preferito");
        String colore = in.nextLine();
        System.out.println("Inserisci la tua data di nascita GG/MM/AAAA");
        String dataNascita = in.nextLine();
        //nextLine() è un metodo che prevede una stringa, infatti la variabile dataNascita come le precedenti sono tipizzate come stringhe tramite String e nextLine() come metodo fa precisamente di catturare la stringa successiva alla precedente stampata
        
        String[] formatoData = dataNascita.split("/");
        String data = formatoData[2];
        //split(String regex) è un metodo che suddivide una stringa in base ad un modello regex. In questo caso l'anno in formato GG/MM/AAAA. Il risultato ottenuto è un array e infatti la variabile formatoData è tipizzata come un array di stringhe, proprio come l'argomento del main denominato args. Ciò detto, come in javascript recupero l'emento dell'array che mi interessa come indice

        System.out.println("Il tuo nome è " +nome);
        System.out.println("Il tuo cognome è " +cognome);
        System.out.println("Il tuo colore preferito è " +colore);
        System.out.println("La tua data di nascita è " +dataNascita);

        System.out.println("Password generata per te: "+nome+"-"+cognome+"-"+colore+"-"+data);

        in.close();

    // sono un metodo che tutti possono vedere = public
    //sono un metodo a cui ci si riferisce come main => main
    // dispongo di un unico parametro denominato args, di tipo array di String => String[] args
    //eccezionalmente si attiva un evento tramite => throws Exception


    }

}
