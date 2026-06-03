public class CheckingAccount extends BankAccount {

    /** Limite de découvert (-1 indique une valeur non initialisée) */
    private double limit = -1;

    /**
     * Retourne la limite de découvert du compte courant.
     *
     * @return La limite de découvert
     * @throws IllegalStateException si la limite n'a pas encore été définie
     */
    public double getLimit() {
        if (limit == -1) {
            throw new IllegalStateException("La limite de découvert n'a pas encore été définie.");
        }
        return limit;
    }

    /**
     * Définit la limite de découvert du compte courant.
     *
     * @param limit La limite à assigner
     * @throws IllegalArgumentException si la limite est négative
     */
    public void setLimit(double limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("La limite de découvert ne peut pas être négative.");
        }
        this.limit = limit;
    }

}