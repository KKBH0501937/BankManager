public class BankAccount {

    /** Numéro du compte bancaire (null si non initialisé) */
    protected String account;

    /** Solde du compte (-1 indique une valeur non initialisée) */
    protected double balance = -1;

    /**
     * Retourne le numéro du compte bancaire.
     *
     * @return Le numéro de compte
     * @throws IllegalStateException si le numéro de compte n'a pas encore été défini
     */
    public String getAccount() {
        if (account == null) {
            throw new IllegalStateException("Le numéro de compte n'a pas encore été défini.");
        }
        return account;
    }

    /**
     * Définit le numéro du compte bancaire.
     *
     * @param account Le numéro de compte à assigner
     * @throws IllegalArgumentException si le numéro de compte est null ou vide
     */
    public void setAccount(String account) {
        if (account == null || account.trim().isEmpty()) {
            throw new IllegalArgumentException("Le numéro de compte ne peut pas être vide ou null.");
        }
        this.account = account;
    }

    /**
     * Retourne le solde actuel du compte.
     *
     * @return Le solde du compte
     * @throws IllegalStateException si le solde n'a pas encore été défini
     */
    public double getBalance() {
        if (balance == -1) {
            throw new IllegalStateException("Le solde du compte n'a pas encore été défini.");
        }
        return balance;
    }

    /**
     * Définit le solde du compte.
     *
     * @param balance Le solde à assigner
     * @throws IllegalArgumentException si le solde est négatif
     */
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Le solde ne peut pas être négatif.");
        }
        this.balance = balance;
    }

}