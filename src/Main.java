public class Main {


    public static void main(String[] args) {




        //Ajout et lecture de données bancaire


        // --- Compte Courant ---
        try {
            CheckingAccount checkingAccount = new CheckingAccount();
            checkingAccount.setAccount("CA-009");
            checkingAccount.setBalance(150000);
            checkingAccount.setLimit(50000);

            System.out.println("Compte courant");
            System.out.println("Numéro : " + checkingAccount.getAccount());
            System.out.println("Solde  : " + checkingAccount.getBalance() + " FCFA");
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println("Erreur compte courant : " + e.getMessage());
        }

        System.out.println();

        // --- Compte d'Épargne ---
        try {
            SavingsAccount savingsAccount = new SavingsAccount();
            savingsAccount.setAccount("SA-009");
            savingsAccount.setBalance(500000);


            System.out.println("Compte d'Epargne");
            System.out.println("Numéro : " + savingsAccount.getAccount());
            System.out.println("Solde  : " + savingsAccount.getBalance() + " FCFA");
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println("Erreur compte épargne : " + e.getMessage());
        }

        System.out.println();

        // --- Certificat de Dépôt ---
        try {
            COD cod = new COD();
            cod.setAccount("COD-009");
            cod.setBalance(1000000);


            System.out.println("Certificat de Dépôt");
            System.out.println("Numéro : " + cod.getAccount());
            System.out.println("Solde  : " + cod.getBalance() + " FCFA");
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println("Erreur certificat de dépôt : " + e.getMessage());
        }
    }
}