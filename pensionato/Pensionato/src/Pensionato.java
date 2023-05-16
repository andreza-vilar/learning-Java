import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Quartos[] vetor = new Quartos[10];

        System.out.print("How many rooms will be rented? ");
        int entrada = sc.nextInt();


        for (int i = 1; i <= entrada; i++){
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String emails = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            System.out.print("Telephone number: ");
            String telephone = sc.next();
            System.out.println();

            vetor[roomNumber] = new Quartos(name, emails, telephone);
        }

        System.out.println();
        System.out.println("Busy rooms:");

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] != null){
                System.out.println(i+ ": " + vetor[i]);

            }

        }


        sc.close();
    }
}
